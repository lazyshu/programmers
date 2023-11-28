package level_0.Nov_28;

import java.util.Arrays;
import java.util.stream.Stream;

public class Delete {
    public static void main(String[] args) {
        int[] arr={293, 1000, 395, 678, 94} ;
        int[] delete_list={94, 777, 104, 1000, 1, 12};
        String answer="";
        for(int m: arr){
            Boolean check = false;
            for (int del : delete_list) {
                if (m == del) {
                    check=true;
                }
            }
            if (check == false) {
                answer+=m +" ";
            }
        }
        int[] ans = Arrays.stream(answer.trim().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        System.out.println("answer = " + ans);
    }
}
