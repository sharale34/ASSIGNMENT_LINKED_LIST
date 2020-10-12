package com.bridgelabz.linkedlist;

public class MyNode<K> implements INode<K> {
	private K key;
	private INode<K> next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode next) {
		this.next = (MyNode<K>) next;
	}

	public void setNext(MyNode<K> next) {
		this.next = next;
	}

}