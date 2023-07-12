package com.board.controller;


import com.board.VO.BoardVO;
import com.board.dao.BoardDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WriteController {
    @Autowired
    private BoardDao boardDao;

    @RequestMapping(value = "/board/save.do", method = RequestMethod.POST)
    public ModelAndView save(BoardVO boardVO) {
        // 게시물 저장
        boardDao.insertBoard(boardVO);

        // 메인 페이지로 리다이렉트
        ModelAndView mav = new ModelAndView("redirect:/board/list.do");
        return mav;
    }

    @RequestMapping(value = "/board/write.do", method = RequestMethod.GET)
    public ModelAndView process() {
        System.out.println("글쓰기 레이아웃 전 컨트롤러");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("write");

        return mav;
    }
}