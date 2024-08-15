#Summary: Input: Array of integers nums, integer target. Return the [match1, match2] that equals target.
#Approach: For loop through nums. Compare the current value to the next values and see if it matches. If so, return the pair. Hash Map. Two Pointer.
#Solution:
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numMap = {}
        for index, num in enumerate(nums):
            complement = target - num
            if complement in numMap:
                return [numMap[complement], index]
            numMap[num] = index
        return []
