import java.util.Scanner;


public class Foootball {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // int count1=0;
        // Boolean ans=false;
        // for(int i=0;i<str.length()-1;i++){
        //     if(str.charAt(i)==str.charAt(i+1)){
        //         count1++;
        //     }
                //else
                //count=0;
        //     if(count1==7){
        //         System.out.println("YES");
        //         break;
        //     }
        // }
        if(str.contains("1111111") || str.contains("0000000")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }   
}
