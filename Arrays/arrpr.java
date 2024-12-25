import java.util.*;
public class arrpr {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int i,j,n;
            n=50;
            int b[] = new int[n];
            int count=0;
            for(i=0; i<n; i++){
                b[i]=i+1;
            }

            for(j=0; j<n; j++) {
                count = 0;
                for (int k = 1; k <= b[j]; k++) {
                    if (b[j] % k == 0) {
                        count = count + 1;
                    }
                }
            }
            if(count==2){
                    System.out.print("Prime- "+b[j]);
                }
            else if(count>2){
                    System.out.print("Not prime- "+b[j]);
                }

        }
    }
