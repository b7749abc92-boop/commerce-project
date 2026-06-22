package required;

public class Product {

    private String name;
    private int pri;
    private String descrip;
    private int stock;

    public Product(String name, int pri, String descrip, int stock) {
        this.name = name;
        this.pri = pri;
        this.descrip = descrip;
        this.stock = stock;

    }


    public String getname() {
        return name;
    }
    public int getpri() {
        return pri;
    }
    public String getdescrip() {
        return descrip;
    }


}
