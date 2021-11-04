package springBoard.springBoard.domain.board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springBoard.springBoard.domain.member.Member;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor
public class BoardUpdateRequestDto
{
 /*   private Board boardNum;
    private Member member;*/
    private String title;
    private String content;
    private int readcont;
    private Timestamp writeDate;

    @Builder
    public BoardUpdateRequestDto(String title, String content, int readcont, Timestamp writeDate)
    {
        this.title = title;
        this.content = content;
        this.readcont = readcont;
        this.writeDate = writeDate;
    }
}
