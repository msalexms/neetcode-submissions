class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer>  complementMap = new HashMap<>();

        for(Integer i = 0; i < numbers.length ; i++){

            int number = numbers[i];

            int complement = target - number;


            if(complementMap.containsKey(complement)){
                return new int[]{complementMap.get(complement) + 1, i +1};
            }else{


                complementMap.put(number, i);

            }


        }

        return new int[2];

        
    }
}
