package co.jacob.Thread;

import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	
	Stack<Coin> coinBox = new Stack<Coin>();
	
	coinBox.push(new Coin(100));
	coinBox.push(new Coin(50));
	coinBox.push(new Coin(100));
	coinBox.push(new Coin(50));
	
	while(!coinBox.isEmpty()) {
		Coin coin = coinBox.pop();
		System.out.println("������ ���� : " + coin.getValue() + "��");
	}
}
}
