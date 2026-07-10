class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int tail = numbers.length;

        for(int i = 0; i < tail; i++){
            for(int j = i + 1; j < tail; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int [] {i + 1, j + 1};
                }
            }
        }
        return new int [] {};
    }
}
