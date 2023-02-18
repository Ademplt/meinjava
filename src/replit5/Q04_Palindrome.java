package replit5;

public class Q04_Palindrome {
    /*
    Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.

   Input :I love Java.

Output:Reversed sentence : avaJ evol I. It is not a palindrome"
    */
    public static void main(String[] args) {
        String Input = "I love Java.";
        String temp = Input;
        String arr[] = Input.split("");
        String reversedSentence = "";

        for (int i = Input.length() - 1; i >= 0; i--) {
            reversedSentence += arr[i];

        }
        System.out.println(reversedSentence);
        if (!temp.equals(reversedSentence)) {
            System.out.println(" It is not a palindrome");
        }else{
            System.out.println("It is a palindrome");
        }
    }
}
