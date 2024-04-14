package com.devblog.practice.service;


import com.devblog.practice.dao.BoardDao;
import com.devblog.practice.vo.BoardVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{


    private BoardDao boardDao;

    public BoardServiceImpl(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Override
    public List<BoardVo> memberList() throws Exception{

        return boardDao.memberList();
    }
}
