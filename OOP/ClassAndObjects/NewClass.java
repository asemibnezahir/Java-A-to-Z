/*
    **********Some Topics About Classes**********
        ## Class Members:
            -> Nested Classes or Interfaces
            -> Constructors
            -> Blocks
            -> Methods or Functions
            -> Variable or Fields
*/




/* 
    *************** Methods *************** 

    ### Functions are named method in class in Java
    ### Method Parts-
        -> Parameters
        -> Return Type
        -> Access Modifier
        -> Block or Body or Code
    

    ### Types of Method by Ownership-

        -> Class Method-
            1. To define it "static" keyword is needed
            2. Class methods can be accessed by using class name or reference.
            3. To access class methods objects are not needed.
            4. Syntax--> Access_Modifier static return_type method_name (parameters)
                        {
                            Codes or Body
                        }

        -> Instance Method-
            1. To Access need object
            2. Can't be access with class only
            3. Syntax--> Access_Modifier return_type method_name (parameters)
                        {
                            Code or Body 
                        }
*/


/*
    *************** Constructors *************** 

    ### Constructor is a special type of method.
    ### Why Special ??
        -> They are used to initialize objects while creating
        -> They have no return type
        -> They are named exactly the same of the class name
        -> Every class has a default constructor and it is used defaultly if 
            no constructor is defined.
 */


/*
    *************** Blocks ***************

    ### Also called as Initializer Block
    ### Mainly 2 types-
        1. Class Initializer Block
            -> Not Depended on creating instance.
            -> Can be executed only with class.
            -> Executes only for one time after running program.
            -> Syntax--> static { Codes or Body }
        2. Instance or Object Initializer Block
            -> Executes only when an object created
            -> Executes at first for one time after creating every object.
            -> Syntax--> { Codes or Body }
*/


/*
    *************** Fields *************** 

    ### Fields means variable member in a class
    ### It also has 2 types-
        1. Class Variable-
            -> static keyword needed
            -> Can be accessed and modified inside Class Blocks and Class Methods
            -> Can't be accessed from instance block or methods
            -> Syntax--> Access_Modifier static data_type variable_name;
        2. Instance Variable-
            -> Can be accessed from instance blocks and instance methods.
            -> Can't be accessed from Class Blocks and Class Methods.
            -> Syntax--> Access_Modifier data_type variable_name;
*/


public class NewClass //Class Defined to use on other file
{
    public int id; // Instance Field or variable
    public static int classid=111; // Class Field or Variable
    public int insid=110;
    public NewClass(int id) // Constructor
    {
        this.id=id;
        System.out.println("ID No has been set "+id+" with constructor");
    }

    public void display() // Instance Method Built
    {
        System.out.println("ID No is: "+id+" displayed from instance method");
    }

    public static void classmeth() // Class Method Built
    {
        System.out.println("this is a Class Method Created");
    }

    { //Instance Block
        insid=115;
        System.out.println("this is an Instance Block Created and Insid is: " + insid);
    }

    static {
        classid=120;
        System.out.println("this is an Class Block Created and classid is: " + classid);
    }

}