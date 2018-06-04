import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rings 
{
	@Id
private String gold;
private String silver;
private String platinum;

public String getGold() {
	return gold;
}
public void setGold(String gold) {
	this.gold = gold;
}
public String getSilver() {
	return silver;
}
public void setSilver(String silver) {
	this.silver = silver;
}
public String getPlatinum() {
	return platinum;
}
public void setPlatinum(String platinum) {
	this.platinum = platinum;
}

}
