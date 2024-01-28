package GUI;
///Za prekratak unos za login imam samo ispis na conzoli
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ATM_stuff.Transaction;
import ATM_stuff.User;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ATM_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_user;
	private JPasswordField passwordField_2;
	private JTextField textField_prezime;
	private JTextField textField_ime;
	private User korisnik=null;
	private JTextField textField_ID;
	private JTextField textField_deposit;
	private JTextField textField_withdraw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_GUI frame = new ATM_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ATM_GUI() {
		 setTitle("ATM");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 140));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ATM");
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 65));
		lblNewLabel.setBounds(313, 10, 156, 87);
		panel.add(lblNewLabel);
		
		JLabel lblOurBank = new JLabel("-OUR BANK-");
		lblOurBank.setFont(new Font("Cambria", Font.PLAIN, 23));
		lblOurBank.setBounds(319, 82, 134, 48);
		panel.add(lblOurBank);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel panel_login = new JPanel();
		panel_1.add(panel_login, "name_751570067172400");
		panel_login.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(295, 33, 168, 30);
		panel_login.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(295, 96, 168, 30);
		panel_login.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		;
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnNewButton.setBounds(317, 164, 117, 30);
		panel_login.add(btnNewButton);
		
		JLabel lblCreateNewAccount = new JLabel("Create new account");
		
		lblCreateNewAccount.setForeground(Color.BLUE);
		lblCreateNewAccount.setFont(new Font("Cambria", Font.PLAIN, 17));
		lblCreateNewAccount.setBounds(307, 204, 143, 48);
		panel_login.add(lblCreateNewAccount);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblPassword.setBounds(147, 84, 115, 48);
		panel_login.add(lblPassword);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblUsername.setBounds(147, 23, 127, 48);
		panel_login.add(lblUsername);
		
		JPanel panel_newAcc = new JPanel();
		panel_1.add(panel_newAcc, "name_751572969783400");
		panel_newAcc.setLayout(null);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(290, 251, 168, 30);
		panel_newAcc.add(passwordField_1);
		
		textField_user = new JTextField();
		textField_user.setColumns(10);
		textField_user.setBounds(290, 188, 168, 30);
		panel_newAcc.add(textField_user);
		
		JLabel lblUsername_1 = new JLabel("USERNAME:");
		lblUsername_1.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblUsername_1.setBounds(142, 178, 127, 48);
		panel_newAcc.add(lblUsername_1);
		
		JLabel lblPassword_1 = new JLabel("PASSWORD:");
		lblPassword_1.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblPassword_1.setBounds(142, 239, 115, 48);
		panel_newAcc.add(lblPassword_1);
		
		JLabel lblCreateNewAccount_1 = new JLabel("Create new account");
		lblCreateNewAccount_1.setFont(new Font("Cambria", Font.BOLD, 20));
		lblCreateNewAccount_1.setBounds(280, 10, 191, 54);
		panel_newAcc.add(lblCreateNewAccount_1);
		
		JLabel lblConfirmPassword = new JLabel("CONFIRM PASSWORD:");
		lblConfirmPassword.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblConfirmPassword.setBounds(113, 292, 156, 48);
		panel_newAcc.add(lblConfirmPassword);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(290, 304, 168, 30);
		panel_newAcc.add(passwordField_2);
		
		JLabel lblName = new JLabel("LAST NAME:");
		lblName.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblName.setBounds(142, 130, 127, 48);
		panel_newAcc.add(lblName);
		
		textField_prezime = new JTextField();
		textField_prezime.setColumns(10);
		textField_prezime.setBounds(290, 140, 168, 30);
		panel_newAcc.add(textField_prezime);
		
		JLabel lblFirstName = new JLabel("FIRST NAME:");
		lblFirstName.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblFirstName.setBounds(142, 84, 127, 48);
		panel_newAcc.add(lblFirstName);
		
		textField_ime = new JTextField();
		textField_ime.setColumns(10);
		textField_ime.setBounds(290, 94, 168, 30);
		panel_newAcc.add(textField_ime);
		
		JButton btnConfirm = new JButton("Confirm");
		
		btnConfirm.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnConfirm.setBounds(314, 360, 117, 30);
		panel_newAcc.add(btnConfirm);
		
		JButton btnNewButton_1_2_2_1_1 = new JButton("Back");
		
		btnNewButton_1_2_2_1_1.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_2_2_1_1.setBackground(new Color(255, 153, 153));
		btnNewButton_1_2_2_1_1.setBounds(20, 351, 156, 54);
		panel_newAcc.add(btnNewButton_1_2_2_1_1);
		
		JPanel panel_admin = new JPanel();
		panel_1.add(panel_admin, "name_752727407767600");
		panel_admin.setLayout(null);
		
		JLabel lblCreateNewAccount_1_1_1 = new JLabel("Choose service");
		lblCreateNewAccount_1_1_1.setFont(new Font("Cambria", Font.BOLD, 20));
		lblCreateNewAccount_1_1_1.setBounds(313, 5, 141, 54);
		panel_admin.add(lblCreateNewAccount_1_1_1);
		
		JButton btnNewButton_1_3 = new JButton("Users");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(panel_admin, "Information is in the file users.txt");
			
			try(ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("users.bin")));
					PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("users.txt")));
					) {
				try {
					
					pw.write("ID       Name       LastName       Username       Balance"+"\n");
					while(true) {
						
						User u1= (User) ois.readObject();
						pw.write(u1.toString()+"\n");
					}
				} catch (Exception e2) {
					
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			}
		});
		btnNewButton_1_3.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_3.setBackground(new Color(238, 232, 170));
		btnNewButton_1_3.setBounds(230, 69, 289, 54);
		panel_admin.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_2_2_1 = new JButton("Back");
		btnNewButton_1_2_2_1.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_2_2_1.setBackground(new Color(255, 153, 153));
		btnNewButton_1_2_2_1.setBounds(29, 339, 156, 54);
		panel_admin.add(btnNewButton_1_2_2_1);
		
		JButton btnNewButton_1_3_1 = new JButton("Delete all");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try(ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("users.bin")));) {
				oos.writeObject(null);
				User.ID=0;
				JOptionPane.showMessageDialog(panel, "All users deleted");
			} catch (Exception e2) {
				// TODO: handle exception
			}
			}
		});
		btnNewButton_1_3_1.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_3_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1_3_1.setBounds(230, 146, 289, 54);
		panel_admin.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_3_1_1 = new JButton("Delete user");
	
		btnNewButton_1_3_1_1.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_3_1_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1_3_1_1.setBounds(230, 221, 289, 54);
		panel_admin.add(btnNewButton_1_3_1_1);
		
		JLabel lblId = new JLabel("ID to delete:");
		lblId.setVisible(false);
		lblId.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblId.setBounds(366, 305, 115, 48);
		panel_admin.add(lblId);
		
		textField_ID = new JTextField();
		textField_ID.setVisible(false);
		textField_ID.setColumns(10);
		textField_ID.setBounds(502, 318, 168, 30);
		panel_admin.add(textField_ID);
		
		JButton btnID = new JButton("->");
		btnID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int w=0;
				btnID.setVisible(false);
				lblId.setVisible(false);
				textField_ID.setVisible(false);
				String id1= textField_ID.getText();
				int id=Integer.parseInt(id1);
				List<User> lista=new LinkedList<>();
				try(ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("users.bin")));) {
				
					try {
						while(true) {
							User u1= (User) ois.readObject();
							lista.add(u1);
						}
					} catch (Exception e2) {
						
					}
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
				for(int i=0;i<lista.size();i++) {
					if(lista.get(i)!=null) {
						if(lista.get(i).getId()==id) {
							lista.remove(i);
							w=1;
							JOptionPane.showMessageDialog(panel, "User removed");
							break;
						}
					}
				}
				if(w==0)
					JOptionPane.showMessageDialog(panel, "ID does not exist");
				try(ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("users.bin"))); ) {
					for(int i=0;i<lista.size();i++) {
						if(lista.get(i)!=null)
							oos.writeObject(lista.get(i));
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				//
			}
		});
		btnID.setVisible(false);
		btnID.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnID.setBackground(new Color(238, 232, 170));
		btnID.setBounds(533, 365, 134, 35);
		panel_admin.add(btnID);
		
		JPanel panel_user = new JPanel();
		panel_1.add(panel_user, "name_752731436864500");
		panel_user.setLayout(null);
		
		JLabel lblCreateNewAccount_1_1 = new JLabel("Choose service");
		lblCreateNewAccount_1_1.setFont(new Font("Cambria", Font.BOLD, 20));
		lblCreateNewAccount_1_1.setBounds(314, 10, 141, 54);
		panel_user.add(lblCreateNewAccount_1_1);
		
		JButton btnNewButton_1 = new JButton("Balance");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pr="Your balance is "+korisnik.getBalance();
			JOptionPane.showMessageDialog(panel, pr);
			}
		});
		btnNewButton_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1.setBounds(231, 74, 289, 54);
		panel_user.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Transactions");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=0;
				try(PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("user_report.txt")));) {
					for(int i=0;i<korisnik.getTransakcije().size();i++) {
						if(korisnik.getTransakcije().get(i)!=null) {
							n++;
							pw.print(korisnik.getTransakcije().get(i).toString()+"\n");
						}
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				if(n==0) {
					JOptionPane.showMessageDialog(panel, "History of transactions is empty");
				}else {
					JOptionPane.showMessageDialog(panel, "Report is in the file user_report.txt");
				}
					
			
			}
		});
		btnNewButton_1_1.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1_1.setBounds(231, 138, 289, 54);
		panel_user.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Withdrawal");
		
		btnNewButton_1_2.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_2.setBackground(new Color(238, 232, 170));
		btnNewButton_1_2.setBounds(231, 202, 289, 54);
		panel_user.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Deposit");
		
		btnNewButton_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_2_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1_2_1.setBounds(231, 266, 289, 54);
		panel_user.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("Back");
		
		btnNewButton_1_2_2.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_2_2.setBackground(new Color(255, 153, 153));
		btnNewButton_1_2_2.setBounds(30, 344, 156, 54);
		panel_user.add(btnNewButton_1_2_2);
		
		JPanel panel_deposit = new JPanel();
		panel_1.add(panel_deposit, "name_830960642552300");
		panel_deposit.setLayout(null);
		
		JLabel lblCreateNewAccount_1_1_2 = new JLabel("Enter amount of money you would like to deposit");
		lblCreateNewAccount_1_1_2.setFont(new Font("Cambria", Font.BOLD, 20));
		lblCreateNewAccount_1_1_2.setBounds(156, 10, 451, 54);
		panel_deposit.add(lblCreateNewAccount_1_1_2);
		
		textField_deposit = new JTextField();
		textField_deposit.setBounds(265, 74, 249, 28);
		panel_deposit.add(textField_deposit);
		textField_deposit.setColumns(10);
		
		JButton btnNewButton_1_4 = new JButton("Confirm");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String d=textField_deposit.getText();
					double deposit;
					try {
						if(d.charAt(0)=='-')
							throw new Exception();
						deposit=Double.parseDouble(d);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(panel, "Please input positive numbers only, using . and not ,");
						throw new Exception("los input");
					}
					korisnik.setBalance(korisnik.getBalance()+deposit);
					Transaction t=new Transaction();
					t.setBalance(deposit);
					t.setDeposit(true);
					List<Transaction> transactions= korisnik.getTransakcije();
					transactions.add(t);
					korisnik.setTransakcije(transactions); 
					List<User> users=new LinkedList<>();
					try(ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("users.bin")));) {
						try {
							while(true) {
								User u1=(User) ois.readObject();
								users.add(u1);
							}
						} catch (Exception e2) {
							// TODO: handle exception
						}
					} catch (Exception e2) {
						e2.printStackTrace();
						throw new Exception();
					}
					for(int i=0;i<users.size();i++) {
						if(users.get(i)!=null) {
							if(users.get(i).equals(korisnik)) {
								users.set(i, korisnik);
								break;
							}
						}
					}
					
					try(ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream((new FileOutputStream("users.bin"))));) {
						for(int i=0;i<users.size();i++) {
							if(users.get(i)!=null) {
								oos.writeObject(users.get(i));
							
							}
						}
					} catch (Exception e2) {
						e2.printStackTrace();
						
					}
					JOptionPane.showMessageDialog(panel, "Successfull payment");
					panel_1.removeAll();
					panel_1.add(panel_user);
					panel_1.repaint();
					panel_1.revalidate();
				}
                catch(Exception e5){
					e5.printStackTrace();
				}
			
			
			}
		});
		btnNewButton_1_4.setFont(new Font("Cambria", Font.PLAIN, 30));
		btnNewButton_1_4.setBackground(new Color(238, 232, 170));
		btnNewButton_1_4.setBounds(265, 137, 249, 45);
		panel_deposit.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_2_2_1_2 = new JButton("Back");
		
		btnNewButton_1_2_2_1_2.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_2_2_1_2.setBackground(new Color(255, 153, 153));
		btnNewButton_1_2_2_1_2.setBounds(58, 316, 156, 54);
		panel_deposit.add(btnNewButton_1_2_2_1_2);
		
		JPanel panel_withdrawal = new JPanel();
		panel_1.add(panel_withdrawal, "name_830972668698700");
		panel_withdrawal.setLayout(null);
		
		JLabel lblCreateNewAccount_1_1_2_1 = new JLabel("Enter amount of money you would like to withdraw");
		lblCreateNewAccount_1_1_2_1.setFont(new Font("Cambria", Font.BOLD, 20));
		lblCreateNewAccount_1_1_2_1.setBounds(153, 10, 482, 54);
		panel_withdrawal.add(lblCreateNewAccount_1_1_2_1);
		
		textField_withdraw = new JTextField();
		textField_withdraw.setColumns(10);
		textField_withdraw.setBounds(262, 74, 249, 28);
		panel_withdrawal.add(textField_withdraw);
		
		JButton btnNewButton_1_4_1 = new JButton("Confirm");
		btnNewButton_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String d=textField_withdraw.getText();
					double with;
					try {
						if(d.charAt(0)=='-')
							throw new Exception();
						with=Double.parseDouble(d);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(panel, "Please input positive numbers only, using . and not ,");
						throw new Exception("los input");
					}
					korisnik.setBalance(korisnik.getBalance()-with);
					Transaction t=new Transaction();
					t.setBalance(with);
					t.setDeposit(false);
					List<Transaction> transactions= korisnik.getTransakcije();
					transactions.add(t);
					korisnik.setTransakcije(transactions); 
					List<User> users=new LinkedList<>();
					try(ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("users.bin")));) {
						try {
							while(true) {
								User u1=(User) ois.readObject();
								users.add(u1);
							}
						} catch (Exception e2) {
							// TODO: handle exception
						}
					} catch (Exception e2) {
						e2.printStackTrace();
						throw new Exception();
					}
					for(int i=0;i<users.size();i++) {
						if(users.get(i)!=null) {
							if(users.get(i).equals(korisnik)) {
								users.set(i, korisnik);
								break;
							}
						}
					}
					
					try(ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream((new FileOutputStream("users.bin"))));) {
						for(int i=0;i<users.size();i++) {
							if(users.get(i)!=null) {
								oos.writeObject(users.get(i));
							
							}
						}
					} catch (Exception e2) {
						e2.printStackTrace();
						
					}
					JOptionPane.showMessageDialog(panel, "Successfull payment");
					panel_1.removeAll();
					panel_1.add(panel_user);
					panel_1.repaint();
					panel_1.revalidate();
				}
                catch(Exception e5){
					e5.printStackTrace();
				}
			
			}
		});
		btnNewButton_1_4_1.setFont(new Font("Cambria", Font.PLAIN, 30));
		btnNewButton_1_4_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1_4_1.setBounds(262, 137, 249, 45);
		panel_withdrawal.add(btnNewButton_1_4_1);
		
		JButton btnNewButton_1_2_2_1_2_1 = new JButton("Back");
		btnNewButton_1_2_2_1_2_1.setFont(new Font("Cambria", Font.PLAIN, 35));
		btnNewButton_1_2_2_1_2_1.setBackground(new Color(255, 153, 153));
		btnNewButton_1_2_2_1_2_1.setBounds(55, 316, 156, 54);
		panel_withdrawal.add(btnNewButton_1_2_2_1_2_1);
		
		lblCreateNewAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(panel_newAcc);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int p=0;
					User u=new User();
					u.setName(textField_ime.getText());
					u.setLastName(textField_prezime.getText());
					u.setUserName(textField_user.getText());
					u.setPassword(passwordField_1.getText());
					u.setBalance(0);
					
					if(!passwordField_1.getText().equals(passwordField_2.getText()))
						throw new Exception("Passwords must be identical");
					List<User> lista=new LinkedList<>();
					//citam datoteku, proveravam da li postoji takav user, ako postoji greska, ako ne postoji onda se unosi u sistem
					try(ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("users.bin")));) {
					
						try {
							while(true) {
								User u1= (User) ois.readObject();
								lista.add(u1);
							}
						} catch (Exception e2) {
							
						}
					} catch (Exception e2) {
						e2.printStackTrace();
						
					}
					if(lista.contains(u)) {
						JOptionPane.showMessageDialog(panel_admin, "User already exists");
					}
					else {
						int q=0;
						for(int i=0;i<lista.size();i++) {
							if(lista.get(i)!=null) {
								q=lista.get(i).getId();
							}
						}
						User.ID=q+1;
						u.setId(User.ID);
						lista.add(u);
						
						
				
						
						try(ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("users.bin"))); ) {
							for(int i=0;i<lista.size();i++) {
								if(lista.get(i)!=null)
									oos.writeObject(lista.get(i));
							}
						} catch (Exception e2) {
							e2.printStackTrace();
						}
						JOptionPane.showMessageDialog(panel, "Valid input.");
					}
					
					panel_1.removeAll();
					panel_1.add(panel_login);
					panel_1.repaint();
					panel_1.revalidate();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(panel, "Error: "+e2.getMessage());
					e2.printStackTrace();
				}
				
				
				
			}
		});
		
		
		btnNewButton.addActionListener(new ActionListener()   {
			public void actionPerformed(ActionEvent e) {
				try {
					if(textField.getText()==null || passwordField.getText()==null)
						JOptionPane.showMessageDialog(panel, "Please type in your information1");
					if(textField.getText()=="" || passwordField.getText()=="")
						JOptionPane.showMessageDialog(panel, "Wrong password.");
					//	JOptionPane.showMessageDialog(panel, "Please type in your information");
					String username=textField.getText();
					String password=passwordField.getText();
					if(username.equals("admin") && password.equals("admin")) {
						panel_1.removeAll();
						panel_1.add(panel_admin);
						panel_1.repaint();
						panel_1.revalidate();
						throw new Exception("admin");
					}
					User u2=new User();
				    u2.setUserName(username);
					List<User> lista=new LinkedList<>();
					try(ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("users.bin")))) {
						try {
							while(true) {
								User u1=(User) ois.readObject();
								lista.add(u1);
							}
						} catch (Exception e2) {
							// TODO: handle exception
						}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					int z=0;
					int z1=1;
					for(int i=0;i<lista.size();i++) {
						if(lista.get(i)!=null) {
						if(lista.get(i).equals(u2)) {
							if(lista.get(i).getPassword().equals(password)) {
								korisnik=lista.get(i);
								z=1;
							}else {
								JOptionPane.showMessageDialog(panel, "Wrong password.");
								z1=0;
							}
							break;
						}}
					}
					if(z==1 && z1==1) {
						panel_1.removeAll();
						panel_1.add(panel_user);
						panel_1.repaint();
						panel_1.revalidate();
						
					}
					else {
						if(z1==1)
						JOptionPane.showMessageDialog(panel, "Wrong input");
					}
					
				
				} catch (RuntimeException e2) {
					JOptionPane.showMessageDialog(panel, e2.getMessage());
				}
				catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});
		
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				korisnik=null;
				panel_1.removeAll();
				panel_1.add(panel_login);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		
	
		btnNewButton_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.removeAll();
				panel_1.add(panel_login);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		btnNewButton_1_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.removeAll();
				panel_1.add(panel_login);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		
		btnNewButton_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			btnID.setVisible(true);
			lblId.setVisible(true);
			textField_ID.setVisible(true);
			}
		});
		
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.removeAll();
				panel_1.add(panel_deposit);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		
		btnNewButton_1_2_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.removeAll();
				panel_1.add(panel_user);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.removeAll();
				panel_1.add(panel_withdrawal);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
	}
}
