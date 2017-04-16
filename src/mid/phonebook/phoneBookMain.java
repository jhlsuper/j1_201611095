package mid.phonebook;

import javax.swing.*;
import java.awt.*;

public class phoneBookMain{
  static JTextField nameTf1, nameTf2, nameTf3;
  static JTextField addressTf1, addressTf2, addressTf3;
  static JTextField numberTf1, numberTf2, numberTf3;
  public static void main(String[] args){
    JFrame f = new JFrame();
    JPanel panel = new JPanel(new GridLayout(5,3));
    f.getContentPane().add(panel);
    JLabel label1 = new JLabel("name");
    JLabel label2 = new JLabel("address");
    JLabel label3 = new JLabel("number");
    
    nameTf1 = new JTextField(15);
    nameTf2 = new JTextField(15);
    nameTf3 = new JTextField(15);
   
    
    addressTf1 = new JTextField(40);
    addressTf2 = new JTextField(40);
    addressTf3 = new JTextField(40);
    
    numberTf1= new JTextField(20);
    numberTf2= new JTextField(20);
    numberTf3= new JTextField(20);
    
    
    
    
    JButton b1 = new JButton("save");
    JButton b2 = new JButton("delete");
    
    
    
    panel.add(label1);
    panel.add(label2);
    panel.add(label3);
    panel.add(nameTf1);
    panel.add(addressTf1);
    panel.add(numberTf1);
    panel.add(nameTf2);
    panel.add(addressTf2);
    panel.add(numberTf2);
    panel.add(nameTf3);
    panel.add(addressTf3);
    panel.add(numberTf3);
   
    panel.add(b1);
    panel.add(b2);
    
    f.pack();
    f.setVisible(true);
    f.setSize(300,500);
    
  }
}