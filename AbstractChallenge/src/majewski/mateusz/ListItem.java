package majewski.mateusz;

public abstract class ListItem {

    public String name;
    public int index;

    public abstract void moveToNext();
    public abstract void moveToPrevious();
    public abstract void setNextValue(String name);
    public abstract void setPreviousValue(String name);
    public abstract void compareTo();

}
