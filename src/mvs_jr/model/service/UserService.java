package mvs_jr.model.service;

import mvs_jr.bean.User;

import java.util.List;

public interface UserService {
    User deleteUser(long id);

    User createOrUpdateUser(String name, long id, int level);

    List<User> getUserByName(String name);

    List<User> getAllDeletedUsers();

    List<User> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User> filterOnlyActiveUsers(List<User> allUsers);

    User getUserById(long userId);
}
