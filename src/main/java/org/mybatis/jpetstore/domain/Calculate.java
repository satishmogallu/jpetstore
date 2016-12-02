package org.mybatis.jpetstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class ItemCalculate implements Serializable {

  private String itemId;
  private String productId;
  private BigDecimal listPrice;
  private BigDecimal unitCost;
  private int supplierId;
  private String status;
  private String attribute1;
  private String attribute2;
  private String attribute3;
  private String attribute4;
  private String attribute5;
  private Product product;
  private int quantity;

  public String CalculateTotal(int quantity, BigDecimal unitCost) {
    return quantity*unitCost;
  }


}
#Comment added on date:Fri Dec  2 09:27:04 UTC 2016
#Comment added on date:Fri Dec  2 09:30:46 UTC 2016
#Comment added on date:Fri Dec  2 09:31:06 UTC 2016
#Comment added on date:Fri Dec  2 09:32:20 UTC 2016
#Comment added on date:Fri Dec  2 09:35:03 UTC 2016
