package level_0.Nov_28;

import java.util.Arrays;

public class Num {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 100, 99, 98};
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 0) {
                arr[i] += k;
            } else arr[i] *= k;
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2= {1, 2, 3, 100, 99, 98};
        int k2 = 3;

        int[] answer = Arrays.stream(arr2).map(operand -> k2 % 2 == 0 ? operand = k : operand * k).toArray();
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
