import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,2,3}, {5,9,2}, {6,2,8}};
       altValue2dArr(arr);

    }
    static void altValue2dArr (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                List<Integer> newArr = new ArrayList<>();
                newArr.add(arr[j][i]);
                System.out.print(newArr);

            }
        }
    }

}
