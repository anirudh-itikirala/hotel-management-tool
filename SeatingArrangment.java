import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SeatingArrangement {
    public VBox getUI() {
        VBox seatingLayout = new VBox();
        seatingLayout.getChildren().add(new Label("Seating Arrangement UI"));
        return seatingLayout;
    }
}