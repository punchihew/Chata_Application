package Controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;

public class ClientController {


    public ScrollPane TxtMassageShowFeild;
    public javafx.scene.layout.VBox VBox;
    /* public static HBox h_box;*/
    public TextField textChat;
    public AnchorPane imogi_pane;
    public Label lbl_name;

    BufferedReader reader;
    PrintWriter writer;
    Socket socket;
    private FileChooser fileChooser;
    private File filePath;



    public void btn_logout_On_action(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void Mouse_On_Click_Hide_Emogi(MouseEvent mouseEvent) {
        imogi_pane.setVisible(false);
    }

    public void ChatOnAction(ActionEvent actionEvent) {

        String msg = textChat.getText();
        writer.println(lbl_name.getText() + ": " + msg);

        textChat.clear();


        if(msg.equalsIgnoreCase("BYE") || (msg.equalsIgnoreCase("logout"))) {
            System.exit(0);

        }
    }

    public void btn_imogi_on_action(MouseEvent mouseEvent) {
        imogi_pane.setVisible(true);

    }

    public void btn_cam_on_action(MouseEvent mouseEvent) {

        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        fileChooser = new FileChooser();
        fileChooser.setTitle("Open Image");
        this.filePath = fileChooser.showOpenDialog(stage);
        writer.println(lbl_name.getText() + " " + "img" + filePath.getPath());
    }

    public void btn_massage_send_on_action(MouseEvent mouseEvent) {

        String msg = textChat.getText();
        writer.println(lbl_name.getText() + ": " + msg);

        textChat.clear();

        if(msg.equalsIgnoreCase("BYE") || (msg.equalsIgnoreCase("logout"))) {
            System.exit(0);

        }
    }

    public void emo_pane_on_action(MouseEvent mouseEvent) {
    }

    public void sad(MouseEvent mouseEvent) {
        String emoji = new String(Character.toChars(128546));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);
    }

    public void lot_sad(MouseEvent mouseEvent) {

        String emoji = new String(Character.toChars(128554));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);
    }

    public void money(MouseEvent mouseEvent) {

        String emoji = new String(Character.toChars(129297));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);
    }

    public void love(MouseEvent mouseEvent) {

        String emoji = new String(Character.toChars(128525));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);
    }

    public void green_sad(MouseEvent mouseEvent) {

        String emoji = new String(Character.toChars(128560));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);
    }

    public void smile_one_eyy(MouseEvent mouseEvent) {

        String emoji = new String(Character.toChars(128540));
        textChat.setText(emoji);
        imogi_pane.setVisible(false);
    }

    public void cry_yes(MouseEvent mouseEvent) {
    }

    public void cry_head(MouseEvent mouseEvent) {
    }

    public void real_amile(MouseEvent mouseEvent) {
    }

    public void tuin(MouseEvent mouseEvent) {
    }

    public void woow(MouseEvent mouseEvent) {
    }

    public void smile_normal(MouseEvent mouseEvent) {
    }

    public void large_smile(MouseEvent mouseEvent) {
    }

    public void small_smile(MouseEvent mouseEvent) {
    }

    public void tong_smile(MouseEvent mouseEvent) {
    }
}
