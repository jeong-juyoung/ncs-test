package com.greedy.ncs.member.run;

import com.greedy.ncs.member.model.dto.MemberDTO;

public class Application {

	
		public static void main(String[] args) {
			
			MemberDTO dto = new MemberDTO();
			
			dto.setNumber(500);
			dto.setName("정주영");
			dto.setPwd("sdfsd1324");
			dto.setId("juyoung111");
			dto.setDate("2021-03-15");
			dto.setHeight(160);
			dto.setWeight(80.0);
			dto.setYesno("유");
			
			System.out.println(dto.getInformation());
			
		}
}
