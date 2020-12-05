package MiniProject;

import java.util.*;

class MARKSHEET12
{
    Display D1= new Display();
    void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\tWelcome to marks sheet");
        System.out.print("Enter the name of Student \t\t:\t");
        String name = sc.next();
        System.out.print("Enter the Roll Number \t\t\t:\t");
        int roll = sc.nextInt();


        System.out.print("\nEnter the Marks of ENGLISH \t\t:\t");
        int s1 = sc.nextInt();
        System.out.print("Enter the Marks of MARATHI \t\t:\t");
        int s2 = sc.nextInt();
        System.out.print("Enter the Marks of PHYSICS \t\t:\t");
        int s3 = sc.nextInt();
        System.out.print("Enter the Marks of MATHEMATICS \t:\t");
        int s4 = sc.nextInt();
        System.out.print("Enter the Marks of CHEMISTRY \t:\t");
        int s5 = sc.nextInt();

        D1.detail(name,roll,s1,s2,s3,s4,s5);
    }


}

