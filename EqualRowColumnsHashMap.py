#Question: Given a 0-indexed n * n integer matrix called grid, return the number of pairs such that the values in the row and column are equal.
#Example: [[3,2,1],[1,7,6],[2,7,7]]
#Abstract: Need to navigate the arrays using a nested for loop. With n as the length of the particular row and for each individual value (from each row, then each column), check if the next (n - 1) column values are equal to the next row values. 
#Solution:

class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        #counter = 0
        #for r in grid:
        #    for c in grid[r]:
        #        if grid[r].pop() == grid.pop():
        #            counter + 1
        #return counter
    
        cols = []
        for c in range(len(grid[0])):
            temp = []
            for r in range(len(grid)):
                temp.append(grid[r][c])
            cols.append(temp)
        
        
        count = 0
        
        for r in grid:
            for c in cols:
                if r==c:
                    count+=1
        
        return count
