package typeGame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class type<Char> extends JFrame{
	String message = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new type().init();
	}
	private void init() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,900,900);
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
				if(message.equals(e.VK_ENTER)) {
					repaint();
				}else {
					char a = e.getKeyChar();
					message = String.valueOf(a);
					
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		setVisible(true);
	}
	@Override
	public void paint(Graphics g)
	{
		g.drawString(message, 100, 100);
		repaint();
	}

}
