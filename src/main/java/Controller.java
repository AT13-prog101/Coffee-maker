import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

//import javax.print.attribute.standard.Media;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private TextField field1;
    @FXML
    private TextField field2;
    @FXML
    private TextField field3;
    @FXML
    private Label results;
    @FXML
    private Button boton;
    @FXML
    private MediaView mv;

    private int numericDate1 = 0;
    private int numericDate2 = 0;
    private int numericDate3 = 0;
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

    @FXML
    private void action() {
        if (sanity(field1.getText())) {
            if (sanity(field2.getText())) {
                if (sanity(field3.getText())) {
                    numericDate1 = Integer.parseInt(field1.getText().trim());
                    numericDate2 = Integer.parseInt(field2.getText().trim());
                    numericDate3 = Integer.parseInt(field3.getText().trim());
                    results.setText("");
                    results.setText(verify(numericDate1, numericDate2, numericDate3));
                } else {
                    results.setText("Date 3 invalid");
                }
            } else {
                results.setText("Date 2 invalid");
            }
        } else {
            results.setText("Date 1 invalid");
        }
    }

    private String verify(int date1, int date2, int date3) {
        if (date1 == date2 && date2 == date3) {
            return "Triangle is Equilateral";
        } else {
            if (date1 == date2 || date1 == date3 || date2 == date3) {
                return "Triangle is Isosceles";
            } else {
                if (date1 != date2 || date1 != date3 || date3 != date2) {
                    return "Triangle is Scalene";
                }
            }
        }
        return "";
    }

    private boolean sanity(String date) {
        if (date.equals("")) return false;
        date = date.trim();
        for (int i = 0; i < date.length(); i++) {
            if ((int) date.charAt(i) < 48 || (int) date.charAt(i) > 57) {
                return false;
            }
        }

        int auxNum = Integer.parseInt(date);

        if (auxNum < 1 || auxNum > 100) return false;

        return true;
    }

    @FXML
    private void clear(){
        field1.setText("");
        field2.setText("");
        field3.setText("");
    }


}
