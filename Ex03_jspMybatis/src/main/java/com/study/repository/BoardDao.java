package com.study.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.dto.Board;

//sql문(xml)과 메소드를 연결하고 결과 값을 정의해놓은 타입으로 매핑 시켜주는 것
@Mapper
public interface BoardDao {
	public List<Board> list();
	public Board detailBoard(String no);
	public int totalRecord();
	public int insertBoard(Board board);
	public int deleteBoard(String no);
}
