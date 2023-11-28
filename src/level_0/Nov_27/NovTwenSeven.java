package level_0.Nov_27;

import java.util.Arrays;
import java.util.Scanner;

public class NovTwenSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int c = 3;

        int b_square = a*a-c*c;

        System.out.println(b_square);

        int start_num=10;
        int end_num=3;
        int[] answer = new int[start_num - end_num + 1];
        for(int i=0; i<answer.length; i++){
            answer[i]= start_num--;
        }
        System.out.println(Arrays.toString(answer));
    }
}
