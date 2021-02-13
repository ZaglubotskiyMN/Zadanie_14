package part1.lessons14.task1;
import java.io.*;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger log=Logger.getLogger(Main.class);



    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("D://Somedir2//products.txt"));
            while (sc.hasNextLine() == true) {
                String s = sc.nextLine();
                String s1 = sc.nextLine();
                double a = Double.parseDouble(s1);
                String s2 = sc.nextLine();
                double b = Double.parseDouble(s2);
                System.out.printf("Товар :%s \n Количество: %s \n Цена: %s \n", s, a, b);
                System.out.println("-------------------------");
                System.out.println("----------Чек------------");
                System.out.println("Товар:" + s + " " + " \n Итоговая стоимость" + " " + (a * b));
                System.out.println("-------------------------");

            }
            log.info("Файл успешно прочитан");

        } catch (NumberFormatException e)
        {
            System.err.println("В документе указаны запятые вместо точек"+ " "+e.getMessage());
            log.error("В документе указаны запятые вместо точек"+ " "+e.getMessage());

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //getread();




    }

     /*static void getread() throws Errorex{
        try {
            product();

        }catch (readex due)
        {
            due.getMessage();
            throw  new Errorex("что то пошло не так");
        }

    }
    static void product() throws readex{
        throw new readex("В файле указаны запятые");
    }

    static class Errorex extends Exception{

        public Errorex(String mes){
            super(mes);
        }
        public  Errorex(String mes,Throwable cause){
            super(mes,cause);
        }
    }
    static class readex extends Exception{
        public readex(String mes){
            super(mes);
        }

    }*/

}