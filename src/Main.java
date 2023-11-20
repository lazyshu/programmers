import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "4 3 2 1";
        String ans[] = s.split(" ");
        int[] i = new int[ans.length];
        int up = 0;
        int max= Integer.parseInt(ans[0]);
        int min= Integer.parseInt(ans[0]);

        for (String meep :ans) {
            i[up] = Integer.parseInt(meep);
            if (max < i[up]) {
                max = i[up];
            }
            if(i[up]<min){
                min = i[up];
            }
        }
        String answer = min + " " + max;
        System.out.println(answer);


    }
}
