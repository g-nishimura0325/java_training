//Lesson4 練習問題4
import java.io.*;

class rennsyuu3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("三角形の高さと底辺を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("三角形の面積は"+(double)num1*(double)num2/2+"です。");
    }
}