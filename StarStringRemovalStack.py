#Question: Given a string s containing stars (*), return the string with all stars removed. In one operation, you can choose a star in s and remove the closest non-star character to its left as well as remove the star itself.
#Example: s = "leet**cod*e"
#Step 1: s = "lee*cod*e"
#Step 2: s = "lecod*e"
#Step 3: s = "lecoe"
#Abstract: Iterate through the string. Once you find a star, remove it and the char in the -1 position to it. Recall the function until there are no more stars found.
#Solution:
class Solution:
    #Search string s until a * is found
    #If one is found, remove it and its -1 position char neighbor
    #Store value as s_remain
    #Call removeStars again
    #Else, return str
    
    def removeStars(self, s: str) -> str:
        #s_remain = ""
        #for i in range(len(s)):
            #if s[i] == '*':
                #s_remain = s.replace('*', '', 1)
                #removeStars(s_remain)
            #else:
                #return s

            
        stack_star = []
        for i in s:
            if i != '*':
                stack_star.append(i)
            else:
                stack_star.pop()
        return(''.join(stack_star))
