package model;

public class Prograd {
	private String name;
	private String id;
	private String rate;
	private String comment;
	private String recommand;
	public Prograd(String name, String id, String rate, String comment, String recommand) {
		super();
		this.name = name;
		this.id = id;
		this.rate = rate;
		this.comment = comment;
		this.recommand = recommand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getRecommand() {
		return recommand;
	}
	public void setRecommand(String recommand) {
		this.recommand = recommand;
	}
	
	
	
}
