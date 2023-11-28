package level_0.Nov_27;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Keyboard {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        String[][] keymap1 = stream(keymap).map(s -> s.split("")).toArray(String[][]::new);
        String[][] target1 = stream(targets).map(m -> m.split("")).toArray(String[][]::new);
        System.out.println(Arrays.deepToString(keymap1));
        System.out.println(Arrays.deepToString(target1));
        int result[] = new int[keymap.length];
        int count=0;

        for (String[] wt : target1) { //target 2times
            int abs[] = new int[wt.length];
            for (String wt2 : wt) { //"ABCD" 4times
                int compare=9999;
            for (String[] first : keymap1) { //key 2times
                int j=0;
                for (String second : first) { //key 5times
                    j++;
                    if (second.equals(wt2)) {
                        count+=j; //3
                        break;
                    }

                    if (compare < count) {
                        break;
                    }else compare = count; break;
                }
                }
            } int i = 0;
            i++;

        }

    }
}
