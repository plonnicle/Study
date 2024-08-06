#Summary: Given an array of integers, sort them into two arrays where the values hop from even to odd. Sum the values of each array and return them in an integer array of two final sums.
#Approach: Iterate through the array. If the value has an even index, add it to the first array. Else, add it to the second array. When the loop is done, sum the elements of each array. Return the final array with both sums.
#Solution:
def solution(a):
    #
    #evenArray = []
    #oddArray = []
    #for i in a:
    #    if (a[i] % 2 == 0):
    #        evenArray.append(a[i])
    #    else:
    #        oddArray.append(a[i])
    #        
    #for e in evenArray:
    #    evenSum = evenSum + e
    #
    #for o in oddArray:
    #    oddSum = oddSum + o
    #    
    #return [evenSum, oddSum]
    

    return [sum([i for i in a[::2]]), sum([i for i in a[1::2]])]
    
