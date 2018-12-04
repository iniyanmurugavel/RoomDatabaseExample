package coinconveter.iniyan.com.roomdatabase.Local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import coinconveter.iniyan.com.roomdatabase.Model.User;
import io.reactivex.Flowable;

@Dao
public interface UserDAO {


    @Query("Select * From users WHERE id=:userId")
    Flowable<User> getUserById(int userId);

    @Query("Select * From users")
    Flowable<List<User>> getAllUsers();

    @Insert
    void insertUser(User... users);

    @Update
    void updateUser(User... users);
    @Delete
    void deleteUser(User... user);


    @Query("Delete From users")
    void deleteAllUsers();





}
