package org.big.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "descriptiontype", schema = "desc_trait_media")
public class Descriptiontype {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "descterm")
    private String descterm;
    @Column(name = "dtorder")
    private Integer dtorder;
    @Column(name = "meaning")
    private String meaning;
    @Column(name = "pid")
    private String pid;
}
