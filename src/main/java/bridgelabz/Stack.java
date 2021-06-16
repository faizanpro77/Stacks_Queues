package bridgelabz;

public class Stack<T> {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    public void push(INode newNode) {
        myLinkedList.add(newNode);
    }

    public INode peek() {
        return myLinkedList.head;
    }
}