package ExtendInterface;

public class Chrome implements WebDrivers, Browser {//class implemenets interface, class extends class
    @Override
    public void maximize(){
        System.out.println("CHrome MAximized");
    }
    @Override
    public void open(){
        System.out.println("Chrome Maximized");

        //949-508-2630, 8576309

    }
    @Override
    public void close(){
        System.out.println("Chrome closed");
    }
}
