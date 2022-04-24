package replit_sotular;

import java.util.ArrayList;
import java.util.List;

public class Q03 {
    /*
    Write a code that returns the duplicate chars in a String array.(interview Question)

    Input : String str=“Javaisalsoeasy”

    Output: [a, s]
     */
    public static void main(String[] args) {
        int count = 0;
        String str="Javaisalsoeasy";
       // char arr[]=str.toCharArray();
        List<String> lines = new ArrayList<>();
        for (int i =0; i<str.length(); i++){
            for (int j =i+1; j<str.length() ;j++){
                if (str.charAt(i)==str.charAt(j)){
              if (!lines.contains(String.valueOf(str.charAt(i)))){
                  lines.add(str.charAt(i)+"");
              }

                }


            }
        }
        System.out.println(lines);
    }
}
