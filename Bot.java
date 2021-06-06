package bot;

import java.util.*;

public class Bot {

    final static Scanner scanner = new Scanner(System.in);  //constant for reading all inputs required in the app

    public static void main (String [] args){
        greet("Bender", 2021);
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    //Greeting function
    static void greet(String botName, int birthYear){
        System.out.println("Hello! My name is " + botName);
        System.out.println("I was created in " + birthYear);
    }

    //Reading user name
    static void remindName(){
        System.out.println("Please, remind me your name.");
        String userName=scanner.nextLine();
        System.out.println("What a great name you have, " + userName );
    }

    //Guessing age function
    static void guessAge(){
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3=scanner.nextInt();
        int rem5=scanner.nextInt();
        int rem7=scanner.nextInt();
        int age= (rem3 * 70 + rem5 * 21 + rem7 * 15) %105;
        System.out.println("Your age is " + age + " that's a good time to start programming!");
    }

    //Counting function
    static void count(){
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int userNumber= scanner.nextInt();
        for(int i=0;i<=userNumber;i++){
            System.out.println(i+"!");
        }
    }

    //Test function
    static void test(){
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");

        while(true){
            int userAnswer = scanner.nextInt();

            if (userAnswer==2){
                System.out.println("Congratulations, have a nice day!");
                break;
            } else{
                System.out.println("Please, try again.");
            }
        }
    }

    //End function
    static void end(){
        System.out.println("Completed, have a nice day!");
    }

}
