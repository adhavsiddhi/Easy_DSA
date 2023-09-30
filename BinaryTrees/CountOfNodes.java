public class CountOfNodes {
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

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int ln = countNodes(root.left);
        int rn = countNodes(root.right);
        return (ln + rn) + 1;
    }

    public static void main(String[] args) {

        //     1
        //    / \
        //   2  3
        //  / \ / \
        // 4  5 6 7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("total Nodes of tree : " + countNodes(root)); // total Nodes of tree : 7

        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(10);

        System.out.println("total Nodes of tree : " + countNodes(root)); // total Nodes of tree : 9
    }
}
/*The provided Java code defines a program that counts the total number of nodes in a binary tree. Let's break down the code and its output:

Node Class:

The Node class represents the nodes of a binary tree. Each node has an integer data, a reference to the left child (left), and a reference to the right child (right).
countNodes Method:

The countNodes method is a recursive function that takes a Node representing the root of a binary tree as its input.
If the current node is null, it returns 0 because there are no nodes in the subtree rooted at that node.
Otherwise, it recursively counts the nodes in the left subtree (variable ln) and the nodes in the right subtree (variable rn).
The total number of nodes in the current subtree is calculated as (ln + rn) + 1 and returned.
Main Method:

In the main method, a binary tree is constructed as follows:
Copy code
1
/
2 3
/ \ /
4 5 6 7

sql
Copy code
- The root node is created with a value of 1, and the left and right children are added to form a binary tree.

- The `countNodes` method is called with the root of the binary tree, and the total number of nodes in the tree is printed.

Output:

The output of the program is:
yaml
Copy code
total Nodes of tree : 7
total Nodes of tree : 9
In the first call to countNodes, it counts all 7 nodes in the initial binary tree.
In the second call, two additional nodes (9 and 10) are added to the rightmost part of the tree, and the total count becomes 9.
In summary, this code demonstrates how to count the total number of nodes in a binary tree using a recursive approach. It first constructs a binary tree and then counts the nodes, printing the count for each case.*/





