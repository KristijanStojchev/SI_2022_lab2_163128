import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) { // A
        if (list.size() <= 0) { // B
            throw new IllegalArgumentException("List length should be greater than 0"); // C
        }
        int n = list.size(); // D
        int rootOfN = (int) Math.sqrt(n); // E
        if (rootOfN * rootOfN  != n) { // F
            throw new IllegalArgumentException("List length should be a perfect square"); // G
        }
        List<String> numMines = new ArrayList<>(); // H
        for (int i = 0; i < n; i++) { // I.1 I.2 I.3 //9
            if (!list.get(i).equals("#")) { // J //10
                int num = 0; // K 11
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { // L
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ // M
                        num += 2; //N 14
                    }
                    else {
                        num  += 1; // O 15
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //P 16
                    num++; // Q 17
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ //R 18
                    num++; //S //19
                }
                numMines.add(String.valueOf(num)); //T 20
            }
            else {
                numMines.add(list.get(i)); //U 21
            }
        }
        return numMines;//V 22
    } //W end 23
}