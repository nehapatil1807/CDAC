package com.blogs.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(of="title", callSuper=false)
public class BlogPost extends BaseEntity {
	@Column(unique = true, length = 100)
	private String title;
	private String description;
	@Column(length = 1000)
	private String content;
	//BlogPost * -----> 1 Catgeory
	//BlogPost - many , child , owning side
	//(=the side containing physical mapping of the association : FK)
	@ManyToOne //mandatory , o.w MappingException
	@JoinColumn(name = "category_id",nullable=false)//to customize name of FK column 
	//+ added not null constraint
	private Category blogCategory;
	//BlogPost * ---> 1 User(Blogger)
	@ManyToOne//mandatory , o.w MappingException
	//w/o adding @JoinColumn - blogger_id
	private User blogger;
	public BlogPost(String title, String description, String content) {
		super();
		this.title = title;
		this.description = description;
		this.content = content;
	}	
}
