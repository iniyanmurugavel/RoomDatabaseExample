package coinconveter.iniyan.com.roomdatabase.Local;

import java.util.List;

import coinconveter.iniyan.com.roomdatabase.Database.IUserDataSource;
import coinconveter.iniyan.com.roomdatabase.Model.User;
import io.reactivex.Flowable;

public class UserDataSource implements IUserDataSource {


    private static UserDataSource mInstance;

    private UserDAO userDAO;

    public static UserDataSource getInstance(UserDAO userDAO) {
        if (mInstance == null) {
            mInstance = new UserDataSource(userDAO);
        }
        return mInstance;
    }

    ;

    public UserDataSource(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public Flowable<User> getUserById(int userId) {
        return userDAO.getUserById(userId);
    }

    @Override
    public Flowable<List<User>> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void insertUser(User... users) {
        userDAO.insertUser(users);
    }

    @Override
    public void updateUser(User... users) {
        userDAO.updateUser(users);
    }

    @Override
    public void deleteUser(User... user) {
        userDAO.deleteUser(user);
    }

    @Override
    public void deleteAllUsers() {
        userDAO.deleteAllUsers();
    }
}
