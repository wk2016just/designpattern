package proxy;

/**
 * Person接口 用于代理和被代理的共同接口
 * 用于实例保护代理
 *
 */
public interface Person {
	public String getName() ;
	public void setName(String name) ;
	public String getHobby();
	public void setHobby(String hobby) ;
	public String getDescription() ;
	public void setDescription(String description);
	public float getScore() ;
	public void setScore(float score) ;
}
