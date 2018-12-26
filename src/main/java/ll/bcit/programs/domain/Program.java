package ll.bcit.programs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Program entity
 * @author Liang Li
 *
 */
@Entity
public class Program {
	
	@Id
	@GeneratedValue
	private Long pId;		//program id
	private String name;	//program name
	

	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
