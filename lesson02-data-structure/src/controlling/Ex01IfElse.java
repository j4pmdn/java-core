package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		
		// Randome 1 số nguyên ngẫu nhiên từ [5, 20)
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		System.out.println("Số ngẫu nhiên --> " + number);
		
		// Kiểm tra số nguyên đó có phải là số chẵn không
		// Nếu là số chẵn thì sẽ in ra năm hiện tại + số chẵn đó
		// Nếu ko phải --> ko in ra ko làm chi cả
		/*
		 
		int currentYear = Year.now().getValue();
		//boolean isEven = (number % 2 == 0);
		//if(isEven) {
		if(number % 2 == 0)	{
			System.out.println("number là số chẵn(+2024) --> " + (currentYear + number));
		}
		System.out.println("kết thúc chương trình...");
		*/
		
		// Nhập vào mật khẩu, kiểm tra độ dài của mật khẩu có hợp lệ hay không
		// Nếu độ dài của mật khẩu >=8 --> in ra mật khẩu hợp lệ
		// Ngược lại --> in ra mật khẩu ko hợp lệ, vui lòng nhập lại
		
		// mở kết nối nhập xuất đến bàn phím
		Scanner ip = new Scanner(System.in);
		
		/*
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();
		
		int length = password.length();
		
		if(length >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		}else {
			System.out.println("Mật khẩu không hợp lệ");
		}
		*/
		
		System.out.println("\n\n");
		
		// Random điểm trung bình(số thực) của học sinh[0.0, 10.0]
		// KQ: số ko biết được số thập phân bao nhiêu, làm tròn lấy 1 chữ số thập phân
		// Nếu điểm mà
		// + [0, 5)   : Yếu
		// + [5, 6.5) : Trung Bình
		// + [6.5, 8) : Khá
		// + [8, 10]  : Giỏi
		float score = rd.nextFloat(0, 11); // [0.0, 11.0) --> 0.0 -> 10.99
		/*
		if(score > 10f) {
			score = 10f;
		}
		*/
		
		score = score > 10f ? 10f : score;
		
		// #,###.#
		// score = 7.8642787f; // 7.9
		// score = 7.002f; // 7
		
		// #,###.0 --> luôn luôn tối thiểu và tối đa là 1 chữ số thập phân
		// score = 7.8642787f; // 7.9
		// score = 7.002f; // 7.0
		// score = 7f; // 7.0
		
		// pattern - công thức, cú pháp
		DecimalFormat df = new DecimalFormat("#,###.0");
		String formattedScore = df.format(score); // đinh dạng 1 giá trị KDL ? sang string để in ra
		score = Float.parseFloat(formattedScore);
		
		// System.out.println("ĐTB: " + score);
		System.out.println("Điểm trung bình: " + score);
		
		/*
		if(score < 5) {
			System.out.println("Học lực -> Yếu");
		} else if(score < 6.5f) {
			System.out.println("Học lực -> Trung bình");
		} else if(score < 8.0f) {
			System.out.println("Học lực -> Khá");
		} else {
			System.out.println("Học lực -> Giỏi");
		}
		
		*/
		
		/*
		String ranking = "";
		if(score < 5) {
			ranking = "Yếu";
		} else if(score < 6.5f) {
			ranking = "Trung bình";
		} else if(score < 8.0f) {
			ranking = "Khá";
		} else {
			ranking = "Giỏi";
		}
		*/
		String ranking = score < 5 ? "Yếu" 
				   : score < 6.5f ? "Trung Bình"
						          : score < 8.0f ? "Khá"
						        		         : "Giỏi";
		
		System.out.println("Học lực --> " + ranking);
		
		System.out.println("\nToán tử 3 ngôi");
		
		/*
		 
		  if(exp){
		  	result1(statement)
		  } else{
		  	result2(statement)
		  }
		  
		  (exp) ? result1 : result2;
		 */
		 // VD: randon 2 số nguyên ngẫu nhiên a va fb [0, 12]
		 // Yêu cầu: Tìm max của 2 số
		int a = rd.nextInt(12);
		int b = rd.nextInt(12);
		System.out.println("a --> " + a);

		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);
		
		  
		 
		 
		
		
		System.out.println("kết thúc chương trình...");
		ip.close(); // đóng kết nối
	} 
	
}
