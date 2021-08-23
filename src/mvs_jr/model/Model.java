package mvs_jr.model;

public interface Model {
    ModelData getModelData();

    void loadUsers();

    void loadDeletedUsers();
}
