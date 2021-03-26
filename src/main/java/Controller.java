import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private MediaView mv;
    private MediaPlayer mediaPlayer;
    private File file;
    private Media media;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        file = new File("C:\\Jala\\progra101\\edson\\comercial.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
    }

    @FXML
    private void play_Video() {
        file = new File("C:\\Jala\\progra101\\edson\\startButton.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
    }

    @FXML
    private void playWater() {
        file = new File("C:\\Jala\\progra101\\edson\\water.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
    }

    @FXML
    private void playCoffee() {
        file = new File("C:\\Jala\\progra101\\edson\\beansCoffee.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
    }

    @FXML
    private void playPutPot() {
        file = new File("C:\\Jala\\progra101\\edson\\loadPot.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
    }

    @FXML
    private void playRemovePot() {
        file = new File("C:\\Jala\\progra101\\edson\\removePot.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
    }

}
