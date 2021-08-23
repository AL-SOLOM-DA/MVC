package mvs_jr.view;

import mvs_jr.bean.User;
import mvs_jr.controller.Controller;
import mvs_jr.model.ModelData;

public class UsersView implements View {

    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        if(modelData.isDisplayDeletedUserList()){
            System.out.println("All deleted users:");
        } else{
            System.out.println("All users:");
        }
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

    public void fireEventShowDeletedUsers(){
        controller.onShowAllDeletedUserss();
    }


}
