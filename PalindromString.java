import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean res=true;
        StringBuilder ans=new StringBuilder(str);
        if(ans.reverse().equals(ans)){
            System.out.println(res);
        }else{
            res=false;
            System.out.println(res);
        }
        
    }
}
