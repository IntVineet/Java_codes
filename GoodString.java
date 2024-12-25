import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] str1=str.toCharArray();
        int count=0;
        int max=0;
        int i=0;
        while(i<str1.length){
              if(str1[i]=='a'|| str1[i]=='e' || str1[i]=='i' || str1[i]=='o'|| str1[i]=='u'){
                    count++;
                    i++;
                    break;
                }
                else{
                        max=Math.max(max, count);
                        i++;
                        count=0;
                }
        }
        System.out.println(max);
    }   
}
