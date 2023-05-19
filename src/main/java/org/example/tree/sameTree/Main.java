package org.example.tree.sameTree;

import org.example.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        LinkedList<Integer> queue = new LinkedList<>();

        inOrder(p,queue,true);
        inOrder(q,queue,false);
        if (queue.isEmpty())
            return true;

        return false;
    }
    static void inOrder(TreeNode node, LinkedList<Integer>list, boolean isAdd) {
        if (node == null)
            return;
        inOrder(node.left,list,isAdd);
        if (isAdd){
            list.add(node.val);
        }else{
            list.remove();
        }
        inOrder(node.right,list,isAdd);
    }


/*    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> firstTree = new ArrayList<>();
        List<Integer> secondTree = new ArrayList<>();
        inOrder(p,firstTree);
        inOrder(q,secondTree);
        if (firstTree.equals(secondTree))
            return true;

        return false;
    }

    static void inOrder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);
    }*/
}
