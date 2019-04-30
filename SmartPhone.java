
/**
 * Smartphone class has a connection with an app.
 * 
 * @author Luke Wismer
 * @version 1.1.1
 */
public class SmartPhone
{
    private App[] appArray;
    private String password;
    private int totalMemory;
    private int numberOfApps;
    private boolean isApple;

    public SmartPhone(String secretPassword, boolean isIphone)
    {
        appArray = new App[100];
        password = secretPassword;
        totalMemory = 0;
        numberOfApps = 0;
        isApple = isIphone;
    }

    public void createNewApp(String name, int size, boolean schoolRelated)
    {
        App app1 = new App(name, size, schoolRelated);
        return;
    }

    public int getTotalMemory()
    {
        return totalMemory;
    }

    public void addAppToArray(App app1)
    {
        appArray[numberOfApps + 1] = app1;
        
        //add code here:

    }
}
