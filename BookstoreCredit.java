/*Chapter 3 Exercise #6 pg.164
Filename: BookstoreCredit.java
Alexa Caridi 02/14/2020*/

import java.util.Scanner;

public class BookstoreCredit
{
    public static void main(String[] args)
    {
        //variables and constants
        String studentName;
        double studentGPA;
        int multiplyBy = 10;
        double bookCredit;

        //objects
        Scanner input = new Scanner(System.in);

        //input phase
        System.out.print("Please enter your name. >> ");
        studentName = input.nextLine();

        System.out.print("Please enter your grade point average (GPA). >> ");
        studentGPA = input.nextDouble();

        //calculation phase
        bookCredit = studentGPA * multiplyBy;

        //outputphase
        System.out.println("Thank you, " + studentName + ". Your GPA is " + 
        studentGPA + ", and your bookstore credit is $" + bookCredit + "!");
    }

}