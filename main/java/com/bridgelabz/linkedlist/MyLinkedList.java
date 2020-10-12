package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
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
    while(tempNode != null && tempNode.getNext() != null)
    {
    	if(tempNode.getKey() == key) {
    		break;
    	}
    	tempNode = tempNode.getNext();
    }
    if(tempNode.getKey() == key)
    	return tempNode;
    else
    	return null;
	}
}
