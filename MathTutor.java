
/**
 * Created by parkercopeland on 5/4/16.
 */
import javax.swing.JOptionPane;
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
        String textChoice = JOptionPane.showInputDialog("Please select difficulty type: \n" +
                "1) Easy \n" +
                "2) Moderate \n" +
                "3) Difficult \n" +
                "Choice: ");
        choice1 = Integer.parseInt(textChoice);
        if(choice1 < 1 || choice1 > 3 ){
            JOptionPane.showMessageDialog(null, "Please select a number 1-3");
        }
    }return choice1;}

    public int getQuestionType(){ while (choice < 1 || choice > 4)
    {
        String textChoice1 = JOptionPane.showInputDialog("Please select the type of questions you would like: \n" +
                "1) Addition \n" +
                "2) Subtraction \n" +
                "3) Multiplication \n" +
                "4) Divistion \n" +
                "Type: ");
        choice = Integer.parseInt(textChoice1);
        if (choice < 1 || choice > 4)
        {
            JOptionPane.showMessageDialog(null, "Please select a number 1-4");
        }
    }return choice;}

    public void askQuestions() {
        for (int i = 0; i < 10; i++)
        {
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;

            if(choice1 == 1 && choice == 1 || choice == 2) {
                num1 = genRandomNum();
                num2 = genRandomNum();
                num3 = genRandomNum();
            }else if(choice1 == 1 && choice == 3 || choice == 4 ){
                num1 = genRandomNum2();
                num2 = genRandomNum2();
                num3 = genRandomNum2();
            }else if(choice1 == 2 && choice == 1 || choice == 2){
                num1 = genRandomNum3();
                num2 = genRandomNum3();
                num3 = genRandomNum3();
            }else if(choice1 == 2 && choice == 3 || choice == 4){
                num1 = genRandomNum4();
                num2 = genRandomNum4();
                num3 = genRandomNum4();
            }else if(choice1 == 3 && choice == 1 || choice == 2){
                num1 = genRandomNum5();
                num2 = genRandomNum5();
                num3 = genRandomNum5();
            }else if(choice1 == 3 && choice == 3 || choice == 4){
                num1 = genRandomNum6();
                num2 = genRandomNum6();
                num3 = genRandomNum6();
            }

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
                default: JOptionPane.showMessageDialog(null, "Error");
                    System.exit(1);
            }
        }
    }

    public int genRandomNum() {
        return (int)generator.nextInt(50) +1;
    }
    public int genRandomNum2() {
        return (int)generator.nextInt(12) +1;
    }
    public int genRandomNum3() {
        return (int)generator.nextInt(90) +10;
    }
    public int genRandomNum4() {
        return (int)generator.nextInt(40) +10;
    }
    public int genRandomNum5() {
        return (int)generator.nextInt(900) +100;
    }
    public int genRandomNum6() {
        return (int)generator.nextInt(990) +10;
    }

    public void genMotivationalPhrase(){
        int numMo = (int)generator.nextInt(4)+1;
        switch(numMo)
        {
            case 1: JOptionPane.showMessageDialog(null, "Great job!");
                break;
            case 2: JOptionPane.showMessageDialog(null, "I knew you could do it!");
                break;
            case 3: JOptionPane.showMessageDialog(null, "Math is easy!");
                break;
            case 4: JOptionPane.showMessageDialog(null, "Hello MIT!");
                break;
            default: JOptionPane.showMessageDialog(null, "Error");
        }}
    public void genMotivationalWrPhrase(){
        int numMo = (int)generator.nextInt(4)+1;
        switch(numMo)
        {
            case 1: JOptionPane.showMessageDialog(null, "Try again!");
                break;
            case 2: JOptionPane.showMessageDialog(null, "So close!");
                break;
            case 3: JOptionPane.showMessageDialog(null, "I know you can do it!");
                break;
            case 4: JOptionPane.showMessageDialog(null, "You'll get it next time!");
                break;
            default: JOptionPane.showMessageDialog(null, "Error");
        }}
    public void addition(int num1, int num2) {
        String textChoice2 = JOptionPane.showInputDialog("What is " + num1 + " + " + num2 + "? ");
        int answer = Integer.parseInt(textChoice2);
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
            String textChoice3 = JOptionPane.showInputDialog("What is " + num1 + " - " + num2 + "? ");
            int answer = Integer.parseInt(textChoice3);
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
            String textChoice4 = JOptionPane.showInputDialog("What is " + num2 + " - " + num1 + "? ");
            int answer = Integer.parseInt(textChoice4);
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
        String textChoice5 = JOptionPane.showInputDialog("What is " + num1 + " * " + num2 + "? ");
        int answer = Integer.parseInt(textChoice5);
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
        String textChoice6 = JOptionPane.showInputDialog("What is the quotient of " + num3 + " / " + num1 + "? ");
        int answer = Integer.parseInt(textChoice6);
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
        double percent = numCorrect / win * 100 ;

        if(percent<75){
            if(choice==1)
                JOptionPane.showMessageDialog(null, "Number of correct responses: " + numCorrect + "/" + 10 + "\n" +
                        "Your percentage: " + percent + "% \n" +
                        "Please see your teacher for help with Addition");
            else if(choice==2)
                JOptionPane.showMessageDialog(null, "Number of correct responses: " + numCorrect + "/" + 10 + "\n" +
                        "Your percentage: " + percent + "% \n" +
                        "Please see your teacher for help with Subtraction");
            else if(choice==3)
                JOptionPane.showMessageDialog(null, "Number of correct responses: " + numCorrect + "/" + 10 + "\n" +
                        "Your percentage: " + percent + "% \n" +
                        "Please see your teacher for help with Multiplication");
            else if(choice==4)
                JOptionPane.showMessageDialog(null, "Number of correct responses: " + numCorrect + "/" + 10 + "\n" +
                        "Your percentage: " + percent + "% \n" +
                        "Please see your teacher for help with Division");
        }
    }
}
