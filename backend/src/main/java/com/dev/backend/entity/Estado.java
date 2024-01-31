package com.dev.backend.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Estado")
@Data
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String sigla;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCricao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

    public Date dataImprimir(){
        return dataAtualizacao;
    }
}
