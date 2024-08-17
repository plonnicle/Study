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
    
    
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        tList, sList = list(pattern), s.split(" ")
        n, m = len(tList), len(sList)
        sMap, tMap = {}, {}
        tCount, sCount = [], []

        if n != m:
            return False

        for i in range(n):
            sString, tString = sList[i], tList[i]
            if sString not in sMap:
                sMap[sString] = [i]
            else:
                sMap[sString] += [i]

            if tString not in tMap:
                tMap[tString] = [i]
            else:
                tMap[tString] += [i]

        def helper(currentMap):
            ret = []
            for key, value in currentMap.items():
                ret.append(value)
            ret.sort()
            return ret
        
        tCount, sCount = helper(tMap), helper(sMap)
        return tCount == sCount
