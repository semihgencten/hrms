package javacamp.hrms.entities.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.apache.tomcat.jni.User;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seekers")
@PrimaryKeyJoinColumn(name="user_id")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
@Inheritance(strategy=InheritanceType.JOINED)
public class JobSeeker extends javacamp.hrms.entities.abstracts.User{
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="user_id")
//	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="birth_year")
	private int birthYear;
	

}
