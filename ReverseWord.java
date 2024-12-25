public class ReverseWord {
    public static void main(String[] args) {
        String str="Dream bug";
        StringBuilder res=new StringBuilder(str);
        System.out.println(res.reverse());
        String arr[]=str.split(" ");
        String ans="";
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                ans+=arr[i].charAt(j);
            }
            ans+=" ";
        }
        System.out.println(ans);
    }   
}
