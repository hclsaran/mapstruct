package com.hcl;

import com.hcl.model.Emp;
import com.saran.dto.EmpDTO;
import com.saran.mapper.EmpMapper;
import com.saran.mapper.EmpMapperImpl;

public class App 


{
	
	private static EmpMapper instance=new EmpMapperImpl();
    public static void main( String[] args )
    {
        Emp emp=Emp.builder()
        		.id(100)
        		.firstName("Saran")
        		.lastName("Paddy")
        		.build();
        
        EmpDTO empDTO=instance.toDTO(emp);
        System.out.println(empDTO);
        		
    }
}
