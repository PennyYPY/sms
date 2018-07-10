package sms.model;

/**
 * @program: sms
 * @description:课程实体类
 * @author: Mr.Wang
 * @create: 2018-07-11 00:11
 **/
public class Course extends NamedEntity {

    public Course() {
    }

    public Course(String id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
