#Summary: Input: integer array nums1, integer array nums2, integer m as length of nums1, integer n as length of nums2
#Approach: Array, Two Pointer. for(i in range(m)){for(j in range(n)) {if(nums1[i] < nums2[j])}}
#Solution:
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        #for i in range(m):
        #    for j in range(n):
        #        if nums1[i] > nums2[j]:
        #            temp = nums1[i]
        #            nums1[i] = nums2[j]
        #            nums1[i+1] = temp
        #        else:
        #            continue
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        if n == 0 :return
        len1 = len(nums1)
        end_idx = len1-1
        while n > 0 and m > 0 :
            if nums2[n-1] >= nums1[m-1]:
                nums1[end_idx] = nums2[n-1]
                n-=1
            else:
                nums1[end_idx] = nums1[m-1]
                m-=1
            end_idx-=1
        while n > 0:
            nums1[end_idx] = nums2[n-1]
            n-=1
            end_idx-=1
