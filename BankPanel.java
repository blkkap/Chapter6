
//Date:02/07/21
//Class:CSC110
//Description: Bank Panel That displays user info 




package Ch6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class BankPanel extends JPanel {
	
	private int AcctNum;
	private double balance;
	private String Name;
	private String Status;
	private static double amount;
	
	private JLabel AccountNameLabel;
	private JTextField acctNameField;
	private JButton DepositButton;
	private JButton WithdrawButton;
	private JLabel AccountNumberLabel;
	private JLabel AccountBalanceLabel;
	private JLabel AccountStatusLabel;
	private JTextField acctNumField;
	private JTextField AccountBalanceField;
	private JTextField AccountStatusField;
	private JLabel AmountLabel;
	private JTextField amtField;
	
 public BankPanel() {
	 
	AcctNum = 1234;
	balance = 0;
	Name  = "Jaidan";
	Status = " ";
	
	
	AccountNameLabel = new JLabel("Account Name");
	acctNameField = new JTextField(7);
	DepositButton = new JButton("Depsoit");
	WithdrawButton = new JButton("Withdraw");
	AccountNumberLabel = new JLabel("Account Number");
	AccountBalanceLabel = new JLabel("Account Balance");
	AccountStatusLabel = new JLabel("Accouunt Status");
	acctNumField = new JTextField(8);
	AccountBalanceField = new JTextField(8);
	AccountStatusField = new JTextField(8);
	AmountLabel = new JLabel("Depsoit/Withdraw amount");
	amtField = new JTextField(7);
	
	
	
	
	add(AccountNameLabel);
	add(acctNameField);
    add(AccountNumberLabel);
    add( acctNumField);
    add(AccountBalanceLabel);
    add(AccountBalanceField);
    add(AccountStatusLabel);
    add(AccountStatusField);
    add(DepositButton);
    add(WithdrawButton);
    add(AmountLabel);
    add(amtField);
    
    
    DepositButton.addActionListener(new ButtonListener());
	WithdrawButton.addActionListener(new ButtonListener());
    acctNumField.setText(Integer.toString(0));
    
    
    
    
    
    
    setBackground(Color.cyan);
    setPreferredSize(new Dimension(300, 200));
    AccountBalanceField.setText(Double.toString(balance));
    amtField.setText(Double.toString(amount));
    
    
    
    
 } 
    private class ButtonListener implements ActionListener
    {
     public void actionPerformed (ActionEvent event) {
    	 
    	BankAccount myAcct = new BankAccount(128895, 0.0, "Bart Simposn");
    	 
    	 //acctNameField.setText(Double.toString(amount));
    	 //acctNumField.setText(Double.toString(amount));
    	 //AccountBalanceField.setText(Double.toString(amount));
    	 //AccountStatusField.setText(Double.toString(amount));
    	 //amtField.setText(Double.toString(amount));
    	 acctNameField.setText(myAcct.getName() );
    	 acctNumField.setText(Integer.toString(myAcct.getAcctNumber() ) );
    	 //amtField.setText(Double.toString(0.0) );
    	 
    	 
    	 
    	if(event.getSource() == DepositButton) {
    		balance = (balance +
    				(Double.parseDouble(amtField.getText( ))));
    		        AccountBalanceField.setText(Double.toString(balance));
    	}
    	else {
    		balance =(balance - 
    				(Double.parseDouble(amtField.getText())));
    		        AccountBalanceField.setText(Double.toString(balance));		
    	}
    	if(balance >= 0 ) {
    		AccountStatusField.setText("ok");
    	}
    	else {
    		AccountStatusField.setText("overdraw");
    	}
    	 
    	 
    	 
    	 
    	 
    	 
     }
    	
    	
    	
    	
    }
	
	
	

	
	

}
