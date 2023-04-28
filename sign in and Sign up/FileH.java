package JavaClasses.src;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileH{

    static void create(){
        File obj = new File("registration.txt");
        try
        {
            if (obj.createNewFile()) {

                System.out.println("File created");
            }
            else System.out.println("Already exists");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void write_file(String input){
        try {
            FileWriter fw = new FileWriter("registration.txt", true);
            fw.write(input +" , ");

            fw.close();

            System.out.println("successfully update data");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    static boolean read(String check){
        boolean ans=false;
        try {
            File fr= new File("registration.txt");
            Scanner sc = new Scanner(fr);

            while(sc.hasNextLine())
            {  String file_data = sc.nextLine();
               // System.out.println(file_data);
                 ans= file_data.contains(check);
            }
                    sc.close();
        }
        catch(Exception ignored){

        }
      return ans;
    }

    static void delete(){
        File fd = new File("registration.txt");
        System.out.println(fd.delete());;
    }


    public static  void main(String[] args)
    {

    }

}

/*
 * file class to read and create
 * FileWriter class to write data
 */