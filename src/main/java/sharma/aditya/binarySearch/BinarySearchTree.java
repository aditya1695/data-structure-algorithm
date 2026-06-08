package sharma.aditya.binarySearch;

import java.util.*;

public class BinarySearchTree {
    private static Node nodeRoot;
    public static void main(String[] args) {
        int [] data = {5, 2, 7, 1, 8, 11};
        Arrays.stream(data).forEach(item -> nodeRoot = insert(nodeRoot, item));
        printBST(nodeRoot);
        int item = 11;
        boolean isItemFound = findRoot(nodeRoot, item) != -1;
        System.out.println("\n--------------------------");
        System.out.println(isItemFound ? "ITEM FOUND :)" : "NOT FOUND :(");
        System.out.println("\n--------------------------");
        bfs(nodeRoot);
    }

    private static void bfs(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }


    private static int findRoot(Node root, int item) {
        int answer = -1;
        if (root == null) return answer;
        else if (root.data == item) return root.data;
        else if (root.data > item) answer =  findRoot(root.left, item);
        else answer = findRoot(root.right, item);
        return answer;
    }

    private static void printBST(Node root){
        System.out.println("Printing in IN-ORDER: ");
        inOrder(root);
        System.out.println("\nPrinting in PRE-ORDER: ");
        preOrder(root);
        System.out.println("\nPrinting in POST-ORDER: ");
        postOrder(root);
    }

    private static void inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }
    private static void postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    private static void preOrder(Node root){
        if (root == null) return;
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static Node insert(Node root, int item){
        return insertData(root, item);
    }
    private static Node insertData(Node root, int data) {
        Node newRoot = new Node(data);
        if(root == null) return newRoot;
        else if (data < root.data) root.left = insertData(root.left, data);
        else root.right = insertData(root.right, data);
        return root;
    }

}


