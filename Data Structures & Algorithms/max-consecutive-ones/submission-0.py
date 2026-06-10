class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        max = 0
        for num in nums:
            if num==1:
                count+=1
            else:
                count = 0
            if count>max:
                max=count
        return max