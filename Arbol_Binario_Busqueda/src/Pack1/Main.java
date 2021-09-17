package Pack1;

public class Main {

    public static void main(String[] args) {
	Node A1 = new Node(8);
	A1.add(3);
	A1.add(10);
	A1.add(1);
	A1.add(6);
	A1.add(14);
	A1.add(4);
	A1.add(7);
	A1.add(13);
	A1.printInOrder();
	System.out.println("");
	if(A1.search(6)){
	    System.out.println("True");
	}
	else{
	    System.out.println("False");
	}
    }
    
}
