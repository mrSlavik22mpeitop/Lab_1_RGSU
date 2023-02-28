

import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int N = 1;
        int M = 1;
        int X = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк:");
       if (in.hasNextInt()){
             N = in.nextInt();
      }
       else
      {
           System.out.println("Вы ввели не число, смените тип данных)");
           System.exit(1);
       }
        System.out.print("Введите количество столбцов:");
        if (in.hasNextInt())
      {
             M = in.nextInt();
        }
        else
        {
            System.out.println("Вы ввели не число, смените тип данных)");
            System.exit(1);
        }
        System.out.print("Введите границу допустимых значений:");
        if (in.hasNextInt())
        {
             X = in.nextInt();

        }
        else
        {
            System.out.println("Вы ввели не число, смените тип данных)");
            System.exit(1);
        }
        int[][] massive = new int[N][M];
        Random rand = new Random();
        int i;
        int j;
        for(i = 0; i < N; ++i) {
            for(j = 0; j < M; ++j) {
                massive[i][j] = rand.nextInt(X);
            }
        }

        for(i = 0; i < N; ++i) {
            for(j = 0; j < M; ++j) {
                if (i == j) {
                    massive[i][j] *= massive[i][j];
                }

                System.out.print(massive[i][j] + " ");
            }

            System.out.println();
        }

    }
}
