package springBoard.springBoard.domain.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity // 테이블과 링크될 클래스
@Table(name = "member")
public class Member {

    @Id // 해당 테이블의 PK 필드
    @GeneratedValue // PK의 생성 규칙 표시
    private Long id;
    
    //테이블의 칼럼을 표시 ()안에 속성 값을 지정
    @Column(length = 15, nullable = false, name = "memberId", unique = true)
    private String memberId;

    @Column(length = 18, nullable = false, name = "pw")
    private String pw;

    @Column(length = 100, nullable = false,name = "address")
    private String address;

    @Column(length = 50, nullable = false,name = "email")
    private String email;

    @Column(length = 11,nullable = false, name = "phone")
    private int phone;

    @Column(name = "signUpDate")
    private Timestamp signUpDate;

    @Builder // 해당클래스의 빌더 패턴 클래스 생성
    public Member (String memberId, String pw, String address, String email, int phone, Timestamp timestamp)
    {
        this.memberId = memberId;
        this.pw = pw;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.signUpDate = timestamp;
    }
}
