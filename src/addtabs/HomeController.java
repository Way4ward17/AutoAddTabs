package addtabs;
import com.jfoenix.controls.JFXTabPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
public class HomeController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private JFXTabPane pane;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       button.setOnAction(e->{
       try {
       Tab pana = new Tab("NEW TAB");
       AnchorPane b = new AnchorPane();
       pana.setContent(createPage("/addtabs2/Data.fxml"));
       pane.getTabs().addAll(( pana));
       pane.getSelectionModel().selectLast();    
       } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
       }
       });
    }      
  public AnchorPane createPage(String loc) throws IOException{
      AnchorPane g;
       g = FXMLLoader.load(getClass().getResource(loc)); 
       return g;
    }
    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
}