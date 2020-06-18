package com.wiiu.prototype.deepclone;

import java.io.*;

/**
 * @ClassName DeepProtoType
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/18 3:21 下午
 * @Version 1.0
 */

public class DeepProtoType implements Serializable,Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    // 深拷贝方式1
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 处理基本类型
        deep = super.clone();
        // 处理引用类型
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
        return deep;
    }

    // 深拷贝方式2 (推荐使用)
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e){
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception o){
                System.out.println("关闭流");
            }
        }
    }
}
