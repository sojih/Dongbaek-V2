package com.itwillbs.DongZero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.DongZero.mapper.*;
import com.itwillbs.DongZero.vo.*;

@Service
public class StoreService {
	@Autowired StoreMapper mapper;
	public List<SnackVO> getSnackList() {
		// TODO Auto-generated method stub
		return mapper.selectSnackList();
	}
	public SnackVO getSnackListByNum(int snackNum) {
		// TODO Auto-generated method stub
		return mapper.selectSnackListByNum(snackNum);
	}


}
