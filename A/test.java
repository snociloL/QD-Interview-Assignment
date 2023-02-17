public class test {
    public static void main(String[] args) {
        FIFOQUEUE test = new FIFOQUEUE();

        System.out.println("\n~~~~~ Queue ~~~~~~");
        test.enqueue("hello");
        test.enqueue("2nd hello");
        System.out.println("\n");
        test.getQueue();
        System.out.println("\n");
        System.out.println(test.dequeue()); 
        System.out.println(test.dequeue()); 
        System.out.println("\nThats all for Queue operations\n\n");

        System.out.println("\n ~~~~~ Stack ~~~~~");
        LIFOQUEUE testStack = new LIFOQUEUE();

        testStack.enqueue("Stackssss");
        testStack.enqueue("2nd Stack");
        testStack.enqueue("3rd");
        testStack.enqueue("4th");
        testStack.enqueue("5th");
        System.out.println("\n");
        testStack.getQueue();
        System.out.println("\n");
        System.out.println(testStack.dequeue());
        System.out.println(testStack.dequeue());
        System.out.println("\ngetQueue() after dequeue twice :- \n");

        testStack.getQueue();

        System.out.println("\nTesting adding more to stack\n");
        testStack.enqueue("More stacks");
        testStack.getQueue();
        System.out.println("\n");

        System.out.println(testStack.dequeue());
        System.out.println("\n");

        testStack.getQueue();

    }
}
