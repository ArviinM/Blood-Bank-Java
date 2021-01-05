package Encapsulation;

import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodData bd = new BloodData();

        String input1, input2;

        System.out.print("Enter the patient's blood type: ");
        bd.setBloodType(input1 = sc.nextLine());
        System.out.print("Enter the patient's Rhesus factor (+ or -): ");
        bd.setRhFactor(input2 = sc.nextLine());

        if(input1.isBlank() && input2.isBlank()){
            bd.setBloodType("O");
            bd.setRhFactor("+");

            System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
        } else {
            System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
        }
    }
}
