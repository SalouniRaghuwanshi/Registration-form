import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class StudentRegistrationForm implements ActionListener
{
JFrame f;
JPanel p;
JLabel lblname,lblrollno,lblsem,lblbranch,lblgender,lblnationality,lblres,lblblank1,lblblank2;
JTextField txtname,txtrollno;
JComboBox cbsem,cbbranch;
String sem[]={"1st","2nd","3rd","4th","5th","6th","7th","8th"};
String branch[]={"CSE","IT","EX","ME","CE"};
JRadioButton male,female,yes,no;
ButtonGroup bg,bg1;
JButton btnshow,btnexit;
JTextArea taresult;
public StudentRegistrationForm()
{
f=new JFrame("RegistrationForm");
p=new JPanel();
lblname=new JLabel("Name:");
lblrollno=new JLabel("Rollnumber:");
lblsem=new JLabel("Semester:");
lblbranch=new JLabel("Branch:");
lblgender=new JLabel("Gender");
lblblank1=new JLabel(" ");
lblnationality=new JLabel("nationality");
lblblank2=new JLabel(" ");
txtname=new JTextField(20);
txtrollno=new JTextField(20);
cbsem=new JComboBox(sem);
cbbranch=new JComboBox(branch);
male =new JRadioButton("male");
female =new JRadioButton("female");
yes=new JRadioButton("yes");
no=new JRadioButton("no");
bg=new ButtonGroup();
bg.add(male);bg.add(female);
bg1=new ButtonGroup();
bg1.add(yes);bg1.add(no);
btnshow=new JButton("Submit");
btnshow.addActionListener(this);
btnexit=new JButton("Exit");
btnexit.addActionListener(this);
taresult=new JTextArea();
p.setLayout(new GridLayout(10,2,5,10));
p.add(lblname);p.add(txtname);
p.add(lblrollno);p.add(txtrollno);
p.add(lblsem);p.add(cbsem);
p.add(lblbranch);p.add(cbbranch);
p.add(lblgender);p.add(male);
p.add(lblblank1);p.add(female);
p.add(lblnationality);p.add(yes);
p.add(lblblank2);p.add(no);
p.add(btnshow);p.add(btnexit);
f.setLayout(new FlowLayout());
f.add(p);
f.add(taresult);
f.setSize(600,600);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{if(ae.getSource()==btnshow)
{
String str="";
str+="Your Name Is:-"+txtname.getText()+"\n";
str+="Your Rollnumber Is:-"+txtrollno.getText()+"\n";
str+="Your Semsester Is:-"+cbsem.getSelectedItem()+"\n";
str+="Your Gender Is:-";
if(male.isSelected()){str+=male.getText()+"\n";}
if(female.isSelected()){str+=female.getText()+"\n";}
str+="Nationality:-";
if(yes.isSelected()){str+=yes.getText()+"\n";}
if(no.isSelected()){str+=no.getText()+"\n";}
taresult.setText(str);
}
if(ae.getSource()==btnexit)
System.exit(0);
}
public static void main(String args[])
{new  StudentRegistrationForm();}
}