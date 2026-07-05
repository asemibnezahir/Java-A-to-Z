public class Loop
{
    public static void main(String[] args)
    {
        // for loop
        System.out.println("For Loop: ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();


        // while loop
        System.out.println("While Loop: ");
        int j=1;
        while(j<10)
        {
            System.out.println(j);
            j+=2;
        }
        System.out.println();
        System.out.println();

        
        //do while loop
        System.out.println("Do While Loop: ");
        int k=2;
        do
        {
            System.out.print(k+" "); //Print Function for avoiding default newline
            k+=2;
        }while(k<=10);
        System.out.println();
        System.out.println();


        //Nested Loop;
        System.out.println("Nested Loop: ");
        int n=5;
        for(int l=1;l<=n;l++)
        {
            for(int m=1;m<=n;m++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        //Break
        System.out.println("Break: ");
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();


        //Continue
        System.out.println("Continue: ");
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
    }    
}
