import java.util.Scanner;

public class RemoveConsicutive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
            for(int j=0;j<str.length()-1;j++){
                if(str.charAt(j)==str.charAt(j+1)){
                    continue;
                }
                else{
                    res+=str.charAt(j);
                }
        } 
        System.out.println(res+str.charAt(str.length()-1));
    }   
}
