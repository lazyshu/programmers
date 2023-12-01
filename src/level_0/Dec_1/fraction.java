package level_0.Dec_1;

import java.util.Arrays;

public class fraction {
    public static void main(String[] args) {
        int numer1=9;
        int denom1=2;
        int numer2=1;
        int denom2=3;
        //29 .6
        int result[] = new int[2];
        int times=0;
        if (denom1 % denom2 > 0) {
           result[0]= (denom1 > denom2) ? (denom1 / denom2)*numer2+numer1 :(denom2>denom1)? (denom2 / denom1)*numer1+numer2:numer2+numer1;
           result[1] = (denom1 > denom2) ? denom1 : denom2;
        } else {
            result[0] = numer1 * denom2 + numer2 * denom1;
            result[1] = denom2 * denom1;
        }

        System.out.println(Arrays.toString(result));
        System.out.println(2%3);
    }
}
