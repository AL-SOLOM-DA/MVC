package mvs_jr;

import mvs_jr.controller.Controller;
import mvs_jr.model.FakeModel;
import mvs_jr.model.MainModel;
import mvs_jr.model.Model;
import mvs_jr.view.EditUserView;
import mvs_jr.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new FakeModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setModel(model);
        controller.setUserView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(1261L);
        editUserView.fireEventUserDeleted(1241);
        editUserView.fireEventUserChanged("Orlov", 1231, 5);
        usersView.fireEventShowDeletedUsers();
    }
}
