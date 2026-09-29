//Lesson3 練習問題 5問目
import java.io.*;

class rennsyuu6
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("身長と体重を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        double hight1 = Double.parseDouble(str1);
        double weight2 = Double.parseDouble(str2);

        System.out.println("身長は"+hight1+"センチです。");
        System.out.println("体重は"+weight2+"キロです。");
    }
}