//Set Matrix Zero
//Problem Statement: Given a matrix
// if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.
//Brute force
import java.util.*;
class TUF {
    static void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {

                    int ind = i - 1;
                    while (ind >= 0) {
                        if (matrix[ind][j] != 0) {
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    ind = i + 1;
                    while (ind < rows) {
                        if (matrix[ind][j] != 0) {
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }
                    ind = j - 1;
                    while (ind >= 0) {
                        if (matrix[i][ind] != 0) {
                            matrix[i][ind] = -1;

                        }
                        ind--;
                    }
                    ind = j + 1;
                    while (ind < cols) {
                        if (matrix[i][ind] != 0) {
                            matrix[i][ind] = -1;

                        }
                        ind++;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] <= 0) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void main(String args[]) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//initially we are actually making all the values -1 because if we make zero in the next iteration it might change tat
//row and column as also zero -->it may affect other rows

//better approach
//import java.util.*;
class TUF{
    static void setZeroes(int [][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int dummy1[]=new int[rows];
        int dummy2[]=new int[cols];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dummy1[i] == 0 || dummy2[j]==0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//Time Complexity: O(N*M + N*M)
//
//Space Complexity: O(N)
