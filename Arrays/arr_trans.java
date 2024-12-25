import java.util.Scanner;
public class arr_trans {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i=0,j=3,n=99;
        int a[][]= new int[3][4];
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                System.out.print("Enter element on "+(i+1)+":"+(j+1)+" - ");
                a[i][j]=sc.nextInt();
            }
        }
        int b[][]= new int[4][3];
        for(i=0; i<4; i++){
            for(j=0; j<3; j++){
                b[i][j]=a[j][i];
            }
        }
        for(i=0; i<4; i++){
            for(j=0; j<3; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}