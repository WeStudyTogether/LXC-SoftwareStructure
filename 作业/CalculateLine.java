import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Pattern;

/**
* @author Xingchao Long
* @date 2019/30/25 22:30:13
* @ClassName CalculateLine
* @Description 统计代码文件中的行数和空行（包括不含字符、空格、制表符的行）数，不包括最后一行的无字符行，即此文件的51行（不包含任何字符）
*/
    
public class CalculateLine {
    static private int lines = 0;
    static private int blankLines = 0;
    static private String line = "";
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("运行时请输入一个参数，程序已退出");
            return;
        }
        
        File file = new File(args[0]);
        
        try {
            Reader reader = new FileReader(file);
            BufferedReader bufffer = new BufferedReader(reader);
            while ((line = bufffer.readLine()) != null) {
                if (Pattern.matches("\\s*", line)) {
                    blankLines++;
                }
                lines++;
            }
            System.out.println("行数：" + lines);
            System.out.println("空白行数：" + blankLines);
            bufffer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
