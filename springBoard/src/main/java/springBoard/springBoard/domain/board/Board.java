package springBoard.springBoard.domain.board;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springBoard.springBoard.domain.member.Member;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "board")
public class Board
{

    @Id
   @GeneratedValue
   private Long id;

    @Column(name = "boardNum", unique = true)
    private Board boardNum;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Member.class)
    @Column(length = 15, nullable = false, name = "memberId")
    private Member member;

    @Column(length = 50, nullable = false,name = "title")
    private String title;

    @Column(length = 500,nullable = false,columnDefinition = "TEXT", name = "contnet")
    private String content;

    @Column(name = "readCount")
    private int readCont;

    @Column
    private Timestamp writeDate;

    @Builder
    public Board(Member member, Board boardNum , String title, String content, int readCont, Timestamp writeDate)
    {
        this.member = member;
        this.boardNum = boardNum;
        this.readCont = readCont;
        this.title = title;
        this.content = content;
        this.writeDate = writeDate;

    }
}
