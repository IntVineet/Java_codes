import java.util.Scanner;
public class arr_grt {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i,j,n=99;
        int a[][]= new int[2][2];
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                System.out.print("Enter element on "+(i+1)+":"+(j+1)+" - ");
                a[i][j]=sc.nextInt();
            }
        }
        int max=a[0][0];
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
            if (a[i][j]>max){
                max=a[i][j];
            }
            }
        }
        System.out.println(max);
    }
}