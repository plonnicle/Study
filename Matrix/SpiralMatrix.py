class Solution:

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        # Initialize the result list
        result = []

        # Check if the matrix is empty
        if not matrix:
            return result

        # Initialize the boundaries
        top, bottom = 0, len(matrix) - 1
        left, right = 0, len(matrix[0]) - 1

        # Traverse the matrix in spiral order
        while top <= bottom and left <= right:

            # Traverse from left to right
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            # Traverse from top to bottom
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            # Traverse from right to left, if there are remaining rows
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            # Traverse from bottom to top, if there are remaining columns
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1

        # Return the result list
        return result
