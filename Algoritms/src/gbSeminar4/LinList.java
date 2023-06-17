package gbSeminar4;

public class LinList {
    private Node head;



    private class Node {
        private int value;
        private Node next;

    }

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Элементов нет");
        } else {
            head = head.next;
        }
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Элементов нет");
        } else {
            Node node = head;
            while (node.next != null) {
                if (node.next.next == null) {
                    node.next = null;
                    return;
                }
                node = node.next;
            }
            head = null;
        }
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    public void reversal() {
        Node previous = null;
        Node node = head;
        while (node != null) {
            Node temp = node.next;
            node.next = previous;
            previous = node;
            node = temp;

        }
        head = previous;
    }


    public boolean contains(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
