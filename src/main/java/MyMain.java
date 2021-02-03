
public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        if(x<10)
        {
            return x;
        }
        else
        {
            int var1 = x-(x%10);
            return (x%10)+addDigits(var1/10);
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if(str.length()<=1)
        {
            return true;
        }
        else if(str.charAt(0)== str.charAt(str.length()-1))
        {
            return isPalindrome(str.substring(1,str.length()-1));
        }
        else
        {
            return false;
        }  
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        if(str.length()<=1)
        {
            return str;
        }
        else
        {
            String newTxt = reverse(str.substring(1)) + str.charAt(0);
            return newTxt;
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(2468));
        System.out.println(isPalindrome("kayak"));
        System.out.println(reverse("My name is Finn Watson"));
    }
}
