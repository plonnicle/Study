#Summary:
#Approach:
#Solution:
class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        def backtrack(remainingTarget, combination, start):
            if remainingTarget == 0:
                result.append(list(combination))
                return
            
            for i in range(start, len(candidates)):
                if candidates[i] > remainingTarget:
                    continue
                    
                combination.append(candidates[i])
                backtrack(remainingTarget - candidates[i], combination, i)
                combination.pop()
            
        backtrack(target, [], 0)
            
        return result
