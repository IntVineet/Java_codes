import java.util.Scanner;

public class LargestSmallestWord {
    public static void main(String[] args) {
        String str= "Hardships often prepare ordinary people for an extraordinary destiny"  ;
        String arr[]=str.split(" ");
        int max=0;
        String smax="";
        String smin="";
        int min=Integer.MAX_VALUE;
        for(String s:arr){
        if(max<s.length()){
            max=s.length();
            smax=s;
        }
        if(min>s.length()){
            min=s.length();
            smin=s;
        }
        }
        System.out.println(smax+" "+smin);
    }
}
