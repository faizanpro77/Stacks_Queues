package bridgelabz;

public class Queue<T> {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    public INode peek() {
      return myLinkedList.head;
    }
}
