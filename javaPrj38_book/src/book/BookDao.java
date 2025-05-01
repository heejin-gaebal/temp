package book;

public class BookDao {

	private BookVo[] bookVoArr = new BookVo[3];
	private int cnt = 0;
	
	public void insert(BookVo vo) {
		bookVoArr[cnt] = vo;
		cnt++;
	}
	
	public BookVo[] getBookVoArr() {
		//배열 리턴
		return bookVoArr;
	}
	
	public void minusCnt() {
		cnt--;
	}

	public int getCnt() {
		return cnt;
	}
}
