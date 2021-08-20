package view;

import bean.User;
import controller.Controller;
import net.company.ModelData;

public class UsersView implements View {

    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users:");
        for (User elem : modelData.getUsers()) {
            System.out.println("\t"+ elem);
        }
        System.out.println("==========================");
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }

}
