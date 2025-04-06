package com.poweroutine.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
@Table(name = "ejercice", schema = "power_routine")
public class Ejercice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;
    @Column(name = "descripcion", length = Integer.MAX_VALUE)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_muscle")
    private Muscle muscle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_body")
    private Body body;

}