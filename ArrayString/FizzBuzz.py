#Summary: Input: integer 'n'. Output: array of strings 'answer' 1-indexed.
#Approach: For loop with length n. For each value of i, check conditions and if they are valid, add the string value to the array.
#Solution:
class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        output = []
        for i in range(1, n+1):
            if i % 3 == 0 and i % 5 == 0:
                output.append("FizzBuzz")
            elif i % 3 == 0:
                output.append("Fizz")
            elif i % 5 == 0:
                output.append("Buzz")
            else:
                output.append(str(i))
        return output
