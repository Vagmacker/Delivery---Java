package code.delivery.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by joao on 29/08/16.
 */
@Entity
@Table(name = "produtos")
public class Produtos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToMany
    @JoinColumn(name = "id", table = "categorias")
    private Long categoria_id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

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

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public Long getCategoria_id() {

        return categoria_id;
    }

    public void setCategoria_id(Long categoria_id) {

        this.categoria_id = categoria_id;
    }


}
