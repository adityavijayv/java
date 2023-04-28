package JavaClasses.src;

import java.util.Scanner;
public  class SignIn_SignUp extends FileH{



    static String name;
    static String gmail;
    static String password;

    static Scanner sc=new Scanner(System.in);
    static void signIn_signUp()
    {
        for(int i=0;;i++)
        {
            boolean flag=true;
            int x;
            System.out.println("Enter your choice number");
            System.out.println("1.login  \n 2. Signup \n 3. exit");
            x=sc.nextInt();

            if(x==2)
            {
                System.out.println(" Enter your details");
                System.out.println("Enter your name");
                 name=sc.next();

                write_file(name);

                System.out.println("Enter your password");
                password=sc.next();

                write_file(password);

                System.out.println("Enter your gmail");
                gmail=sc.next();

                write_file(gmail+"\n");



            }
            else if(x==1)
            {
                System.out.println("Enter login details");
                System.out.println("Enter login name");
                String loginName=sc.next();
                System.out.println("check"+read(loginName));


                    if(read(loginName))
                    {
                        System.out.println("Enter your password");
                        String loginPassword=sc.next();

                        if(read(loginPassword))
                        {
                            System.out.println(" \n \n");
                            System.out.println("Welcome to Home page :-\n");

                            System.out.println("these are your details");
                            System.out.println("Name -->  " );
                            System.out.println("gmaile-->  ");

                            System.out.println("\n \n");

                            System.out.println("special thanks to MUKUL sir :-) \n");
                        }
                        else
                        {     flag=false;
                            System.out.println("you entered wrong password");
                        }
                    }
                    else
                    {
                        if(flag)
                        {
                            System.out.println("\n you entered wrong login name \n please signup \n");

                        }


                    }

            }
            else if(x==3)
            {
                break;
            }
            else System.out.println("you entered wrong choice");
        }



    }

    public static void main(String[] args) {
        create();
        signIn_signUp();
        //delete();

    }

}
