import java.util.*;

public class genericTreeCretion {
    private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }    

    public static int height(Node node){
        int height = -1;

        for(Node child : node.children){
            int ch = height(child);
            height = Math.max(ch,height);
        }

        height += 1;
        return height;
    }
    public static int max(Node node){
        int max = Integer.MIN_VALUE;

        for(Node child : node.children){
            int cm = max(child);
            max = Math.max(cm, max);
        }
        max = Math.max(node.data, max);
        return max;
    }
    public static int size(Node node){
        int size = 0;
        for(Node child : node.children){
            int childSize = size(child);
            size = size + childSize;
        }
        size = size + 1;
        return size;
    }
    // High Level Recursion display
    public  static void display(Node node){
        String str = node.data + " -> ";
        for(Node child : node.children){
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for(Node child : node.children){
            display(child);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1 ,-1, 40, 100, -1, -1, -1};
        Node root = null;
        Stack<Node> st = new Stack<>();

        for(int i = 0 ; i< arr.length ;i++){
            if(arr[i] == -1){
                st.pop();
            }else{
                Node temp = new Node();
                temp.data = arr[i];

                if(st.size() > 0){
                    st.peek().children.add(temp);
                }else{
                    root = temp;
                }
                st.push(temp);
            }
        }
        display(root);
    }
}

