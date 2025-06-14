package model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(
        name = "getAllTasks",
        query = "SELECT m FROM task AS m ORDER BY m.id DESC"
    )
})
@Table(name = "tasks")
public class Task {
    //idカラムを設定（プライマリーキー）
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //作成日時カラムを設定
    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    //更新日時カラムを設定
    @Column(name = "updated_at", nullable = false)
    private Timestamp updated_at;

    //内容カラムを設定
    @Column(name = "content", length = 255, nullable = false)
    private String content;

    //getter,setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
