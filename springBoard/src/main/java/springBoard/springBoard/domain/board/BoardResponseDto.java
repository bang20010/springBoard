package springBoard.springBoard.domain.board;

import lombok.Getter;
import springBoard.springBoard.domain.board.Board;

import java.sql.Timestamp;
@Getter
public class BoardResponseDto
{
    private Long id;
    private Board boardNum;
    private String member;
    private String title;
    private String content;
    private int readcount;
    private Timestamp writedate;

    public BoardResponseDto(Board entity) {
        this.id = entity.getId();
        this.boardNum = entity.getBoardNum();
        this.member = entity.getMember().getMemberId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.readcount = entity.getReadCount();
        this.writedate = entity.getWriteDate();
    }
}
