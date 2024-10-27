package letskiki.searchspot.global.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

@MappedSuperclass
public class BaseEntity extends BaseTimeEntity{

    @CreatedBy
    @Column(name = "created_by", nullable = false, updatable = false, columnDefinition = "bigint unsigned")
    @Comment("최근 수정자")
    private Long createdBy;

    @LastModifiedBy
    @Column(name = "last_modified_by", nullable = true, columnDefinition = "bigint unsigned")
    @Comment("생성자")
    private Long lastModifiedBy;
}
