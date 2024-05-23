public class Memory {
    private Data[] memory = new Data[32];
    private static int index;

    public Memory() { index = 0; }

    public static void setIndex(int i) { index = i; }
    public static int getIndex() { return index; }

    public void POWER() {
        for (int i = 0; i < index + 1; i++) {
            if (memory[i].getDT().equals("string")) System.out.print(memory[i].convert());
            else System.out.print(memory[i]);
        }
    }

    public void POWEr(String dt, String val) {
        memory[index].setDT(dt);
        if (val.equals("pOWeR")) memory[index].setInfo(memory[index].getInfo() + 1);
        else memory[index].setInfo(memory[index].getInfo() - 1);       
    }

}