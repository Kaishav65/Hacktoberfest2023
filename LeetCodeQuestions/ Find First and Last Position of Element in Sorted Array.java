class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums , target);
        result[1] = findLast(nums , target);
        return result;
    } 
    private int findFirst(int[] nums ,int target){
        int index = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            if(nums[(start + end)/2] < target){
                start = (start + end)/2 +1;
            }
            else if(nums[(start + end)/2] > target){
                end = (start + end)/2 -1;
            }
            else {
                index = (start + end)/2;
                end = (start + end)/2 -1;
            }
            
        }
        return index;
    }
    private int findLast(int[] nums ,int target){
        int index = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            if(nums[(start + end)/2] < target){
                start = (start + end)/2 +1;
            }
            else if(nums[(start + end)/2] > target){
                end = (start + end)/2 -1;
            }
            else {
                index = (start + end)/2;
                start = (start + end)/2 +1;
            }
        }
        return index;
    }
}
