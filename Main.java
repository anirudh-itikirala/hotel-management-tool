import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        SeatingArrangement seatingArrangement = new SeatingArrangement();
        InventorySystem inventorySystem = new InventorySystem();
        FeedbackAnalytics feedbackAnalytics = new FeedbackAnalytics();

        BorderPane root = new BorderPane();
        root.setTop(seatingArrangement.getUI());
        root.setCenter(inventorySystem.getUI());
        root.setBottom(feedbackAnalytics.getUI());

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Rosewood Farms Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}