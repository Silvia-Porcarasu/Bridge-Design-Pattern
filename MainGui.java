package Proiect;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MainGui {

	static void task() throws IOException {
		//fereastra grafica
		JFrame frame = new JFrame("Meniul zilei");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(199,21,133));
		frame.setBounds(500,100,670,350);
		frame.setLayout(null);
		
		//lista cos
		ArrayList<Restaurant> item = new ArrayList<Restaurant>();
		
		//texte
		JTextArea txtMesj = new JTextArea();
		txtMesj.setText(" Bine ai venit! Apasa butonul pentru a incepe! ");
		txtMesj.setBounds(50,150,270,25);
		txtMesj.setEditable(false);
		frame.getContentPane().add(txtMesj);
		
		JTextArea txtMesj2 = new JTextArea();
		txtMesj2.setText(" Alege specificul: ");
		txtMesj2.setBounds(50,150,270,25);
		txtMesj2.setVisible(false);
		frame.getContentPane().add(txtMesj2);
		
		JTextArea txtMesj3 = new JTextArea();
		txtMesj3.setText(" Alege: ");
		txtMesj3.setBounds(50,150,270,25);
		txtMesj3.setVisible(false);
		frame.getContentPane().add(txtMesj3);
		
		JTextArea txtMesj4 = new JTextArea();
		txtMesj4.setText(" Doresti sa mai adaugi elemente in meniu? ");
		txtMesj4.setBounds(50,150,270,25);
		txtMesj4.setVisible(false);
		frame.getContentPane().add(txtMesj4);

		
		//butoane
		JButton btnCos=new JButton("");
		btnCos.setBackground(new Color(255,182,193));
		btnCos.setBounds(400, 10, 90, 70);
		frame.getContentPane().add(btnCos);
		BufferedImage img1=ImageIO.read(new File("C:\\Users\\Mada-Teo\\Downloads\\cos.png"));
		JLabel pic1 = new JLabel(new ImageIcon(img1));
		btnCos.add(pic1);
		
		JButton btnGolCos=new JButton("Stergere meniu");
		btnGolCos.setBackground(new Color(255,182,193));
		btnGolCos.setBounds(500, 10, 140, 70);
		frame.getContentPane().add(btnGolCos);
		
		JButton btnIncep=new JButton("Incepe!");
		btnIncep.setBackground(new Color(219,112,147));
		btnIncep.setBounds(50, 200, 120, 70);
		frame.getContentPane().add(btnIncep);
		
		JButton btnItalian=new JButton("Italian");
		btnItalian.setBackground(new Color(219,112,147));
		btnItalian.setBounds(50, 200, 120, 70);
		btnItalian.setVisible(false);
		frame.getContentPane().add(btnItalian);
		
		JButton btnFrantuzesc=new JButton("Frantuzesc");
		btnFrantuzesc.setBackground(new Color(219,112,147));
		btnFrantuzesc.setBounds(200, 200, 120, 70);
		btnFrantuzesc.setVisible(false);
		frame.getContentPane().add(btnFrantuzesc);
		
		JButton btnCiorba=new JButton("Supa");
		btnCiorba.setBackground(new Color(219,112,147));
		btnCiorba.setBounds(200, 200, 120, 70);
		btnCiorba.setVisible(false);
		frame.getContentPane().add(btnCiorba);
		
		JButton btnPaste=new JButton("Paste");
		btnPaste.setBackground(new Color(219,112,147));
		btnPaste.setBounds(50, 200, 120, 70);
		btnPaste.setVisible(false);
		frame.getContentPane().add(btnPaste);
		
		JButton btnFriptura=new JButton("Friptura");
		btnFriptura.setBackground(new Color(219,112,147));
		btnFriptura.setBounds(350, 200, 120, 70);
		btnFriptura.setVisible(false);
		frame.getContentPane().add(btnFriptura);
		
		JButton btnTort=new JButton("Tort");
		btnTort.setBackground(new Color(219,112,147));
		btnTort.setBounds(500, 200, 120, 70);
		btnTort.setVisible(false);
		frame.getContentPane().add(btnTort);
		
		JButton btnDa=new JButton("Da");
		btnDa.setBackground(new Color(219,112,147));
		btnDa.setBounds(50, 200, 120, 70);
		btnDa.setVisible(false);
		frame.getContentPane().add(btnDa);
		
		JButton btnNu=new JButton("Nu");
		btnNu.setBackground(new Color(219,112,147));
		btnNu.setBounds(200, 200, 120, 70);
		btnNu.setVisible(false);
		frame.getContentPane().add(btnNu);
		
		
		class A implements ActionListener{
			
			static int b=0;
			static int c=0;

			public void actionPerformed(ActionEvent a) {
				if(a.getSource()==btnCos) {
					try {
						System.out.println("Meniul format este: ");
						int i=item.size();
						while(i>0) {
							i--;
							item.get(i).alegereClient();
							System.out.println("\n");
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				if(a.getSource()==btnGolCos) {
					try {
						item.clear();
						JFrame f = new JFrame();
						JOptionPane.showMessageDialog(f, "Meniul a fost sters!");
						f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				if(a.getSource()==btnIncep) {
					try {
						btnIncep.setVisible(false);
						txtMesj.setVisible(false);
						btnItalian.setVisible(true);
						txtMesj2.setVisible(true);
						btnFrantuzesc.setVisible(true);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				if(a.getSource()==btnItalian || a.getSource()==btnFrantuzesc) {
					try {

						btnItalian.setVisible(false);
						btnFrantuzesc.setVisible(false);
						txtMesj2.setVisible(false);
						txtMesj3.setVisible(true);
						btnCiorba.setVisible(true);
						btnPaste.setVisible(true);
						btnFriptura.setVisible(true);
						btnTort.setVisible(true);
						if(a.getSource()==btnItalian)
							b=1;
						else
							b=2;
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				if(a.getSource()==btnPaste || a.getSource()==btnFriptura || a.getSource()==btnCiorba || a.getSource()==btnTort) {
					try {
						txtMesj3.setVisible(false);
						txtMesj4.setVisible(true);
						btnPaste.setVisible(false);
						btnTort.setVisible(false);
						btnFriptura.setVisible(false);
						btnCiorba.setVisible(false);
						btnDa.setVisible(true);
						btnNu.setVisible(true);
						
						if(a.getSource()==btnPaste)
							c=1;
						if(a.getSource()==btnFriptura)
							c=2;
						if(a.getSource()==btnCiorba)
							c=3;
						if(a.getSource()==btnTort)
							c=4;
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				if(a.getSource()==btnDa) {
					try {
						txtMesj4.setVisible(false);
						btnDa.setVisible(false);
						btnNu.setVisible(false);
						btnItalian.setVisible(true);
						txtMesj2.setVisible(true);
						btnFrantuzesc.setVisible(true);
						if(c==1)
							if(b==1)
								item.add(new Italian(new Paste()));
							else
								item.add(new Frantuzesc(new Paste()));
						if(c==2)
							if(b==1)
								item.add(new Italian(new Friptura()));
							else
								item.add(new Frantuzesc(new Friptura()));
						if(c==3)
							if(b==1)
								item.add(new Italian(new Supa()));
							else
								item.add(new Frantuzesc(new Supa()));
						if(c==3)
							if(b==1)
								item.add(new Italian(new Tort()));
							else
								item.add(new Frantuzesc(new Tort()));
						c=0;
						b=0;
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				if(a.getSource()==btnNu) {
					try {
						txtMesj4.setVisible(false);
						btnDa.setVisible(false);
						btnNu.setVisible(false);
						if(c==1)
							if(b==1)
								item.add(new Italian(new Paste()));
							else
								item.add(new Frantuzesc(new Paste()));
						if(c==2)
							if(b==1)
								item.add(new Italian(new Friptura()));
							else
								item.add(new Frantuzesc(new Friptura()));
						if(c==3)
							if(b==1)
								item.add(new Italian(new Supa()));
							else
								item.add(new Frantuzesc(new Supa()));
						if(c==3)
							if(b==1)
								item.add(new Italian(new Tort()));
							else
								item.add(new Frantuzesc(new Tort()));
						c=0;
						b=0;
						System.out.println("Meniul format este: ");
						int i=item.size();
						while(i>0) {
							i--;
							item.get(i).alegereClient();
							System.out.println("\n");
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				
				
				
			}
		}
		
		
		btnCos.addActionListener(new A());
		btnGolCos.addActionListener(new A());
		btnIncep.addActionListener(new A());
		btnItalian.addActionListener(new A());
		btnFrantuzesc.addActionListener(new A());
		btnCiorba.addActionListener(new A());
		btnPaste.addActionListener(new A());
		btnFriptura.addActionListener(new A());
		btnDa.addActionListener(new A());
		btnNu.addActionListener(new A());
		btnTort.addActionListener(new A());
		frame.setVisible(true);
}
	
	public static void main(String[] args) throws IOException {
		task();
	}
	
	
}