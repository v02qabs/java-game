package hiro.game.type-game;

import java.lang.Exception;
import java.awt.Frame;
import java.aw.event.WindowAdapter;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;


public class MainActivity extends Frame{
	public static void main(String[] args){
		System.out.println("Hello java game.");
		System.out.println("Typing- game.");
		new MainActivity().initWindow();
	}
	public MainActivity(){
	}
	private void initWindow(){
		System.out.println("initlize window...");
		addWindowListener(new WindowListener(){
			@Override
			public void windowActivated(WindowEvent e){
			}
			@Override
			public void windowClosed(WindowEvent e){

				System.exit(0);

			}
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			@Override	
			public void windowDeactivated(WindowEvent e)	
			{}
			@Override
			public void windowOpened(WindowEvent){
			}
	
		});
		addKeyListener(new KeyListener(){
		@Override
		public void keyPressed(KeyEvent e){
			System.out.println("key press e: " + e.getKeyCode());
		}
		@Override	
		public void keyReleased(KeyEvent e){
			System.out.println("key released: " + e.getKeyCode());
		}
		@Override 
		public void keyTyped(KeyEvent e)
		{
			System.out.println("key typed: " + e.getKeyCode());
		});

		setBounds(0,0,900,900);
		setVisible(true);


	}

}

