/**
	* @bantilan	 ITCC11 B
	* October 20 2020
	* Midterm Exam
	*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Examconverter
{
	private JFrame frame;
	private JPanel mainPanel;
	private JLabel rate,amount,Result;
	private JTextField Txt1,MainTxt,Output;
	private ConvertListener convertListener;
	
	
public Examconverter()
{
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("CONVERTER");
	frame.setResizable(false);
	
	Font f = new Font("Tahoma",Font.BOLD,14);
		
		
	rate = new JLabel("Current Rate:");
	
	
	
	
	convertListener = new ConvertListener();
	
	Txt1 = new JTextField();
	
	
	
	amount = new JLabel("Amount to Convert:");
	

	MainTxt = new JTextField();
	
	
	
	Result = new JLabel("Result:");
	

	Output = new JTextField();
	Output.setEditable(false);
	


	// convertListener
	Txt1.addActionListener(convertListener);
	MainTxt.addActionListener(convertListener);
	Output.addActionListener(convertListener);
	
	
	
	// ContentPaine 
	frame.getContentPane().add(rate);
	frame.getContentPane().add(Txt1);
	frame.getContentPane().add(amount);
	frame.getContentPane().add(MainTxt);
	frame.getContentPane().add(Result);
	frame.getContentPane().add(Output);
	
	// setBounds
	frame.setBounds(100,100,250,360);
	rate.setBounds(12,13,100,16);
	Txt1.setBounds(10,35,215,32);
	amount.setBounds(12,72,150,16);
	MainTxt.setBounds(10,95,215,32);
	Result.setBounds(12,127,150,16);
	Output.setBounds(10,148,215,32);
	
	
	
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
		Examconverter e = new Examconverter();
		e.show();
	}

}
	
	




