package test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="jubsok_jum")
public class jubsokJum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gongsa;
    private String cableName;
    private String jubsok;
    private String gugan;
    private String sigong;
    private String sangwiguk;
    private String hawiguk;
    private String sulchi;
    private String gamri;
    private String gwanri;
    private String core1;
    private String core2;
    private String core3;
    private String core4;
    private String core5;
    private String core6;
    private String core7;
    private String core8;

}