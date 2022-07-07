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
@Table(name = "refs", schema = "desc_trait_media")
public class Refs {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "refstr")
    private String refstr;
    @Column(name = "author")
    private String author;
    @Column(name = "pyear")
    private String pyear;
    @Column(name = "title")
    private String title;
    @Column(name = "journal")
    private String journal;

    /*@Column(name = "reftype")
    private String reftype;
    @Column(name = "language")
    private String language;
    @Column(name = "orignlang")
    private String orignlang;
    @Column(name = "keywords")
    private String keywords;
    @Column(name = "translator")
    private String translator;
    @Column(name = "press")
    private String press;
    @Column(name = "place")
    private String place;
    @Column(name = "issue")
    private String issue;
    @Column(name = "pagenumber")
    private String pagenumber;
    @Column(name = "wordnum")
    private String wordnum;
    @Column(name = "version")
    private String version;
    @Column(name = "refurl")
    private String refurl;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "startpage")
    private String startpage;
    @Column(name = "endpage")
    private String endpage;
    @Column(name = "volume")
    private String volume;
    @Column(name = "status")
    private Integer status;
    @Column(name = "synchdate")
    private Timestamp synchdate;
    @Column(name = "remark")
    private String remark;*/
}
