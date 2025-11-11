package Extras;
import java.util.*;
public class Remove_Duplicates_String {
        public static String removeDuplicates(String str)
        {
            //Your code goes here
            if(str.length()==1){
                return str;
            }
            Set<Character>set = new LinkedHashSet<>();
            for(int i=0; i<str.length(); i++){
                set.add(str.charAt(i));
            }

            StringBuilder ans = new StringBuilder();

            Iterator<Character>index = set.iterator();
            while(index.hasNext()){
                ans.append(index.next());
            }

            return ans.toString();
        }
}
