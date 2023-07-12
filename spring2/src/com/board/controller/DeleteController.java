package com.board.controller;

import com.board.VO.BoardVO;
import com.board.dao.BoardDao;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {

	@Autowired
	private BoardDao boardDao;

	 // 게시물 삭제 처리 메서드
    @RequestMapping(value = "/board/delete.do", method = RequestMethod.POST)
    public ResponseEntity<String> deleteBoard(@RequestParam("seq") Integer seq, HttpServletRequest request) {
        try {
            BoardVO board = boardDao.getBoard(seq);
            
            if (board.getUploadedFile() != null) {
                // 실제 프로젝트 실행 경로 얻기
                String projectRealPath = request.getSession().getServletContext().getRealPath("/");
                String uploadDirPath = "upload"; // 삭제할 상대 경로 지정하기
                
                Path uploadPath = Paths.get(projectRealPath + uploadDirPath + File.separator + board.getUploadedFile());
                Files.deleteIfExists(uploadPath);
            }
            
            boardDao.deleteBoard(seq);
            // 삭제 완료 응답을 리턴
            return new ResponseEntity<>("success", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("fail", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
