package view;

import controller.Controller;
import net.company.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
