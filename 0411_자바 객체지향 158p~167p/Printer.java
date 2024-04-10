package test;

public class Printer {
	private int numOfPapers;// 20
	private boolean duplex;

	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;

	}

	public void print(int amount) {
		if (duplex == true) {
			amount = amount % 2 == 0 ? amount / 2 : amount / 2 + 1;
		}

		if (numOfPapers == 0) {
			System.out.println("0장 있습니다.");
		} else if (amount > numOfPapers) {
			System.out.println("단면으로 모두 출력하려면 용지가" + (amount - numOfPapers) + "부족합니다" + numOfPapers + "장만 출력");
			numOfPapers = 0;
		} else {
			System.out.println( amount + "장 출력했습니다." + "현재" + (numOfPapers-amount) + "장 남아있습니다.");
			numOfPapers -= amount;
		}
	}

	public boolean getDuplex() {
		return duplex;
	}

	// getter 접근자 , 값을 읽어오는 것 setter 설정자 값을 쓸때,변경할때
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

}
