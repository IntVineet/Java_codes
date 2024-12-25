import java.util.Scanner;

public class Capital {
         public static void main(String[] args) {     
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans="";

            ans+=str.substring(0,1).toUpperCase();
             ans+=str.substring(1);
             System.out.println(ans);
            
    }
    }

