package javalesson_02;

import java.util.Random;
import java.util.Scanner;


public class DoWhileIteration {
    static final Random random = new Random();

    static final Scanner scanner = new Scanner(System.in);

    static final int TARGET_VALUE = 21;

    static int currentValue = 0;

    public static void main(String[] args) {
        System.out.println("시작합니다.");
        checkValue();
        if (currentValue >= TARGET_VALUE) {
            System.out.println("최종 점수: 0");
            System.out.println("패배했습니다.");
        } else {
            System.out.println("최종 점수: " + (TARGET_VALUE - (TARGET_VALUE - currentValue)));
        }
    }

    private static void checkValue() {
        do {
            increaseValue();
        }
        while (!stopGame());
    }


    public static boolean stopGame() {
        if (TARGET_VALUE <= currentValue)
            return true;
        String nextValue = null;
        while (true) {
            System.out.print("계속 합니까? (Y / N) : ");
            String input = scanner.next();
            if (input.equals("Y") || input.equals("N")) {
                nextValue = input;
                break;
            }
            System.out.println();
        }
        return nextValue.equals("N");
    }


    private static void increaseValue() {
        currentValue += random.nextInt(10) + 1;
    }
}