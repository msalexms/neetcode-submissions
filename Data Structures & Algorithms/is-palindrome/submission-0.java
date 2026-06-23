class Solution {
    public boolean isPalindrome(String s) {
        

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] charrS = s.toCharArray();


        Integer end = s.length();

        for(int i = 0; i < end; i++){

            end --;

            if(charrS[i] != charrS[end]) return false;


        }

        return true;


    }
}
