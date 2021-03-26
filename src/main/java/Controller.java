import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TextArea;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation.ControllerCoffeeMaker;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation.Outputs;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private MediaView mv;
    private MediaPlayer mediaPlayer;
    private File file;
    private Media media;
    private ControllerCoffeeMaker coffeeMaker;
    private TextArea textAreaField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        file = new File("C:\\Jala\\progra101\\edson\\comercial.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        coffeeMaker = new ControllerCoffeeMaker();
        textAreaField.setText("Welcome Coffee Maker \nConsole Area...");
    }

    @FXML
    private void play_Video() {
        coffeeMaker.initCoffeeMaker();
        if (coffeeMaker.verifyConditionsForCoffeeMaker()) {
            file = new File("C:\\Jala\\progra101\\edson\\startButton.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
            textAreaField.setText(coffeeMaker.printForInterface());
        }
    }

    @FXML
    private void playWater() {
        final int waterCups = 12;
        if (coffeeMaker.loadWater(waterCups)) {
            file = new File("C:\\Jala\\progra101\\edson\\water.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
            textAreaField.setText(coffeeMaker.printForInterface());
        }
    }

    @FXML
    private void playCoffee() {
        if (coffeeMaker.loadCoffeeBeans()) {
            file = new File("C:\\Jala\\progra101\\edson\\beansCoffee.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
            textAreaField.setText(coffeeMaker.printForInterface());
        }


    }

    @FXML
    private void playPutPot() {
        if (coffeeMaker.loadPotOverHeaterPlatePot()) {
            file = new File("C:\\Jala\\progra101\\edson\\loadPot.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
            textAreaField.setText(coffeeMaker.printForInterface());

        }
    }

    @FXML
    private void playRemovePot() {
        if (coffeeMaker.removePotOverPlateHeater()) {
            file = new File("C:\\Jala\\progra101\\edson\\removePot.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
            textAreaField.setText(coffeeMaker.printForInterface());
        }
    }

    @FXML
    private void exitCoffee() {
        coffeeMaker.exit();
    }

}
