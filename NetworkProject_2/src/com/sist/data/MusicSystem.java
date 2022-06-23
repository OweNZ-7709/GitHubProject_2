package com.sist.data;

import java.util.ArrayList;
import java.io.*;
public class MusicSystem {
	public static ArrayList<Music> list=
			new ArrayList<Music>();
	//초기화
	static
	{
		try
		{
			FileInputStream fis=
					new FileInputStream("c:\\java_data\\music.txt");
			ObjectInputStream ois=
					new ObjectInputStream(fis);
			list=(ArrayList<Music>)ois.readObject();
			ois.close();
			fis.close();
		}catch (Exception ex) {}
	}
	public static ArrayList<Music> musicListData(int cno, int page)
	{
		ArrayList<Music> clist=
				new ArrayList<Music>();
		//페이지 나누기
		int j=0;
		int pagecnt=(page*15)-15;
		for(int i=0;i<list.size();i++)
		{
			Music m=list.get(i);
			if(m.getCno()==cno)
			{
			if(j<15 && i>=pagecnt)
			{
				clist.add(m);
				j++;
			}
		  }
		}
		return clist;
	}
	public static int musicTotalPage(int cno)
	{
		return (int)(Math.ceil(100/15.0));
	}
	public static void main(String[] args) {
		ArrayList<Music> list=musicListData(7,2);
		for(Music m:list)
		{
			System.out.println(m.getMno()+"."+m.getTitle());
		}
	}

}
