package springBoard.springBoard.domain.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue
    private Long id;

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

    @Builder
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
