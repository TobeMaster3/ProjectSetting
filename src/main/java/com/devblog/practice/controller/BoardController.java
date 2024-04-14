package com.devblog.practice.controller;

import com.devblog.practice.service.BoardService;
import com.devblog.practice.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {


    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping(value = "/home.do", method = RequestMethod.GET)
    public ModelAndView home() throws Exception {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("home");

        return mv;
    }

    @RequestMapping(value = "/boardList.do", method = RequestMethod.GET)
    public String boardList(Model model) throws Exception{

        List<BoardVo> memberList = boardService.memberList();

        model.addAttribute("memberList", memberList);

        return "board/boardList";
    }
}
