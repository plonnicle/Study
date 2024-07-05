#Summary: Given two strings, s and t, return TRUE if s is a subsequence of t. Return FALSE otherwise.
#Approach: Check if t contains s. If so, return TRUE. Else, return FALSE.
#Solution: Two pointers
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
    #    result = True
    #    for x in s:
    #        if not s[x] in t:
    #            result = False
    #    return result
    
        if len(s) > len(t):return False
        if len(s) == 0:return True
        subsequence=0
        for i in range(0,len(t)):
            if subsequence <= len(s) -1:
                print(s[subsequence])
                if s[subsequence]==t[i]:

                    subsequence+=1
        return  subsequence == len(s) 
