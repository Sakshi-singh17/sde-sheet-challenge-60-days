package Extras;

import java.util.HashMap;
import java.util.Map;

public class Non_Repeating_Character {
    public static char firstNonRepeatingCharacter(String str) {
            if(str.length()==1){
                return str.charAt(0);
            }

            // Write your code here
            Map<Character, Integer> map = new HashMap<>();
            for(int i=0; i<str.length();i++){
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }

            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(map.get(ch)==1){
                    return ch;
                }
            }

            return str.charAt(0);

        }
}
