package com.example.clientesAPI.models.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Getter@Setter
@ToString
@RequiredArgsConstructor
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column
    private String decricao;

    @ManyToOne
    @JoinColumn(name = "id_clientes")
    private Cliente cliente;

    @Column
    private BigDecimal valor;



    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Servico servico = (Servico) o;
        return id != null && Objects.equals(id, servico.id);
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
