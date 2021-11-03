package springBoard.springBoard.domain.board;

import java.sql.Timestamp;

public class BoardDateBase
{
    // 게시판에 입력될 변수들
    private String boardNum;
    private String id;
    private String title;
    private String contents;
    private int readCount;
    private Timestamp writeDate;
    
    // boardDB 생성자
    public BoardDateBase(String boardNum, String id, String title, String contents, int readCount, Timestamp writeDate) {
        this.boardNum = boardNum;
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.readCount = readCount;
        this.writeDate = writeDate;
    }

    public String getBoardNum() {
        return boardNum;
    }

    public void setBoardNum(String boardNum) {
        this.boardNum = boardNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public Timestamp getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate;
    }

    @Override
    public String toString() {
        return "BoardDateBase{" +
                "boardNum='" + boardNum + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", readCount=" + readCount +
                ", writeDate=" + writeDate +
                '}';
    }
}
