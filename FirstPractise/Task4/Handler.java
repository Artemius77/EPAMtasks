package FirstPractise.Task4;

public class Handler {
/*
    1  2  3  4
    5  6  7  8
    9 10 11 12
    13 14 15 16
 */
    public static  void rotate(int[][] mat) {
        if (mat.length != mat[0].length){ System.out.println("Given matrix is not square"); return;}

        int N = mat.length;
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++)
        {
            //  elements in group of 4
            for (int y = x; y < N-x-1; y++)
            {

                int temp = mat[x][y];

                //  from right to top
                mat[x][y] = mat[y][N-1-x];

                //  from bottom to right
                mat[y][N-1-x] = mat[N-1-x][N-1-y];

                //  from left to bottom
                mat[N-1-x][N-1-y] = mat[N-1-y][x];

                mat[N-1-y][x] = temp;
            }
        }
    }

}
