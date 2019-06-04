package popsort.binaryTree;

/**
 * BinaryTree
 * Created by huangx on 2019/6/2.
 */
public class BinaryTree {

    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 1, 2, 6, 8, 5, 7};
        TreeNode treeNode = build(a);
        int[] b = new int[]{3, 4, 1, 2, 6, 8, 7, 8};
        TreeNode treeNode2 = build(b);
        midTravle(treeNode);
        System.out.println(indexTravle(treeNode));
        System.out.println("deep:" + getBinaryDepend(treeNode));
        System.out.println("getNodeNumKthLevelRec:" + getNodeNumKthLevelRec(treeNode, 5));
        System.out.println("getBinaryLeaf:" + getBinaryLeaf(treeNode));
        System.out.println("isSame:" + isSame(treeNode, treeNode2));
        System.out.println("isBalance:" + isBalance(treeNode));
        midTravle(mirrorNoBroke(treeNode));
        System.out.println("isMirror:" + isMirror(treeNode, mirrorNoBroke(treeNode)));
        System.out.println(isValidBST(treeNode,0));
    }

    //前序遍历
    public static void preTravle(TreeNode node) {
        if (node != null) {
            System.out.println(node.data);
            preTravle(node.left);
            preTravle(node.right);
        }
    }

    //中序遍历
    public static void midTravle(TreeNode node) {
        if (node != null) {
            midTravle(node.left);
            System.out.println(node.data);
            midTravle(node.right);
        }
    }

    //后序遍历
    public static void afterTravle(TreeNode node) {
        if (node != null) {
            midTravle(node.left);
            midTravle(node.right);
            System.out.println(node.data);
        }
    }

    //求二叉树的节点个数
    public static int indexTravle(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return indexTravle(node.right) + indexTravle(node.left) + 1;
    }

    //求二叉树k层节点个数
    public static int getNodeNumKthLevelRec(TreeNode root, int k) {
        if (root == null || k < 1) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getNodeNumKthLevelRec(root.left, k - 1) + getNodeNumKthLevelRec(root.right, k - 1);
    }

    //求二叉树深度
    public static int getBinaryDepend(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getBinaryDepend(node.right), getBinaryDepend(node.right)) + 1;
    }

    //求二叉树的叶子节点个数
    public static int getBinaryLeaf(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return getBinaryLeaf(node.left) + getBinaryLeaf(node.right);
    }

    //判断两颗二叉树是否一样
    public static boolean isSame(TreeNode treeNode, TreeNode treeNode2) {
        if (treeNode == null && treeNode2 == null) {
            return true;
        } else if (treeNode == null || treeNode2 == null) {
            return false;
        }
        if (treeNode.data != treeNode2.data) {
            return false;
        }
        return isSame(treeNode.left, treeNode2.left) && isSame(treeNode.right, treeNode2.right);
    }

    //判断二叉树是否为平衡二叉树
    public static boolean isBalance(TreeNode treeNode) {
        if (treeNode == null) {
            return true;
        }
        int heigh = Math.abs(getBinaryDepend(treeNode.left) - getBinaryDepend(treeNode.right));
        if (heigh > 1) {
            return false;
        }
        return isBalance(treeNode.left) && isBalance(treeNode.right);
    }

    //求二叉树镜像
    public static TreeNode mirror(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }
        TreeNode temp = treeNode.right;
        treeNode.right = treeNode.left;
        treeNode.left = temp;
        mirror(treeNode.left);
        mirror(treeNode.right);
        return treeNode;
    }


    //不破坏二叉树 求镜像
    public static TreeNode mirrorNoBroke(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }
        TreeNode root = new TreeNode(treeNode.data);
        root.left = mirrorNoBroke(treeNode.right);
        root.right = mirrorNoBroke(treeNode.left);
        return root;
    }

    //求二叉树互为镜像
    public static boolean isMirror(TreeNode treeNode, TreeNode treeNode2) {
        if (treeNode == null && treeNode2 == null) {
            return true;
        } else if (treeNode == null || treeNode2 == null) {
            return false;
        }
        if (treeNode.data != treeNode2.data) {
            return false;
        }
        return isMirror(treeNode.left, treeNode2.right) && isMirror(treeNode.right, treeNode2.left);
    }

    //判断是否为二分查找数
    public static boolean isValidBST(TreeNode root, int pre){
        if (root == null) {
            return true;
        }
        boolean left = isValidBST(root.left, pre);
        if (!left) {
            return false;
        }
        if(root.data <= pre) {
            return false;
        }
        pre = root.data;
        boolean right = isValidBST(root.right, pre);
        if(!right) {
            return false;
        }
        return true;
    }

    //最低公共祖先节点
//    public static TreeNode bestLowCommon(TreeNode root, TreeNode p1, TreeNode p2) {
//        if (root == null || p1 == null || p2 == null) {
//            return null;
//        }
//        if (root.right==p1 && root.left==p2 ){
//            return true
//        }
//    }


    //通过数组构建二叉树
    public static TreeNode build(int[] datas) {
        TreeNode treeNode = new TreeNode(datas[0]);
        for (int i = 1; i < datas.length; i++) {
            insert(treeNode, datas[i]);
        }
        return treeNode;
    }

    //插入二叉树
    public static void insert(TreeNode treeNode, int val) {
        // TreeNode newNode=new TreeNode(val);
        if (treeNode.data > val) {
            if (treeNode.left == null) {
                treeNode.left = new TreeNode(val);
            } else {
                insert(treeNode.left, val);
            }
        } else {
            if (treeNode.right == null) {
                treeNode.right = new TreeNode(val);
            } else {
                insert(treeNode.right, val);
            }
        }
    }
}
