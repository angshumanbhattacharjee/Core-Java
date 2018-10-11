package FlightSearch.com.capgemini.flightSearch;

public class MyInteger implements Comparable<MyInteger> {

	int num;
	
	public MyInteger(int num) {
		this.num=num;
	}

	public Integer getN() {
		return num;
	}

	

	@Override
	public String toString() {
		return "MyInteger [num=" + num + "]";
	}

	public int compareTo(MyInteger number) {
		// TODO Auto-generated method stub
		return this.num-number.num;
	}
}
