package typeGame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class type<Char> extends JFrame{
	String message = "";
	String[] mondai= {"hello", "orange"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new type().init();
	}
	private void init() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,900,900);
		addKeyListener(new KeyListener() {

			private String mondaic;
			private String[] mondais_array;
			private String[] q0_array;
			private String[] mes_array;
			private char[] c;
			private char c1;
			private char c2;
			private char c3;
			private String moa[];
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
				if(message.equals(e.VK_ENTER)) {
					repaint();
				}else {
					char a = e.getKeyChar();//入力内容
					if(a == 'Q') {
						System.out.println("quit");
						System.exit(0);
						
					}else if(a == 'S') {
						System.out.println("game start");
						message =  mondai[0];
					}
						
				else {
					System.out.print(a);
					//mondai execute;
					
					moa = mondai[0].split("");
					for(int b=0; b<moa.length; b++) {
						
						String ab = String.valueOf(a);
						if(ab.equals(moa[b])){
							System.out.println("ok");
					
					
						}
						moa = mondai[1].split("");
						for(int b1=0; b1<moa.length; b1++) {
							
							String ab1 = String.valueOf(a);
							if(ab1.equals(moa[b1])){
								System.out.println("ok");
						
						
							
											
							}
						}
						
					
					}
				}
				}}
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stu
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}}
		);
		
		setVisible(true);
	}
	@Override
	public void paint(Graphics g)
	{
		g.drawString(message, 100, 100);
		repaint();
	}

}
