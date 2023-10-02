// Group Name : Team Prem and Aditya --- Leader : Prem

import java.util.Scanner;
public class LetterGrade
{
    public static void main(String[] args)
    {
        int lettergrade;

        System.out.println("Please enter your grade : ");
        Scanner scan = new Scanner(System.in);

        int grade =  scan.nextInt();

        // if grade >= 90, set the letterGrade to A

        if(grade >=90){
            lettergrade = 'A';
        }

        // if grade >=80 set the letterGrade to B

         else if (grade >= 80){
        lettergrade = 'B';
        }

        // if grade >=70 set the letterGrade to C

        else if (grade >= 70){
        lettergrade = 'C';
        }

        // if grade >=60 set the letterGrade to D

        else if (grade >= 60){
        lettergrade = 'D';
        }

        //else set the letterGrade to F

        else {
        lettergrade ='F';
        }
            System.out.println("The Final Grade is : "+ lettergrade);
    }//main
}
