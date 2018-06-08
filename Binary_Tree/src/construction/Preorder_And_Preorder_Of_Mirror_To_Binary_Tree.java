package construction;

import util.Node;

public class Preorder_And_Preorder_Of_Mirror_To_Binary_Tree {
	static int preIndex;
	static Node constructTree(int pre[], int preMirror[]) {
		preIndex = 0;
		int[] preMirror1 = new int[pre.length];
		for (int i = pre.length - 1; i >= 0; i--) {
			preMirror1[pre.length - 1 - i] = preMirror[i];
		}
		return constructTreeUtil(pre, preMirror1, 0, pre.length - 1, pre.length);
	}
	
	static Node constructTreeUtil(int pre[], int preMirror[], int l, int h, int size) {
		if (preIndex >= size || l > h) return null;
		Node root = new Node(pre[preIndex++]);
		if (l == h || preIndex >= size) return root;
		int i;
		for (i = l; i <= h; i++) {
			if (preMirror[i] == pre[preIndex]) break;
		}
		if (i <= h) {
			root.left = constructTreeUtil(pre, preMirror, l, i, size);
			root.right = constructTreeUtil(pre, preMirror, i + 1, h, size);
		}
		return root;
	}		
}
