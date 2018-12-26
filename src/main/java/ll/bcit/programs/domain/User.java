package ll.bcit.programs.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * User Entity
 * @author Liang Li
 *
 */
@Entity
public class User {

	@Id
	@GeneratedValue
	private Long uId;
	private String bcitId;
	private String name;
	private int gender;
	private String email;
	private String address;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	private String cellPhone;
	
	public Long getuId() {
		return uId;
	}
	public void setuId(Long uId) {
		this.uId = uId;
	}
	public String getBcitId() {
		return bcitId;
	}
	public void setBcitId(String bcitId) {
		this.bcitId = bcitId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	
	
}
