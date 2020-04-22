package majewski.mateusz;

public abstract class ListItem {
    protected Object value;
    protected ListItem previous;
    protected ListItem next;

    public ListItem(String value) {
        this.value = value;
    }

    public ListItem(String value, ListItem previous, ListItem next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract int compareTo(ListItem value);
    abstract ListItem next();
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem previous);
    abstract ListItem setNext(ListItem next);
}
