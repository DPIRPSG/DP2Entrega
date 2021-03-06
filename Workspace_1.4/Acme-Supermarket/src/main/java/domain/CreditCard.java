package domain;

import javax.validation.Valid;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

//No extiende de DomainEntity al ser dataType
public class CreditCard{
	private String holderName;
	private String brandName;
	private String number;
	private int expirationMonth;
	private int expirationYear;
	private int cvvCode;
	
	@NotBlank
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	@NotBlank
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	@NotBlank
	@CreditCardNumber
	@Valid
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	//NotNull
	@Range(min = 1, max = 12)
	@Valid
	public int getExpirationMonth() {
		return expirationMonth;
	}
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	//NotNull
	public int getExpirationYear() {
		return expirationYear;
	}
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}
	
	//NotNull
	@Range(min = 100, max = 999)
	@Valid
	public int getCvvCode() {
		return cvvCode;
	}
	public void setCvvCode(int cvvCode) {
		this.cvvCode = cvvCode;
	}
	
}
