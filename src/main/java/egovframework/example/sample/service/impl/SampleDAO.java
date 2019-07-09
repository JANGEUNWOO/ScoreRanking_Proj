/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.example.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

/**
 * @Class Name : SampleDAO.java
 * @Description : Sample DAO Class
 * @Modification Information
 * @ @ 수정일 수정자 수정내용 @ --------- --------- ------------------------------- @
 *   2009.03.16 최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 * 		Copyright (C) by MOPAS All right reserved.
 */

@Repository("sampleDAO")
public class SampleDAO extends EgovAbstractDAO {
	
	/*국어 만점자 */
	public List<?> korscholar(Map<String,String> hashmap) throws Exception {
		return list("sampleDAO.korscholar", hashmap);
	}
	/*수학 만점자 */
	public List<?> mathscholar(Map<String,String> hashmap) throws Exception {
		return list("sampleDAO.mathscholar", hashmap);
	}
	/*영어 만점자*/
	public List<?> engscholar(Map<String,String> hashmap) throws Exception {
		return list("sampleDAO.engscholar", hashmap);
	}
	/**
	 *  2019 디와이정보기술 성적조회 코드
	 */
	public List<?> ScoreChk(Map<String,String> hashmap) throws Exception {
		return list("sampleDAO.ScoreChk", hashmap);
	}
	
	public List<?> testNameList(SampleDefaultVO searchVO) throws Exception {
		return list("sampleDAO.testNameList", searchVO);
	}
	
	public List<?> subteacher(Map<String,String> hashmap) throws Exception {
		return list("sampleDAO.subteacher", hashmap);
	}


}
