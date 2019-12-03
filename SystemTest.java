import java.io.*;

public class SystemTest {
    public SystemTest() {

    }

    public void BufferedChar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }

    public void BufferedString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        do {
            str = br.readLine();
        } while (!str.equals("end"));
        // System.out.println(str);
    }

    public void BufferedWrite() {
        int b = 'a';
        System.out.write(b);
        System.out.write('\n'); // 不使用换行不会打印
    }

    public void FileTest() throws IOException {
        byte bWrite[] = { 11, 21, 3, 40, 5, 33, 34, 35, 36, 37, 38, 39 };
        OutputStream os = new FileOutputStream("helloFile/test.txt");
        for (int x = 0; x < bWrite.length; x++) {
            os.write(bWrite[x]); // writes the bytes
        }
        os.close();
        InputStream is = new FileInputStream("helloFile/test.txt");
        int size = is.available();

        for (int i = 0; i < size; i++) {
            System.out.print((char) is.read() + "  ");
        }
        is.close();
    }

    public static void main(String args[]) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SystemTest test = new SystemTest();
        // test.BufferedChar();
        // test.BufferedString();
        // test.BufferedWrite();
        test.FileTest();
    }
}