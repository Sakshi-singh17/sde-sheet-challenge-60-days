package Extras;

public class Decompress_String {
    public static void main(String[] args) {
        String str = "a2b2";
        System.out.println(decompress(str));
    }
    public static String decompress(String str){
        StringBuilder ans = new StringBuilder();
        char prev = str.charAt(0);
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                count+=ch-'0';
            }
            else{
                for(int j=0; j<count; j++){
                    ans.append(prev);
                }
                count=0;
                prev=ch;
            }
        }
        for(int i=0; i<count; i++){
            ans.append(prev);
        }
        return ans.toString();
    }
}
