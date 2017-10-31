package com.love.dbflow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.love.dbflow.bean.User;
import com.love.dbflow.bean.User_Table;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<User> users;

    ModelAdapter<User> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = FlowManager.getModelAdapter(User.class);
        users = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId(i);
            user.setName("lee");
            user.setAge(i);
            user.setAddress("三里屯soho");
            user.setSex(true);
            user.setLove("love");
            users.add(user);
        }

    }


    public void deleteAll(View v) {
        //删除所有
        SQLite.delete(User.class).execute();
    }


    //删除
    public void delete(View view) {
        User user = users.get(0);
        adapter.delete(user);
        user.delete();
    }

    public void saveAll(View view) {
        //保存或更新
        adapter.saveAll(users);
    }

    public void insertAll(View view) {
        //插入  如果有相同的key 会报错
        adapter.insertAll(users);
    }

    public void selectAll(View view) {
        List<User> userList = SQLite.select().from(User.class).queryList();
        for (int i = 0; i < 1; i++) {
            Log.e("selectAll", userList.get(i).toString());
        }
    }

    public void selectOne(View view) {
        User user = SQLite.select().from(User.class).where(User_Table.id.eq(10L)).querySingle();
    }
}
