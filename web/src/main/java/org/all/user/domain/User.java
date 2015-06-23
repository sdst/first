package org.all.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name=("t_user"),catalog="test")
public class User {

	@Id
	@GeneratedValue(generator = "system-uuid")  
    @GenericGenerator(name = "system-uuid", strategy = "uuid") 
    @Column(name="u_id",length=32)
	private String uId;
	
	@Column(name="u_username",length=32)
	private String uUsername;//用户名
	
	@Column(name="u_password",length=32)
	private String uPassword;//密码
	
	@Column(name="u_name",length=10)
	private String uName;//姓名
	
	@Column(name="u_phone",length=11)
	private String uPhone;//手机号
	
	@Column(name="u_mail",length=30)
	private String uMail;//邮箱
	
	@Column(name="u_age")
	private Integer uAge;//年龄
	
	@Column(name="u_hobbies",length=50)
	private String uHobbies;//爱好
	
	@Column(name="u_photo",length=80)
	private String uPhoto;//大头照

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getuUsername() {
		return uUsername;
	}

	public void setuUsername(String uUsername) {
		this.uUsername = uUsername;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}

	public String getuMail() {
		return uMail;
	}

	public void setuMail(String uMail) {
		this.uMail = uMail;
	}

	public Integer getuAge() {
		return uAge;
	}

	public void setuAge(Integer uAge) {
		this.uAge = uAge;
	}

	public String getuHobbies() {
		return uHobbies;
	}

	public void setuHobbies(String uHobbies) {
		this.uHobbies = uHobbies;
	}

	public String getuPhoto() {
		return uPhoto;
	}

	public void setuPhoto(String uPhoto) {
		this.uPhoto = uPhoto;
	}
	
}











