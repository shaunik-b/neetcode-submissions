class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dup_dict = {}
        for num in nums:
            if num in dup_dict:
                return dup_dict[num]
            else:
                dup_dict[num] = True
        return False