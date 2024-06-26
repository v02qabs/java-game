package hiro.game;

import java.io.*;
import javax.swing.*;
import hiro.game.typeGame.*;

class MainActivity extends JFrame{
	public static void main(String[] args){
		System.out.println("Hello game\'s");
		try{
			String a0 = args[0];
			new MainActivity().select_game(a0);
		}
		catch(Exception error)
		{
		}

	}
	private void select_game(String games){
		try{
			System.out.println("game name: " + games);
			if(games.equals("typeGame")){
				new hiro.game.typeGame.typegame().typegame();
			}

		}
		catch(Exception error)
		{
			System.out.println("ゲーム名が空です。");
		}

	}

}

