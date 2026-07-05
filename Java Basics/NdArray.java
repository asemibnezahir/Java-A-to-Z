public class NdArray
{
    public static void main(String[] args)
    {
        // 2D Array
        System.out.println("2D Array: ");
        int[][] Arr2D={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<Arr2D.length;i++)
        {
            for(int j=0;j<Arr2D[i].length;j++)
            {
                System.out.print(Arr2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // 3D Array
        System.out.println("3D Array: ");
        int[][][] Arr3D={{{1,2},{3,4}},{{5,6},{7,8}}};
        for(int[][] a:Arr3D)
        {
            for(int b[]:a)
            {
                for(int c:b)
                {
                    System.out.print(c+" ");
                }
                System.out.print(" ");
            }
            System.out.print("  ");
        }
    }
}
