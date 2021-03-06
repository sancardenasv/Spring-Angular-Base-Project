package com.aldeamo.training.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class Contact {
	private int id;
	private String name;
	private String tel;
	private String dir;
	private String email;
	private String rol;
	
	
	/**
	 * 
	 */
	public Contact() {
		super();
	}


	/**
	 * @param id
	 * @param name
	 * @param tel
	 * @param dir
	 * @param email
	 * @param rol
	 */
	public Contact(int id, String name, String tel, String dir, String email, String rol) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.dir = dir;
		this.email = email;
		this.rol = rol;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [id=");
		builder.append(id);
		builder.append("][name=");
		builder.append(name);
		builder.append("][tel=");
		builder.append(tel);
		builder.append("][dir=");
		builder.append(dir);
		builder.append("][email=");
		builder.append(email);
		builder.append("][rol=");
		builder.append(rol);
		builder.append("]");
		return builder.toString();
	}
	
	
	/**
	 * @return the id
	 */
	// @JsonProperty(required = true)
    @ApiModelProperty(notes = "The id of the contact", required = true)
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	@ApiModelProperty(notes = "The full name of the contact", required = true)
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the tel
	 */
	@ApiModelProperty(notes = "The phone of the contact", required = true)
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the dir
	 */
	@ApiModelProperty(notes = "The physical address of the contact", required = false)
	public String getDir() {
		return dir;
	}
	/**
	 * @param dir the dir to set
	 */
	public void setDir(String dir) {
		this.dir = dir;
	}
	/**
	 * @return the email
	 */
	@ApiModelProperty(notes = "The email of the contact", required = true)
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the rol
	 */
	@ApiModelProperty(notes = "The rol of the contact", required = true)
	public String getRol() {
		return rol;
	}
	/**
	 * @param rol the rol to set
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}
	
}
