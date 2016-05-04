
/**
 * Created by parkercopeland on 5/4/16.
 */

import java.util.Scanner;
import java.util.Random;
public class MathTutor {
    Scanner input = new Scanner(System.in);
    int choice;
    int choice1;
    int numCorrect;
    Random generator = new Random();
    public MathTutor (){
        choice = numCorrect = 0;
    }

    public int getDifficultyType(){ while (choice1 < 1 || choice1 > 3)
    {
        System.out.println("Please select difficulty type");
        System.out.println("1) Easy");
        System.out.println("2) Moderate");
        System.out.println("3) Difficult");
        System.out.println("Choice: ");
        choice1 = input.nextInt();
        if(choice1 < 1 || choice1 > 3 ){
            System.out.print("Choice must be in the range of 1-3");
        }
    }return choice1;}

    public int getQuestionType(){ while (choice < 1 || choice > 4)
    {
        System.out.println("Please select the type of questions you would like");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.print("Type: ");
        choice = input.nextInt();
        if (choice < 1 || choice > 4)
        {
            System.out.println("Choice must be in the range 1-4");
        }
    }return choice;}
    public void askQuestions() {
        for (int i = 0; i < 10; i++)
        {
            int num1 = genRandomNum();
            int num2 = genRandomNum();
            int num3 = genRandomNum();
            int num4 = genRandomNum2();
            int sign = choice;
            if (sign == 5)
            {
                sign = (int)(Math.random() * 4 + 1);
            }
            switch(sign)
            {
                case 1: addition(num1, num2);
                    break;
                case 2: subtraction(num1, num2);
                    break;
                case 3: multiplication(num1, num2);
                    break;
                case 4: division(num1, num2, num3);
                    break;
                default: System.out.println("Error");
                    System.exit(1);
            }
        }
    }
    public int genRandomNum() {
        return (int)generator.nextInt(9) +1;
    }

    public int genRandomNum2() {
        return (int)generator.nextInt(50) +1;
    }

    public void genMotivationalPhrase(){
        int numMo = (int)generator.nextInt(4)+1;
        switch(numMo)
        {
            case 1: System.out.println("Great job!");
                break;
            case 2: System.out.println("I knew you could do it!");
                break;
            case 3: System.out.println("Math is easy!");
                break;
            case 4: System.out.println("Hello MIT!");
                break;
            default: System.out.println("Error");
        }}
    public void genMotivationalWrPhrase(){
        int numMo = (int)generator.nextInt(4)+1;
        switch(numMo)
        {
            case 1: System.out.println("Try again!");
                break;
            case 2: System.out.println("So close!");
                break;
            case 3: System.out.println("I know you can do it!");
                break;
            case 4: System.out.println("You'll get it next time!");
                break;
            default: System.out.println("Error");
        }}
    public void addition(int num1, int num2) {
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = input.nextInt();
        if (num1 + num2 == answer)
        {
            genMotivationalPhrase();
            numCorrect++;
        }
        else
        {
            genMotivationalWrPhrase();
        }
    }
    public void subtraction(int num1, int num2) {
        if(num1>num2){
            System.out.print("What is " + num1 + " - " + num2 + "? ");
            int answer = input.nextInt();
            if (num1 - num2 == answer)
            {
                genMotivationalPhrase();
                numCorrect++;
            }
            else
            {
                genMotivationalWrPhrase();
            }
        }
        else{
            System.out.print("What is " + num2 + " - " + num1 + "? ");
            int answer = input.nextInt();
            if (num2 - num1 == answer)
            {
                genMotivationalPhrase();
                numCorrect++;
            }
            else
            {
                genMotivationalWrPhrase();
            }
        }
    }
    public void multiplication(int num1, int num2) {
        System.out.print("What is " + num1 + " * " + num2 + "? ");
        int answer = input.nextInt();
        if (num1 * num2 == answer)
        {
            genMotivationalPhrase();
            numCorrect++;
        }
        else
        {
            genMotivationalWrPhrase();
        }
    }
    public void division(int num1, int num2, int num3) {
        boolean quotientCorrect = false;
        num3 = num1*num2;
        System.out.print("What is the quotient of " + num3 + " / " + num1 + "? ");
        int answer = input.nextInt();
        if (answer == num3/num1);
        {
            quotientCorrect = true;
        }

        if (quotientCorrect)
        {
            genMotivationalPhrase();
            numCorrect++;
        }
        else
        {
            genMotivationalWrPhrase();
        }
    }
    public void printReport() {
        double win = 10.0;
        System.out.println("Number of correct responses: " + numCorrect + "/" + 10);
        double percent = numCorrect / win * 100 ;
        System.out.println("Your percentage: " + percent + "%");
        if(percent<75){
            System.out.println("Please see your teacher for help with ");
            if(choice==1)
                System.out.println("Addition");
            else if(choice==2)
                System.out.println("Subtraction");
            else if(choice==3)
                System.out.println("Multiplication");
            else if(choice==4)
                System.out.println("Division");}
    }
}
