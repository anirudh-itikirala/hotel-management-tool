import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class FeedbackAnalytics {
    public VBox getUI() {
        VBox feedbackLayout = new VBox();
        feedbackLayout.getChildren().add(new Label("Feedback Analytics UI"));
        return feedbackLayout;
    }
}