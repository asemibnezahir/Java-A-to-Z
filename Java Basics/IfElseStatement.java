public class IfElseStatement
{
    public static void main(String[] args)
    {
        int Num=-10;


        // Simple If-Else
        if(Num%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }


        // If-Else Ladder (When More than 1 condition)
        if(Num>0)
        {
            System.out.println("Number is Positive");
        }
        else if(Num<0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }

        
        // Nested If-Else (When Condition Under Condition)
        if(Num%2==0)
        {
            if(Num>0)
            {
                System.out.println("Number is Even Positive");
            }
            else
            {
                System.out.println("Number is Even Negative");
            }
        }
        else
        {
            if(Num>0)
            {
                System.out.println("Number is Odd Positive");
            }
            else
            {
                System.out.println("Number is Odd Negative");
            }
        }
    }    
}
