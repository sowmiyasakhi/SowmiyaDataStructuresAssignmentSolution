package com.greatlearning.SkewedTreeConversion;

public class DriverClass 
{
	public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
	
	public static void convertTreeToSkewed(Node root, int order)
	{
		if(root == null)
		{
			return;
		}


		if(order > 0)
		{
			convertTreeToSkewed(root.right, order);
		}
		else
		{
			convertTreeToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;


		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}


		if (order > 0)
		{
			convertTreeToSkewed(leftNode, order);
		}
		else
		{
			convertTreeToSkewed(rightNode, order);
		}
	}
	
	static void printRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		printRightSkewed(root.right);       
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		DriverClass tree = new DriverClass();
		tree.node = new Node(20);
		tree.node.left = new Node(10);
		tree.node.right = new Node(80);
		tree.node.left.left = new Node(5);
		tree.node.right.left = new Node(60);
		int order=0;
	    convertTreeToSkewed(node,order);
	    printRightSkewed(headNode);
	    
	}

}