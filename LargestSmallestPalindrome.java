import java.io.StringBufferInputStream;

public class LargestSmallestPalindrome {
public static void main(String[] args) {
  String str="wow you own the kayak";
  String [] arr=str.split(" ");
  boolean p=true;
  int max=0;
  int min=Integer.MAX_VALUE;
 String smax="";
 String smin="";
 for(String s:arr){
   for(int i=0;i<s.length();i++){
     if(s.charAt(i)==s.charAt(s.length()-i-1)){
     p=true;
    }
    else{
      p=false;
      break;
    }
   }
 if(p){
  if(max<s.length()){
    max=s.length();
    smax=s;
}
if(min>s.length()){
    min=s.length();
    smin=s;
}
 }
  }
  System.out.println(smax+" "+smin);
}
}
