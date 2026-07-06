public class ObjectFile
{
    public static void main(String[] args)
    {
        //NewClass is a defined class or User Defined Data type, Defined on other file.
        NewClass n1=new NewClass(101); //n1 object of NewClass declared 
        n1.display(); //Called declared method and showed default info
        n1.id=105; // Modified info of object n1
        n1.display(); //Again Display info after modification for n1

        NewClass n2=new NewClass(102); //Object Declaration
        n2.id=110; //Member Access
        n2.display(); //Instance Method Call

        NewClass.classmeth(); //Class Method Call
    }
}
