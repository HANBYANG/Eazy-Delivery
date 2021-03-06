package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * An entity Comment 
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "Comments")
public class Comment {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An autogenerated id (unique for each Comment in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
   
  //The Comment's status
  @NotNull
  private short status;
  
//The Comment's info
  @NotNull
  private String info;
  
//The Comment's time
  @NotNull
  private String time;
  
//The Comment's name
  @NotNull
  private String name;
  
  
//The Comment's shopId
  @NotNull
  private long shopId;
  
//The Comment's clientId
  @NotNull
  private long clientId;
 
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  public Comment() { }

  public Comment(long id) { 
    this.id = id;
  }
  
  public Comment(short status,String info,String time,String name,long shopId,long clientId) {
    this.status = status;
    this.info=info;
    this.time=time;
    this.shopId=shopId;
    this.clientId=clientId;
    this.name=name;
    
  }

  // Getter and setter methods

  
  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  

  public short getStatus() {
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
	  
   public String getTime() {
		    return time;
		  }

	public void setTime(String value) {
		    this.time = value;
		  }
	
	
	  
 public String getName() {
		    return name;		  }

	public void setName(String value) {
		    this.name = value;
		  }
	  
    public long getShopId() {
		    return shopId;
		  }

    public void setShopId(long value) {
		    this.shopId = value;
		  }
    
    
    public long getClientId() {
        return clientId;
      }

      public void setClientId(long value) {
        this.clientId = value;
      }

 
	
	  
} // class Comment


