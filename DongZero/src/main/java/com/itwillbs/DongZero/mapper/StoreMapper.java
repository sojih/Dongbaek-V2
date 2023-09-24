package com.itwillbs.DongZero.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itwillbs.DongZero.vo.*;

@Mapper
public interface StoreMapper {

	List<SnackVO> selectSnackList();

	SnackVO selectSnackListByNum(int snackNum);

	

}
