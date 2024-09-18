#Summary: From integer arrays nums1 and nums2, return the common elements between both in any order.
#Approach: Iterate through nums1 and check to see if nums2 has any equal values (nested for loop). If so, add them to the final array. Return the final array.
#Completion Time: 9 mins: 16 secs
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        mainArr = []
        checkerArr = []
        finalArr = []
        
        if len(nums1) >= len(nums2):
            mainArr = nums1
            checkerArr = nums2
        else:
            mainArr = nums2
            checkerArr = nums1
            
        for i in range(len(mainArr)):
            for j in range(len(checkerArr)):
                if mainArr[i] == checkerArr[j] and checkerArr[j] not in finalArr:
                    finalArr.append(checkerArr[j])
                else:
                    continue
        
        return finalArr
    

        #intersection_nums = set()
        #for num in nums1:
        #    if num in nums2:
        #        intersection_nums.add(num)
        #return intersection_nums
