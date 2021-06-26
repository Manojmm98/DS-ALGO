import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int moves[]= new int[n];
        for(int i=0;i<moves.length;i++){
            moves[i]=scn.nextInt();
        }
        System.out.println(SwvarJump(moves));
    }
    public static int SwvarJump(int moves[]){
        // we just calculate n whic is the given length and equal movies length 
        int n = moves.length;
        int qb[]= new int[n+1];

        for(int i=n;i>=0;i--)
        {
            // if the i will be n then we can jump directly through 1 step
            if(i==n){
                qb[i]=1;
            }
            else{
                // maxjump is equal to the number of moves equal to moves[i]
                int maxjmp=moves[i];
                // if maxjump is zero then we can jump 0 steps
                if(maxjmp==0){
                    qb[i]=0;
                }
                // if we start the jump from 1 step to maxjump and jump wouldnot exceeds the steps given so jmp+i should be less than n
                for(int jmp=1;jmp<=maxjmp && jmp+i<=n;jmp++){
                    qb[i]+=qb[i+jmp];
                }
            }
        }
        return qb[0];
    }
}