import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class InventorySystem {
    public VBox getUI() {
        VBox inventoryLayout = new VBox();
        inventoryLayout.getChildren().add(new Label("Inventory System UI"));
        return inventoryLayout;
    }
}