import java.util.ArrayList;

public class LCA {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root == null)
            return false;
        
        path.add(root);
        if(root.data == n)
            return true;
        
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft || foundRight)
            return true;
        
        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root, int n1 , int n2) { // TC: O(n)   SC: Large / Bad
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //LCA
        int i = 0;
        for(; i<path1.size() && i<path2.size() ; i++) {
            if(path1.get(i) != path2.get(i)) 
                break;
        }
        Node lca  = path1.get(i-1);  // last equal node (i-1)th
        return lca;
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) { // TC: O(n)  SC: Best O(n) -> RecursionSpaceOnly
        if(root == null || root == p || root == q) {
            return root;
        }
        Node leftLca = lowestCommonAncestor(root.left, p, q);
        Node rightLca = lowestCommonAncestor(root.right, p, q);

        if(rightLca == null)
            return leftLca;
        if(leftLca == null)
            return rightLca;
        
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*         1
         *       /   \
         *      2     3
         *     / \   / \
         *    4   5 6   7
         */

        int n1 = 4 , n2 = 6;
        System.out.println(lca(root,n1,n2).data);

        Node p = root.left.left; // 4
        Node q = root.left.right;  // 5
        System.out.println(lowestCommonAncestor(root,p,q).data); // 2 
    }
}