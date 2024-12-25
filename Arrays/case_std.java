import java.util.Scanner;
public class case_std {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f=0;
        String s[] = {"Vineet", "Nitin", "Rohit", "Suraj", "Shivam"};
        String ph[] = {"7895641428", "8846987418", "2455569815", "7744865129", "5488759641"};
        System.out.print("Enter a name to found ");
        String ch = sc.nextLine();
        for(int i = 0; i < 5; i++) {
            if(s[i].equals(ch)) {
                System.out.print("Yes "+s[i]+" "+ph[i]);
                f=1;
            }
        }
        if(f==0) {
            System.out.print("No");
        }

    }
}
