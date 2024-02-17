package PseudoCodes;

import java.util.ArrayDeque;
import java.util.Deque;

public class STACK4 {

    public static Deque<Integer> calc(Deque<Integer> stack)
    {
        int val =stack.size()-1;
        int value1=1;

        while (val>0) {
            int topElement = stack.pop();
            Deque<Integer> tempstack = new ArrayDeque<Integer>();
            int value2 = 1;

            while (value2 <= value1) {
                int element = stack.pop();
                tempstack.push(element + topElement);
                value2 += 1;
            }

            while (tempstack.peek() != null) {
                stack.push(tempstack.pop());

            }
            stack.push(topElement);
            value1 += 1;
            val -= 1;
            System.out.println(stack);
        }
        return stack;
    }
    public static void main(String[] args) {
        Deque<Integer> stack= new ArrayDeque<>();

        stack.add(7);
        stack.add(5);
        stack.add(3);
        stack.add(1);
        stack.add(2);


        System.out.println(calc(stack));

    }
}
