package com.example.firstProject.controller;

import com.example.firstProject.dto.ArticleForm;
import com.example.firstProject.entity.Article;
import com.example.firstProject.repository.ArticleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import springBoard.springBoard.domain.board.BoardDateBase;
import springBoard.springBoard.domain.board.BoardRepository;

@Controller
public class boardController
{

    private BoardRepository boardRepository;

    @GetMapping("/boardPage/mainPage")
    public String mainPage()
    {
        return "/boardPage/mainPage";
    }

    @PostMapping
    public String mainPageForm(BoardDateBase boardForm)
    {
        System.out.println(boardForm.toSpring);

        // Dto를 변환
        BoardDateBase board = boardForm.toEntity();
        System.out.println(boardForm);

        // Repository에게 Entity를 DB안에 저장
        BoardDateBase boardsave = boardRepository.save(boardForm);
        System.out.println(board);

        return "";
    }
}
