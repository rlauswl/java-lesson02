package javalesson_02;

import java.util.Scanner;

public class ScoreAverage {

    public static void main(String[] args) {
        double score = getAverageScore(new Scanner(System.in));
        System.out.printf("당신의 점수는 %.2f점 입니다.%n", score);
        System.out.printf("당신은 %s 등급 입니다.", estimateGrade(score));
    }
    private static double getAverageScore(Scanner scanner) {
        Scanner scan=new Scanner(System.in);
        int loop = 0;
        int score = 0;
        while (true) {
            loop++;
            int x=scan.nextInt();
            if(x==0){
                break;
            }
            else{
                score+=x;
            }
        }
        return ((double)score) / ((double)loop);
    }

    private static String estimateGrade(double averageScore) {
        if(averageScore>=90){
            return "A";
        }
        else if(averageScore>=80){
            return "B";
        }
        else if(averageScore>=70){
            return "C";
        }
        else{
            return "D";
        }

    }

}