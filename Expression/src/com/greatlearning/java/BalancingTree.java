package com.greatlearning.java;

import java.util.HashSet;

public class BalancingTree {
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	static boolean traversel(Node node, int sum, HashSet<Integer> set) {
		
		if (node == null) {
			return false;
		}
		System.out.println(node.data);
		if (traversel(node.left, sum, set)) {
			return true;
		}
		if(set.contains(sum - node.data)) {
			System.out.println("Pair exists");
			return true;
		} else {
			set.add(node.data);
		}
		if (traversel(node.right, sum, set)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> interation = new HashSet<Integer>();
		int sum1 = 60;
		int sum2 = 100;
		Node root = new Node(30);
		Node left = new Node(20);
		Node right = new Node(40);
		root.left = left;
		root.right = right;
		boolean binearySearch = traversel(root, sum1, interation);
		if(binearySearch == false) {
			System.out.println("Pair doesn't exists");
		}
		boolean binearySearch2 = traversel(root, sum2, interation);
		if(binearySearch2 == false) {
			System.out.println("Pair doesn't exists");
		}
	}
}
