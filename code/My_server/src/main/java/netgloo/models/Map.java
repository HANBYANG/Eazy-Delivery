package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * An entity Map 
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "maps")
public class Map {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An autogenerated id (unique for each Map in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  // The Map's client
  @NotNull
  private long clientId;
  
  // The Map's shop
  @NotNull
  private long shopId;
  
  // The Map's user
  @NotNull
  private long userId;
  
  //The Map's longitude
  @NotNull
  private double longitude;

  //The Map's latitude
  @NotNull
  private double latitude;
  
  //The Map's status
  @NotNull
  private short status;
 
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  public Map() { }

  public Map(long id) { 
    this.id = id;
  }
  
  public Map(long clientId, long shopId,long userId,double longitude,double latitude,short status) {
    this.clientId= clientId;
    this.shopId = shopId;
    this.userId=userId;
    this.longitude = longitude;
    this.latitude = latitude;
    this.status = status;
  }

  // Getter and setter methods

  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  public long getClient() {
    return clientId;
  }
  
  public void setClient(long value) {
    this.clientId = value;
  }
  
  public long getShop() {
    return shopId;
  }

  public void setShop(long value) {
    this.shopId = value;
  }
  
  public long getUser() {
	    return userId;
	  }

  public void setUser(long value) {
	    this.userId = value;
	  }
  public double getLongitude() {
	    return longitude;
  }

  public void setLongitude(double value) {
	    this.longitude = value;
  }
  
  public double getLatitude() {
	    return latitude;
  }

  public void setLatitude(double value) {
	    this.latitude = value;
  }

  public long getStatus() {
    return status;
  }

  public void setStatus(short value) {
    this.status = value;
  }
	  
} // class Map

