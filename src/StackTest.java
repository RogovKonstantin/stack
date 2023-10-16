public class StackTest {
    public static void main(String[] args) {
        Minion minion1 = new Minion("bob", 5);
        Minion minion2 = new Minion("jack", 7);
        Minion minion3 = new Minion("joe", 3);
        Minion minion4 = new Minion("peter", 9);

        Stack<Minion> stack = new Stack<Minion>(3);
        stack.push(minion1);
        stack.push(minion2);
        stack.push(minion3);
        stack.push(minion4);
        stack.show();
        stack.pop();
        stack.show();
        System.out.println(stack.peek() + "\n");

        for (Minion minion : stack) {
            minion.setAge(10);
        }
        stack.show();
    }
}

