/**
	* @bantilan	 ITCC11 B
	* October 20 2020
	* Midterm Exam
	*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Exam
{
	private JFrame frame;
	private JPanel mainPanel;
	private JLabel rate,amount,Result;
	private JTextField Txt1,MainTxt,Output;
	private ConvertListener convertListener;
	
	
public Exam()
{
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(100,100,250,360);
	frame.setTitle("CONVERTER");
	frame.setResizable(false);
	
	Font f = new Font("Tahoma",Font.BOLD,14);
		
		
	rate = new JLabel("Current Rate:");
	rate.setBounds(12,13,100,16);
	
	
	
	convertListener = new ConvertListener();
	Txt1 = new JTextField();
	Txt1.setBounds(10,35,215,32);
	Txt1.addActionListener(convertListener);
	
	
	
	
	amount = new JLabel("Amount to Convert:");
	amount.setBounds(12,72,150,16);
	
	
	
	MainTxt = new JTextField();
	MainTxt.setBounds(10,95,215,32);
	MainTxt.addActionListener(convertListener);
	
	
	Result = new JLabel("Result:");
	Result.setBounds(12,127,150,16);
	
	
	
	Output = new JTextField();
	Output.setBounds(10,148,215,32);
	Output.setEditable(false);
	Output.addActionListener(convertListener);
	
	
	
	// ContentPaine 
	frame.getContentPane().add(rate);
	frame.getContentPane().add(Txt1);
	frame.getContentPane().add(amount);
	frame.getContentPane().add(MainTxt);
	frame.getContentPane().add(Result);
	frame.getContentPane().add(Output);
	
	
	
	mainPanel = new JPanel();


	frame.add(mainPanel);
}
	public void show(){
		frame.setVisible(true);
	}
	class ConvertListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
			
			try {
                
				
				String CurretRate = Txt1.getText();
				String AmounttoConvert = MainTxt.getText();
                
				double cr = Double.parseDouble(CurretRate);
                double amount = Double.parseDouble(AmounttoConvert);
                double output = cr * amount;
                
				Output.setText(String.valueOf((output)));
          } 


		catch (Exception error) 
		{
                Output.setText("INPUT ERROR");
				
            }
        }
    }
	
	public static void main(String[] args) {
		Exam e = new Exam();
		e.show();
	}

}
	
	




