package mvs_jr;

import mvs_jr.controller.Controller;
import mvs_jr.model.MainModel;
import mvs_jr.model.Model;
import mvs_jr.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUserView(usersView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventShowDeletedUsers();
    }
}
