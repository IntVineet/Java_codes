public class Frequency {
    public static void main(String[] args) {
        String str= "big black bug bit a big black dog on his big black nose" ;
        str=str.toLowerCase();
        for(char c='a';c<'z';c++){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==c){
                    count++;
                }
            }
            if(count==0){
                continue;
            }
            else{
                System.out.println(c+" "+count);
            }
        }
    }
}
