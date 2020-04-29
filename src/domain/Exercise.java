package domain;
import java.util.Arrays;
import java.util.Random;
/** Содержит реализацию методов для посчёта суммы елементов строки*/
public class Exercise {
    public static String Calculate(byte N, byte M){
        byte[][] arr = new byte[N][M];
        byte[][] arrend = new byte[N][M+1];
        byte num = 0;
        Random random = new Random();
        String s = "";
        for(byte i = 0; i < N; i++)
            for(byte y = 0; y < M; y++)
                arr[i][y] = (byte) random.nextInt(5);
        for(byte i = 0; i < N; i++)
            for(byte y = 0; y < M; y++)
                arrend[i][y] = arr[i][y];
        for(byte[] row:arr)
            System.out.println(Arrays.toString(row));
        for(byte i = 0; i < N; i++){
            for(byte y = 0; y < M+1; y++)
                if(y==M){
                    arrend[i][y] = num;
                    num = 0;
                }
                else
                    num += arrend[i][y];
        }
        for(byte[] row:arrend)
            s += Arrays.toString(row)+"\n";
        return s;
    }
    
    
}
