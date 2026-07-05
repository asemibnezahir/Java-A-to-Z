public class Operators
{
    public static void main(String[] args)
    {
        int A=18,B=5;

        // Arithmatic Operators
        int sum=A+B;
        int sub=A-B;
        int mul=A*B;
        int div=A/B;
        int mod=A%B;
        System.out.println("Summation is: "+sum);
        System.out.println("Substraction is: "+sub);
        System.out.println("Mulplication is: "+mul);
        System.out.println("Division is: "+div);
        System.out.println("Remainder is: "+mod);


        // Relational Operators
        boolean R1=(A==B);
        boolean R2=(A!=B);
        boolean R3=(A<=B);
        boolean R4=(A>=B);
        boolean R5=(A<B);
        boolean R6=(A>B);
        System.out.println("A is Equal to B: "+R1);
        System.out.println("A is not Equal to B: "+R2);
        System.out.println("A is Less than or Equal B: "+R3);
        System.out.println("A is Greater than or Equal B: "+R4);
        System.out.println("A is Less than B: "+R5);
        System.out.println("A is Greater than B: "+R6);


        // Logical Operators
        boolean C=true;
        boolean D=false;

        boolean AND=C&&D;
        boolean OR=C||D;
        boolean NOT=!C;
        System.out.println("When Logical AND: "+AND);
        System.out.println("When Logical OR: "+OR);
        System.out.println("When Logical NOT Applied on C: "+NOT);

        //Assignment Operator
        /* 
           1. A+=B --> A=A+B;
           2. A-=B --> A=A-B;
           3. A*=B --> A=A*B;
           4. A/=B --> A=A/B;
           5. A%=B --> A=A%B;
        */

        // Unary Operator
        int E=50;
        System.out.println("Printing E Normally: "+E);
        System.out.println("Printing E with Pre Increment: "+ ++E);
        System.out.println("Printing E After Pre Increment: "+E);
        System.out.println("Printing E with Post Increment: "+ E++);
        System.out.println("Printing E After Post Increment: "+E);
    }    
}
