package level_0.Nov_28;

import java.util.Arrays;

public class Decode {
    public static void main(String[] args) {
        String my_string = "zpiaz";
        int[] index_list = {1, 2, 0, 0, 3};
        char[] chr_string = my_string.toCharArray();
        String answer = "";
        for (int i = 0; i < index_list.length; i++) {
            answer += chr_string[index_list[i]];
        }
        System.out.println(" answer = " +  answer);
    }
}
