import java.util.ArrayList;
import java.util.Arrays;

class DuplicatesWords{
    public static void main(String[] args) {
        String str= "big black bug bit a big black dog on his big black nose";
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                else if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            if(count>0){
                System.out.println(arr[i]);
            }
        }
    }
}