package domain;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class Tax extends DomainEntity{
	private String name;
	private double value;
	
	@NotBlank
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Al ser primitivo no necesita ser @NotNull
	@Min(0)
	@Digits(integer=3, fraction=2)
	@Valid
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}
