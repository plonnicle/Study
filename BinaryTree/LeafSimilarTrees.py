# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#Summary: Given two head nodes 'root1' and 'root2', return true if their respective trees are 'leaf similar' AKA they have the same ending node values in the same sequence.
#Approach: Do a tree traversal down to the nodes, and store their value in one of two temporary arrays. At the end, check if the two arrays have the same value. If so, return true, else false.
#Solution [Structure - Algorithm]: Binary Tree - Depth-First Search
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        # Helper function to perform a depth-first search (DFS) to find all leaf values in order
        def dfs(root):
            # If the current node is None, return an empty list
            if root is None:
                return []
            # Recursively explore the left and right children, and accumulate leaf values
            leaves = dfs(root.left) + dfs(root.right)
            # If 'leaves' is empty, it means this is a leaf node, so return its value
            # Otherwise, it means this is an internal node and 'leaves' contains its subtree's leaves
            return leaves or [root.val]
        # Compare the leaf value sequences of both trees
        return dfs(root1) == dfs(root2)
