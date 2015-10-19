package domain;

import javax.validation.Valid;
import javax.validation.constraints.Min;

public class Storage extends DomainEntity{
	private int units;
	private WareHouse wareHouse;
	private Item item;
	
	//NotNull
	@Min(1)
	@Valid
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	@Valid
	public WareHouse getWareHouse() {
		return wareHouse;
	}
	public void setWareHouse(WareHouse wareHouse) {
		this.wareHouse = wareHouse;
	}
	
	@Valid
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	

}
