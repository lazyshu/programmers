package leecode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dec_27 {
    public static void main(String[] args) {
        int c = 121;
        String[] v= Integer.toString(c).split("");
        String[] meep = new String[v.length];
        int j=0;
        
        for (int i = v.length-1; i >= 0; i--) {
            meep[j] = v[i];
            j++;
            System.out.println("i = " + i);
        }
        System.out.println("meep = " + Arrays.toString(meep));
        System.out.println("v = " + Arrays.toString(v));
        System.out.println(Arrays.equals(meep,v)?true:false);
    }
}
