package com.hitmans.api.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

@Data
@Entity
@Table(name = "hitmans")
public class HitmansModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String hitmanName;
    @Column(name = "country")
    private String hitmanContry;
    @Column(name = "age")
    private int hitmanAge;
    @Column(name = "weapon")
    private String hitmanWeapon;
    @Column(name = "excommunicado")
    private int hitmanExcommunicado;

}
