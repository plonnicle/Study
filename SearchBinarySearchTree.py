# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#Summary: Given the 'root' of a binary search tree and an integer 'val', find the node whose value equals val and return the subtree rooted with that node. If it doesn't exist, return null.
#Approach: Check each node, starting with the root, for val. If its value doesn't equal val, search its children (left and right) by calling the same function. Conduct until there are no children to go to or val is found. If val is found, return the remaining tree. Else, return null.
#Solution:
class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        #if root.val == val:
        #    return root
        #elif root.left != None or root.right != None:
        #    self.searchBST(root.left, val)
        #    self.searchBST(root.right, val)
        #else:
        #    return None
        
        while root:
            if root.right and root.val<val: root=root.right
            elif root.left and root.val>val: root=root.left
            elif root.val==val: return root
            else: break
        return None
