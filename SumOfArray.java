import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={6,2,4};
        int arr2[]={7,5,6};
       ArrayList<Integer> ans=new ArrayList<Integer>();
        int crry=0;
        int sum=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+arr2[i]+crry;
            if(sum==10){
                ans.add(0);
            }
            else if(sum>9){
                ans.add(j, 1);
                ans.add(j+1, sum%10);
                crry=1;
                j=j+2;
            }
            else{
                ans.add(j,sum);
                j++;
                crry=0;
            }
        }
       for(int i:ans){
        System.out.print(i);
       }
    }
}
