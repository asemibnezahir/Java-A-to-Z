public class SearchFromArrayProblem
{
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50};
        int searchval=25,index=0;
        boolean found=false;
        for(int val:arr)
        {
            if(val==searchval)
            {
                found=true;
                break;
            }
            index++;
        }
        if(found)
            System.err.println(searchval+ " is Found at index "+index);
        else
            System.err.println(searchval+ " is not Found.");
    }
}
