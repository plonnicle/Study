#Summary: Given an integer array, find the element that appears more than array.length / 2
#Approach: Iterate through the list and using a hash set, check to see if that number currently exists in the set. If so, add a number to its assigned value in the set. If that value ever reaches array.length / 2, return that key from the set.

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        #checkMap = {}
        #for i in nums:
        #    if nums[i] not in checkMap:
        #        checkSet.add(nums[i])
        #    else:
        #        if chec
                
        hash = {}
        res = majority = 0
        
        for n in nums:
            hash[n] = 1 + hash.get(n, 0)
            if hash[n] > majority:
                res = n
                majority = hash[n]
        
        return res
