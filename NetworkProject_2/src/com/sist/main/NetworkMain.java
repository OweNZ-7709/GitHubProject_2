package com.sist.main;
import com.sist.client.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NetworkMain extends JFrame{
	MenuForm menu=new MenuForm();
	ControllerPanel cp=new ControllerPanel();
	WaitForm wr=new WaitForm();
	public NetworkMain()
	{
		setTitle("레시피 프로그램");
		setLayout(null); //사용자 정의 (직접 배치)
		menu.setBounds(10, 15, 100, 350);
		add(menu);
		
		cp.setBounds(120,15,850,820);
		add(cp);
		
		wr.setBounds(980, 15, 250, 700);
		add(wr);
		
		setSize(1250,900);
		setVisible(true);
		//종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static Image getImage(ImageIcon ii, int width, int height)
	{
		Image dimg=ii.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return dimg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		}catch(Exception ex) {}
		new NetworkMain();
	}

}
