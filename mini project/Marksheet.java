package MiniProject;

import java.util.*;
class Marksheet
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        Display ds=new Display();
        int n;
        do {
            System.out.println("Enter who are you");
            System.out.println("\n1=teacher\n2=student\n0=EXIT");
            n=sc.nextInt();
            switch(n) {
                case 1:
                    MARKSHEET12 mark=new MARKSHEET12();
                    mark.insert();
                    ds.display();
                    break;
                case 2:

                    ds.display();
                    break;
            }
        }while(n!=0);
        System.out.println("programme Exit");
    }
}
