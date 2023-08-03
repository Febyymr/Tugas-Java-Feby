import java.util.Scanner;

public class ForgetfulMachine{
    Scanner keyboard = new Scanner(System.in){

    System.out.println("What city is the capital of France");
    keyboard.next();

    System.out.println("What is 6 multiplied by ??");
    keyboard.nextInt();   
    }
}