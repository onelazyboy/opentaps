package org.opentaps.domain.base.services;

/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.util.Map;
import java.util.Set;
import javolution.util.FastSet;
import javolution.util.FastMap;

import org.opentaps.foundation.service.ServiceWrapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.ofbiz.entity.GenericValue;

/**
 * Auto generated base service entity updateCustRequest.
 */
public class UpdateCustRequest extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateCustRequest";

    /** The enumeration of input parameters. */
    public static enum In {
        closedDateTime("closedDateTime"),
        createdByUserLogin("createdByUserLogin"),
        createdDate("createdDate"),
        currencyUomId("currencyUomId"),
        custRequestCategoryId("custRequestCategoryId"),
        custRequestDate("custRequestDate"),
        custRequestId("custRequestId"),
        custRequestName("custRequestName"),
        custRequestTypeId("custRequestTypeId"),
        description("description"),
        fromPartyId("fromPartyId"),
        fulfillContactMechId("fulfillContactMechId"),
        fulfilledDateTime("fulfilledDateTime"),
        internalComment("internalComment"),
        lastModifiedByUserLogin("lastModifiedByUserLogin"),
        lastModifiedDate("lastModifiedDate"),
        locale("locale"),
        maximumAmountUomId("maximumAmountUomId"),
        openDateTime("openDateTime"),
        priority("priority"),
        productStoreId("productStoreId"),
        reason("reason"),
        responseRequiredDate("responseRequiredDate"),
        salesChannelEnumId("salesChannelEnumId"),
        statusId("statusId"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        oldStatusId("oldStatusId"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private Timestamp inClosedDateTime;
    private String inCreatedByUserLogin;
    private Timestamp inCreatedDate;
    private String inCurrencyUomId;
    private String inCustRequestCategoryId;
    private Timestamp inCustRequestDate;
    private String inCustRequestId;
    private String inCustRequestName;
    private String inCustRequestTypeId;
    private String inDescription;
    private String inFromPartyId;
    private String inFulfillContactMechId;
    private Timestamp inFulfilledDateTime;
    private String inInternalComment;
    private String inLastModifiedByUserLogin;
    private Timestamp inLastModifiedDate;
    private Locale inLocale;
    private String inMaximumAmountUomId;
    private Timestamp inOpenDateTime;
    private Long inPriority;
    private String inProductStoreId;
    private String inReason;
    private Timestamp inResponseRequiredDate;
    private String inSalesChannelEnumId;
    private String inStatusId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outOldStatusId;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInClosedDateTime() {
        return this.inClosedDateTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCreatedByUserLogin() {
        return this.inCreatedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInCreatedDate() {
        return this.inCreatedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrencyUomId() {
        return this.inCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustRequestCategoryId() {
        return this.inCustRequestCategoryId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInCustRequestDate() {
        return this.inCustRequestDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCustRequestId() {
        return this.inCustRequestId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustRequestName() {
        return this.inCustRequestName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustRequestTypeId() {
        return this.inCustRequestTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFromPartyId() {
        return this.inFromPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFulfillContactMechId() {
        return this.inFulfillContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFulfilledDateTime() {
        return this.inFulfilledDateTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInternalComment() {
        return this.inInternalComment;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLastModifiedByUserLogin() {
        return this.inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastModifiedDate() {
        return this.inLastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInMaximumAmountUomId() {
        return this.inMaximumAmountUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInOpenDateTime() {
        return this.inOpenDateTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInPriority() {
        return this.inPriority;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReason() {
        return this.inReason;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInResponseRequiredDate() {
        return this.inResponseRequiredDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSalesChannelEnumId() {
        return this.inSalesChannelEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInStatusId() {
        return this.inStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutOldStatusId() {
        return this.outOldStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inClosedDateTime the inClosedDateTime to set
    */
    public void setInClosedDateTime(Timestamp inClosedDateTime) {
        this.inParameters.add("closedDateTime");
        this.inClosedDateTime = inClosedDateTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedByUserLogin the inCreatedByUserLogin to set
    */
    public void setInCreatedByUserLogin(String inCreatedByUserLogin) {
        this.inParameters.add("createdByUserLogin");
        this.inCreatedByUserLogin = inCreatedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedDate the inCreatedDate to set
    */
    public void setInCreatedDate(Timestamp inCreatedDate) {
        this.inParameters.add("createdDate");
        this.inCreatedDate = inCreatedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrencyUomId the inCurrencyUomId to set
    */
    public void setInCurrencyUomId(String inCurrencyUomId) {
        this.inParameters.add("currencyUomId");
        this.inCurrencyUomId = inCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestCategoryId the inCustRequestCategoryId to set
    */
    public void setInCustRequestCategoryId(String inCustRequestCategoryId) {
        this.inParameters.add("custRequestCategoryId");
        this.inCustRequestCategoryId = inCustRequestCategoryId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestDate the inCustRequestDate to set
    */
    public void setInCustRequestDate(Timestamp inCustRequestDate) {
        this.inParameters.add("custRequestDate");
        this.inCustRequestDate = inCustRequestDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCustRequestId the inCustRequestId to set
    */
    public void setInCustRequestId(String inCustRequestId) {
        this.inParameters.add("custRequestId");
        this.inCustRequestId = inCustRequestId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestName the inCustRequestName to set
    */
    public void setInCustRequestName(String inCustRequestName) {
        this.inParameters.add("custRequestName");
        this.inCustRequestName = inCustRequestName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestTypeId the inCustRequestTypeId to set
    */
    public void setInCustRequestTypeId(String inCustRequestTypeId) {
        this.inParameters.add("custRequestTypeId");
        this.inCustRequestTypeId = inCustRequestTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromPartyId the inFromPartyId to set
    */
    public void setInFromPartyId(String inFromPartyId) {
        this.inParameters.add("fromPartyId");
        this.inFromPartyId = inFromPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFulfillContactMechId the inFulfillContactMechId to set
    */
    public void setInFulfillContactMechId(String inFulfillContactMechId) {
        this.inParameters.add("fulfillContactMechId");
        this.inFulfillContactMechId = inFulfillContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFulfilledDateTime the inFulfilledDateTime to set
    */
    public void setInFulfilledDateTime(Timestamp inFulfilledDateTime) {
        this.inParameters.add("fulfilledDateTime");
        this.inFulfilledDateTime = inFulfilledDateTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInternalComment the inInternalComment to set
    */
    public void setInInternalComment(String inInternalComment) {
        this.inParameters.add("internalComment");
        this.inInternalComment = inInternalComment;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedByUserLogin the inLastModifiedByUserLogin to set
    */
    public void setInLastModifiedByUserLogin(String inLastModifiedByUserLogin) {
        this.inParameters.add("lastModifiedByUserLogin");
        this.inLastModifiedByUserLogin = inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedDate the inLastModifiedDate to set
    */
    public void setInLastModifiedDate(Timestamp inLastModifiedDate) {
        this.inParameters.add("lastModifiedDate");
        this.inLastModifiedDate = inLastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMaximumAmountUomId the inMaximumAmountUomId to set
    */
    public void setInMaximumAmountUomId(String inMaximumAmountUomId) {
        this.inParameters.add("maximumAmountUomId");
        this.inMaximumAmountUomId = inMaximumAmountUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOpenDateTime the inOpenDateTime to set
    */
    public void setInOpenDateTime(Timestamp inOpenDateTime) {
        this.inParameters.add("openDateTime");
        this.inOpenDateTime = inOpenDateTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPriority the inPriority to set
    */
    public void setInPriority(Long inPriority) {
        this.inParameters.add("priority");
        this.inPriority = inPriority;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReason the inReason to set
    */
    public void setInReason(String inReason) {
        this.inParameters.add("reason");
        this.inReason = inReason;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inResponseRequiredDate the inResponseRequiredDate to set
    */
    public void setInResponseRequiredDate(Timestamp inResponseRequiredDate) {
        this.inParameters.add("responseRequiredDate");
        this.inResponseRequiredDate = inResponseRequiredDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSalesChannelEnumId the inSalesChannelEnumId to set
    */
    public void setInSalesChannelEnumId(String inSalesChannelEnumId) {
        this.inParameters.add("salesChannelEnumId");
        this.inSalesChannelEnumId = inSalesChannelEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inStatusId the inStatusId to set
    */
    public void setInStatusId(String inStatusId) {
        this.inParameters.add("statusId");
        this.inStatusId = inStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outOldStatusId the outOldStatusId to set
    */
    public void setOutOldStatusId(String outOldStatusId) {
        this.outParameters.add("oldStatusId");
        this.outOldStatusId = outOldStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("closedDateTime")) mapValue.put("closedDateTime", getInClosedDateTime());
        if (inParameters.contains("createdByUserLogin")) mapValue.put("createdByUserLogin", getInCreatedByUserLogin());
        if (inParameters.contains("createdDate")) mapValue.put("createdDate", getInCreatedDate());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("custRequestCategoryId")) mapValue.put("custRequestCategoryId", getInCustRequestCategoryId());
        if (inParameters.contains("custRequestDate")) mapValue.put("custRequestDate", getInCustRequestDate());
        if (inParameters.contains("custRequestId")) mapValue.put("custRequestId", getInCustRequestId());
        if (inParameters.contains("custRequestName")) mapValue.put("custRequestName", getInCustRequestName());
        if (inParameters.contains("custRequestTypeId")) mapValue.put("custRequestTypeId", getInCustRequestTypeId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("fromPartyId")) mapValue.put("fromPartyId", getInFromPartyId());
        if (inParameters.contains("fulfillContactMechId")) mapValue.put("fulfillContactMechId", getInFulfillContactMechId());
        if (inParameters.contains("fulfilledDateTime")) mapValue.put("fulfilledDateTime", getInFulfilledDateTime());
        if (inParameters.contains("internalComment")) mapValue.put("internalComment", getInInternalComment());
        if (inParameters.contains("lastModifiedByUserLogin")) mapValue.put("lastModifiedByUserLogin", getInLastModifiedByUserLogin());
        if (inParameters.contains("lastModifiedDate")) mapValue.put("lastModifiedDate", getInLastModifiedDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maximumAmountUomId")) mapValue.put("maximumAmountUomId", getInMaximumAmountUomId());
        if (inParameters.contains("openDateTime")) mapValue.put("openDateTime", getInOpenDateTime());
        if (inParameters.contains("priority")) mapValue.put("priority", getInPriority());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("reason")) mapValue.put("reason", getInReason());
        if (inParameters.contains("responseRequiredDate")) mapValue.put("responseRequiredDate", getInResponseRequiredDate());
        if (inParameters.contains("salesChannelEnumId")) mapValue.put("salesChannelEnumId", getInSalesChannelEnumId());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("oldStatusId")) mapValue.put("oldStatusId", getOutOldStatusId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("closedDateTime")) setInClosedDateTime((Timestamp) mapValue.get("closedDateTime"));
        if (mapValue.containsKey("createdByUserLogin")) setInCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        if (mapValue.containsKey("createdDate")) setInCreatedDate((Timestamp) mapValue.get("createdDate"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("custRequestCategoryId")) setInCustRequestCategoryId((String) mapValue.get("custRequestCategoryId"));
        if (mapValue.containsKey("custRequestDate")) setInCustRequestDate((Timestamp) mapValue.get("custRequestDate"));
        if (mapValue.containsKey("custRequestId")) setInCustRequestId((String) mapValue.get("custRequestId"));
        if (mapValue.containsKey("custRequestName")) setInCustRequestName((String) mapValue.get("custRequestName"));
        if (mapValue.containsKey("custRequestTypeId")) setInCustRequestTypeId((String) mapValue.get("custRequestTypeId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("fromPartyId")) setInFromPartyId((String) mapValue.get("fromPartyId"));
        if (mapValue.containsKey("fulfillContactMechId")) setInFulfillContactMechId((String) mapValue.get("fulfillContactMechId"));
        if (mapValue.containsKey("fulfilledDateTime")) setInFulfilledDateTime((Timestamp) mapValue.get("fulfilledDateTime"));
        if (mapValue.containsKey("internalComment")) setInInternalComment((String) mapValue.get("internalComment"));
        if (mapValue.containsKey("lastModifiedByUserLogin")) setInLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        if (mapValue.containsKey("lastModifiedDate")) setInLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maximumAmountUomId")) setInMaximumAmountUomId((String) mapValue.get("maximumAmountUomId"));
        if (mapValue.containsKey("openDateTime")) setInOpenDateTime((Timestamp) mapValue.get("openDateTime"));
        if (mapValue.containsKey("priority")) setInPriority((Long) mapValue.get("priority"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("reason")) setInReason((String) mapValue.get("reason"));
        if (mapValue.containsKey("responseRequiredDate")) setInResponseRequiredDate((Timestamp) mapValue.get("responseRequiredDate"));
        if (mapValue.containsKey("salesChannelEnumId")) setInSalesChannelEnumId((String) mapValue.get("salesChannelEnumId"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("oldStatusId")) setOutOldStatusId((String) mapValue.get("oldStatusId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdateCustRequest</code> from the input values of the given <code>UpdateCustRequest</code>.
     * @param input a <code>UpdateCustRequest</code>
     */
    public static UpdateCustRequest fromInput(UpdateCustRequest input) {
        UpdateCustRequest service = new UpdateCustRequest();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateCustRequest</code> from the output values of the given <code>UpdateCustRequest</code>.
     * @param output a <code>UpdateCustRequest</code>
     */
    public static UpdateCustRequest fromOutput(UpdateCustRequest output) {
        UpdateCustRequest service = new UpdateCustRequest();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateCustRequest</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateCustRequest fromInput(Map<String, Object> mapValue) {
        UpdateCustRequest service = new UpdateCustRequest();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>UpdateCustRequest</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateCustRequest fromOutput(Map<String, Object> mapValue) {
        UpdateCustRequest service = new UpdateCustRequest();
        service.putAllOutput(mapValue);
        return service;
    }
}
