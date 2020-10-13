

/*
class Que_1
{
 public static void main(String args[])
  {
     
     for(int i=1;i<=9;i++)
     {
     
         for(int j=9;j>=i;j--)
        {
          System.out.print(" ");
        }


       for(int k=1;k<=i;k++)
       {
         System.out.print(i);
         System.out.print(" ");
       }

    System.out.println(); 
  

     }

    
  }

}
*/


/*
class Que_2
{
  public static void main(String args[])
  {
     for(int i=1;i<=9;i++)
     {
        for(int j=9;j>=i;j--)
        {
          System.out.print(" ");
        }


       for(int k=1;k<=i;k++)
       {
         System.out.print(k); // printing data
         System.out.print(" ");
       }

    System.out.println(); 

     } 
  }
}

*/

/*
class Que_3
{
  public static void main(String args[])
  {
     for(int i=1;i<=9;i++)
      {
        for(int j=9;j>=i;j--)
          {
            System.out.print(" ");
          }
        for(int k=1;k<=i;k++)
         {
          System.out.print("*");
          System.out.print(" ");
         }
        System.out.println();
      }
  }
}

*/


/*
class Que_4
{
 public static void main(String[] args)
  {
    for(int i=1;i<=9;i++)// rows
    {
      for(int j=9;j>=i;j--) //for spaces
       {
         System.out.print(" ");  
       }
 
      for(int k=1;k<=i;k++) // for printing
      {
        System.out.print(k  );
      }
      
      for(int m=2;m<=i;m++)
      {
        int n=i-1;
        do
        {
        System.out.print(n);
        n--;
        }
        while(n!=0);
       break;
      }
   System.out.println();

    }
  }
}
*/


/*
class Que_5
{
 public static void main(String[] args)
  {
    
  

  
  
  }
}
*/

/*
class Que_6
{
  public static void main(String args[])
   {
    int c=9;
     for(int i=1;i<10;i++)
      {
        for(int j=2;j<=i;j++)
         {
           System.out.print(" ");
         }

        for(int k=1;k<=c;k++)
         {
            System.out.print("*");
            System.out.print(" ");
         }
       System.out.println();
       c--;
      }
   }
}

*/

/*
class Que_7
{
  public static void main(String args[])
   {
    int c=9;
     for(int i=1;i<10;i++)
      {
        for(int j=2;j<=i;j++)
         {
           System.out.print(" ");
         }

        for(int k=1;k<=c;k++)
         {
            System.out.print(c);
            System.out.print(" ");
         }
       System.out.println();
       c--;
      }
   }
}

*/

/*
class Que_7
{
  public static void main(String args[])
   {
    int c=9;
     for(int i=1;i<10;i++)
      {
        for(int j=2;j<=i;j++)
         {
           System.out.print(" ");
         }

        for(int k=1;k<=c;k++)
         {
            System.out.print(c);
            System.out.print(" ");
         }
       System.out.println();
       c--;
      }
   }
}

*/

/*
class Que_8
{
  public static void main(String args[])
   {
    
     for(int i=1;i<6;i++)
      {
        for(int j=1;j<=i;j++)
         {
            System.out.print("*");
            System.out.print(" ");
         }
       System.out.println();
      
      }
   }
}
*/

/*
class Que_9
{
  public static void main(String args[])
   {
    
     for(int i=1;i<=6;i++)
      {
        for(int j=6;j>=i;j--)
         {
            System.out.print("*");
            System.out.print(" ");
         }
       System.out.println();
      
      }
   }
}

*/

/*
class Que_10
{
  public static void main(String args[])
   {
   
     for(int i=1;i<=6;i++)
      {
         
        for(int j=i;j<=6;j++)
         {
           if(i==1 || j==i || j==6) // if any one condition is true then directly enter into the loop
            {
              System.out.print(" *");
            } 

           else
           {
             System.out.print("  ");
           }
         }
       System.out.println();
       
      }
   }
}
*/

/*
class Que_11
{
  public static  void main(String[] args)
    {
       for(int i=1;i<=6;i++)
        {
          for(int j=6;j>=i;j--)
           {
              
             System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
             System.out.print(" *");
           }
        System.out.println();
       
        
        }
    }
}
*/


/*
class Que_12
{
  public static void main(String[] args)
   {
     int c=6;
     for(int i=1;i<=6;i++)
      {
        for(int j=2;j<=i;j++)
         {
             System.out.print(" ");
         }
        for(int k=1;k<=c;k++)
         {
           System.out.print(" *");
         }
      System.out.println();
      c--;
      }
   }
}
*/


/*
class Que_13
{
 public static void main(String[] args)
 {
    int c=0;
     for(int i=1;i<=6;i++)
      {
       for(int j=1;j<=11;j++)
        {
            if(i+j==7 || j-i==5 )
            {
              if(i==6)
              {
                   if(j==11)
                   System.out.print(" *");
                  continue;
              }
             System.out.print("*"); 
            }
            else if(i==6)
            {
                if(j%2==0 || c==11)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            else
            {
               System.out.print(" "); 
            }
        }
       
       
        System.out.println();
            
       }
 }    
}

*/



































































