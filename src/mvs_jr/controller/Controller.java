package mvs_jr.controller;

import mvs_jr.model.Model;
import mvs_jr.view.UsersView;

public class Controller {
    private Model model;
    private UsersView usersView;

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers(){

        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void setUserView(UsersView usersView) {
        this.usersView = usersView;
    }
}