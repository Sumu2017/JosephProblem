package com.sumu.demo;

/**
 * 约瑟夫环
 * 
 * @author sumu 
 * 约瑟夫环运作如下： 
 * 1、一群人围在一起坐成环状（如：N） 
 * 2、从某个编号开始报数（如：K）
 * 3、数到某个数（如：M）的时候，此人出列，下一个人重新报数 
 * 4、一直循环，直到所有人出列，约瑟夫环结束
 */
public class JosephProblem {
	private static int N = 20;// 总共有多少人
	private static int K = 0;// 从编号0开始报数
	private static int M = 5;// 数到5，第五个人出列
	
	public class Node {
		int value;// 下标
		Node next;// 后面一个人

		public Node(int value) {
			this.value = value;
		}
	}

	public void dequeue() {
		Node header = new Node(1);//第一个结点
		Node node=header;//目前被点到的人
		//首先将20个人通过链表的形式连成一个环
		for (int i = 1; i < N; i++) {
			node.next=new Node(i+1);
			node=node.next;
		}
		node.next=header;//首尾相连
		while (node!=node.next) {
			for (int i = 1; i < M; i++) {
				node=node.next;
			}
			System.out.println("编号:"+node.next.value+"出列");
			node.next=node.next.next;
		}
		System.out.println("编号:"+node.next.value+"最后出列");
	}

	public static void main(String[] args) {
		JosephProblem josephProblem=new JosephProblem();
		josephProblem.dequeue();
	}
}


