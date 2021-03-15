public class StringManipulation {

    public static void main(String[] args) {
        //String Concatenation
        String str1 = "Rock";
        String str2 = "Star";
        //Method 1 : Using concat
        String str3 = str1.concat(str2);
        System.out.println(str3);
        //Method 2 : Using "+" operator
        String str4 = str1 + str2;
        System.out.println(str4);
        //Length of a string
        System.out.println("Length of String: " + str4.length());
        System.out.println("Character at position 5: " + str4.charAt(5));
        //Index of a given character
        System.out.println("Index of character 'S': " + str4.indexOf('S'));

        System.out.println("Contains sequence 'tar': " + str4.contains("tar"));

        System.out.println("EndsWith character 'r': " + str4.endsWith("r"));

        System.out.println("Replace 'Rock' with 'Duke': " + str4.replace("Rock", "Duke"));
        //Convert to Lowercase
        System.out.println("Convert to LowerCase: " + str4.toLowerCase());
        //Convert to UpperCase
        System.out.println("Convert to UpperCase: " + str4.toUpperCase());


    }
}