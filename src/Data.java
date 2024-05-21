public class Data {
    private String datatype;
    private int info;
    private static int index;

    public Data(String datatype, int info) {
        this.datatype = datatype;
        this.info = info;
    }

    public char convert() { return (char) info; }

    public String getDT() { return datatype; }
    public int getInfo() { return info; }
    public static void setIndex(int i) { index = i; }
    public static int getIndex() { return index; }
}