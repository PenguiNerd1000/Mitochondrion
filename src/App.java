import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Memory mem = new Memory();
        int i = 0;
        ArrayList<String> code = new ArrayList<String>();

        try {
            File myFileObj = new File("D:/Code/Java/apCSA/e0_compiler_project/src/SampleCode.txt");
            Scanner file = new Scanner(myFileObj);
            while (file.hasNextLine()) {
                code.add(file.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.getStackTrace();
        }

        System.out.println(code.toString());

        for (; i < code.size(); i++){ 
            while (!(code.get(i).substring(0,code.get(i).indexOf(" ")).equals(""))) {
                String syntax = code.get(i).substring(0, code.get(i).indexOf(" "));
                shiftOver(code, i);
                if (!syntax.equalsIgnoreCase("power")) throw new Exception("Code was not powerful, need more POWER!");
                else if (syntax.equals("POWER")) mem.POWER();
                else if (syntax.equals("POWEr")) {
                    String dt = code.get(i).substring(0, code.get(i).indexOf(" "));
                    shiftOver(code, i);
                    String val = code.get(i).substring(0, code.get(i).indexOf(" "));
                    shiftOver(code, i);
                    if (!dt.equals("PoWEr") && !dt.equals("PoWeR")) throw new Exception("Cell must have a POWER type!");
                    else if (!val.equals("pOWeR") && !val.equals("pOWer")) throw new Exception("Cell must be set to something with POWER!");
                    else mem.POWEr(dt, val);
                } else if (syntax.equals("POWeR")) {
                    
                } else if (syntax.equals("POWer")) {

                }
            }   
        }
    }
    public static void shiftOver(ArrayList<String> code, int i) throws Exception { 
        int a = code.get(i).indexOf(" ");
        if (a == -1) throw new Exception("POWER ran out of room!");
        code.set(i, code.get(i).substring(a)); 
    }
}