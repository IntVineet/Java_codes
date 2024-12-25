public class Subsets {
    public static void main(String[] args) {
        String str="ABC";
        for(int i=0;i<str.length();i++){
            String ans="";
            for(int j=i;j<str.length();j++){
                ans+=str.charAt(j);
                System.out.println(ans);
            }
        }
    }
}
