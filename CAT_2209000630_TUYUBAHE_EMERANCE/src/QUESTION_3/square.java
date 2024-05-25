package QUESTION_3;

public class square extends SPAPE {
	int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public String toString() {
		return "square [side=" + side + "]";
	}

	public void setArea(int area) {
		// TODO Auto-generated method stub
		super.setArea(this.getSide());
	}

	public void setPermiter(int permiter) {
		// TODO Auto-generated method stub
		super.setPermiter(permiter);
	}
	

	
	}

//}
