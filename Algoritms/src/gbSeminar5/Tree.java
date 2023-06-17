package gbSeminar5;


/*
 ** Tree
 */
public class Tree<V extends Comparable<V>> {
    private Node root;

    private enum Color {
        RED, BLACK
    }


    private class Node {
        private V value;
        private Color color;
        private Tree.Node leftChild;
        private Tree.Node rightChild;
    }

    public boolean contains(V value) {
        Node node = root;
        while (node != null) {
            if (node.value.equals(value)) {
                return true;
            }
            if (node.value.compareTo(value) > 0) {
                node = node.leftChild;
            } else {
                node = node.rightChild;
            }
        }
        return false;
    }

    public void add(V value) {
        if (root != null) {
            addNode(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
        } else {
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;

        }

// Добавление новой ноды
    }

    public void addNode(Node node, V value) {
        if (node.value == value) {
            System.out.println("Такой элемент существует");
        } else {
            if (node.value.compareTo(value) > 0) {
                if (node.leftChild != null) {
                    addNode(node.leftChild, value);
                    node.leftChild = rebalance(node.leftChild);
                } else {
                    node.leftChild = new Node();
                    node.leftChild.value = value;
                    node.leftChild.color = Color.RED;
                }
            } else {
                if (node.value.compareTo(value) < 0) {
                    if (node.rightChild != null) {
                        addNode(node.rightChild, value);
                        node.rightChild = rebalance(node.rightChild);
                    } else {
                        node.rightChild = new Node();
                        node.rightChild.value = value;
                        node.rightChild.color = Color.RED;
                    }

                }
            }
        }
        // Условие балансировки
    }

    private Node rebalance(Node node) {
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.rightChild != null && result.rightChild.color == Color.RED &&
                    (result.leftChild == null || result.leftChild.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.leftChild.leftChild != null && result.leftChild.leftChild.color == Color.RED) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED && result.rightChild != null &&
                    result.rightChild.color == Color.RED) {
                needRebalance = true;
                colorSwap(result);
            }
        } while (needRebalance);
        return result;
    }

    private void colorSwap(Node node) {
        node.rightChild.color = Color.BLACK;
        node.leftChild.color = Color.BLACK;
        node.color = Color.RED;
    }

    private Node leftSwap(Node node) {
        Node Chiild = node.leftChild;
        Node between = Chiild.rightChild;
        Chiild.rightChild = node;
        node.leftChild = between;
        Chiild.color = node.color;
        node.color = Color.RED;
        return Chiild;
    }

    private Node rightSwap(Node node) {
        Node rightChild = node.rightChild;
        Node betweenChild = rightChild.leftChild;
        rightChild.leftChild = node;
        node.rightChild = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }


}


//        *
// * * *     * * *

