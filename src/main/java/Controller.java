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
        file = new File("C:\\Jala\\progra101\\edson\\water.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
    }

    @FXML
    private void play_Video() {
        mediaPlayer.play();

    }

}
