package proxy;

/**
 * 每个人都可以维护自己的信息 但是评分不能自己维护 需要别人维护
 *
 */
public class PersonBeanImpl implements Person{

	String name;
	String hobby;
	String description;
	float score;
	
	
	
	public PersonBeanImpl(String name, String hobby, String description) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.description = description;
		this.score = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "PersonBean [name=" + name + ", hobby=" + hobby
				+ ", description=" + description + ", score=" + score + "]";
	}
	
	
}
