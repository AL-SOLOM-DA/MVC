package mvs_jr.view;

import mvs_jr.bean.User;
import mvs_jr.controller.Controller;
import mvs_jr.model.ModelData;

public class EditUserView implements View{
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        for (User elem : modelData.getUsers()) {
            System.out.println("\t"+ elem);
        }
        System.out.println("==========================");
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
