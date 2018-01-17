package com.sumu.demo;

/**
 * Լɪ��
 * 
 * @author sumu 
 * Լɪ���������£� 
 * 1��һȺ��Χ��һ�����ɻ�״���磺N�� 
 * 2����ĳ����ſ�ʼ�������磺K��
 * 3������ĳ�������磺M����ʱ�򣬴��˳��У���һ�������±��� 
 * 4��һֱѭ����ֱ�������˳��У�Լɪ�򻷽���
 */
public class JosephProblem {
	private static int N = 20;// �ܹ��ж�����
	private static int K = 0;// �ӱ��0��ʼ����
	private static int M = 5;// ����5��������˳���
	
	public class Node {
		int value;// �±�
		Node next;// ����һ����

		public Node(int value) {
			this.value = value;
		}
	}

	public void dequeue() {
		Node header = new Node(1);//��һ�����
		Node node=header;//Ŀǰ���㵽����
		//���Ƚ�20����ͨ���������ʽ����һ����
		for (int i = 1; i < N; i++) {
			node.next=new Node(i+1);
			node=node.next;
		}
		node.next=header;//��β����
		while (node!=node.next) {
			for (int i = 1; i < M; i++) {
				node=node.next;
			}
			System.out.println("���:"+node.next.value+"����");
			node.next=node.next.next;
		}
		System.out.println("���:"+node.next.value+"������");
	}

	public static void main(String[] args) {
		JosephProblem josephProblem=new JosephProblem();
		josephProblem.dequeue();
	}
}


