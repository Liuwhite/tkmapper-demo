package com.white.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Column(name = "cid")
    private Integer cid;
    @Column(name = "Category_name")
    private String CategoryName;
    @Column(name = "category_level")
    private Integer categoryLevel;
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "category_icon")
    private String categoryIcon;
    @Column(name = "category_slogan")
    private String categorySlogan;
    @Column(name = "category_pic")
    private String categoryPic;
    @Column(name = "category_bg_color")
    private String categoryBgColor;

}
