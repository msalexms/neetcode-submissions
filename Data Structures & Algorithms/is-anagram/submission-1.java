class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> word1 = new HashMap<>();
        HashMap<Character, Integer> word2 = new HashMap<>();



        for ( Integer  i = 0; i < s.length(); i ++){


            word1.merge(s.charAt(i), 1, Integer::sum);

        }

        for ( Integer  i = 0; i < t.length(); i ++){


            if(!word1.containsKey(t.charAt(i))){
                return false;
            }

            word2.merge(t.charAt(i), 1, Integer::sum);

        }

        return word1.equals(word2);

    }
}
