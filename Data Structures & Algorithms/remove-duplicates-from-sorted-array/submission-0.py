class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        set_nums = set()

        for i in range(len(nums)-1,-1,-1):

            if nums[i] in set_nums:
                nums.pop(i)
            else:
                set_nums.add(nums[i])

        return len(nums)