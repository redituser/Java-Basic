package Main;

import java.util.Random;

public class ReversArray {

    public static void main(String[] args) {
        // 랜덤 배열 생성
        int[] randomArr = RandomArray(5);

        // 생성된 랜덤 배열 출력
        System.out.println("Random Array:");
        displayArray(randomArr);

        // 랜덤 배열 뒤집기
        reverseArray(randomArr);

        // 뒤집힌 배열 출력
        System.out.println("Reversed Array:");
        displayArray(randomArr);
    }

    static int[] RandomArray(int size) {
        int[] randomArr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomArr[i] = random.nextInt(100);
        }
        return randomArr;
    }

    static void reverseArray(int[] numArr) {
        for (int i = 0; i < numArr.length / 2; i++) {
            swapArr(numArr, i, numArr.length - 1 - i);
        }
    }

    static void swapArr(int[] numArr, int source, int target) {
        int temp = numArr[source];
        numArr[source] = numArr[target];
        numArr[target] = temp;
    }

    static void displayArray(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
    }
}
