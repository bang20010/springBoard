package springBoard.springBoard.domain.board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springBoard.springBoard.domain.board.Board;
import springBoard.springBoard.domain.member.Member;

import java.sql.Timestamp;
@Getter
@NoArgsConstructor
public class BoardCreateRequestDto
    {
        private Board boardNum;
        private Member member;
        private String title;
        private String content;
        private int readCount;
        private Timestamp writeDate;

        @Builder
        public BoardCreateRequestDto(Board boardNum, Member member, String title, String content, int readCount, Timestamp writeDate)
        {
            this.boardNum = boardNum;
            this.member = member;
            this.title = title;
            this.content = content;
            this.readCount = readCount;
            this.writeDate = writeDate;
        }

        public Board toEntity()
        {
            return Board.builder()
                    .boardNum(boardNum)
                    .member(member)
                    .title(title)
                    .content(content)
                    .readCount(readCount)
                    .writeDate(writeDate)
                    .build();
        }
    }

