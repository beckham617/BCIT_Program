package ll.bcit.programs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Relationship between program and part
 * @author Liang Li
 *
 */
@Entity
public class ProgramPart {

	@Id
	@GeneratedValue
	private Long pp_id;
	@ManyToOne
	private Program program;
	@ManyToOne
	private PartCourse partCourse;
	
	public Long getPp_id() {
		return pp_id;
	}
	public void setPp_id(Long pp_id) {
		this.pp_id = pp_id;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public PartCourse getPartCourse() {
		return partCourse;
	}
	public void setPartCourse(PartCourse partCourse) {
		this.partCourse = partCourse;
	}
	
	
	
	
	
}
