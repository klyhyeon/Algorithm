package baekJoon.week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GoldBach_9020_ex2 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine().trim());
        int[] prime=new int[10000];
        prime[0]=1;
        prime[1]=1;
        for(int i=2;i<10000;i++){
            if(prime[i]==0){
                for(int j=2;i*j<10000;j++){
                    prime[i*j]=1;
                }
            }
        }
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(br.readLine().trim());
            for(int j=N/2;;j--){
                if(prime[j]==0&&prime[N-j]==0){
                    bw.write(j+" "+(N-j)+"\n");
                    break;
                }
            }
        }
        bw.close();

    }
}
