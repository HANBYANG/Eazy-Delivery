package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * An entity Item
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "items")
public class Item {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An autogenerated id (unique for each Item in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  // The Item's name
  @NotNull
  private String name;
  
  // The Item's status
  @NotNull
  private short status;
  
  // The Item's price
  @NotNull
  private String price;
  
  //The Item's shopId
  @NotNull
  private long shopId;
  
  
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  public Item() { }

  public Item(long id) { 
    this.id = id;
  }
  
  public Item(String name, short status,String price,long shopId){
    this.name = name;
    this.status = status;
    this.shopId = shopId;
    this.price = price;
  }

  // Getter and setter methods

  public long getId(){
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  public String getPrice() {
    return price;
  }
  
  public void setPrice(String value) {
    this.price = value;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }
  
  public long getShopId() {
	    return shopId;
	  }

  public void setShopId(long value) {
	    this.shopId = value;
	  }

  
  public String getStatus() {
	    return name;
  }

  public void setStatus(short value) {
	    this.status = value;
  }
	  
  
} // class Item
