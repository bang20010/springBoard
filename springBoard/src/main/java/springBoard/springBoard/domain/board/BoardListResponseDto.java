package springBoard.springBoard.domain.board;


import springBoard.springBoard.domain.board.Board;

public class BoardListResponseDto {
        private Long id;
        private String member;
        private String title;
        private int readCount;

        public BoardListResponseDto(Board entity) {
            this.id = entity.getId();
            this.member = entity.getMember().getMemberId();
            this.title = entity.getTitle();
            this.readCount = entity.getReadCount();
        }
    }

