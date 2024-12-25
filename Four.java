import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            int count=0;
          while(arr[i]>0){
            int r=arr[i]%10;
            arr[i]=arr[i]/10;
            if(r==4){
                count++;
            }
        }
        System.out.println(count);
        }
    }
}
