package chap06_1;

public class Book {
	//필드:field
		private int bookNo;
		private String title;
		private int price;
		
		
		
	public int getBookNo() {
			return bookNo;
		}



		public String getTitle() {
			return title;
		}



		public int getPrice() {
			return price;
		}



		//생성자:constructor
		Book(int bookNo, String title, int price){
			this.bookNo = bookNo;
			this.title = title;
			this.price = price;
		}
		
	//메소드: method
	
}//end class
