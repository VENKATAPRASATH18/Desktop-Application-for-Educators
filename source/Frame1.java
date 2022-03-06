package source;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel GrdLbl1 ; private JLabel GrdLbl2 ;  private JLabel GrdLbl3 ;  private JLabel GrdLbl4 ;  private JLabel GrdLbl5 ;
public void  CreateFrame() {
	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.setBounds(100, 100, 950, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAPER 1");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(418, 126, 100, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PAPER 2");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(418, 187, 100, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PAPER 3");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(418, 256, 100, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PAPER 4");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(418, 317, 100, 50);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PAPER 5");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(418, 378, 100, 50);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(517, 133, 53, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(517, 194, 53, 37);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(517, 263, 53, 37);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(517, 324, 53, 37);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(517, 385, 53, 37);
		frame.getContentPane().add(textField_4);
		
		lblNewLabel_5 = new JLabel("        STUDENTS        GRADE        MANAGEMENT        SYSTEM");
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setBackground(Color.GRAY);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(10, 11, 916, 58);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-11, 75, 947, 13);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(361, 126, -5, 345);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(70, 249, 298, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(408, 75, 9, 357);
		frame.getContentPane().add(separator_3);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblName.setBounds(10, 141, 53, 50);
		frame.getContentPane().add(lblName);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(89, 148, 309, 37);
		frame.getContentPane().add(textField_5);
		
		JLabel lblDept = new JLabel("DEPT");
		lblDept.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDept.setBounds(10, 329, 53, 50);
		frame.getContentPane().add(lblDept);
		
		JLabel lblYear = new JLabel("YEAR");
		lblYear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblYear.setBounds(10, 268, 60, 50);
		frame.getContentPane().add(lblYear);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(89, 275, 81, 37);
		frame.getContentPane().add(textField_7);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 436, 916, 13);
		frame.getContentPane().add(separator_4);
		
		JButton btnCalculateGrade = new JButton("GENERATE GRADE");
		btnCalculateGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getCGPA();
			}
		});
		btnCalculateGrade.setForeground(Color.BLACK);
		btnCalculateGrade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCalculateGrade.setBackground(Color.MAGENTA);
		btnCalculateGrade.setBounds(10, 452, 219, 50);
		frame.getContentPane().add(btnCalculateGrade);
		
		JLabel lblRollno = new JLabel("ROLLNO");
		lblRollno.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblRollno.setBounds(10, 207, 81, 50);
		frame.getContentPane().add(lblRollno);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(89, 336, 81, 37);
		frame.getContentPane().add(textField_8);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 128, 408, 2);
		frame.getContentPane().add(separator_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(89, 214, 81, 37);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_6 = new JLabel("STUDENTS DETAILS");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_6.setBounds(89, 80, 225, 44);
		frame.getContentPane().add(lblNewLabel_6);
		
		JSeparator separator_5_1 = new JSeparator();
		separator_5_1.setBounds(410, 126, 526, 4);
		frame.getContentPane().add(separator_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("ACADEMIC DETAILS");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_6_1.setBounds(427, 78, 253, 44);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblResult = new JLabel("SEM");
		lblResult.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblResult.setBounds(10, 382, 53, 50);
		frame.getContentPane().add(lblResult);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(89, 391, 81, 37);
		frame.getContentPane().add(textField_9);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setBounds(739, 80, 9, 357);
		frame.getContentPane().add(separator_3_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("GRADE");
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_6_1_1.setBounds(798, 80, 93, 44);
		frame.getContentPane().add(lblNewLabel_6_1_1);
		
		 GrdLbl1 = new JLabel("Nil");
		GrdLbl1.setForeground(Color.RED);
		GrdLbl1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		GrdLbl1.setBounds(819, 127, 38, 44);
		frame.getContentPane().add(GrdLbl1);
		
		 GrdLbl2 = new JLabel("Nil");
		GrdLbl2.setForeground(Color.RED);
		GrdLbl2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		GrdLbl2.setBounds(818, 188, 93, 44);
		frame.getContentPane().add(GrdLbl2);
		
		 GrdLbl3 = new JLabel("Nil");
		GrdLbl3.setForeground(Color.RED);
		GrdLbl3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		GrdLbl3.setBounds(818, 257, 93, 44);
		frame.getContentPane().add(GrdLbl3);
		
		 GrdLbl4 = new JLabel("Nil");
		GrdLbl4.setForeground(Color.RED);
		GrdLbl4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		GrdLbl4.setBounds(818, 318, 93, 44);
		frame.getContentPane().add(GrdLbl4);
		
		 GrdLbl5 = new JLabel("Nil");
		GrdLbl5.setForeground(Color.RED);
		GrdLbl5.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		GrdLbl5.setBounds(818, 379, 93, 44);
		frame.getContentPane().add(GrdLbl5);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(10, 449, 407, 53);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CREDITS");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(592, 126, 100, 50);
		frame.getContentPane().add(lblNewLabel_8);
		
		JSeparator separator_3_1_1 = new JSeparator();
		separator_3_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_1.setBounds(580, 126, 9, 306);
		frame.getContentPane().add(separator_3_1_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("CREDITS");
		lblNewLabel_8_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_8_1.setBounds(592, 187, 100, 50);
		frame.getContentPane().add(lblNewLabel_8_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(676, 133, 53, 37);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(676, 194, 53, 37);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(676, 263, 53, 37);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(676, 324, 53, 37);
		frame.getContentPane().add(textField_13);
		
		JLabel lblNewLabel_2_1 = new JLabel("CREDITS");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(592, 256, 100, 50);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CREDITS");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(592, 317, 100, 50);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("CREDITS");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(592, 378, 100, 50);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_14.setColumns(10);
		textField_14.setBounds(676, 385, 53, 37);
		frame.getContentPane().add(textField_14);
		
		JButton AddToDb = new JButton("ADD TO DATABASE");
		AddToDb.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		AddToDb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField_5.getText().toString();		String rollno=textField_6.getText().toString();
				int year=Integer.parseInt(textField_7.getText());	String dept=textField_8.getText().toString();
				int sem=Integer.parseInt(textField_9.getText());
				
				DBoperations d= new DBoperations();
				double cgpa=getCGPA();
				d.InsertData(name,rollno,year,dept,sem,cgpa);
				
			}
		});
		AddToDb.setBounds(418, 452, 311, 50);
		frame.getContentPane().add(AddToDb);
	
}
public void GenerateGrade(int paper,JLabel lbl) {
	if(paper>=91 && paper<=100) 
		lbl.setText("O");
	else if(paper>=81 && paper<=90)
		lbl.setText("A+");
	else if(paper>=71 && paper<=80)
		lbl.setText("A");
	else if(paper>=61 && paper<=70)
		lbl.setText("B+");
	else if(paper>=51 && paper<=60)
		lbl.setText("B");
	else
		lbl.setText("U");
}
public double getCGPA() {
	int paper1=Integer.parseInt(textField.getText());		 int paper2=Integer.parseInt(textField_1.getText());
	int paper3=Integer.parseInt(textField_2.getText());		 int paper4=Integer.parseInt(textField_3.getText());
	int paper5=Integer.parseInt(textField_4.getText());
	
	/*int g1=Integer.parseInt(textField_10.getText());		int g2=Integer.parseInt(textField_11.getText());
	int g3=Integer.parseInt(textField_12.getText());		int g4=Integer.parseInt(textField_13.getText());
	int g5=Integer.parseInt(textField_14.getText());*/
	
	GenerateGrade(paper1,GrdLbl1);	GenerateGrade(paper2,GrdLbl2);	GenerateGrade(paper3,GrdLbl3);	GenerateGrade(paper4,GrdLbl4);	GenerateGrade(paper5,GrdLbl5);
	
//	double grade1=paper1*g1;		double grade2=paper2*g2;		double grade3=paper3*g3;		double grade4=paper4*g4;
//	double grade5=paper2*g5; 
	
	double percent =(paper1+paper2+paper3+paper4+paper5)/5;
	
	return percent;
}
	public static void main(String[] args) {
		
			
				try {
					Frame1 window = new Frame1();
					window.CreateFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
}
