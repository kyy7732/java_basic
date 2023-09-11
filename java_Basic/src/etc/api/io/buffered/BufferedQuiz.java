package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
		         1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
		          오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
		         2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
		         3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
		          파일을 작성합니다. 
		          (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
		           연결해 주시면 됩니다.)
		                각 문장은 줄 개행을 포함합니다.
		         4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
		          파일을 읽어서 콘솔에 출력해 보세요.
		         */
		
			File file = new File("C:\\MyWork\\file\\20230908file");
			
			if(!file.exists()) {
				file.mkdirs();
				System.out.println("폴더가 생성되었습니다.");
			} else {
				System.out.println("해당 폴더가 있습니다.");
			}
			
			FileOutputStream fos = null;
			BufferedOutputStream fob = null;
			StringBuilder tet = new StringBuilder(); // 파일 내용 생성 객체
			FileReader fr = null;
			BufferedReader br = null;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("생성하실 파일명을 입력하세요 (확장자 포함x)");
			System.out.print("> ");
			String text = sc.next();
			System.out.println("파일이 생성되었습니다.\n파일의 내용을 작성하세요 ('그만'입력시 종료)\n");
			System.out.print("> ");
			String texts;
			sc.nextLine(); // 엔터값 받아주기
			
			try {
				fos = new FileOutputStream("C:\\MyWork\\file\\20230908file\\" + text + ".txt");
				fob = new BufferedOutputStream(fos);
			
				while(true) {
					texts = sc.nextLine();
					if(texts.equals("'그만'")) {
						break;
					}
					tet.append(texts + "\n");
						
				}
				byte[] data = new String(tet).getBytes();
				for(byte b : data) {
					fob.write(b);
				}
			
				fob.close();
				fos.close();
				fr = new FileReader("C:\\MyWork\\file\\20230908file\\" + text + ".txt");
				br = new BufferedReader(fr);
				
				System.out.println("파일 쓰기가 완료되었습니다.");
				String str;
				while((str = br.readLine()) != null) {
					System.out.println(str);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					sc.close();
					br.close();
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			 
			
		
	}

}










