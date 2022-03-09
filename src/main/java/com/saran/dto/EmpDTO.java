package com.saran.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpDTO {
	private int id;
	private String fullName;//firstName + '  '+lastName
	

}
