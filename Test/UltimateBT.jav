import java.util.*;
import java.io.*;
class Node{
    int data;
    Node left , right;
    Node(int data){
        System.out.println("Node created");
        this.data = data;
    }

    Node(int data , Node left , Node right){
        this(data);
        this.left = left;
        this.right = right;
    }
}
class BT{
    Node root; 
    BT(Integer inp[]){
        System.out.println("Constructing your binary Tree");
        root = construct(inp);
    }
    private static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.state = state;
            this.node = node;
        }
    }
    private Node construct(Integer inp[]){
      // code for contructing binary tree
        Node root = new Node(arr[0]);
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root));
        int idx = 1;
        while(st.size() > 0){
            Pair tpair = st.peek();
            if(tpair.state == 0){
                Integer vl = arr[idx++];
                if(vl != null){
                    Node newnode = new Node(vl); // create
                    tpair.node.left = newnode; // connect to left
                    st.push(new Pair(newnode)); // push to stack
                }
                tpair.state++;
            }else if(tpair.state == 1){
                Integer vl = arr[idx++];
                if(vl != null){
                    Node newnode = new Node(vl); // create
                    tpair.node.right = newnode; // connect to right
                    st.push(new Pair(newnode)); // push to stack
                }
                tpair.state++;
            }else{ //tpair.state == 2
                st.pop();
            }
        }
        return root;
    }
    public void display(){
        display(root);
    }
    public int size(){
        return size(root);
    }
    public int sum(){
        return sum(root);
    }
    public int max(){
        return max(root);
    }
    public int min(){
        return min(root);
    }
    public int height(){
        return height(root);
    }
    public boolean find(int data){
        return find(root,data);
    }
    public ArrayList<Integer> nodeToRootPath(int data){
        return nodeToRootPath(root,data);
    }
    private void display(Node node) {
        // code for displaying binary tree
        if(node == null) return;

        if(node.left != null) System.out.print(node.left.data);
        System.out.print(" <- "+node.data+" -> ");
        if(node.right != null) System.out.print(node.right.data);
        System.out.println();

        display(node.left);
        display(node.right);
    }

    private int size(Node node) {
        // code for finding size of binary tree
         if(node == null){
            return 0;
        }
        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;
        return ts;
        
    }
  
    private int sum(Node node) {
        // code for finding sum of binary tree
        if(node == null){
            return 0;
        }
        int lsm = sum(node.left);
        int rsm = sum(node.right);
        int tsm = ls + rs + node.data;
        return tsm;
    }
  
    private int max(Node node) {
        // code for finding max of binary tree
        if(node == null){
            return -1;
        }
        int lmax = max(node.left);
        int rmax = max(node.right);
        int tmax = Math.max(node.data,Math.max(lm,rm));
        return tmax;
    }
    private int min(Node node) {
        // code for finding min of binary tree
        Node curr = node;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr.data;
    }
    
    private int height(Node node) {
        // code for finding height of binary tree
        if(node == null){
            return -1;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);
        int theight = Math.max(lh,rh) + 1;
        return theight;
    }
    static ArrayList<Integer> path;
    public static boolean find(Node node, int data){
        // code for finding data in a binary tree
        if(node == null){
            return false;
        }
        if(node.data == data){
            // path.add(node.data);
            return true;
        }
        boolean abc = find(node.left,data);
        if(abc){
            // path.add(node.data);
            return true;
        }
        booleans xyz = find(node.right,data);
        if(xyz){
            path.add(node.data);
            return true;
        }
        return false;
    }
    
    public ArrayList<Integer> nodeToRootPath(Node node, int data){
        // code for nodeToRootPath in a binary tree
        if(node.data == data){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }

        for(Node child : node.children){
            ArrayList<Integer> ptc = nodeToRootPath(child,data);
            if(ptc.size() > 0){
            ptc.add(node.data);
            return ptc;
        }
        return new ArrayList<>();
    }
}

public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }
        int data = Integer.parseInt(br.readLine());
        BT bt = new BT(arr);

        bt.display();
        System.out.println("Size " + bt.size());
        System.out.println("Sum "+bt.sum());
        System.out.println("Max "+bt.max());
        System.out.println("Min "+bt.min());
        System.out.println("Height "+bt.height());

        boolean found = bt.find(data);
        System.out.println(found);

        ArrayList<Integer> path = bt.nodeToRootPath(data);
        System.out.println(path);
    }
}