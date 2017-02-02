package com.java.session17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerialExternalization {

	public static void main(String[] args) {
		Site ws = new Site();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the site");
		ws.setName(sc.next());
		System.out.println("Purpose of the site");
		ws.setPurpose(sc.next());
		System.out.println("Rank of the site");
		ws.setRank(sc.nextInt());
		FileOutputStream fos;
		sc.close();
		try {
			fos = new FileOutputStream("C:\\Users\\SAIKIRAN\\Desktop\\sai.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ws);
			oos.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("C:\\Users\\SAIKIRAN\\Desktop\\sai.txt");
			ObjectInputStream ois= new ObjectInputStream(fis);){
			
			try {
				ws = (Site)ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println(ws);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
	class Site implements Serializable{
		private String name;
		private String purpose;
		private int rank;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPurpose() {
			return purpose;
		}
		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		@Override
		public String toString() {
			return "Site name=" + name + ", purpose=" + purpose + ", rank=" + rank + " ";
		}
		
	}