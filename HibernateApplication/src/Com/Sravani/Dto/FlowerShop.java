package Com.Sravani.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FlowerShop {
@Id	

	private int Id;
	private String flowerType;
	private int weeklySales;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFlowerType() {
		return flowerType;
	}
	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}
	public int getWeeklySales() {
		return weeklySales;
	}
	public void setWeeklySales(int weeklySales) {
		this.weeklySales = weeklySales;
	}
	
	

}
