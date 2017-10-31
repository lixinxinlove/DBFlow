package com.love.dbflow.bean;

import com.love.dbflow.db.DBFlowDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by android on 2017/10/31.
 */

//@ModelContainer //表示可以直接解析JSON
@Table(database = DBFlowDatabase.class)
public class User extends BaseModel {

    @PrimaryKey(autoincrement = false)
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private int age;
    @Column
    private boolean sex;
    @Column
    private String love;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", love='" + love + '\'' +
                '}';
    }
}
