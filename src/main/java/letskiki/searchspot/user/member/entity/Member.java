package letskiki.searchspot.user.member.entity;

import jakarta.persistence.*;
import letskiki.searchspot.global.entity.BaseTimeEntity;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@Builder
@Entity
@Table(name = "MEMBER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Comment("회원 테이블")
public class Member extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false, updatable = false, columnDefinition = "bigint unsigned")
    @Comment("회원 IDX")
    private Long memberId;

    @Column(name = "id", length = 50, nullable = false, unique = true)
    @Comment("아이디 (이메일)")
    private String id;

    @Column(name = "password", length = 60, nullable = false, columnDefinition = "char(60)")
    @Comment("비밀번호")
    private String password;

    @Column(name = "phone", length = 11, nullable = false)
    @Comment("휴대폰번호")
    private String phone;

    @Column(name = "sns_yn", length = 1, nullable = false, columnDefinition = "char(1)")
    @Comment("SNS 수신여부")
    private String snsYn;

    @Column(name = "privacy_yn", length = 1, nullable = false, columnDefinition = "char(1)")
    @Comment("개인정보 제공여부")
    private String privacyYn;

    @Column(name = "status", length = 1, nullable = false, columnDefinition = "char(1)")
    @Comment("상태 (1: 활성, 2: 탈퇴)")
    private String status;

    @Column(name = "role", length = 1, nullable = false, columnDefinition = "char(1)")
    @Comment("등급 (1: 일반회원)")
    private String role;
}
