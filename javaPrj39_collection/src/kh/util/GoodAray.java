package kh.util;

public class GoodAray {
	
	int[] arr = new int[5];
	int cnt = 0;
	
	//배열의 모든 값 출력
	public void printArray() {
		for(int i=0; i<cnt; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//배열의 특정 인덱스의 값 삭제
	public void delete(int n) {
		//뒷 요소 앞으로 당기기
		for(int i=n; i<cnt-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[cnt-1]=0;
		cnt--;
	}
	
	//배열에 값을 추가
	public void add(int v) {
		if(arr.length == cnt) { //배열이 모두 찼을때
			//배열 사이즈 늘리고
			int[] temp = new int[arr.length *2];
			
			//배열 복제
			for(int i=0; i<arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}
		
		arr[cnt] = v;
		cnt++;
	}
	
	//인덱스 받아서 해당 값 리턴
	public int getValue(int index) {
		if(index < 0 || index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[index];
		
	}
}
