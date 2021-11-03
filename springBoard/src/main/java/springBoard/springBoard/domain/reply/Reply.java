package springBoard.springBoard.domain.reply;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springBoard.springBoard.domain.board.Board;
import springBoard.springBoard.domain.member.Member;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "reply")
public class Reply {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, name = "replyNum")
    private Reply reply;


    @Column(length = 200,nullable = false,columnDefinition = "TEXT", name = "replyContnet")
    private String replyContnet;


    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Member.class)
    @Column(length = 15, nullable = false, name = "memberId")
    private Member member;


    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Board.class)
    @Column(length = 15, nullable = false, name = "memberId")
    private Board boardNum;

    @Column
    private Timestamp replyDate;

    @Builder
    public Reply(Reply reply, String replyContnet, Member memerId, Board boardNum, Timestamp replyDate )
    {
        this.reply = reply;
        this.replyContnet = replyContnet;
        this.member = memerId;
        this.boardNum = boardNum;
        this.replyDate = replyDate;
    }
}


