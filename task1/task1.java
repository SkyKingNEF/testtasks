import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        int n, m;

        n = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);

        int[] CircleMassive = new int[n];
        ArrayList<Integer> path = new ArrayList<>();

        for(int i=0; i<n; i++){
            CircleMassive[i] = i+1;
        }

        findPath(CircleMassive, m, n, path);

        for (int a:path
             ) {
            System.out.print(a);
        }
    }

    public static void findPath(int[] CircleMassive, int m, int n, ArrayList<Integer> path){
        int j=0;
        path.add(CircleMassive[0]);
        while (true){
            j+=(m-1);
            if (j>(n-1)) j-=n;
            if (CircleMassive[j] == CircleMassive[0]) break;
            path.add(CircleMassive[j]);
        }
    }
}
