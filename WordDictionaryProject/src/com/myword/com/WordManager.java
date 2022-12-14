package com.myword.com;

import java.util.Scanner;

import com.myword.com.WordCRUD;

public class WordManager {
	
	Scanner s = new Scanner(System.in);
	WordCRUD wordCRUD;
	
	WordManager() {
		wordCRUD = new WordCRUD(s);
	}
	
	public int selectMenu( ) {
		System.out.println("***영단어 마스터***");
		System.out.println("*********************");
		System.out.println("1.	모든 단어 보기");
		System.out.println("2.	수준병 단어 보기");
		System.out.println("3.	단어 검색");
		System.out.println("4.	단어 추가");
		System.out.println("5.	단어 수정");
		System.out.println("6.	단어 삭제");
		System.out.println("7.	파일 저장");
		System.out.println("0.	나가기");
		System.out.println("**********************");
		System.out.println("=> 원하는 메뉴는?");
		
		return s.nextInt( );
	}
	
	public void start( ) {
		while (true) {
		int menu = selectMenu( );
		if (menu == 0) {
			wordCRUD.endMenu();
		}
		if (menu == 4 ) {
			wordCRUD.addWord();
		}
		else if (menu == 1) {
			wordCRUD.listAll();
		}
		else break;
		}
	}
	
}

