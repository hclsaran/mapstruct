package com.saran.mapper;

import com.hcl.model.Emp;
import com.hcl.model.Emp.EmpBuilder;
import com.saran.dto.EmpDTO;
import com.saran.dto.EmpDTO.EmpDTOBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-09T10:43:35-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
public class EmpMapperImpl extends EmpMapper {

    @Override
    public EmpDTO toDTO(Emp emp) {
        if ( emp == null ) {
            return null;
        }

        EmpDTOBuilder empDTO = EmpDTO.builder();

        empDTO.fullName( fullNameByFirstAndLastName( emp ) );
        empDTO.id( emp.getId() );

        return empDTO.build();
    }

    @Override
    public Emp fromDTO(EmpDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EmpBuilder emp = Emp.builder();

        emp.id( dto.getId() );

        return emp.build();
    }
}
