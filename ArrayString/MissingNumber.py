#Summary: array nums contains n numbers (all distinct) in the range 0, n. return the only number in the range missing
#Approach: Hash Map, Linear Search. Iterate through nums.
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        #table = {}
        #n = len(nums)
        #for i in range(0, n):
        #    if nums[i] not in table:
        #        table[nums[i]] = nums[i]
        #return table.get(None)
    
    
        l = nums + list(range(len(nums) + 1))
        d = dict(Counter(l))
        for i in d:
            if d[i] == 1:
                return i
