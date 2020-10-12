package com.bridgelabz.linkedlist;

public class MyLinkedList {
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

	// Printing the available nodes
	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public INode pop(INode myNode) {
    	INode tempNode = this.head;
    	this.head = this.head.getNext();
    	return tempNode;
	}
}
