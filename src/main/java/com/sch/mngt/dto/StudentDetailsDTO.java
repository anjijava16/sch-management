package com.sch.mngt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailsDTO {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private String contactNumber;
	private Long schoolId;
	private String schoolName;
	private String middleName;
	private String  grade;
	
}
