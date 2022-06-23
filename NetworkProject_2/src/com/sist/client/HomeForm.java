package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;

import com.sist.data.Music;
import com.sist.data.MusicSystem;
public class HomeForm extends JPanel {
	JButton b1,b2; //이전, 다음
	JButton[] m=new JButton[7];
	MusicManager mm=new MusicManager();
	MusicSystem ms=new MusicSystem();
	public HomeForm()
	{
		b1=new JButton("이전");
		b2=new JButton("다음");
		JPanel p=new JPanel();
		String[] title= {"Top100","가요","POP","OST","트롯","JAZZ","CLASSIC"};
		for(int i=0;i<m.length;i++)
		{
			m[i]=new JButton(title[i]);
			p.add(m[i]);
		}
		//배치
		setLayout(null);
		p.setBounds(0,0,840,35);
		add(p);
		mm.setBounds(0,0,840,780);
		add(mm);
		//시작과 동시에 데이터를 받기
		ArrayList<Music> list=MusicSystem.musicListData(1, 1);
		mm.carPrint(list);
	}

}
