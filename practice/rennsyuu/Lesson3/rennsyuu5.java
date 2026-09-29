//lesson3 練習問題 4問目
import java.io.*;

class rennsyuu5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("円周率の値はいくつですか？");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        double pi = Double.parseDouble(str);

        System.out.println("円周率の値は" +pi+ "です。");
    }
}