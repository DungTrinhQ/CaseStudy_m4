package com.codegym.casestudy.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String keyWord;

//    @ManyToMany(cascade = CascadeType.ALL)
////    @JoinTable(name = "blog_tag")
//    private List<Blog> blogs;
}
