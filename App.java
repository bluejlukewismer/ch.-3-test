
/**
 * app class has a connection with an a smartphone.
 * 
 * @author Luke Wismer
 * @version 1.1.1
 */
public class App
{
    private String name;
    private int size; // in MB
    private boolean schoolRelated;

    public App(String name, int size, boolean schoolRelated)
    {
        this.name = name;
        this.size = size;
        this.schoolRelated = schoolRelated;
        if (size > 200) {

            System.out.println("Warning: this is a large application");
        }
    }

    public App()
    {
        name = "";
        size = 50;
        schoolRelated = true;
    }    

    public String getName()
    {
        return name;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isSchoolRelated()
    {
        return schoolRelated;
    }

    public void changeName(String newName)
    {
        name = newName;
    }

    public void changeSize(int newSize)
    {
        size = newSize;
    }

    public void changeSchoolRelated(boolean isEducational)
    {
        schoolRelated = isEducational;
    }

}
