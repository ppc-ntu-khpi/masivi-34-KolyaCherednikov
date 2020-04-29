package domain;
import java.util.Arrays;
import java.util.Random;
/** Содержит реализацию методов для посчёта суммы елементов строки*/
public class Exercise {
    public static String Calculate(byte N, byte M){
        byte[][] arr = new byte[N][M];
        byte num = 0;
        Random random = new Random();
        String s = "";
        for(byte[] row:arr)
            Arrays.fill(row, (byte) (random.nextInt(10)+1));
        for(byte[] row:arr)
            System.out.println(Arrays.toString(row));
        System.out.println();
        byte[][] arrend = new byte[N][M+1];
        byte i = 0;
        for(byte[] row:arr){
            arrend[i] = Arrays.copyOf(row,M+1);
            i++;
        }
        for(i = 0; i < N; i++)
            arrend[i][M] = (byte) (arrend[i][M-1]*M);
        
        for(byte[] rowend:arrend){
            s += Arrays.toString(rowend) + "\n";
        }
        return s;
    }
}
