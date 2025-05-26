package InterviewQ;

import java.util.Scanner;

public class MatrixZero {
    public static void main(String[] args) {
        int row = 3, col = 4;
        int matrix[][] = new int[row][col];
        Scanner reader = new Scanner(System.in);
        for (int var = 0; var < row; var++) {
            for (int colvar = 0; colvar < col; colvar++) {
                matrix[var][colvar] = reader.nextInt();

            }

        }

        // System.out.println(matrix.length);
        doMatrx(matrix);




    }

    public static void doMatrx(int test[][]) {
        int tempRow = 0, tempCol = 0;
        for (int var = 0; var < test.length; var++) {
            for (int colvar = 0; colvar < test[0].length; colvar++) {
                if (test[var][colvar] == 0) {
                    tempRow = var;
                    tempCol = colvar;
                    for (int j = 0; j < test.length; j++) {
                        test[tempRow][j] = 0;

                    }
                    for (int j = 0; j < test.length; j++) {
                        test[j][tempCol] = 0;

                    }

                }
            }

        }


        for (int var = 0; var < test.length; var++) {
            for (int colvar = 0; colvar < test[0].length; colvar++) {
                System.out.print(test[var][colvar] + "  ");

            }
            System.out.println();

        }


    }


}
