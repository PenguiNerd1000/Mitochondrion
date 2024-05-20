import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] memory = new String[32];
        int index = 0;

        Scanner scanner = new Scanner(System.in);

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
            String syntax = code.get(i).substring(0,code.get(i).indexOf(" "));
            if (!syntax.equalsIgnoreCase("power")) throw new Exception("Code was not powerful, need more POWER!");
            else {
                if (syntax.equals("POWER")) POWER(memory);
            }
        }
    }

    public static void POWER(String[] memory) {
        for (String s : memory) if (!(s != null && !s.equals(""))) System.out.println (s);
    }
}