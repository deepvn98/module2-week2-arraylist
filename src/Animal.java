import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Animal {
    private String name;
    private int size;
    private String id;

    public Animal(String name, int size, String id) {
        this.name = name;
        this.size = size;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "name='" + name +
                ", size=" + size +
                ", id='" + id +
                "\n";
    }
    //    public String toString(){
//
//    }
}
