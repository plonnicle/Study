#Question: Given an integer array called 'height' of length 'n', find two lines that form the biggest container.
#Abstract: Area can be calculated by (x1, y1) * (x2, y2) - |(y1 - y2)| 
#Solution: Iterate through a for loop to check the height of each line. When a higher line is found, calculate the area. Keep a running counter of only the highest value thus far for the area. Return the final value.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        #currentMaxArea = 0
        #for i in height:
        #    for j in height[i]:
        #    if(something > currentMaxArea):
        #return currentMaxArea
        
        
        max_area = 0
        left = 0
        right = len(height) - 1

        while left < right:
            max_area = max(max_area, (right - left) * min(height[left], height[right]))

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return max_area
