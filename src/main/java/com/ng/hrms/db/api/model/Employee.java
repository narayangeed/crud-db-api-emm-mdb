package com.ng.hrms.db.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "TBL_EMPLOYEE_DTLS")
public class Employee {
	@Id
	private Integer employeeId;
	private String name;
	private String gender;
	private Long salary;
	private Address address;
	private List<Department> departments;
}
