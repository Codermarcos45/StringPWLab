import java.util.Scanner;

class ReverseOfAString {


    //CASE 1 : "biswarup singha" >> "ahgnis purawsib" 
    public static String reverStringCase1(String name) {
        String name2 = "";

        for(int i=name.length()-1;i>=0;i--) {
            name2 = name2 + name.charAt(i);
        }
        
        return name2;
    
        }

    //CASE 2 : "Biswarup Singha want to be an actual programmer." >> "programmer actual an be to want Singha Biswarup"
    public static void reverStringCase2(String name) {
        String str = "";

        String strArr[]  = name.split(" ");

        for(int i=strArr.length-1;i>=0;i--) {
            str = str +" "+ strArr[i];
        }

        System.out.println("CASE 2 : Reverse String is : \""+str+"\"");
    }

    //CASE 3 : "Bharat Mata Ki Jay" >> "tarahB ataM iK yaJ"
    public static void reverseStringCase3(String name) {

        String strArr[] = name.split(" ");
        String str = "";

        for(int i=0;i<strArr.length;i++) {
            str = str + " " + reverStringCase1(strArr[i]);
        }

        System.out.println("Revrese String CASE : 3 >>>> "+str);


    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String name = sc.nextLine();

        System.out.println("Reverse String CASE 1 : "+reverStringCase1(name));
        reverStringCase2(name);
        reverseStringCase3(name);

    }
}
