import java.util.Scanner;

public class NonRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String[] str=new String[size];
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
        int index = -1;
        char fnc = ' ';
       for(int i=0;i<size;i++){
         if(str[i].length()==0){
         System.out.println("EMPTY STRING");
       }
              
        for (char j : str[i].toCharArray()) {
            if (str[i].indexOf(j) == str[i].lastIndexOf(j)) {
                fnc = j;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == str[i].length()-1) {
            System.out.println();
        }
        else {
            System.out.println("First non-repeating character is " + fnc);
        }
       }
    }
}
