import java.util.Scanner;
public class MainDiagonalSum {
    static void findMainDiagonalSum(int[][] array,int row,int column)
    {
        int sum=0;
        for (int i=0;i<row;i++)
        {
            sum+=array[i][i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int R=scanner.nextInt();
        int C=scanner.nextInt();
        int[][] A=new int[R][C];
        for (int i=0;i<R;i++)
        {
            for (int j=0;j<C;j++)
            {
                A[i][j]=scanner.nextInt();
            }
        }
        findMainDiagonalSum(A,R,C);
    }
}

