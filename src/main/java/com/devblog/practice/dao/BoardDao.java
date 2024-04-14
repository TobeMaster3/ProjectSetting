package com.devblog.practice.dao;

import com.devblog.practice.vo.BoardVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    private SqlSession sqlSession;

    public List<BoardVo> memberList() throws Exception{

        return sqlSession.selectOne("BoardMapper.selectBoardList");
    }

}
