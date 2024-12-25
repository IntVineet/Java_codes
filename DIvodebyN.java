class dividebyN{
    public static void main(String[] args) {
        String str="aaaabbbbcddd";
        int n=4;
        int part=0;
        if(str.length()%n==0){
             part=str.length()/4;
        }
        for(int i=0;i<str.length();i++){
            if((i+1)%part==0){
                System.out.println(" ");
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
}