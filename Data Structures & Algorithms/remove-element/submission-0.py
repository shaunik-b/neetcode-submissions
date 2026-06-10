class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        p1 = 0
        p2 = 0
        count = 0
        for i in range(len(nums)):
            p2=i 
            if nums[i]==val:
                while p2!=len(nums) and nums[p2]==val :
                    p2+=1
                if p2<len(nums):
                    nums[i], nums[p2]=nums[p2], nums[i]
                    count+=1
            else:
                count+=1

                
        return count