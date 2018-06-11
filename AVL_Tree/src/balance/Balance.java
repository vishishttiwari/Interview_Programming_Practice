package balance;

import util.Node;

public class Balance {
	public static int balance(Node root) {
		return root.left.height - root.right.height;
	}
}

/* Balance is the difference between the left and right of the node */
/* If the balance is less than -1 then it is Right Right or Right Left */
/* If the balance is greater than 1 then it is Left Right or Left Left */
/* Balance for an AVL Tree should always be less -1, 0, 1 */