package com.wiiu.prototype.deepclone;

import java.io.Serializable;

/**
 * @ClassName DeepCloneableTarget
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/18 3:18 下午
 * @Version 1.0
 */

public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
