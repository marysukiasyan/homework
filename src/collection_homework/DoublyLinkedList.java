package collection_homework;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    class Node {
        Student student;
        Node next;
        Node prev;

        public Node(Student student, Node next, Node prev) {
            this.student = student;
            this.next = next;
            this.prev = prev;
        }
    }

    public void print() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while(current != null){
            System.out.println(current.student);
            current = current.next;
        }
    }

    public void push(Student student){
        Node node = new Node(student, head, null);

        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null) {
            tail = node;
        }
        size++;
    }

    public Student pop() {
        Node node = head;
        head = head.next;
        head.prev = null;
        size--;
        return node.student;
    }

    public void addLast(Student student){
        Node node = new Node(student, null, tail);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }
        size++;
    }

    public Student removeLast(){
        Node node = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return node.student;
    }

    public int size(){
        return size;
    }
}
