package coinconveter.iniyan.com.roomdatabase.Database;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import coinconveter.iniyan.com.roomdatabase.Model.User;
import io.reactivex.Flowable;

public interface IUserDataSource {




    Flowable<User> getUserById(int userId);


    Flowable<List<User>> getAllUsers();


    void insertUser(User... users);

    void updateUser(User... users);

    void deleteUser(User... users);


    void deleteAllUsers();




}
