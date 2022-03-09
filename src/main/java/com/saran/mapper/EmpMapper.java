package com.saran.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.hcl.model.Emp;
import com.saran.dto.EmpDTO;

@Mapper
public abstract class EmpMapper {
	@Mapping(target = "fullName", source = ".", qualifiedByName = "fullNameByFirstAndLastName")
	public abstract EmpDTO toDTO(Emp emp);

	@InheritInverseConfiguration(name = "toDTO")
	public abstract Emp fromDTO(EmpDTO dto);

	@Named("fullNameByFirstAndLastName")
	String fullNameByFirstAndLastName(Emp emp) {
		return emp.getFirstName() + "  " + emp.getLastName();

	}

}
