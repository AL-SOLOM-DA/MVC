package mvs_jr.model;

import mvs_jr.bean.User;
import mvs_jr.model.service.UserService;
import mvs_jr.model.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    private List<User> getAllUsers(){
        List<User> users = new ArrayList<>(userService.getUsersBetweenLevels(1, 100));
        return userService.filterOnlyActiveUsers(users);
    }


    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(getAllUsers());
    }

    @Override
    public void loadDeletedUsers() {
        modelData.setDisplayDeletedUserList(true);
        List<User> users = userService.getAllDeletedUsers();
        modelData.setUsers(users);


    }

    @Override
    public void loadUserById(long userId) {
        User user = userService.getUserById(userId);
        modelData.setActiveUser(user);
    }

    @Override
    public void deleteUserById(long id) {

        userService.deleteUser(id);
        modelData.setUsers(getAllUsers());
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        userService.createOrUpdateUser(name, id, level);
        modelData.setUsers(getAllUsers());
    }


}
