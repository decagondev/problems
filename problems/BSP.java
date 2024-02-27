class Node {
}

public class BSP {
    public BSP() {
    }

    void insert(int value) {
    }

    Node insertRec(Node root, int value) {
    }

    void traverse(Node node, int playerPosition) {
    }

    // Test the solution
    public static void main(String[] args) {
        BSP tree = new BSP();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        int playerPosition = 7;
        tree.traverse(tree.root, playerPosition); // 7 5 3 10 12 15 18 
    }
}
