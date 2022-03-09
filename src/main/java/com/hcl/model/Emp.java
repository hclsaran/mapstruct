package com.hcl.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder 
public class Emp {
	private int id;
	private String firstName;
	private String lastName;
	
}
/*@Builder lets you automatically produce the code 
required to have your class be instantiable with code
Emp.builder()
.id("100")
.firstName("Saran")
.lastName("Paddy") 
.build();

*/
