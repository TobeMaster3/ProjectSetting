package com.devblog.practice.service;

import com.devblog.practice.vo.BoardVo;
import java.util.List;

public interface BoardService {

    public List<BoardVo> memberList() throws Exception;

}
