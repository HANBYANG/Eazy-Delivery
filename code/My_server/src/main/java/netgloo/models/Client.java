package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * An entity Client 
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "clients")
public class Client {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An autogenerated id (unique for each Client in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
   
  //The Client's status
  @NotNull
  private short status;
  
  //The Client's info
  @NotNull
  private String info;
  
  //The Client's phone
  @NotNull
  private String phone;
 
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  public Client() { }

  public Client(long id) { 
    this.id = id;
  }
  
  public Client(short status,String info,String phone) {
    this.status = status;
    this.info=info;
    this.phone=phone;
  }

  // Getter and setter methods

  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  

  public long getStatus() {
    return status;
  }

  public void setStatus(short value) {
    this.status = value;
  }
	
  public String getInfo() {
	    return info;
  }

  public void setInfo(String value) {
	    this.info = value;
  }
  
  public String getPhone() {
	    return phone;
}

public void setPhone(String value) {
	    this.phone = value;
}
} // class Client

