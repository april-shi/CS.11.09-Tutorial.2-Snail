import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [][] snail_1 = new int[][]
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

        int[] snail_2 = {1,2,3,4,5,6,7,8,9};

        int[][] result = Snail.makeSnail(snail_2);

        for (int i = 0; i < result.length; i ++) {

            for (int j = 0; j < result[i].length; j++) {

                System.out.println(result[i][j]);

            }

        }

    }
}
