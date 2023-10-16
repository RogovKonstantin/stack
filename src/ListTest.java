public class ListTest {
    public static void main(String[] args) {
        Minion minion1 = new Minion("bob", 5);
        Minion minion2 = new Minion("jack", 7);
        Minion minion3 = new Minion("joe", 3);
        Minion minion4 = new Minion("peter", 9);
        Minion minion5 = new Minion("andrew", 6);
        Minion minion6 = new Minion("bill", 6);

        DoublyLinkedList<Minion> doublyLinkedList = new DoublyLinkedList<>();

        AgeComp ageComp = new AgeComp();

        doublyLinkedList.addFirst(minion1);
        doublyLinkedList.addFirst(minion2);
        doublyLinkedList.addFirst(minion3);
        doublyLinkedList.addFirst(minion4);
        doublyLinkedList.addFirst(minion5);

        doublyLinkedList.show();

        for (Minion minion : doublyLinkedList) {
            System.out.println(ageComp.compare(minion6, minion));
        }

        System.out.println(doublyLinkedList.getByIndex(0));
    }
}

