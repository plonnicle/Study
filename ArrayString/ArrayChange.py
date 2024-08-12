#Summary: Given an array of integers, find the minimal number of moves required to obtain a strictly increasing sequence from the input. On each turn, you can only increase a value by one.
#Approach: Start at the back of the array. If the [end number] is less than or equal to the [end number - 1], add one to its value and add one to the timer. Do this until onto the next.
#Solution:
def solution(inputArray):
    sum = 0
    q = inputArray[0]
    for i in inputArray[1:]:
        if i <= q:
            sum += q-i+1
            q = q+1
        else:
            q = i
    return sum
