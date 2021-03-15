import jdk.nashorn.internal.objects.NativeString;

public class Palindrome {

    public void palindrome(String str,String t){


        for(int i = str.length()-1; i>=0; i-- ){

            t = t +str.charAt(i);
        }

        if(str.equals(t)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args){

        String str = "radar";
        String t = "";
        Palindrome p = new Palindrome();

        p.palindrome(str,t);
    }
}
