package gbSeminar4;

public class LinlistDuo {
    private Node head;
    private Node teil;

    public class Node {
        private int value;
        private Node next;
        private Node previous;

    }

    public void addFirstData(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            teil = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }
    }
    public void dellFirst(){
        if (head == null){
            System.out.println("Список пуст");
           return;
        }
        if ( head == teil){
            head = null;
            teil = null;
            System.out.println("Единственный элемент списка удалён");
        }
        else {
            head = head.next;
            head.previous = null;
        }

    }

    public void dellLast(){
        if (head == null){
            System.out.println("Список пуст");
            return;
        }
        if ( head == teil){
            head = null;
            teil = null;
            System.out.println("Единственный элемент списка удалён");
        }
        else {
            teil = teil.previous;
            teil.next = null;
        }
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (teil != null) {
            teil.next = node;
            node.previous = teil;
            teil = node;
        } else {
            head = node;
            teil = node;
        }
    }

    public void add(int value, int desired) {
        int element = desired;
        Node current = head;
        Node node = new Node();
        node.value = value;
        while (current.value != element) {
            current = current.next;
        }
        node.next = current;
        node.previous = current.previous;
        current.previous.next = node;
        current.previous = node;
    }


    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }

    }

    public void printRevers() {
        Node node = teil;
        while (teil != null) {
            System.out.print(teil.value + " ");
            teil = teil.previous;
        }
    }

}
