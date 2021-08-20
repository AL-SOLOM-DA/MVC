package mvs_jr.view;

import mvs_jr.controller.Controller;
import mvs_jr.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
