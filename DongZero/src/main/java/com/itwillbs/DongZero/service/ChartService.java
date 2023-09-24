package com.itwillbs.DongZero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.DongZero.mapper.*;
import com.itwillbs.DongZero.voNew.*;

@Service
public class ChartService {
	
	@Autowired
	private ChartMapper mapper;

	public List<ChartVO> getSixUpGenre() {
		
		return mapper.selectSixUp();
	}
}
