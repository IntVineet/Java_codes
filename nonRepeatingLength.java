public class nonRepeatingLength {
    public static void main(String[] args) {
        String str="ABCDEGABD";
        int count=0;
        int max=0;
        for(int i=0;i<str.length();i++){
            if(count>max){
                max=count;
                count=0;
            }
            for(int j=i;j<str.length()-1;j++){
                if(str.charAt(j)!=str.charAt(j+1)){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(max);
    }    

}
