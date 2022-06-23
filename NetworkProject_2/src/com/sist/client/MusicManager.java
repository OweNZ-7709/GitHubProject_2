package com.sist.client;

import javax.swing.JPanel;

import com.sist.data.*;
import java.util.*;

import java.awt.*;
import java.util.ArrayList;
public class MusicManager extends JPanel{
	PosterCard[] musics=new PosterCard[15];
	public void carPrint(ArrayList<Music> list)
	{
		setLayout(null);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,5));
		int i=0;
		for(Music m:list)
		{
			musics[i]=new PosterCard(m);
			p.add(musics[i]);
		}
		
		p.setBounds(10,15,840,730);
		add(p);
		
		
	}

}
