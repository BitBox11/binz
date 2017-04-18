package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.zerock.domain.DiaryVO;

@Repository
public class DiaryDAO {

	@Inject
	SqlSessionTemplate sessiontemplate;

	public List<DiaryVO> getlist(){
		
		List<DiaryVO> list = sessiontemplate.selectList("org.zerock.persistence.DiaryDAO.getlist");
		
		return list;
		
	}
	
	
	
	
	
}
