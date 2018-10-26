

class MyListedListTest {
    public static void main(String[] args) {
        System.out.println("TESTING");

        MyLinkedList ll = new MyLinkedList(10);
        ll.printList();
//        System.out.println(ll.testGetData(0));
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.printList();
    }
}
