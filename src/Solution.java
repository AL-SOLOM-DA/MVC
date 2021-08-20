import controller.Controller;
import net.company.FakeModel;
import net.company.Model;
import view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new FakeModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUserView(usersView);

        usersView.fireEventShowAllUsers();

    }
}
