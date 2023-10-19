import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


class PupilDetails extends JFrame{
    JLabel id,name,rollno,branch,email,FatherName;

    JTextField id1,name1,rollno1,branch1,email1,result,fatherName;

    JButton submit;

    PupilDetails(){
        try {
            JFrame   frame = new JFrame("Pupil Details");
            frame.setBounds(550,100,400,700);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

            /** ---------------------------------------------------- **/
            Font f1= new Font("Ariel",Font.BOLD,20);
            /** ---------------------------------------------------- **/


            id= new JLabel("Id");
            id.setBounds(30,30,100,30);
            frame.add(id);
            id.setFont(f1);

            name= new JLabel("Name");
            name.setBounds(30,80,100,30);
            frame.add(name);
            name.setFont(f1);

            rollno= new JLabel("RollNo");
            rollno.setBounds(30,130,100,30);
            frame.add(rollno);
            rollno.setFont(f1);

            branch= new JLabel("Branch");
            branch.setBounds(30,180,100,30);
            frame.add(branch);
            branch.setFont(f1);

            email= new JLabel("Email");
            email.setBounds(30,230,100,30);
            frame.add(email);
            email.setFont(f1);

            /** ---------------------------------------------------- **/
            id1= new JTextField();
            id1.setBounds(150,30,200,30);
            frame.add(id1);

            name1= new JTextField();
            name1.setBounds(150,80,200,30);
            frame.add(name1);

            rollno1= new JTextField();
            rollno1.setBounds(150,130,200,30);
            frame.add(rollno1);

            branch1= new JTextField();
            branch1.setBounds(150,180,200,30);
            frame.add(branch1);

            email1= new JTextField();
            email1.setBounds(150,230,200,30);
            frame.add(email1);
            /** ---------------------------------------------------- **/
            submit=new JButton("Submit");
            submit.setBounds(120,280,120,50);
            frame.add(submit);
            /** ---------------------------------------------------- **/

            result= new JTextField();
            result.setBounds(50,380,300,30);
            frame.add(result);


            frame.setVisible(true);

        }catch (Exception e){

        }
    }

}

public class Pupil_Details {
    static  String id2,name2,rollno2,branch2,email2;

    public static void main(String[] args) {


        try {
            PupilDetails  pD = new PupilDetails();
            pD.submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    name2 = pD.name1.getText();
                    id2= pD.id1.getText();
                    rollno2=pD.rollno1.getText();
                    branch2=pD.branch1.getText();
                    email2=pD.email1.getText();
                    try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pupil_Details", "root", "ZXY7877@Av");
                        String query = "Insert into studentDetails values ( "+id2+",'"+name2+"',"+rollno2+",'"+branch2+"','"+email2+"');";
                        Statement st =  con.createStatement();
                        st.executeUpdate(query);
                        pD.result.setText("Data added into table successfully");

                    } catch (Exception e1){
                        System.out.println(e1);
                    }


                }

            });

        }catch (Exception e){

        }
    }
}



