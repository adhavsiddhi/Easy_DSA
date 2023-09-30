/*
 *   Build Binary Tree 
 */

public class BuildBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data); // 1
        System.out.println(root.left.data); // 2
        System.out.println(root.right.data); // 3

    }
}

/*
 * Output:
 * 1
 * 2
 * 3
 */
/*The provided Java code defines a program to build a binary tree from an array representation and then print out specific nodes' data. Let's break down the code and its output:

Node Class:

The Node class represents the nodes of a binary tree. Each node has an integer data, a reference to the left child (left), and a reference to the right child (right).
BinaryTree Class:

The BinaryTree class contains a static variable idx initialized to -1. This variable is used to keep track of the current index when building the binary tree.
The buildTree method takes an integer array nodes as input and recursively builds a binary tree from it. It starts at index 0 and traverses the array in a depth-first manner.
When encountering -1 in the array, it represents a null node in the binary tree, so a null node is returned.
When a non-null value is encountered in the array, a new Node is created with that value, and its left and right children are recursively built by calling the buildTree method.
The method returns the root node of the binary tree.
Main Method:

In the main method, an integer array nodes is defined, representing the structure of the binary tree. In this example, nodes represents the following binary tree:
markdown
Copy code
    1
   / \
  2   3
 /     \
4       6
 \
  5
An instance of the BinaryTree class is created, and the buildTree method is called with the nodes array, resulting in the construction of the binary tree.
The data values of the root and its left and right children are printed using System.out.println.
Output:

The output of the program is:
Copy code
1
2
3
This output corresponds to the data values of the root node and its left and right children in the constructed binary tree.
In summary, this code demonstrates how to construct a binary tree from an array representation and then access specific nodes within the tree. The output shows the data values of the root and its immediate children in the tree structure defined by the nodes array.*/
