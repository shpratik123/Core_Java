package ExtendInterface;

public class Test {
    public static void main(String[] args) {

      Chrome c= new Chrome();// yo nahalda ni huncha, first we have to assign the value for variable.
        //***
        Browser b = new Chrome();//yo browser lai chrome halda ni huncha,  browser halda chahi yesle extends gareko cha webdriver snga so browser halda ni huncha

        //can callall 3 open, close and maximize()
        b.open();
        b.close();
        b.maximize();

        Browser b1 = new Firefox();//yo browser lai firefox halda ni huncha
        //can callall 3 open, close and maximize()
        b1.open();
        b1.close();
        b1.maximize();

        /* next method
          // yo nahalda ni huncha, first we have to assign the value for variable.
        //***
        Chrome b = new Chrome();//yo browser lai chrome halda ni huncha,  browser halda chahi yesle extends gareko cha webdriver snga so browser halda ni huncha

        //can callall 3 open, close and maximize()
        b.open();
        b.close();
        b.maximize();

        Firefox b1 = new Firefox();//yo browser lai firefox halda ni huncha
        //can callall 3 open, close and maximize()
        b1.open();
        b1.close();
        b1.maximize();

         */

    }
}
