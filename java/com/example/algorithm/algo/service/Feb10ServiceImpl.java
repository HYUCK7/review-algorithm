package com.example.algorithm.algo.service;

import java.util.Scanner;

/**
 * packageName: com.example.algorithm.algo.service
 * fileName   : Feb10ServiceImpl
 * author     : HYUCK7
 * date       : 2022/02/13
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/13         HYUCK7         최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service {
    @Override
    public void magicSquare(Scanner scanner) {
        /**
         * 홀수 마방진 구하기
         * 1. 시작은 첫 행, 한 가운데 열에 1을 둔다.
         * 2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
         * 3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
         * 4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
         * 5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화가 없다.
         * 참고) https://cbts.tistory.com/65/
         *
         * */
        int num;
        while (true) {
            num = (int)(Math.random() * 9) + 1;
            if (num % 2 == 1 && num != 1) {
                break;
            }
        }
        /**
         * 첫 while문은 무한 루프로, num값이 홀수를 나오게 만든다. num은 랜덤값이되, 1과 10사이의 수만 나온다.
         * if문은 활용해 num %2 == 1, 2로 나누었을 경우, 나머지는 1이 되는 수여야 하며, num!=1 1은 아니여야만,
         * &&(논리곱, 양 곱하는 값이, 둘 다 true)여야만 조건을 만족합니다. 따라서, if가 실행되고, 3,5,7,9의 값이여야만
         * 코드가 진행됩니다.
         */

        int array[][] = new int[num][num];
        int row, col;
        row = 0;
        col = num / 2; // 마방진은 1행 가운데 열에서부터 시작
        /** num = 5라고 가정합니다.
         *  마방진은 1행 가운데 열부터 시작해야하므로, 열의 가운데부터 시작하기 위해
         *  5/2 = 2 이므로, 0,1,2,3,4로 열의 가운데 오게 됩니다.
         */

        for (int i = 1; i <= num * num; i++) {
            array[row][col] = i;
            if (i % num == 0) {
                row++;
                if (row == num) {
                    row = 0;
                }
            } else {
                row--;
                col++;
                if (row == -1) {
                    row = num - 1;
                }
                if (col == num) {
                    col = 0;
                    /**
                     *  i는 해당 칸의 들어가는 수를 의미합니다. 마방진의 칸에서 넘어가지 않도록 5 * 5가 넘지 않도록 합니다.
                     *  5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화가 없다. -> if문을 이용해 row의 값만 증가하도록 합니다.
                     *  else 이후로는 2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
                     *  3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
                     *  4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
                     */
                }
            }
        }
        for (row = 0; row < num; row++) {
            for (col = 0; col < num; col++) {
                System.out.printf("%3d", array[row][col]);
            }
            System.out.println();
        }
    }
    }

