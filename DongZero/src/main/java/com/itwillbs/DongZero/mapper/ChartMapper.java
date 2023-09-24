package com.itwillbs.DongZero.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.itwillbs.DongZero.voNew.*;

@Mapper
public interface ChartMapper {

	List<ChartVO> selectSixUp();
	
	
}
