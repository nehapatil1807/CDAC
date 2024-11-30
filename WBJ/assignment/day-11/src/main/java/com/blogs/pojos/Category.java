package com.blogs.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true, exclude = "blogPosts")
public class Category extends BaseEntity {
	@Column(name = "category_name", unique = true, length = 30)
	private String categoryName;
	private String description;
	private List<BlogPost> blogPosts = new ArrayList<>();

	public Category(String categoryName, String description) {
		super();
		this.categoryName = categoryName;
		this.description = description;
	}

}
