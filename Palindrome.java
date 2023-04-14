import java.util.Scanner;

class Palindrome {
    
    public static boolean isPalindrome(String str) {
        String str2 = "";

        for(int i=str.length()-1;i>=0;i--) {
            str2 = str2 + str.charAt(i);
        }

        if(str.equals(str2)) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        String str;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        str = sc.nextLine();

        if(isPalindrome(str)) {
            System.out.println("Palindrome >>> ");
        } else {
            System.out.println("Not palindrome!!!");
        }
    }
}