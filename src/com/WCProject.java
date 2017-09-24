package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class WCProject{
	private static String line_current = null;
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("Please enter a file name:");
		String path = mScanner.nextLine();
		File mFile = new File(path);
		if (!mFile.exists()) {
			System.out.println("File is not exist!");
			return;
		}
		try {
			BufferedReader mBufferedReader = new BufferedReader(new FileReader(mFile));
			line_current = mBufferedReader.readLine();
			int line_count = 0;
			int word_count = 0;
			int char_count = 0;
			while(line_current!=null) {
				line_count+=1;
				char_count+=line_current.length();
				word_count+=line_current.split(" |,|\\.").length;
				line_current = mBufferedReader.readLine();
			}
			System.out.println("Line:"+line_count);
			System.out.println("Char:"+char_count);
			System.out.println("Word:"+word_count);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}