package com.sic.credit.api.datacollection.bo.common;

import com.sic.credit.api.datacollection.domain.common.Dc_TableInfo;

import java.io.Serializable;

/**
 * [添加说明]
 * <br>@author : sanGe
 * <br>@date : 18-12-25 下午4:59
 * <br>@version : 1.0
 */
public class Dc_TableInfoBo extends Dc_TableInfo implements Serializable {

    private Integer treeLevel;

    private boolean leaf;

    private boolean root;

    public Integer getTreeLevel() {
        return treeLevel;
    }

    public void setTreeLevel(Integer treeLevel) {
        this.treeLevel = treeLevel;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }
}
