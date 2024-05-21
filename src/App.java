import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
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

        for (int i = 0; i < code.size(); i++){ 
            while (!(code.get(i).substring(0,code.get(i).indexOf(" ")).equals(""))) {
                String syntax = code.get(i).substring(0,code.get(i).indexOf(" "));
                code.set(i, code.get(i).substring(code.get(i).indexOf(" ")));
                if (!syntax.equalsIgnoreCase("power")) throw new Exception("Code was not powerful, need more POWER!");
            }   
        }
    }
}