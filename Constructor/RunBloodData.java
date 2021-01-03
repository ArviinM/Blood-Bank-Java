import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1, input2;

        System.out.print("Enter the patient's blood type: ");
        input1 = sc.nextLine();
        System.out.print("Enter the patient's Rhesus factor (+ or -): ");
        input2 = sc.nextLine();

        if(input1.isBlank() && input2.isBlank()){
            BloodData bd = new BloodData();
            bd.display();
        } else {
            BloodData bd = new BloodData(input1, input2);
            bd.display();
        }
    }
}
