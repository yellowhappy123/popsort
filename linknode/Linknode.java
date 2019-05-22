package popsort.linknode;

import java.util.Stack;

/**
 * Linknode
 * Created by huangx on 2019/3/31.
 */
public class Linknode {

    public Node head;
    public Node current;

    public void add(int i) {
        if (head == null) {
            head = new Node(i);
            current = head;
        } else {
            current.next = new Node(i);
            current = current.next;
        }
    }

    public void print(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public int getLenth(Node node) {
        int num = 0;
        while (node != null) {
            num++;
            node = node.next;
        }
        return num;
    }

    public int findLastNode(int index) {
        if (head == null) {
            return -1;
        }
        int size = 0;
        current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        current = head;
        for (int i = 0; i < size - index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int findMiddle(Node node) {
        if (node == null) {
            return -1;
        }
        Node current1 = node;
        Node current2 = node;
        while (current1 != null && current2 != null) {
            if (current2.next != null) {
                current2 = current2.next.next;
            } else {
                break;
            }
            current1 = current1.next;
        }
        return current1.data;
    }

    class Node {
        //注：此处的两个成员变量权限不能为private，因为private的权限是仅对本类访问。
        int data; //数据域
        Node next;//指针域

        public Node(int data) {
            this.data = data;
        }
    }

     //合并成有序链表
    public Node mergeLinkList(Node node1, Node node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        Node res;
        Node c1;
        if (node1.data < node2.data) {
            res = node1;
            node1 = node1.next;
        } else {
            res = node2;
            node2 = node2.next;
        }
        c1 = res;
        while (node1 != null && node2 != null) {
            if (node1.data < node2.data) {
                c1.next = node1;
                node1 = node1.next;
                c1 = c1.next;
            } else {
                c1.next = node2;
                node2 = node2.next;
                c1 = c1.next;
            }
        }
        if (node1 == null) {
            while (node2 != null) {
                c1.next = node2;
                node1 = node1.next;
                c1 = c1.next;
            }
        }
        if (node2 == null) {
            while (node1 != null) {
                c1.next = node1;
                node1 = node1.next;
                c1 = c1.next;
            }
        }
        return res;
    }

    //链表反转 需要加强
    public Node revers(Node node) {
        Node header = null;
        Node c1 = node;
        Node next = null;
        while (c1 != null) {
            next = c1.next;
            c1.next = header;
            header = c1;
            c1 = next;
        }
        return header;
    }

    //逆序输出
    public void reverserPrint(Node node) {
        if (node == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();  //新建一个栈
        while (node != null) {
            stack.add(node);
            node = node.next;
        }
        while (!stack.empty()) {
            System.out.println(stack.pop().data);
        }
    }

    //递归逆序输出
    public void reverserDigui(Node node) {
        if (node == null) {
            return;
        }
        reverserDigui(node.next);
        System.out.println(node.data);
    }


    public static void main(String[] args) {
        int AA = 5;
        Linknode link = new Linknode();
        link.add(1);
        link.add(7);
        link.add(9);
        link.add(15);
        link.add(25);
        link.add(56);
        link.add(78);
        Linknode link2 = new Linknode();
        link2.add(2);
        link2.add(6);
        link2.add(18);
        link2.add(31);
        link.print(link.head);
        System.out.println("lenth:" + link.getLenth(link.head));
        System.out.println("findLastNode:" + link.findLastNode(2));
        System.out.println("findMiddle:" + link.findMiddle(link.head));
        link.print(link.mergeLinkList(link.head, link2.head));
        System.out.println("rever");
        link.print(link.revers(link.head));

//        link.reverserPrint(link.head);
//        link.reverserDigui(link.head);
    }


}
