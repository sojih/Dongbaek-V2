package com.itwillbs.DongZero.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.itwillbs.DongZero.vo.*;
import com.itwillbs.DongZero.voNew.*;

@Mapper
public interface ReservationMapper {
	
	// 영화 목록 조회(예매율 순)
	List<MovieVO> selectMovieListDescBookinRate();
	
	// 영화 목록 조회(가나다 순)
	List<MovieVO> selectMovieListAscMovieName();

	// 영화 정보 조회
	MovieVO selectMovie(int movie_num);

	// 극장 목록 조회
	List<TheaterVO> selectTheaterList(int movie_num);

	// 극장 정보 조회
	TheaterVO selectTheater(int theater_num);

	// 상영 목록 조회
	List<Map<String, Object>> selectPlayList(@Param("movie_num") int movie_num, @Param("theater_num") int theater_num, @Param("play_date") String play_date);

	// 상영관 목록 조회
	List<RoomVO> selectRoomList(int theater_num);
	
	// 상영 정보 조회
	ReservationVO selectPlay(int play_num);
	
	// 좌석 사용 여부 조회를 위한 오더티켓 조회
	List<OrderTicketVO> selectOrderTicket(int play_num);
	
	// 티켓 가격 조회
	List<TicketTypeVO> selectTicketTypeList(String play_time_type);
	
	int insertOrder(OrderVO order);

	int insertTicket(OrderTicketVO ticket);

	int insertPayment(PaymentVO payment);

	void insertSnack(OrderSnackVO snack);

	TicketTypeVO selectTicketTypeListByNum(int ticket_type_num);

	int selectSeatNumListByName(String seat);

	MemberVO selectMember(String member_id);

}
