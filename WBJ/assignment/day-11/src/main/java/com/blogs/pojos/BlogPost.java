package com.blogs.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "posts")
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true,exclude = {"blogCategory"})
public class BlogPost extends BaseEntity {
	@Column(unique = true, length = 100)
	private String title;
	private String description;
	@Column(length = 1000)
	private String content;
	private Category blogCategory;
	public BlogPost(String title, String description, String content) {
		super();
		this.title = title;
		this.description = description;
		this.content = content;
	}	
}
