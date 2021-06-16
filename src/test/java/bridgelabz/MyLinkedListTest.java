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
    }