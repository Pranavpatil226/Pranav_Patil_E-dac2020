package MiniProject;

public class Display
{
    static String name;
    static int roll,s1,s2,s3,s4,s5;

      void detail(String name,int roll,int s1,int s2,int s3,int s4,int s5)
      {

          this.name=name;
          this.roll=roll;
          this.s1=s1;
          this.s2=s2;
          this.s3=s3;
          this.s4=s4;
          this.s5=s5;

      }
    void display() {
        int total;
        float percent;

        total = s1 + s2 + s3 + s4 + s5;
        percent = total / 5;
        System.out.print("\n======================================================");
        System.out.print("\n\n\t\t   Kharghar Junior College");
        System.out.print("\n\t\t\t\t  Marksheet");
        System.out.print("\n-----------------------------------------------------");
        System.out.print("\n\tName\t\t:\t" + name);
        System.out.print("\n\tRoll No.\t:\t" + roll);
        System.out.print("\n-----------------------------------------------------");
        System.out.print("\n\tSubject\t\t:\tMarks Obtain\t:\tMaximum Marks");
        System.out.print("\n\tENGLISH\t\t:\t" + s1+"  \t\t\t     100");
        System.out.print("\n\tMARATHI\t\t:\t" + s2+"  \t\t\t     100");
        System.out.print("\n\tPHYSICS\t\t:\t" + s3+"  \t\t \t     100");
        System.out.print("\n\tMATHEMATICS\t:\t" + s4+" \t\t\t\t     100");
        System.out.print("\n\tCHEMISTRY\t:\t" + s5+"   \t\t\t     100");
        System.out.print("\n-----------------------------------------------------");
        System.out.print("\n\tTotal\t\t:\t" + total);
        System.out.print("\n\tPercentage\t:\t" + percent + "%");


        if (percent >= 60) {
            System.out.print("\n\tClass\t\t:\tFirst");
        }

        if (percent >= 40 && percent < 60) {
            System.out.print("\n\tClass\t\t:\tSecond");
        }

        if (percent < 40) {
            System.out.print("\n\tClass\t\t:\tFail");
        }
        System.out.println("\n======================================================");
    }
}
