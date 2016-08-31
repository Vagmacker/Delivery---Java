package code.delivery.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by joao on 29/08/16.
 */
@Entity
@Table(name = "categorias")
public class Categorias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
