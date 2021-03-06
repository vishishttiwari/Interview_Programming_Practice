package util;
public class Print {
	public static void print(Node root) {
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println();
		System.out.print("Preorder: ");
		preorder(root);
		System.out.println();
		System.out.print("Postorder: ");
		postorder(root);
		System.out.println();
	}
	
	public static void inorder(Node root) {
		if (root == null) return;
		inorder(root.left);
		System.out.print(root.value + " ");
		inorder(root.right);
	}
	
	public static void preorder(Node root) {
		if (root == null) return;
		System.out.print(root.value + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Node root) {
		if (root == null) return;
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.value + " ");
	}
}
