//Java program to implement a basic stack Data Structure using arrays

import java.util.Scanner;

public class Stack {
	private int[] stack;
	private int top;
	private int capacity;

	Stack(int size) {
		stack = new int[size];
		capacity = size;
		top = -1;
	}

	private boolean isFull() {
		return (top == capacity) ? true : false;
	}

	private boolean isEmpty() {
		return (top==-1) ? true : false;
	}

	public void push(int val) {
		if (isFull()) {
			System.out.println("Stack overflow!");
		}
		else {
			stack[++top] = val;
			System.out.println(val + " pushed onto stack");
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow!");
		}
		else {
			System.out.println(stack[top--] + " popped and returned");
			return stack[top];
		}
		return -1;
	}

	public void display() {
		int i;
		for (i=0; i<=top; i++) {
			System.out.println(stack[i] + "\n");
		}
	}

	public static void main(String args[]) {
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.pop();
		stack.display();
	}
}