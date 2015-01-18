/**
 * 
 */
package com.sumitbisht.web.model;

/**
 * User model for the website
 * @author sumit
 *
 */
public class User {
	
	private String name;
	private Integer age;
	private String sex;
	
	@Override
	public String toString(){
		return name+", "+age+", "+sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
