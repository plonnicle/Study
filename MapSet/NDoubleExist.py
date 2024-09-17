#Summary: Check to see if two indexes of array arr are not equal, 0 is less than or equal to i and j is greater than arr's length and arr[i] is equal to twice the value of arr[j]
#Approach: for loop, with an if statement inside to check is value meets conditions
class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
    #    checkMap = {}
    #    j = len(arr) - 1
    #    for i in range(len(arr) // 2):
    #       checkMap[i] = arr[i]
    #        if i >= 0 and arr[i] == 2 * arr[j]:
    #            return True
    #        j -= 1
    #    return False
    
    
        # Create a hash set to store the elements of the array
        seenElements = set()
        
        # Iterate through each element in the array
        for num in arr:
            
            # Check if the double of the current element or half of the current element (if it's even) exists in the set
            if 2 * num in seenElements or (num % 2 == 0 and num // 2 in seenElements):
                
                # If found, return True
                return True
            
            # Add the current element to the set
            seenElements.add(num)
        
        # If no such elements are found, return False
        return False
