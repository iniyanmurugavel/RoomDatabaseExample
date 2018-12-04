package coinconveter.iniyan.com.roomdatabase.Local;


import android.arch.persistence.room.Database;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import coinconveter.iniyan.com.roomdatabase.Model.User;

import static coinconveter.iniyan.com.roomdatabase.Local.UserDatabase.DATABASE_VERSION;

@Database(entities = User.class,version = DATABASE_VERSION)
public abstract class UserDatabase extends RoomDatabase {

 public    static  final  int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="Iniyan-Room";
    public abstract UserDAO userDAO();
    private static  UserDatabase mInstance;


    public static UserDatabase getInstance(Context context){
        if(mInstance==null){
            mInstance = Room.databaseBuilder(context,UserDatabase.class,DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return  mInstance;
    }
}
