package hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Todo {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name="description")
	private String description;
	
	public Todo(){
		
	}
	public Todo(String desc) {
		super();
		this.description = desc;
	}
	
	
}
