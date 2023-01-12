package com.cs7eric.repo.sparsearray;

/**
 * 稀疏数组
 *
 * @author cs7eric
 * @date 2023/01/12
 */
public class SparseArray {

    public SparseArray() {
    }

    public static void main(String[] args) {
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[4][5] = 2;
        System.out.println("原始的二维数组~~");
        int[][] chessArr2 = chessArr1;
        int count = chessArr1.length;

        int i;
        int var7;
        int var8;
        for (i = 0; i < count; ++i) {
            int[] row = chessArr2[i];
            int[] var9 = row;
            var8 = row.length;

            for (var7 = 0; var7 < var8; ++var7) {
                i = var9[var7];
                System.out.printf("%d\t", i);
            }

            System.out.println();
        }

        int sum = 0;

        for (i = 0; i < 11; ++i) {
            for (count = 0; count < 11; ++count) {
                if (chessArr1[i][count] != 0) {
                    ++sum;
                }
            }
        }

        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        count = 0;

        for (i = 0; i < 11; ++i) {
            for (i = 0; i < 11; ++i) {
                if (chessArr1[i][i] != 0) {
                    ++count;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = i;
                    sparseArr[count][2] = chessArr1[i][i];
                }
            }
        }

        System.out.println();
        System.out.println("得到稀疏数组为~~~~");

        for (i = 0; i < sparseArr.length; ++i) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }

        System.out.println();
        chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];

        for (i = 1; i < sparseArr.length; ++i) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        System.out.println();
        System.out.println("恢复后的二维数组");
        int[][] var18 = chessArr2;
        var8 = chessArr2.length;

        for (var7 = 0; var7 < var8; ++var7) {
            int[] row = var18[var7];
            int[] var13 = row;
            int var12 = row.length;

            for (int var11 = 0; var11 < var12; ++var11) {
                int data = var13[var11];
                System.out.printf("%d\t", data);
            }

            System.out.println();
        }
    }
}