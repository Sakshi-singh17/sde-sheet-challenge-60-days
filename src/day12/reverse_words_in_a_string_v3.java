class Solution {
    public String reverseWords(String s) {
        Stack<String>stack = new Stack<>();
        StringBuilder word = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(ch==' '){
                if(word.length()>0){
                    stack.push(word.toString());
                    word.setLength(0);
                }
            }
            else{
                word.append(ch);
            }
        }

        if(word.length()>0){
            stack.push(word.toString());
        }

        while(!stack.isEmpty()){
            ans.append(stack.pop());
            if(!stack.isEmpty()){
                ans.append(" ");
            }
        }

        return ans.toString();

    }
}