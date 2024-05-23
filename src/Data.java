public class Data {
    private String datatype;
    private int info;

    public Data(String datatype, int info) {
        this.datatype = datatype;
        this.info = info;
    }

    public char convert() { return (char) info; }

    public String getDT() { return datatype; }
    public int getInfo() { return info; }
    public void setDT(String datatype) { this.datatype = datatype; }
    public void setInfo(int info) {this.info = info;}
}