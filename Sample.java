package silver;

import java.util.Random;

public class Sample {
	private int num;
	private String name;
	private long id;
	public Sample(int num) {
		this.name = "Sample";
		this.num = num;
		Random r = new Random();
		long rr = r.nextLong();
		this.id = rr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 11;
		Random r = new Random();
		int result = r.nextInt(1000);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)/*引数がそれ自身なら*/
//			return true;
//		if (obj == null)/*引数がnullなら*/
//			return false;
//		if (getClass() != obj.getClass())/*非同クラスなら*/
//			return false;
//		Sample other = (Sample) obj;/*非同クラスでないならSampleにキャスト*/
//		if (name == null) {/*インスタンスの名前がnullで、*/
//			if (other.name != null)/*引数の名前が非nullなら*/
//				return false;
//		} else if (!name.equals(other.name))/*名が違ったら*/
//			return false;
//		if (num != other.num)/*numが違ったら*/
//			return false;
//		return true;
//	}
	public boolean equals(Sample o) {
		if(this == o) {
			return true;
		}
		if(this.num == o.num) {
			return true;
		}
		return false;
	}


}
