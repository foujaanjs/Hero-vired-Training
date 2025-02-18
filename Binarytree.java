
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }
    
}

public class Binarytree {
    Node root;

    Binarytree (){
        root = null;
    }

    Node Insert(Node node,int data){
        if(node == null){
            node = new Node(data);
            return node;
        }
        if(data < node.data){
            node.left = Insert(node.left , data);
        }else if(data > node.data){
            node.right = Insert(node.right, data);
        }
        return node;
    }

    void inorderTraversel(Node node){
        if(node != null){
            inorderTraversel(node.left);
            System.out.print(node.data + " ");
            inorderTraversel(node.right);
        }
     }
    
     void preorderTraversal(Node node){
        if(node !=null){
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
     }

     void postorderTraversal(Node node){
        if(node != null){
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " " );
        }
     }

     Node search(Node root,int key){
        if (root ==null || root.data == key) {
            return root;
        }
        if(root.data < key){
            return search(root.right, key);
        }
        return search(root.left, key);
     }



    public static void main(String[] args) {
        Binarytree tree = new Binarytree();

        tree.root = tree.Insert(tree.root, 10);
        tree.Insert(tree.root, 15);
        tree.Insert(tree.root, 20);
        tree.Insert(tree.root, 50);
        tree.Insert(tree.root, 25);
        tree.Insert(tree.root, 35);
        tree.Insert(tree.root, 45);
        tree.Insert(tree.root, 65);
        tree.Insert(tree.root, 75);
        tree.Insert(tree.root, 69);

        tree.Insert(tree.root, 96);

        System.out.print("preorder traversal of the tree : ");
        tree.preorderTraversal(tree.root);

        System.out.print("\npostorder traversal of the tree : ");
        tree.postorderTraversal(tree.root);

        System.out.print("\ninorder traversal of the tree : ");
        tree.inorderTraversel(tree.root);
        
        Node result = tree.search(tree.root, 50);
        if(result != null){
            System.out.println("node found : " + result.data);
        }else{
            System.out.println( "\n node not found");
        }



        
    }
}
