package ExtendInterface;

public class Firefox implements WebDrivers, Browser {
  @Override
  public void maximize(){
      System.out.println("Firefox MAximized");
  }
    @Override
    public void open(){
        System.out.println("Firefox Maximized");

        //949-508-2630, 8576309

    }
    @Override
    public void close(){
        System.out.println("Firefox closed");
    }

}
