class Solution {
    public int search(int[] nums, int target) {
        


        int left = 0;
        int right = nums.length-1;
        int middle;
        int current;
        while(right>=left) {
            middle = (left+right)/2;
            current = nums[middle];
            if(current==target){
                return middle;
            } else if(current>target){
                right = middle-1;

            } else if(current<target){
                left = middle+1;
            }


        }

        return -1;

    }
}
