package Pack1;

public class Node {
    private Integer value;
    private Node left;
    private Node right;
 
    public Node(Integer value) {
        this.value = value;
    }
 
    public void add(Integer value) {
        if (value < this.value) {
            if (left != null) {
                left.add(value);
            } else {
                left = new Node(value);
            }
        } else {
            if (right != null) {
                right.add(value);
            } else {
                right = new Node(value);
            }
        }
    }
 
    public Boolean search(Integer value) {
        if (value == this.value) {
            return true;
        } else if (value < this.value) {
            if (this.left != null) {
                return this.left.search(value);
            } else {
                return false;
            }
        } else {
            if (this.right != null) {
                return this.right.search(value);
            } else {
                return false;
            }
        }
    }
 
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(value);
        if (right != null) {
            right.printInOrder();
        }
    }
 
    public void printPreOrder() {
        System.out.println(value);
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }
 
    public void printPosOrder() {
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
        System.out.println(value);
    }
}
