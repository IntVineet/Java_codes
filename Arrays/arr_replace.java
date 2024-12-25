import java.util.Scanner;
public class arr_replace {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i,j,n=99;
        int a[][]= new int[3][4];
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                System.out.print("Enter element on "+(i+1)+":"+(j+1)+" - ");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                if(a[i][j]==2||a[i][j]==3||a[i][j]==4){
                    a[i][j]=n;
                }
            }
        }
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}