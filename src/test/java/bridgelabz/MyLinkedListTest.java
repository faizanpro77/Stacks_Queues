package bridgelabz;

import org.junit.Assert;
import org.junit.Test;

    public class MyLinkedListTest {

        @Test
        public void StackIsCreated_shouldReturnNodeData() {
            Stack<Integer> stack = new Stack<>();
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);

            stack.push(myThirdNode);
            stack.push(mySecondNode);
            stack.push(myFirstNode);

            INode result = stack.peek();
            Assert.assertEquals(result, myFirstNode);
        }

        @Test
        public void StackIsPeekOrPop_shouldReturnPopNodeData() {
            Stack<Integer> stack = new Stack<>();
            MyNode<Integer> Node1 = new MyNode<>(56);
            MyNode<Integer> Node2 = new MyNode<>(30);
            MyNode<Integer> Node3 = new MyNode<>(70);

            stack.peek();
            stack.peek();
            stack.peek();

            stack.push(Node3);
            stack.push(Node2);
            stack.push(Node1);

            stack.pop();
            stack.pop();
            stack.pop();

            int result = stack.size();
            Assert.assertEquals(result, 0 );
        }

        @Test
        public void queueIsCreated_shouldReturnFirstNodeData() {
            Queue<Integer> queue = new Queue<>();
            MyNode<Integer> Node1 = new MyNode<>(56);
            MyNode<Integer> Node2 = new MyNode<>(30);
            MyNode<Integer> Node3 = new MyNode<>(70);

            queue.enqueue(Node1);
            queue.enqueue(Node2);
            queue.enqueue(Node3);

            INode result = queue.peek();

            Assert.assertEquals(result, Node1);
        }

        @Test
        public void queueNodeDequeued_shouldReturnDequeueNode() {
            Queue<Integer> queue = new Queue<>();
            MyNode<Integer> Node1 = new MyNode<>(56);
            MyNode<Integer> Node2 = new MyNode<>(30);
            MyNode<Integer> Node3 = new MyNode<>(70);


            queue.enqueue(Node1);
            queue.enqueue(Node2);
            queue.enqueue(Node3);

            queue.dequeue();
            INode result = queue.dequeue();
            queue.printNode();

            Assert.assertEquals(result, Node2);
        }
    }