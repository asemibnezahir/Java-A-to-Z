public class Array
{
    public static void main(String[] args)
    {
        // Array Declaration
        int[] arr=new int[5];

        //Array Initialization
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        // Array Printing with traverse
        for(int i=0;i<arr.length;i++) //Normal For Loop
            System.out.print(arr[i]+" ");
        System.out.println();
        for(int val:arr) //For Each Loop(Every element access shortcut)
            System.out.print(val+" ");
        System.out.println();
        System.out.println();

        //Declaration & Initialization at same time
        int[] arr2={10,20,30,40};
        System.out.print("Printing Array-2: ");
        for(int val:arr2) 
            System.out.print(val+" ");
    }   
}
