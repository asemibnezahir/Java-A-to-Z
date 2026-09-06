import java.util.Scanner;
public class InputTakingInJava
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        int age=input.nextInt();
        char section=input.next().charAt(0);
        float cgpa=input.nextFloat();
        boolean Passed=input.nextBoolean();
        System.out.println("Hello I am "+name+". "+"I am "+age+" years old. "+"I am in Section "+section+". My CGPA is "+cgpa+". ");
        System.out.print("Passing Status: "+Passed);
    }
}
