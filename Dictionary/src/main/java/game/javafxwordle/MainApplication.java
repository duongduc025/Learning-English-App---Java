//package game.javafxwordle;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.stage.Screen;
//import javafx.stage.Stage;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Objects;
//import java.util.stream.Stream;
//
//public class MainApplication extends Application {
//
//    public static final ArrayList<String> winningWords = new ArrayList<>();
//    public static final ArrayList<String> dictionaryWords = new ArrayList<>();
//
//    private static Stage stageReference;
//
//    @Override
//    public void start(Stage stage) throws IOException {
//        initializeWordLists();
//        stageReference = stage;
//        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Wordle-view.fxml"));
//        Parent root = fxmlLoader.load();
//
//        MainController mainController = fxmlLoader.getController();
//        mainController.createUI();
//        mainController.getRandomWord();
//        mainController.helpIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/help.png"))));
//        mainController.githubIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/github.png"))));
//        mainController.restartIcon.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/icons8-restart-40.png"))));
//        mainController.githubIcon.setOnMouseClicked(me -> getHostServices().showDocument("https://github.com/jpkhawam/WordleFX"));
//
//        double screenWidth = Screen.getPrimary().getBounds().getWidth();
//        double screenHeight = Screen.getPrimary().getBounds().getHeight();
//        Scene scene = new Scene(root, 864, 624);
//        stage.setMinWidth(864);
//        stage.setMinHeight(624);
//        stage.setMaxWidth(screenWidth);
//        stage.setMaxHeight(screenHeight);
//        stage.setTitle("WordleFX");
//        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/icon.png"))));
//        stage.setScene(scene);
//        stage.show();
//
//        mainController.gridRequestFocus();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//
//    public static void showToast() {
//        Toast.makeText(stageReference);
//    }
//
//    public static void quit() {
//        stageReference.close();
//    }
//
//    public void initializeWordLists() {
//        InputStream winning_words = getClass().getResourceAsStream("winning-words.txt");
//        InputStream dictionary = getClass().getResourceAsStream("dictionary.txt");
//
//        if (winning_words != null && dictionary != null) {
//            Stream<String> winning_words_lines = new BufferedReader(new InputStreamReader(winning_words)).lines();
//            winning_words_lines.forEach(winningWords::add);
//            Stream<String> dictionary_lines = new BufferedReader(new InputStreamReader(dictionary)).lines();
//            dictionary_lines.forEach(dictionaryWords::add);
//        } else
//            quit();
//    }
//
//}
