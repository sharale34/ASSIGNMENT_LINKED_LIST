package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
	private static char[] size;
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(MyNode myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null)
			this.head = myNode;
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop(INode myNode) {
		INode tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}

	public INode popLast(INode myNode) {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode search(K key) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey() == key) {
				break;
			}
			tempNode = tempNode.getNext();
		}
		if (tempNode.getKey() == key)
			return tempNode;
		else
			return null;
	}

	public void remove(INode myNode, INode deleteNode) {
		myNode.setNext(deleteNode.getNext());
	}

	public int size() {
		int size = 0;
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			size++;
			tempNode = tempNode.getNext();
		}
		return size;
	}

	public <K extends Comparable<K>> void insert(K key) {
		MyNode newNode = new MyNode(key);
		INode<K> current = head;
		INode previous = null;
		while (current != null && key.compareTo(current.getKey()) > 0) {
			previous = current;
			current = current.getNext();
		}
		if (previous == null) {
			head = newNode;
		} else {
			previous.setNext(newNode);
		}
		newNode.setNext(current);
	}
}
