package com.remous.thread.tree;

import java.util.List;

/**
 * @Author: Remous
 * @Date: 2021/1/23 18:01
 * @ Nothing is impossible to a willing heart.
 */
public class TreeNode {

    /** id **/
    private String id;

    /** 父子节点 **/
    private String parentId;

    private String name;

    private List<TreeNode> children;

    TreeNode(String id, String parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

        public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return parentId;
    }

    public void setPid(String pid) {
        this.parentId = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
