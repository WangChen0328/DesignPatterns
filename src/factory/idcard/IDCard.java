package factory.idcard;

import factory.Product;

/**
 * @author wangchen
 * @date 2018/5/14 14:09
 */
public class IDCard extends Product {

    private String owner;

    /**
     * 默认只能 IDCardFactory new实例，其他调用者必须使用，工程创建
     * @param owner
     */
    IDCard(String owner) {
        System.out.println("制作 " + owner + "的ID卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + "的ID卡。");
    }

    public String getOwner() {
        return owner;
    }
}
