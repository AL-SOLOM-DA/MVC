package mvs_jr.model;

import mvs_jr.bean.User;
import mvs_jr.model.service.UserService;
import mvs_jr.model.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setDisplayDeletedUserList(false);
        List<User> users = new ArrayList<>();
        users.addAll(userService.getUsersBetweenLevels(1, 100));
        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        modelData.setDisplayDeletedUserList(true);
        List<User> users = userService.getAllDeletedUsers();
        modelData.setUsers(users);
    }


}
