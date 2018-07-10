package sms.model;

/**
 * @program: sms
 * @description:抽象命名父类
 * @author: Mr.Wang
 * @create: 2018-07-11 00:08
 **/
public abstract class NamedEntity extends Entity {
    protected String name;

    public NamedEntity() {
    }

    public NamedEntity(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
