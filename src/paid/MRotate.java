package paid; // https://leetcode.com/problems/rotate-image/

// paid 4/25

public class MRotate {
    public static void rotate(int[][] matrix) {
        if (matrix.length==1 || matrix.length==0) {
            return;
        }
        int n=matrix.length-1;
        int hold; int temp;
        for (int i=0; i<(n+1)/2; i++) {
            //
            for (int j=i; j<=n-i-1; j++) {
                hold=matrix[j][n-i];
                matrix[j][n-i]=matrix[i][j];
                temp=matrix[n-i][n-j];
                matrix[n-i][n-j]=hold;
                hold=matrix[n-j][i];
                matrix[n-j][i]=temp;
                matrix[i][j]=hold;

            }
        }
    }

    public static void main(String[] args) {
        int[][] test= {{1,2,3},
  {4,5,6},
  {7,8,9}};

        int[][] test2= {{ 5, 1, 9,11},
  { 2, 4, 8,10},
  {13, 3, 6, 7},
  {15,14,12,16}};

        rotate(test);

        for (int i=0; i<test.length; i++) {
            for (int j=0; j<test.length; j++) {
                System.out.print(test[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        rotate(test2);

        for (int i=0; i<test2.length; i++) {
            for (int j=0; j<test2.length; j++) {
                System.out.print(test2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
