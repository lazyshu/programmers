package level_0.Nov_25;

import java.util.stream.IntStream;

public class Novem_twentyfive {
    public static void main(String[] args) {


        int[] num_list1= new int[]{1, 2, 3, 4, 5};
        int n1=6;
        int answer = IntStream.of(num_list1).anyMatch(meep -> meep == n1) ? 1 : 0;

        System.out.println(answer);


    }

}
