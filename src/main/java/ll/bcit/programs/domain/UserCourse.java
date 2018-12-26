package ll.bcit.programs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Relationship between user and course
 * @author Liang Li
 *
 */
@Entity
public class UserCourse {

	@Id
	@GeneratedValue
	private Long ucId;
	@ManyToOne
	private Course course;
	@ManyToOne
	private User user;
	@ManyToOne
	private Program program;
	private int isSingleCourse;
	
	public Long getUcId() {
		return ucId;
	}
	public void setUcId(Long ucId) {
		this.ucId = ucId;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public int getIsSingleCourse() {
		return isSingleCourse;
	}
	public void setIsSingleCourse(int isSingleCourse) {
		this.isSingleCourse = isSingleCourse;
	}
	
	
}
