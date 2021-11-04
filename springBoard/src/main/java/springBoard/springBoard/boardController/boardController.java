package springBoard.springBoard.boardController;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springBoard.springBoard.domain.board.BoardCreateRequestDto;
import springBoard.springBoard.domain.board.BoardRepository;
import springBoard.springBoard.domain.board.BoardService;
import springBoard.springBoard.domain.board.BoardUpdateRequestDto;

@RequiredArgsConstructor
@RestController
public class BoardController
{
    public BoardRepository boardRepository;

    private final BoardService boardService;

/*
    @GetMapping("/boardPage/mainPage")
    public String mainPage()
    {
        return "/boardPage/mainPage";
    }
*/

    // board테이블 전체조회(목록)
    @PostMapping("/board")
    public Long Create(@RequestBody BoardCreateRequestDto requestDto)
    {
        return boardService.create(requestDto);

    }

    // board테이블 개별조회
    @PutMapping("/board/{id}")
    public Long update(@PathVariable Long id, @RequestBody BoardUpdateRequestDto requestDto) {
        return boardService.update(id, requestDto);
    }

    @DeleteMapping("/board/{id}")
    public void delete(@PathVariable Long id)
    {
        boardService.delete(id);
    }
}
