import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class javaFXApplicationMenu extends Application
{@Override
 public void start(Stage stage)
 {
  MenuBar menubar=new MenuBar();
  Menu fileMenu=new Menu("File");
  Menu editMenu=new Menu("Edit");
  Menu helpMenu=new Menu("Help");
 

  MenuItem newItem=new MenuItem("New");
  MenuItem openFileItem=new MenuItem("Open File");
  MenuItem exitItem=new MenuItem("Exit");
 
  MenuItem copyItem=new MenuItem("Copy");
  MenuItem pasteItem=new MenuItem("Paste");
  
  fileMenu.getItems().addAll(newItem,openFileItem,exitItem);
  editMenu.getItems().addAll(copyItem,pasteItem);
 
  menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu);

  BorderPane root=new BorderPane();
  root.setTop(menuBar);
  Scene scene=new Scene(root,350,200);
 
  stage.setTitle("JavaFX Menu(o7planning.org)");
  stage.setScene(scene);
  stage.show();
 }
 
 public static void main(String args[])
 {
  Application.launch(args);
 }
}

