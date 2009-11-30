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
 * Auto generated base entity ReturnItem.
 */
@javax.persistence.Entity
@Table(name="RETURN_ITEM")
public class ReturnItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("returnId", "RETURN_ID");
        fields.put("returnItemSeqId", "RETURN_ITEM_SEQ_ID");
        fields.put("returnReasonId", "RETURN_REASON_ID");
        fields.put("returnTypeId", "RETURN_TYPE_ID");
        fields.put("returnItemTypeId", "RETURN_ITEM_TYPE_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("statusId", "STATUS_ID");
        fields.put("expectedItemStatus", "EXPECTED_ITEM_STATUS");
        fields.put("returnQuantity", "RETURN_QUANTITY");
        fields.put("receivedQuantity", "RECEIVED_QUANTITY");
        fields.put("returnPrice", "RETURN_PRICE");
        fields.put("returnItemResponseId", "RETURN_ITEM_RESPONSE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ReturnItem", fields);
}
  public static enum Fields implements EntityFieldInterface<ReturnItem> {
    returnId("returnId"),
    returnItemSeqId("returnItemSeqId"),
    returnReasonId("returnReasonId"),
    returnTypeId("returnTypeId"),
    returnItemTypeId("returnItemTypeId"),
    productId("productId"),
    description("description"),
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    statusId("statusId"),
    expectedItemStatus("expectedItemStatus"),
    returnQuantity("returnQuantity"),
    receivedQuantity("receivedQuantity"),
    returnPrice("returnPrice"),
    returnItemResponseId("returnItemResponseId"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.ReturnItemPkBridge.class)
     private ReturnItemPk id = new ReturnItemPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ReturnItemPk</code>
     */
      public ReturnItemPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ReturnItemPk</code> value to set
    */   
      public void setId(ReturnItemPk id) {
         this.id = id;
      }
   @Column(name="RETURN_REASON_ID")
   private String returnReasonId;
   @Column(name="RETURN_TYPE_ID")
   private String returnTypeId;
   @Column(name="RETURN_ITEM_TYPE_ID")
   private String returnItemTypeId;
   @Column(name="PRODUCT_ID")
   private String productId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="ORDER_ID")
   private String orderId;
   @Column(name="ORDER_ITEM_SEQ_ID")
   private String orderItemSeqId;
   @Column(name="STATUS_ID")
   private String statusId;
   @Column(name="EXPECTED_ITEM_STATUS")
   private String expectedItemStatus;
   @Column(name="RETURN_QUANTITY")
   private BigDecimal returnQuantity;
   @Column(name="RECEIVED_QUANTITY")
   private BigDecimal receivedQuantity;
   @Column(name="RETURN_PRICE")
   private BigDecimal returnPrice;
   @Column(name="RETURN_ITEM_RESPONSE_ID")
   private String returnItemResponseId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ReturnHeader returnHeader = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_REASON_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ReturnReason returnReason = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ReturnType returnType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ReturnItemType returnItemType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_ITEM_RESPONSE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ReturnItemResponse returnItemResponse = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;
   private transient OrderItem orderItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EXPECTED_ITEM_STATUS", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem inventoryStatusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   private transient List<OrderItemShipGrpInvRes> orderItemShipGrpInvReses = null;
   private transient List<ReturnAdjustment> returnAdjustments = null;
   private transient List<ReturnItemBilling> returnItemBillings = null;
   private transient List<ReturnItemShipment> returnItemShipments = null;
   private transient List<ReturnStatus> returnStatuses = null;
   private transient List<ShipmentReceipt> shipmentReceipts = null;

  /**
   * Default constructor.
   */
  public ReturnItem() {
      super();
      this.baseEntityName = "ReturnItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("returnId");this.primaryKeyNames.add("returnItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("returnId");this.allFieldsNames.add("returnItemSeqId");this.allFieldsNames.add("returnReasonId");this.allFieldsNames.add("returnTypeId");this.allFieldsNames.add("returnItemTypeId");this.allFieldsNames.add("productId");this.allFieldsNames.add("description");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("expectedItemStatus");this.allFieldsNames.add("returnQuantity");this.allFieldsNames.add("receivedQuantity");this.allFieldsNames.add("returnPrice");this.allFieldsNames.add("returnItemResponseId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ReturnItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        id.setReturnId(returnId);
    }
    /**
     * Auto generated value setter.
     * @param returnItemSeqId the returnItemSeqId to set
     */
    public void setReturnItemSeqId(String returnItemSeqId) {
        id.setReturnItemSeqId(returnItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param returnReasonId the returnReasonId to set
     */
    public void setReturnReasonId(String returnReasonId) {
        this.returnReasonId = returnReasonId;
    }
    /**
     * Auto generated value setter.
     * @param returnTypeId the returnTypeId to set
     */
    public void setReturnTypeId(String returnTypeId) {
        this.returnTypeId = returnTypeId;
    }
    /**
     * Auto generated value setter.
     * @param returnItemTypeId the returnItemTypeId to set
     */
    public void setReturnItemTypeId(String returnItemTypeId) {
        this.returnItemTypeId = returnItemTypeId;
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
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param expectedItemStatus the expectedItemStatus to set
     */
    public void setExpectedItemStatus(String expectedItemStatus) {
        this.expectedItemStatus = expectedItemStatus;
    }
    /**
     * Auto generated value setter.
     * @param returnQuantity the returnQuantity to set
     */
    public void setReturnQuantity(BigDecimal returnQuantity) {
        this.returnQuantity = returnQuantity;
    }
    /**
     * Auto generated value setter.
     * @param receivedQuantity the receivedQuantity to set
     */
    public void setReceivedQuantity(BigDecimal receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }
    /**
     * Auto generated value setter.
     * @param returnPrice the returnPrice to set
     */
    public void setReturnPrice(BigDecimal returnPrice) {
        this.returnPrice = returnPrice;
    }
    /**
     * Auto generated value setter.
     * @param returnItemResponseId the returnItemResponseId to set
     */
    public void setReturnItemResponseId(String returnItemResponseId) {
        this.returnItemResponseId = returnItemResponseId;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnId() {
        return this.id.getReturnId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnItemSeqId() {
        return this.id.getReturnItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnReasonId() {
        return this.returnReasonId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnTypeId() {
        return this.returnTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnItemTypeId() {
        return this.returnItemTypeId;
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
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExpectedItemStatus() {
        return this.expectedItemStatus;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReturnQuantity() {
        return this.returnQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReceivedQuantity() {
        return this.receivedQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReturnPrice() {
        return this.returnPrice;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnItemResponseId() {
        return this.returnItemResponseId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>ReturnHeader</code> by the relation named <code>ReturnHeader</code>.
     * @return the <code>ReturnHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnHeader getReturnHeader() throws RepositoryException {
        if (this.returnHeader == null) {
            this.returnHeader = getRelatedOne(ReturnHeader.class, "ReturnHeader");
        }
        return this.returnHeader;
    }
    /**
     * Auto generated method that gets the related <code>ReturnReason</code> by the relation named <code>ReturnReason</code>.
     * @return the <code>ReturnReason</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnReason getReturnReason() throws RepositoryException {
        if (this.returnReason == null) {
            this.returnReason = getRelatedOne(ReturnReason.class, "ReturnReason");
        }
        return this.returnReason;
    }
    /**
     * Auto generated method that gets the related <code>ReturnType</code> by the relation named <code>ReturnType</code>.
     * @return the <code>ReturnType</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnType getReturnType() throws RepositoryException {
        if (this.returnType == null) {
            this.returnType = getRelatedOne(ReturnType.class, "ReturnType");
        }
        return this.returnType;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemType</code> by the relation named <code>ReturnItemType</code>.
     * @return the <code>ReturnItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnItemType getReturnItemType() throws RepositoryException {
        if (this.returnItemType == null) {
            this.returnItemType = getRelatedOne(ReturnItemType.class, "ReturnItemType");
        }
        return this.returnItemType;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemResponse</code> by the relation named <code>ReturnItemResponse</code>.
     * @return the <code>ReturnItemResponse</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnItemResponse getReturnItemResponse() throws RepositoryException {
        if (this.returnItemResponse == null) {
            this.returnItemResponse = getRelatedOne(ReturnItemResponse.class, "ReturnItemResponse");
        }
        return this.returnItemResponse;
    }
    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>OrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getOrderHeader() throws RepositoryException {
        if (this.orderHeader == null) {
            this.orderHeader = getRelatedOne(OrderHeader.class, "OrderHeader");
        }
        return this.orderHeader;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getOrderItem() throws RepositoryException {
        if (this.orderItem == null) {
            this.orderItem = getRelatedOne(OrderItem.class, "OrderItem");
        }
        return this.orderItem;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>InventoryStatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getInventoryStatusItem() throws RepositoryException {
        if (this.inventoryStatusItem == null) {
            this.inventoryStatusItem = getRelatedOne(StatusItem.class, "InventoryStatusItem");
        }
        return this.inventoryStatusItem;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemShipGrpInvRes</code> by the relation named <code>OrderItemShipGrpInvRes</code>.
     * @return the list of <code>OrderItemShipGrpInvRes</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemShipGrpInvRes> getOrderItemShipGrpInvReses() throws RepositoryException {
        if (this.orderItemShipGrpInvReses == null) {
            this.orderItemShipGrpInvReses = getRelated(OrderItemShipGrpInvRes.class, "OrderItemShipGrpInvRes");
        }
        return this.orderItemShipGrpInvReses;
    }
    /**
     * Auto generated method that gets the related <code>ReturnAdjustment</code> by the relation named <code>ReturnAdjustment</code>.
     * @return the list of <code>ReturnAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnAdjustment> getReturnAdjustments() throws RepositoryException {
        if (this.returnAdjustments == null) {
            this.returnAdjustments = getRelated(ReturnAdjustment.class, "ReturnAdjustment");
        }
        return this.returnAdjustments;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemBilling</code> by the relation named <code>ReturnItemBilling</code>.
     * @return the list of <code>ReturnItemBilling</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItemBilling> getReturnItemBillings() throws RepositoryException {
        if (this.returnItemBillings == null) {
            this.returnItemBillings = getRelated(ReturnItemBilling.class, "ReturnItemBilling");
        }
        return this.returnItemBillings;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemShipment</code> by the relation named <code>ReturnItemShipment</code>.
     * @return the list of <code>ReturnItemShipment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItemShipment> getReturnItemShipments() throws RepositoryException {
        if (this.returnItemShipments == null) {
            this.returnItemShipments = getRelated(ReturnItemShipment.class, "ReturnItemShipment");
        }
        return this.returnItemShipments;
    }
    /**
     * Auto generated method that gets the related <code>ReturnStatus</code> by the relation named <code>ReturnStatus</code>.
     * @return the list of <code>ReturnStatus</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnStatus> getReturnStatuses() throws RepositoryException {
        if (this.returnStatuses == null) {
            this.returnStatuses = getRelated(ReturnStatus.class, "ReturnStatus");
        }
        return this.returnStatuses;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentReceipt</code> by the relation named <code>ShipmentReceipt</code>.
     * @return the list of <code>ShipmentReceipt</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShipmentReceipt> getShipmentReceipts() throws RepositoryException {
        if (this.shipmentReceipts == null) {
            this.shipmentReceipts = getRelated(ShipmentReceipt.class, "ShipmentReceipt");
        }
        return this.shipmentReceipts;
    }

    /**
     * Auto generated value setter.
     * @param returnHeader the returnHeader to set
    */
    public void setReturnHeader(ReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
    }
    /**
     * Auto generated value setter.
     * @param returnReason the returnReason to set
    */
    public void setReturnReason(ReturnReason returnReason) {
        this.returnReason = returnReason;
    }
    /**
     * Auto generated value setter.
     * @param returnType the returnType to set
    */
    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }
    /**
     * Auto generated value setter.
     * @param returnItemType the returnItemType to set
    */
    public void setReturnItemType(ReturnItemType returnItemType) {
        this.returnItemType = returnItemType;
    }
    /**
     * Auto generated value setter.
     * @param returnItemResponse the returnItemResponse to set
    */
    public void setReturnItemResponse(ReturnItemResponse returnItemResponse) {
        this.returnItemResponse = returnItemResponse;
    }
    /**
     * Auto generated value setter.
     * @param orderHeader the orderHeader to set
    */
    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
    /**
     * Auto generated value setter.
     * @param orderItem the orderItem to set
    */
    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param inventoryStatusItem the inventoryStatusItem to set
    */
    public void setInventoryStatusItem(StatusItem inventoryStatusItem) {
        this.inventoryStatusItem = inventoryStatusItem;
    }
    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * Auto generated value setter.
     * @param orderItemShipGrpInvReses the orderItemShipGrpInvReses to set
    */
    public void setOrderItemShipGrpInvReses(List<OrderItemShipGrpInvRes> orderItemShipGrpInvReses) {
        this.orderItemShipGrpInvReses = orderItemShipGrpInvReses;
    }
    /**
     * Auto generated value setter.
     * @param returnAdjustments the returnAdjustments to set
    */
    public void setReturnAdjustments(List<ReturnAdjustment> returnAdjustments) {
        this.returnAdjustments = returnAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param returnItemBillings the returnItemBillings to set
    */
    public void setReturnItemBillings(List<ReturnItemBilling> returnItemBillings) {
        this.returnItemBillings = returnItemBillings;
    }
    /**
     * Auto generated value setter.
     * @param returnItemShipments the returnItemShipments to set
    */
    public void setReturnItemShipments(List<ReturnItemShipment> returnItemShipments) {
        this.returnItemShipments = returnItemShipments;
    }
    /**
     * Auto generated value setter.
     * @param returnStatuses the returnStatuses to set
    */
    public void setReturnStatuses(List<ReturnStatus> returnStatuses) {
        this.returnStatuses = returnStatuses;
    }
    /**
     * Auto generated value setter.
     * @param shipmentReceipts the shipmentReceipts to set
    */
    public void setShipmentReceipts(List<ShipmentReceipt> shipmentReceipts) {
        this.shipmentReceipts = shipmentReceipts;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setReturnId((String) mapValue.get("returnId"));
        setReturnItemSeqId((String) mapValue.get("returnItemSeqId"));
        setReturnReasonId((String) mapValue.get("returnReasonId"));
        setReturnTypeId((String) mapValue.get("returnTypeId"));
        setReturnItemTypeId((String) mapValue.get("returnItemTypeId"));
        setProductId((String) mapValue.get("productId"));
        setDescription((String) mapValue.get("description"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setStatusId((String) mapValue.get("statusId"));
        setExpectedItemStatus((String) mapValue.get("expectedItemStatus"));
        setReturnQuantity(convertToBigDecimal(mapValue.get("returnQuantity")));
        setReceivedQuantity(convertToBigDecimal(mapValue.get("receivedQuantity")));
        setReturnPrice(convertToBigDecimal(mapValue.get("returnPrice")));
        setReturnItemResponseId((String) mapValue.get("returnItemResponseId"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("returnId", getReturnId());
        mapValue.put("returnItemSeqId", getReturnItemSeqId());
        mapValue.put("returnReasonId", getReturnReasonId());
        mapValue.put("returnTypeId", getReturnTypeId());
        mapValue.put("returnItemTypeId", getReturnItemTypeId());
        mapValue.put("productId", getProductId());
        mapValue.put("description", getDescription());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("expectedItemStatus", getExpectedItemStatus());
        mapValue.put("returnQuantity", getReturnQuantity());
        mapValue.put("receivedQuantity", getReceivedQuantity());
        mapValue.put("returnPrice", getReturnPrice());
        mapValue.put("returnItemResponseId", getReturnItemResponseId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}