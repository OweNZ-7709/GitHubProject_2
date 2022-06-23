package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import com.sist.data.Music;
import com.sist.main.NetworkMain;
public class PosterCard extends JPanel{
	JLabel poster=new JLabel();
	JLabel title=new JLabel();
	JLabel singer=new JLabel();
	public PosterCard(Music m)
	{
		setLayout(null);
		poster.setBounds(5,5,168,170);
		//poster.setOpaque(true);
		//poster.setBackground(Color.pink);
		try
		{
			URL url=new URL("http:"+m.getPoster());
			Image img=NetworkMain.getImage(new ImageIcon(url), 168, 170);
			poster.setIcon(new ImageIcon(img));
		}catch(Exception ex) {}
		
		title.setBounds(5,180,168,30);
		//title.setOpaque(true);
		//title.setBackground(Color.orange);
		title.setText(m.getTitle());
		singer.setBounds(5,215,168,30);
		
		singer.setBounds(5,215,168,30);
		//singer.setOpaque(true);
		//singer.setBackground(Color.cyan);
		add(poster);
		add(title);
		add(singer);
		
	}
}
