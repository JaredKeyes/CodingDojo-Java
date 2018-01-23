public class ListTester{

public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.add(1);
    sll.add(2);
    sll.add(2);
    sll.add(3);
    sll.add(4);

    sll.removeAt(1);
    sll.add(5);
    sll.add(9);
    sll.remove();
    sll.printValues();
    }
}