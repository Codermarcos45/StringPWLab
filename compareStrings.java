public class compareStrings {

    public static void main(String args[])  {
        // (==) operator checks the references of two object
        // .equals : It checks the content of two object
        

        String fullName = "Biswarup Singha";
        String name = new String("Biswarup Singha");

        //it will give false because it doesn't refers same object even though content of the object are same.
        System.out.println("Comparison(reference) : "+(fullName==name));

        //it will give true because .equals() checks the content
        System.out.println("Comaparison(content) : "+fullName.equals(name));

        

    }
}