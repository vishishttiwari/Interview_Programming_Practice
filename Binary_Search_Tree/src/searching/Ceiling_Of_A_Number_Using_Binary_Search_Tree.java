package searching;

import util.Node;

public class Ceiling_Of_A_Number_Using_Binary_Search_Tree {
    public static int Ceil(Node node, int input) {
        if (node == null) return -1;
        if (node.value == input) return node.value;
        if (node.value < input) return Ceil(node.right, input);
        int ceil = Ceil(node.left, input);
        return (ceil >= input) ? ceil : node.value;
    }
}
