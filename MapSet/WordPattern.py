#Summary: Input: String pattern, String s / Output: Boolean isMatch
#Approach: Split s into an array of strings divided by spaces / Iterate through each letter of pattern and  
#Solution:
class Solution:
   def wordPattern(self, pattern: str, s: str) -> bool:
   #     isMatch = False
   #     wordMap = {}
   #     words = s.split()
   #     for index in range(words):
   #         if pattern[index] not in wordMap:
   #             wordMap[index] = pattern[index]
   #         else:
   #             
   #     return isMatch
    
    

        arr = s.split()
        if len(arr) != len(pattern):
            return False
        
        for i in range(len(arr)):
            if pattern.find(pattern[i]) != arr.index(arr[i]):
                return False
        return True
