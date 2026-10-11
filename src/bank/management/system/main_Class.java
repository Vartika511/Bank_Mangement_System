package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {


    JButton b1,b2,b3,b4,b5,b6,b7;
   String pin;
    main_Class(String pin){

        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);
        JLabel label = new JLabel("Please select your Transaction");
        label.setBounds(420,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD,28));
        l3.add(label);




        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,170,35);
        b1.setForeground(Color.WHITE);
        b1.setOpaque(true);
        b1.setContentAreaFilled(true);
        b1.setBorderPainted(false);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWAL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(675,274,170,35);
        b2.setForeground(Color.WHITE);
        b2.setOpaque(true);
        b2.setContentAreaFilled(true);
        b2.setBorderPainted(false);
        b2.addActionListener(this);
        l3.add(b2);


        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(410,318,170,35);
        b3.setForeground(Color.WHITE);
        b3.setOpaque(true);
        b3.setContentAreaFilled(true);
        b3.setBorderPainted(false);
        b3.addActionListener(this);
        l3.add(b3);


        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(675,318,170,35);
        b4.setForeground(Color.WHITE);
        b4.setOpaque(true);
        b4.setContentAreaFilled(true);
        b4.setBorderPainted(false);
        b4.addActionListener(this);
        l3.add(b4);


        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,362,170,35);
        b5.setForeground(Color.WHITE);
        b5.setOpaque(true);
        b5.setContentAreaFilled(true);
        b5.setBorderPainted(false);
        b5.addActionListener(this);
        l3.add(b5);


        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(675,362,170,35);
        b6.setForeground(Color.WHITE);
        b6.setOpaque(true);
        b6.setContentAreaFilled(true);
        b6.setBorderPainted(false);
        b6.addActionListener(this);
        l3.add(b6);


        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(675,406,170,35);
        b7.setForeground(Color.WHITE);
        b7.setOpaque(true);
        b7.setContentAreaFilled(true);
        b7.setBorderPainted(false);
        b7.addActionListener(this);
        l3.add(b7);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if(e.getSource()==b7){
        System.exit(0);
        }else if(e.getSource()==b2){
            new Withdrawal(pin);
            setVisible(false);
        }else if(e.getSource()==b6){
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if(e.getSource() == b3){
            new FastCash(pin);
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
