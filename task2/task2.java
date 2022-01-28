import java.io.*;

public class task2 {
    public static void main(String[] args) throws IOException {

        int count = 0;

        float[] circle = new float[3];
        float[] dot = new float[2];

        BufferedReader reader1 = new BufferedReader(new FileReader(args[0]));
        while (true){
            String line = reader1.readLine();
            if (line == null) break;
            String[] words = new String[2];
            words = line.split(" ");
            if (words.length == 2) {
                circle[0] = Integer.parseInt(words[0]);
                circle[1] = Integer.parseInt(words[1]);
            }
            if (words.length == 1) circle[2] = Integer.parseInt(words[0]);

        }
        reader1.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(args[1]));
        while (true){
            String line = reader2.readLine();
            if (line == null) break;
            String[] words = new String[2];
            words = line.split(" ");
            dot[0] = Integer.parseInt(words[0]);
            dot[1] = Integer.parseInt(words[1]);

            System.out.println(count + " - " +  dotStatus(circle, dot));
            count++;
        }
        reader2.close();

    }
    public static String dotStatus(float[] c, float[] d){
        String res = new String();
        float h;
        d[0] -= c[0];
        d[1] -= c[1];
        h = (float) Math.sqrt( (d[0]*d[0]) + (d[1]*d[1]));
        if (h<c[2]) res = "точка лежит на окружности";
        if (h==c[2]) res = "точка внутри";
        if (h>c[2]) res = "точка снаружи";

        return res;
    }
}
