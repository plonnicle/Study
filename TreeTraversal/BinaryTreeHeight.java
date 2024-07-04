import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
//Question: Write a program that finds tree height (distance from root node to furthest node). The height of a tree with only one node is 0. All trees will have at least one node but no more than 20.
//Abstract: Start at root node, check for children. Add to the max height counter. If the children don't have children nodes, stop the count for that branch. Return final value.
//Solution: 

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
        //If the left or right child node have children... (If-else block)
        //Add to the max height counter. (Positive increment)
        //Call the method to the nodes that have value. (Recursion call)
        //Return final count. (Return statement)
          // Write your code here.
          
        //If the root doesn't have a value...
        //Return -1
        //Always return the maximum value between height of root.left and height of root.right plus 1.
        if(root == null){
            return -1;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}
