package com.sist.client;

import java.awt.*;

import javax.swing.*;

public class ControllerPanel extends JPanel{
	CardLayout card=new CardLayout();
	HomeForm hf=new HomeForm();
	public ControllerPanel()
	{
		setLayout(card);
		add("HOME",hf);
	}

}
