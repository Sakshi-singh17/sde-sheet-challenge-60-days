package Extras;

public class Compress_String {
    public static String getCompressedString(String str) {
        // Write your code here.
        // Write your code here.
        StringBuilder ans = new StringBuilder();
        char prev = str.charAt(0);
        int count = 1;
        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch==prev){
                count++;
            }
            else{
                ans.append(prev);
                if(count>1){
                    ans.append(count);
                }
                count=1;
                prev = ch;

            }
        }
        ans.append(prev);
        if(count>1){
            ans.append(count);
        }

        return ans.toString();
    }
}
