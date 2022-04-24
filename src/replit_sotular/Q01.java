package replit_sotular;

public class Q01 {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

       e.g:

      char ch1= 'a' ;

      String name =“John came late"

     Expected Output: Number of a = 2
         */
        char ch1= 'a' ;

        String name ="John came late";
        int counter =0;

        for(int i=0; i<name.length()-1; i++){
            if (name.charAt(i)==ch1){
                counter++;
            }
        }
        System.out.println(ch1 +" harfi "+"girilen cumlede " + counter+ " defa vardir");
    }
}
