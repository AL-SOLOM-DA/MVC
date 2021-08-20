package mvs_jr.dao.mock;

import mvs_jr.bean.User;

import java.util.LinkedList;
import java.util.List;

public class DataSource {
    private static DataSource ourInstance = new DataSource();

    public  static DataSource getInstance(){
        return ourInstance;
    }

    private DataSource(){
    }

    private List<User> users = new LinkedList<>(){{
        add(new User("Ivanov", 1231, 1));
        add(new User("Petrov", 1241, 2));
        add(new User("Petrov", 1251, 1));
        add(new User("Sidorov", 1261, 2));
    }};

    private long maxUserId = 1261;

    public List<User> getUsers(){
        return users;
    }

    public User createOrUpdate(User newUser){
        if(newUser == User.NULL_USER)
            return User.NULL_USER;
        //new user
        if(newUser.getId() == 0)
            return createNewUser(newUser);
        else return updateUser(newUser);
    }

    private User createNewUser(User newUser) {
        User clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User updateUser(User newUser) {
        for (User user: users) {
            if(user.getId() == newUser.getId()){
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we don't find such a user
        return User.NULL_USER;
    }

}