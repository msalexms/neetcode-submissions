class Solution {
    public boolean isPalindrome(String s) {
        

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuilder newStr = new StringBuilder(s);
        char[] charrS = s.toCharArray();

        return newStr.toString().equals(newStr.reverse().toString());



    }
}
