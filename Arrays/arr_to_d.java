import java.util.Scanner;
class arr_to_d{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        int a[][]= new int[3][4];;
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                System.out.print("Enter element on "+(i+1)+":"+(j+1)+" - ");
                a[i][j]=sc.nextInt();
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