package com.test.practiceofall;

class Node {
	public Integer num;

	public Node(Integer num) {
		this.num = num;
	}

}

public class Example {

	public static void main(String[] args) {
		Node node = new Node(213);
		System.out.println(node.num);

		first(node);
		System.out.println(node.num);

		second(node);
		System.out.println(node.num);

	}

	public static void first(Node n) {
		n = new Node(214);
		// System.out.println(n.num);
	}

	public static void second(Node n) {
		n.num = 214;
	}

}
