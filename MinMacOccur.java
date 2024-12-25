public class MinMacOccur {
    public static void main(String[] args) {
        String str="sas is reener on the other sied" ;
        int max=0;
        char cmax=' ';
        char cmin=' ';
        int min=Integer.MAX_VALUE;
        str=str.toLowerCase();
        for(char c='a';c<'z';c++){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    continue;
                }
                else if(str.charAt(i)==c){
                    count++;
                }
                if(count>max){
                    max=count;
                    cmax=str.charAt(i);
                }
                if(count<min){
                    cmin=str.charAt(i);
                    min=count;
                }
                }
                }
                System.out.println(cmin+" "+cmax);
    }   
}
