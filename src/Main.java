import controller.ClientController;
import controller.DummyView;
import controller.ServerController;
import view.View;

public class Main {
  public static void main(String[] args) {
   try {
     if (args[0].equals("server")) {
      new ServerController(6666, 2);
     } else {
       new ClientController(new View());
     }
   } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
