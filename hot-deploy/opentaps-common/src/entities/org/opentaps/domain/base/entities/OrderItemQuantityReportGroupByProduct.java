package org.opentaps.domain.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity OrderItemQuantityReportGroupByProduct.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectOrderItemQuantityReportGroupByProducts", query="SELECT OH.ORDER_TYPE_ID AS \"orderTypeId\",OH.STATUS_ID AS \"statusId\",OH.ORDER_DATE AS \"orderDate\",OI.STATUS_ID AS \"statusId\",OI.PRODUCT_ID AS \"productId\",II.ISSUED_DATE_TIME AS \"issuedDateTime\",OI.QUANTITY_ORDERED AS \"quantityOrdered\",II.QUANTITY AS \"quantity\",OI.QUANTITY_OPEN AS \"quantityOpen\" FROM ORDER_HEADER OH INNER JOIN ORDER_ITEM OI ON OI.ORDER_ID = OH.ORDER_ID LEFT JOIN ITEM_ISSUANCE II ON OI.ORDER_ID = II.ORDER_ID AND OI.ORDER_ITEM_SEQ_ID = II.ORDER_ITEM_SEQ_ID", resultSetMapping="OrderItemQuantityReportGroupByProductMapping")
@SqlResultSetMapping(name="OrderItemQuantityReportGroupByProductMapping", entities={
@EntityResult(entityClass=OrderItemQuantityReportGroupByProduct.class, fields = {
@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="orderStatusId", column="orderStatusId")
,@FieldResult(name="orderDate", column="orderDate")
,@FieldResult(name="orderItemStatusId", column="orderItemStatusId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="issuedDateTime", column="issuedDateTime")
,@FieldResult(name="quantityOrdered", column="quantityOrdered")
,@FieldResult(name="quantityIssued", column="quantityIssued")
,@FieldResult(name="quantityOpen", column="quantityOpen")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class OrderItemQuantityReportGroupByProduct extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("orderStatusId", "OH.STATUS_ID");
        fields.put("orderDate", "OH.ORDER_DATE");
        fields.put("orderItemStatusId", "OI.STATUS_ID");
        fields.put("productId", "OI.PRODUCT_ID");
        fields.put("issuedDateTime", "II.ISSUED_DATE_TIME");
        fields.put("quantityOrdered", "OI.QUANTITY_ORDERED");
        fields.put("quantityIssued", "II.QUANTITY");
        fields.put("quantityOpen", "OI.QUANTITY_OPEN");
fieldMapColumns.put("OrderItemQuantityReportGroupByProduct", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderItemQuantityReportGroupByProduct> {
    orderTypeId("orderTypeId"),
    orderStatusId("orderStatusId"),
    orderDate("orderDate"),
    orderItemStatusId("orderItemStatusId"),
    productId("productId"),
    issuedDateTime("issuedDateTime"),
    quantityOrdered("quantityOrdered"),
    quantityIssued("quantityIssued"),
    quantityOpen("quantityOpen");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String orderTypeId;
    
   private String orderStatusId;
    
   private Timestamp orderDate;
    
   private String orderItemStatusId;
    
   private String productId;
    
   private Timestamp issuedDateTime;
    
   private BigDecimal quantityOrdered;
    
   private BigDecimal quantityIssued;
    
   private BigDecimal quantityOpen;

  /**
   * Default constructor.
   */
  public OrderItemQuantityReportGroupByProduct() {
      super();
      this.baseEntityName = "OrderItemQuantityReportGroupByProduct";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("orderStatusId");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("orderItemStatusId");this.allFieldsNames.add("productId");this.allFieldsNames.add("issuedDateTime");this.allFieldsNames.add("quantityOrdered");this.allFieldsNames.add("quantityIssued");this.allFieldsNames.add("quantityOpen");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderItemQuantityReportGroupByProduct(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param orderTypeId the orderTypeId to set
     */
    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    /**
     * Auto generated value setter.
     * @param orderStatusId the orderStatusId to set
     */
    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
    /**
     * Auto generated value setter.
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
    /**
     * Auto generated value setter.
     * @param orderItemStatusId the orderItemStatusId to set
     */
    public void setOrderItemStatusId(String orderItemStatusId) {
        this.orderItemStatusId = orderItemStatusId;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param issuedDateTime the issuedDateTime to set
     */
    public void setIssuedDateTime(Timestamp issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
    }
    /**
     * Auto generated value setter.
     * @param quantityOrdered the quantityOrdered to set
     */
    public void setQuantityOrdered(BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }
    /**
     * Auto generated value setter.
     * @param quantityIssued the quantityIssued to set
     */
    public void setQuantityIssued(BigDecimal quantityIssued) {
        this.quantityIssued = quantityIssued;
    }
    /**
     * Auto generated value setter.
     * @param quantityOpen the quantityOpen to set
     */
    public void setQuantityOpen(BigDecimal quantityOpen) {
        this.quantityOpen = quantityOpen;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderTypeId() {
        return this.orderTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderStatusId() {
        return this.orderStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOrderDate() {
        return this.orderDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemStatusId() {
        return this.orderItemStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getIssuedDateTime() {
        return this.issuedDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityOrdered() {
        return this.quantityOrdered;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityIssued() {
        return this.quantityIssued;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityOpen() {
        return this.quantityOpen;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setOrderStatusId((String) mapValue.get("orderStatusId"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setOrderItemStatusId((String) mapValue.get("orderItemStatusId"));
        setProductId((String) mapValue.get("productId"));
        setIssuedDateTime((Timestamp) mapValue.get("issuedDateTime"));
        setQuantityOrdered(convertToBigDecimal(mapValue.get("quantityOrdered")));
        setQuantityIssued(convertToBigDecimal(mapValue.get("quantityIssued")));
        setQuantityOpen(convertToBigDecimal(mapValue.get("quantityOpen")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("orderStatusId", getOrderStatusId());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("orderItemStatusId", getOrderItemStatusId());
        mapValue.put("productId", getProductId());
        mapValue.put("issuedDateTime", getIssuedDateTime());
        mapValue.put("quantityOrdered", getQuantityOrdered());
        mapValue.put("quantityIssued", getQuantityIssued());
        mapValue.put("quantityOpen", getQuantityOpen());
        return mapValue;
    }


}