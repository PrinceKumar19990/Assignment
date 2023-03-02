package Mypackage;

public class Main1 {
	public static void main(String[] args) {
		Movie M = new Movie();
		M.setName("Bahubali");
		M.setStarttime(9);
		M.setEndtime(1);
		M.setPrice(400);
		
		System.out.println("movie name is:"+M.getName());
		System.out.println("starting time is:"+M.getStarttime());
		System.out.println("end time is:"+M.getEndtime());
		System.out.println("price is:"+M.getPrice());
	}

}





public class Movie {
	private String name;
	private int starttime;
	private int endtime;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStarttime() {
		return starttime;
	}
	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}
	public int getEndtime() {
		return endtime;
	}
	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}