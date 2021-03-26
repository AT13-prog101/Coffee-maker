import javafx.fxml.FXML;
import javafx.fxml.Initializable;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        file = new File("C:\\Jala\\progra101\\edson\\comercial.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        coffeeMaker = new ControllerCoffeeMaker();
    }

    @FXML
    private void play_Video() {
        coffeeMaker.initCoffeeMaker();
        if (coffeeMaker.verifyConditionsForCoffeeMaker()){
            file = new File("C:\\Jala\\progra101\\edson\\startButton.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();

        }
    }

    @FXML
    private void playWater() {
        file = new File("C:\\Jala\\progra101\\edson\\water.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        coffeeMaker.loadWater(12);
    }

    @FXML
    private void playCoffee() {
        file = new File("C:\\Jala\\progra101\\edson\\beansCoffee.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        coffeeMaker.loadCoffeeBeans();
    }

    @FXML
    private void playPutPot() {
        file = new File("C:\\Jala\\progra101\\edson\\loadPot.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        coffeeMaker.loadPotOverHeaterPlatePot();
    }

    @FXML
    private void playRemovePot() {
        file = new File("C:\\Jala\\progra101\\edson\\removePot.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        coffeeMaker.removePotOverPlateHeater();
    }

    @FXML
    private void exitCoffee(){
        coffeeMaker.exit();
    }

}
