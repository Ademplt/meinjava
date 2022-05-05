package replit6;

public class Q02_stringBuilder {
    public static void main(String[] args) {
        /*
        Write a java program which accept a sentence as parameter,
        than reverses sentence by using StringBuilder
        and checks if sentence is palindrome or not (without case sensitivity) Eg :
        input : I love Java Output: "Reversed sentence : avaJ evol I . It is not a palindrome"
         */
        String str = "madam";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb1.append(str);
        System.out.println("sb1 =" + sb1);
        sb2.append(sb1.reverse());
        System.out.println("sb2 = " + sb2);
        if (sb2.toString() != sb1.toString()) {
            System.out.println("It is not a Palindrom");
        } else {
            System.out.println("It is a Palindrom");
        }

    }
}
