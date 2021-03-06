package jbr.hibernate.annotation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", nullable = false, unique = true, length = 11)
  private int id;

  @Column(name = "USERNAME", nullable = false, length = 45)
  private String username;

  @Column(name = "PASSWORD", nullable = false, length = 45)
  private String password;

  @Column(name = "FIRSTNAME", nullable = false, length = 45)
  private String firstname;

  @Column(name = "LASTNAME", nullable = true, length = 45)
  private String lastname;

  @Column(name = "ADDRESS", nullable = true, length = 45)
  private String address;

  @Column(name = "PHONE", nullable = true, length = 15)
  private long phone;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public long getPhone() {
    return phone;
  }

  public void setPhone(long phone) {
    this.phone = phone;
  }

}
