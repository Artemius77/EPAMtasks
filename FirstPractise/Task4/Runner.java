package FirstPractise.Task4;

import java.util.Arrays;

public class Runner {

    public static void run(){
        System.out.println("Current Matrix\n");
        int mat[][] =
                {
                        {1, 2, 3, 4,7},
                        {5, 6, 7, 8,9},
                        {9, 10, 11, 12,-1},
                        {13, 14, 15, 16,-4},
                        {1,5,2,4,6}
                };
        displayMatrix(mat);
        System.out.println("Rotated Matrix\n");
        Handler.rotate(mat);
        displayMatrix(mat);

    }

    static void displayMatrix( int mat[][])
    {
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat.length; j++)
                System.out.print(" " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
