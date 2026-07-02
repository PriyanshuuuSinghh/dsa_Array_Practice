class Solution {
    public boolean detectCapitalUse(String word) {

        if(word.equals(word.toUpperCase())){
            return true;
        }else if(word.equals(word.toLowerCase())){
            return true;
        }else{
            char first = word.charAt(0);
            if(Character.isUpperCase(first)){
                for(int i = 1; i<word.length();i++){
                    char ch = word.charAt(i);
                    if(ch<'a' || ch>'z'){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}