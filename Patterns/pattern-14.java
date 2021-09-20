import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // we have to print 3*1 = 3 , 3*2=6 , 3*3=9 so on till 10 times for any input n (here we took n=3)
        int n = scn.nextInt();
        // store the n value in x
        int x = n;
        for(int i=1;i<=10;i++){
            // result will be val * i  for every iteratio i increases from 1 to 10 so new val is val = x *i lastly print it in the given format
          int val = x *i;
           System.out.println(x + " * " + i + " = " + val);
        }
        

    }
}