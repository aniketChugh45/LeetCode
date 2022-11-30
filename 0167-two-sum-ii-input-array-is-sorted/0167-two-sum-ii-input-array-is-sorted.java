class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int ptr1 =0;
        int ptr2=numbers.length-1;
        while(ptr1 < ptr2){
            if((numbers[ptr1] + numbers[ptr2]) == target){
                ans[0] = ptr1+1;
                ans[1] = ptr2+1;
                break;
            }
            else if((numbers[ptr1] + numbers[ptr2]) > target){
                ptr2--;
            }
            else {
                ptr1++;
            }
        }
        return ans;
    }
}