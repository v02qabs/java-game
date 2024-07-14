package hiro.game;

import java.lang.Exception;
import java.awt.Frame;
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
		try{
			String args1 = args[1];
			System.out.println("args: " + args1);
		}
		catch(Exception error)
		{
			System.out.println("e: " + error.toString());
		}

	}
}

