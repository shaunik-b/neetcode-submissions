class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict_sums = {}
        for i, nums in enumerate(nums):
            if target-nums in dict_sums:
                return [dict_sums[target-nums],i]
            else:
                dict_sums[nums] = i
        return []