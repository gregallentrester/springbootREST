package com.mkyong;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Book {

  // avoids "No default constructor for entity"
  public Book() { }

  public Book(Long idVal, String nameVal, String authorVal, BigDecimal priceVal) {
    id = idVal;
    name = nameVal;
    author = authorVal;
    price = priceVal;
  }

  public Book(String nameVal, String authorVal, BigDecimal priceVal) {
    name = nameVal;
    author = authorVal;
    price = priceVal;
  }

  @Id
  @GeneratedValue
  private Long id;
  public Long getId() { return id; }
  public void setId(Long value) { id = value; }

  private String name;
  public String getName() { return name; }
  public void setName(String value) { name = value; }

  private String author;
  public String getAuthor() { return author; }
  public void setAuthor(String value) { author = value; }

  private BigDecimal price;
  public BigDecimal getPrice() { return price; }
  public void setPrice(BigDecimal value) { price = price; }

  @Override
  public String toString() {
    return
      "Book{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", author='" + author + '\'' +
      ", price=" + price +
      '}';
  }
}
