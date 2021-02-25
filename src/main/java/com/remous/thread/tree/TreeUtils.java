package com.remous.thread.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Remous
 * @Date: 2021/1/23 18:02
 * @ Nothing is impossible to a willing heart.
 */
public class TreeUtils {

    private static List<TreeNode> listGetStree(List<TreeNode> list) {
        List<TreeNode> treeList = new ArrayList<TreeNode>();
        for (TreeNode tree : list) {
            //找到根
            if (tree.getPid() == "0") {
                treeList.add(tree);
            }
            //找到子
            for (TreeNode treeNode : list) {
                if (treeNode.getPid() == tree.getId()) {
                    if (tree.getChildren() == null) {
                        tree.setChildren(new ArrayList<TreeNode>());
                    }
                    tree.getChildren().add(treeNode);
                }
            }
        }
        return treeList;
    }

    public static void main(String[] args) {

        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(new TreeNode("1", "0", "1"));
        list.add(new TreeNode("2", "0", "2"));
        list.add(new TreeNode("3", "2", "3"));
        list.add(new TreeNode("4", "3", "4"));
        list.add(new TreeNode("5", "4", "5"));
        list.add(new TreeNode("6", "5", "6"));

        List<TreeNode> treeList = new ArrayList<TreeNode>();
        List<TreeNode> treeList1 = new ArrayList<TreeNode>();
        List<TreeNode> treeList2 = new ArrayList<TreeNode>();
        List<TreeNode> treeList3 = new ArrayList<TreeNode>();
        //方法一、
        treeList = listGetStree(list);
//        treeList1 = listToTree(list);
        System.out.println(treeList);
//        treeList2 = toTree(list);
    }
}
