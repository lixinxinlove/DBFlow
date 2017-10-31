package com.love.dbflow.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by android on 2017/10/31.
 */

@Database(name = DBFlowDatabase.NAME, version = DBFlowDatabase.VERSION)
public final class DBFlowDatabase {
    //数据库名称
    public static final String NAME = "DBFlowDatabase";
    //数据库版本号
    public static final int VERSION = 2;

//    /**
//     * 数据库的修改：
//     * 1、User 表结构的变化
//     * 2、增加表字段，考虑到版本兼容性，老版本不建议删除字段
//     */
//    @Migration(version = 6, database = DBFlowDatabase.class)
//    public static class Migration2 extends AlterTableMigration<User> {
//
//        public Migration2(Class<User> table) {
//            super(table);
//        }
//
//        @Override
//        public void onPreMigrate() {
//            //addColumn(SQLiteType.TEXT, "like");
//        }
//    }





}



