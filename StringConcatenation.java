class Str {
    //String Concatenation : adding of two or more strings together.
    //1)By using (+) operator & 2)By using .concat() built-in function.

    public static void main(String[] args) {
        String s1 = "Biswarup ";
        String s2 = s1.concat("Singha");

        String str1 = "Marcos";
        str1 = str1.concat(" Tiger");

        System.out.println(s2);
        System.out.println(str1);

        String str3 = "Hello";
        String str4 = str3 + "World";

        System.out.println(str4);

        //(+) operator allows to add numbers with string but .concat() method doesn't allow this.
        String abc = "number" + 23 + 321 + 99.23;
        System.out.println(abc);
    }
}