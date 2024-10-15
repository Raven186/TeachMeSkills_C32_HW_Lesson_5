
import com.teachmeskills.lesson5.Task_0;
import com.teachmeskills.lesson5.Task_1;
import com.teachmeskills.lesson5.Task_2;
import com.teachmeskills.lesson5.Task_3;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Task_0.task_0(create3DArray());
//        Task_1.task_1();
//        Task_2.task_2();
//        Task_3.task_3();
    }

    public static int[][][] create3DArray () {
        int[][][] array = new int[5][5][5];

        for(int i = 0; i < array.length; i += 1) {
            for(int j = 0; j < array[i].length; j += 1) {
                Arrays.setAll(array[i][j], k -> (int) Math.round(Math.random() * 10));
            }
        }
        System.out.println(Arrays.deepToString(array));
        return array;
    }

}
