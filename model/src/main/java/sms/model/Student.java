package sms.model;

/**
 * @program: sms
 * @description:学生类
 * @author: Mr.Wang
 * @create: 2018-07-11 00:09
 **/
public class Student extends NamedEntity {

    private String group;

    public Student() {
    }

    public Student(String id, String name, String group) {
        super(id, name);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
