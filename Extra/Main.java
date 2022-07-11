import java.util.*;
public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         int m = scanner.nextInt();
         scanner.close();
        int nfact = 1;

        for (int i = 1; i < n;i++){
            nfact= nfact* i;
        }

        int mfact = 1;
        for (int i = 1; i < n; i++){
            mfact= mfact* i;
        }

        int nMmfact = 1;
        for (int i = 1; i < n-m; i++){
            nMmfact= nMmfact*i;
        }

        int lcm = (nfact / (mfact*nMmfact));

        System.out.println(lcm);


     }
}
