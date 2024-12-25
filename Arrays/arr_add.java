import java.util.Scanner;
public class arr_add{
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
        int b[][]= new int[2][2];
        System.out.println("Second Array");
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                System.out.print("Enter element on "+(i+1)+":"+(j+1)+" - ");
                b[j][i]=sc.nextInt();
            }
        }
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                System.out.print(a[i][j]+b[j][i]+" ");
            }
            System.out.println();
        }
    }
}