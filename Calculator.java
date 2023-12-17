package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextArea textarea = new JTextArea(2,10);

//now add 17 buttons in calculator
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JButton button5 = new JButton();
JButton button6 = new JButton();
JButton button7 = new JButton();
JButton button8 = new JButton();
JButton button9 = new JButton();
JButton button0 = new JButton();
JButton buttonAdd = new JButton();
JButton buttonSub = new JButton();
JButton buttonMul = new JButton();
JButton buttonDiv = new JButton();
JButton buttonDot = new JButton();
JButton buttonEqual = new JButton();
JButton buttonClear = new JButton();

double num1,num2,result;
int addc=0,subc=0,mulc=0,divc=0;

  public Calculator()
  {
	  frame.setSize(350,450);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);//makes the frame visible
	  frame.setTitle("NIRMAL CALCULATOR");
  
  frame.add(panel);
  //we add the panel in the frame
  panel.setBackground(Color.LIGHT_GRAY);
  //LIGHT GRAY is the background color of the panel
  Border border = BorderFactory.createLineBorder(Color.RED,4);
  //RED is the color of the border and 4 is the size of the border; we make the object of the Border class 
  panel.setBorder(border);
  
  panel.add(textarea);
  textarea.setBackground(Color.BLACK);
  Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
  textarea.setBorder(tborder);
  
  Font font = new Font("arial",Font.BOLD,35);
  textarea.setFont(font);
  textarea.setForeground(Color.WHITE);
  textarea.setPreferredSize(new Dimension(2,10));
  textarea.setLineWrap(true);
  
  //now adjust the dimensions of the buttons
  //then add icons of 17 buttons from their respective locations
  
  button1.setPreferredSize(new Dimension(100,43));
  button1.setIcon(new ImageIcon("E:\\java projects\\calcButn\\1.jpg"));
  
  button2.setPreferredSize(new Dimension(100,43));
  button2.setIcon(new ImageIcon("E:\\java projects\\calcButn\\2.jpg"));
  
  button3.setPreferredSize(new Dimension(100,43));
  button3.setIcon(new ImageIcon("E:\\java projects\\calcButn\\3.jpg"));
  
  button4.setPreferredSize(new Dimension(100,43));
  button4.setIcon(new ImageIcon("E:\\java projects\\calcButn\\4.jpg"));
  
  button5.setPreferredSize(new Dimension(100,43));
  button5.setIcon(new ImageIcon("E:\\java projects\\calcButn\\5.jpg"));
  
  button6.setPreferredSize(new Dimension(100,43));
  button6.setIcon(new ImageIcon("E:\\java projects\\calcButn\\6.jpg"));
  
  button7.setPreferredSize(new Dimension(100,43));
  button7.setIcon(new ImageIcon("E:\\java projects\\calcButn\\7.jpg"));
  
  button8.setPreferredSize(new Dimension(100,43));
  button8.setIcon(new ImageIcon("E:\\java projects\\calcButn\\8.jpg"));
  
  button9.setPreferredSize(new Dimension(100,43));
  button9.setIcon(new ImageIcon("E:\\java projects\\calcButn\\9.jpg"));
  
  button0.setPreferredSize(new Dimension(100,43));
  button0.setIcon(new ImageIcon("E:\\java projects\\calcButn\\0.jpg"));
  
  buttonAdd.setPreferredSize(new Dimension(100,43));
  buttonAdd.setIcon(new ImageIcon("E:\\java projects\\calcButn\\adds.jpg"));
  
  buttonSub.setPreferredSize(new Dimension(100,43));
  buttonSub.setIcon(new ImageIcon("E:\\java projects\\calcButn\\sub.jpg"));
  
  buttonMul.setPreferredSize(new Dimension(100,43));
  buttonMul.setIcon(new ImageIcon("E:\\java projects\\calcButn\\mul.jpg"));
  
  buttonDiv.setPreferredSize(new Dimension(100,43));
  buttonDiv.setIcon(new ImageIcon("E:\\java projects\\calcButn\\div.jpg"));
  
  buttonDot.setPreferredSize(new Dimension(100,43));
  buttonDot.setIcon(new ImageIcon("E:\\java projects\\calcButn\\dot.jpg"));
  
  buttonEqual.setPreferredSize(new Dimension(200,56));
  buttonEqual.setIcon(new ImageIcon("E:\\java projects\\calcButn\\==.jpg"));
  
  buttonClear.setPreferredSize(new Dimension(100,56));
  buttonClear.setIcon(new ImageIcon("E:\\java projects\\calcButn\\Clear.jpg"));
  
  //now add those 17 buttons in the panel of the JFrame
  
  panel.add(button1);
  panel.add(button2);
  panel.add(button3);
  panel.add(button4);
  panel.add(button5);
  panel.add(button6);
  panel.add(button7);
  panel.add(button8);
  panel.add(button9);
  panel.add(button0);
  panel.add(buttonAdd);
  panel.add(buttonSub);
  panel.add(buttonMul);
  panel.add(buttonDiv);
  panel.add(buttonDot);
  panel.add(buttonEqual);
  panel.add(buttonClear);
  
  
  
  button1.addActionListener(this);
  button2.addActionListener(this);
  button3.addActionListener(this);
  button4.addActionListener(this);
  button5.addActionListener(this);
  button6.addActionListener(this);
  button7.addActionListener(this);
  button8.addActionListener(this);
  button9.addActionListener(this);
  button0.addActionListener(this);
  buttonAdd.addActionListener(this);
  buttonSub.addActionListener(this);
  buttonMul.addActionListener(this);
  buttonDiv.addActionListener(this);
  buttonDot.addActionListener(this);
  buttonEqual.addActionListener(this);
  buttonClear.addActionListener(this);
  }


@Override
public void actionPerformed(ActionEvent e) 
{
	//firstly make the object of Object class named source here
	Object source = e.getSource();
	
	//now add respective actions of each buttons
	
	if(source==buttonClear)
	{
		//this will CLEAR the screen
		num1=0.0;
		num2=0.0;
		textarea.setText("");
	}
	
	if(source==button1){
		textarea.append("1");
	}
	if(source==button2){
		textarea.append("2");
	}
	if(source==button3){
		textarea.append("3");
	}
	if(source==button4){
		textarea.append("4");
	}
	if(source==button5){
		textarea.append("5");
	}
	if(source==button6){
		textarea.append("6");
	}
	if(source==button7){
		textarea.append("7");
	}
	if(source==button8){
		textarea.append("8");
	}
	if(source==button9){
		textarea.append("9");
	}
	if(source==button0){
		textarea.append("0");
	}
	if(source==buttonDot){
		textarea.append(".");
	}
	
	
	if(source==buttonAdd){
		num1 = number_reader();
		textarea.setText("");
		//textarea.append("+");
		addc=1;
		subc=0;
		mulc=0;
		divc=0;
	}
	if(source==buttonSub){
		num1 = number_reader();
		textarea.setText("");
		//textarea.append("-");
		subc=1;
		addc=0;
		mulc=0;
		divc=0;
	}
	if(source==buttonMul){
		num1 = number_reader();
		textarea.setText("");
		//textarea.append("*");
		mulc=1;
		addc=0;
		subc=0;
		divc=0;
	}
	if(source==buttonDiv){
		num1 = number_reader();
		textarea.setText("");
		//textarea.append("/");
		divc = 1;
		addc=0;
		subc=0;
		mulc=0;
	}
	
	//now if user press EQUAL SIGN(=) to get result perform following action 
	
	if(source==buttonEqual)
	{
		//first read number2 before performing any operation
		num2 = number_reader();
		
		if(addc>0){
			//to do addition
			result = num1 + num2;
			textarea.setText(Double.toString(result));
		}
		if(subc>0){
			//to do subtraction
			result = num1 - num2;
			textarea.setText(Double.toString(result));
		}
		if(mulc>0){
			//to do multiplication
			result = num1 * num2;
			textarea.setText(Double.toString(result));
		}
		if(divc>0){
			//for performing division operation
			result  = num1/num2;
			textarea.setText(Double.toString(result));
		}

	}
}

//this number_reader method will convert the received string format input i.e 1,2... into number format 
//to display in screen and returns that number

public double number_reader(){
	double num1;
	String s;
	s = textarea.getText();
	num1 = Double.valueOf(s);
	return  num1;
}

}
