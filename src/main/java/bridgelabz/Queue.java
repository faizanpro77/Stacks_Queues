package bridgelabz;

public class Queue<T> {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    public INode<Integer> peek() {
      return myLinkedList.head;
    }

    public INode<Integer> dequeue() {
        return myLinkedList.popFirst();
    }

    public void printNode() {
        myLinkedList.printNodes();
    }
}
