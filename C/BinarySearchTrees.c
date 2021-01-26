#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct node
{
	int data;
	struct node *left, *right;
} node;

node *createNode(int data)
{
	node *n = calloc(1, sizeof(node));
	n->data = data;
	return n;
}

// Recursively inserts a value into a Binary Search Tree, excluding duplicates.
node *insertBST(node *root, int data)
{
	if (root == NULL)
		return createNode(data);

	if (data < root->data)
		root->left = insertBST(root->left, data);
	else if (data > root->data)
		root->right = insertBST(root->right, data);

	return root;
}

// Deletes a value from the Binary Search Tree.
node *deleteBST(node *root, int data)
{
	node *temp;

	if (root == NULL)
		return NULL;
	else if (data < root->data)
		root->left = deleteBST(root->left, data);
	else if (data > root->data)
		root->right = deleteBST(root->right, data);
	else
	{
        // No children
		if (root->left == NULL && root->right == NULL)
		{
			free(root);
			root = NULL;
		}
        // One left child
		else if (root->right == NULL)
		{
			temp = root->left;
			free(root);
			root = temp;
		}
        // One right child
		else if (root->left == NULL)
		{
			temp = root->right;
			free(root);
			root = temp;
		}
        // Two children
		else
		{
			root->data = findMaxIterative(root->left);
			root->left = deleteBST(root->left, root->data);
		}
	}

	return root;
}

// Recursively finds the maximum value in a Binary Search Tree. 
int findMaxRecursive(node *root)
{
	if (root->right == NULL)
		return root->data;
	else
		return findMaxRecursive(root->right);
}

// Iteratively finds the maximum value in a Binary Search Tree.
int findMaxIterative(node *root)
{
	while (root->right != NULL)
		root = root->right;

	return root->data;
}

// Recursively finds the number of leaf nodes in the Binary Search Tree. 
int numLeafNodes(node *root)
{
	int count;

	if (root == NULL)
		return 0;

	if (root->left == NULL && root->right == NULL)
		return 1;
	else
		return numLeafNodes(root->left) + numLeafNodes(root->right);
}

// Helper function for findBSTHeight. Returns the max of two values.
int findMax(int x, int y)
{
	return (x > y) ? x : y;
}

// Finds the height of a Binary Search Tree.
int findBSTHeight(node *root)
{
	if (root == NULL)
		return -1;
	
	return 1 + findMax(height(root->left), height(root->right));
}

// Finds the sum of all values in a Binary Search Tree.
int sumAllValues(node *root)
{
	if (root == NULL)
		return 0;
	
	if (root->right == NULL && root->left == NULL)
		return root->data;
	
	return root->data + sumAllValues(root->left) + sumAllValues(root->right);
}

// Traversal Functions: Preorder, Inorder, Postorder
void preorder(node *root)
{
	if (root == NULL)
		return;

	printf("%d ", root->data);
	preorder(root->left);
	preorder(root->right);
}

void inorder(node *root)
{
	if (root == NULL)
		return;

	inorder(root->left);
	printf("%d ", root->data);
	inorder(root->right);
}

void postorder(node *root)
{
	if (root == NULL)
		return;

	postorder(root->left);
	postorder(root->right);
	printf("%d ", root->data);
}

// Frees all dynamically allocated memory in the Binary Search Tree.
node *freeMemory(node *root)
{
	if (root == NULL)
		return NULL;

	freeMemory(root->left);
	freeMemory(root->right);

	free(root);

	return NULL;
}
