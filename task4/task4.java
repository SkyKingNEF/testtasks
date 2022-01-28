import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) throws IOException {
        int count = 0;

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.readLine()!=null) count++;
        reader.close();

        int[] words = new int[count];

        BufferedReader reader1 = new BufferedReader(new FileReader(args[0]));
        for (int i = 0; i<count; i++){
            words[i] = Integer.parseInt(reader1.readLine());
        }
        reader1.close();

        System.out.println(countOfSteps(words));
    }
    public static int countOfSteps(int[] d){
        int res=0, m;
        Arrays.sort(d);
        m = d[d.length/2];

        for(int i=0; i<d.length; i++){
            res += Math.abs(d[i]-m);
        }

        return res;
    }
}
