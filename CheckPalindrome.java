import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String Fhalf=str.substring(0,str.length()/2+1);
        String Lhalf="";
        for(int i=str.length()-1;i>=str.length()/2;i--){
            Lhalf+=str.charAt(i);
        }
        if(Fhalf.equals(Lhalf)){
            System.out.println("Palindorme");
        }
        else{
            System.out.println("Not");
        }
        
       
    }
}
