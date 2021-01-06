package Stack;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {
    Scanner sc = new Scanner(System.in);
    Stack<String> basket = new Stack<String>();

    public void catchFruit(){
        System.out.println("Catch and eat any of these fruits: ('apple', 'orange', " +
                "'mango', 'guava')");
        System.out.print("How many fruit(s) would you like to add: ");
        int choice = sc.nextInt();
        System.out.println("Choose a fruit to catch. Press A, O, M, G");
        String chosenFruit;
        for(int i = 1; i <= choice; i++){
            System.out.print("Fruit " + i + " of "+ choice + ": ");
            chosenFruit = sc.next().toLowerCase();

            switch (chosenFruit){
                case "a":
                    basket.push("apple");
                    break;
                case "o":
                    basket.push("orange");
                    break;
                case "m":
                    basket.push("mango");
                    break;
                case "g":
                    basket.push("guava");
                    break;
                default:
                    System.out.println("Fruit not found! Please try again.");
            }
        }
        System.out.println("You basket now has: " + basket);
    }

    public void eatFruit(){
        while(!basket.isEmpty()){
            System.out.print("Press E to eat a fruit. ");
            String choice = sc.next();

            if(choice.equalsIgnoreCase("e")){
                basket.pop();
            } else {
                System.out.println("Please Try Again!");
            }

            if(!basket.isEmpty()){
                System.out.println("Fruit(s) in the basket: " + basket);
            } else {
                System.out.println("No more fruits.");
            }

        }
    }

    public static void main(String[] args) {
        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.catchFruit();
        fruitBasket.eatFruit();
    }
}
