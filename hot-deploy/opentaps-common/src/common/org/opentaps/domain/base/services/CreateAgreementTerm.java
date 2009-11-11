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

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.ofbiz.entity.GenericValue;

/**
 * Auto generated base service entity createAgreementTerm.
 */
public class CreateAgreementTerm extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createAgreementTerm";

    /** The enumeration of input parameters. */
    public static enum In {
        agreementId("agreementId"),
        agreementItemSeqId("agreementItemSeqId"),
        agreementTermId("agreementTermId"),
        currencyUomId("currencyUomId"),
        description("description"),
        fromDate("fromDate"),
        invoiceItemTypeId("invoiceItemTypeId"),
        locale("locale"),
        maxQuantity("maxQuantity"),
        minQuantity("minQuantity"),
        partyClassificationGroupId("partyClassificationGroupId"),
        partyId("partyId"),
        productCategoryId("productCategoryId"),
        productId("productId"),
        roleTypeId("roleTypeId"),
        termDays("termDays"),
        termTypeId("termTypeId"),
        termValue("termValue"),
        textValue("textValue"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        uomId("uomId"),
        userLogin("userLogin"),
        valueEnumId("valueEnumId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        agreementTermId("agreementTermId"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private String inAgreementId;
    private String inAgreementItemSeqId;
    private String inAgreementTermId;
    private String inCurrencyUomId;
    private String inDescription;
    private Timestamp inFromDate;
    private String inInvoiceItemTypeId;
    private Locale inLocale;
    private Double inMaxQuantity;
    private Double inMinQuantity;
    private String inPartyClassificationGroupId;
    private String inPartyId;
    private String inProductCategoryId;
    private String inProductId;
    private String inRoleTypeId;
    private Long inTermDays;
    private String inTermTypeId;
    private BigDecimal inTermValue;
    private String inTextValue;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private String inUomId;
    private GenericValue inUserLogin;
    private String inValueEnumId;
    private String outAgreementTermId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
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
     * @return <code>String</code>
     */
    public String getInAgreementId() {
        return this.inAgreementId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAgreementItemSeqId() {
        return this.inAgreementItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAgreementTermId() {
        return this.inAgreementTermId;
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
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate() {
        return this.inFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInvoiceItemTypeId() {
        return this.inInvoiceItemTypeId;
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
     * @return <code>Double</code>
     */
    public Double getInMaxQuantity() {
        return this.inMaxQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getInMinQuantity() {
        return this.inMinQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPartyClassificationGroupId() {
        return this.inPartyClassificationGroupId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductCategoryId() {
        return this.inProductCategoryId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductId() {
        return this.inProductId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeId() {
        return this.inRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInTermDays() {
        return this.inTermDays;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTermTypeId() {
        return this.inTermTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInTermValue() {
        return this.inTermValue;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTextValue() {
        return this.inTextValue;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInThruDate() {
        return this.inThruDate;
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
     * @return <code>String</code>
     */
    public String getInUomId() {
        return this.inUomId;
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
    public String getInValueEnumId() {
        return this.inValueEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAgreementTermId() {
        return this.outAgreementTermId;
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
     * @param inAgreementId the inAgreementId to set
    */
    public void setInAgreementId(String inAgreementId) {
        this.inParameters.add("agreementId");
        this.inAgreementId = inAgreementId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAgreementItemSeqId the inAgreementItemSeqId to set
    */
    public void setInAgreementItemSeqId(String inAgreementItemSeqId) {
        this.inParameters.add("agreementItemSeqId");
        this.inAgreementItemSeqId = inAgreementItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAgreementTermId the inAgreementTermId to set
    */
    public void setInAgreementTermId(String inAgreementTermId) {
        this.inParameters.add("agreementTermId");
        this.inAgreementTermId = inAgreementTermId;
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
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInvoiceItemTypeId the inInvoiceItemTypeId to set
    */
    public void setInInvoiceItemTypeId(String inInvoiceItemTypeId) {
        this.inParameters.add("invoiceItemTypeId");
        this.inInvoiceItemTypeId = inInvoiceItemTypeId;
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
     * @param inMaxQuantity the inMaxQuantity to set
    */
    public void setInMaxQuantity(Double inMaxQuantity) {
        this.inParameters.add("maxQuantity");
        this.inMaxQuantity = inMaxQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMinQuantity the inMinQuantity to set
    */
    public void setInMinQuantity(Double inMinQuantity) {
        this.inParameters.add("minQuantity");
        this.inMinQuantity = inMinQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyClassificationGroupId the inPartyClassificationGroupId to set
    */
    public void setInPartyClassificationGroupId(String inPartyClassificationGroupId) {
        this.inParameters.add("partyClassificationGroupId");
        this.inPartyClassificationGroupId = inPartyClassificationGroupId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductCategoryId the inProductCategoryId to set
    */
    public void setInProductCategoryId(String inProductCategoryId) {
        this.inParameters.add("productCategoryId");
        this.inProductCategoryId = inProductCategoryId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductId the inProductId to set
    */
    public void setInProductId(String inProductId) {
        this.inParameters.add("productId");
        this.inProductId = inProductId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeId the inRoleTypeId to set
    */
    public void setInRoleTypeId(String inRoleTypeId) {
        this.inParameters.add("roleTypeId");
        this.inRoleTypeId = inRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTermDays the inTermDays to set
    */
    public void setInTermDays(Long inTermDays) {
        this.inParameters.add("termDays");
        this.inTermDays = inTermDays;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTermTypeId the inTermTypeId to set
    */
    public void setInTermTypeId(String inTermTypeId) {
        this.inParameters.add("termTypeId");
        this.inTermTypeId = inTermTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTermValue the inTermValue to set
    */
    public void setInTermValue(BigDecimal inTermValue) {
        this.inParameters.add("termValue");
        this.inTermValue = inTermValue;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTextValue the inTextValue to set
    */
    public void setInTextValue(String inTextValue) {
        this.inParameters.add("textValue");
        this.inTextValue = inTextValue;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThruDate the inThruDate to set
    */
    public void setInThruDate(Timestamp inThruDate) {
        this.inParameters.add("thruDate");
        this.inThruDate = inThruDate;
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
     * @param inUomId the inUomId to set
    */
    public void setInUomId(String inUomId) {
        this.inParameters.add("uomId");
        this.inUomId = inUomId;
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
     * @param inValueEnumId the inValueEnumId to set
    */
    public void setInValueEnumId(String inValueEnumId) {
        this.inParameters.add("valueEnumId");
        this.inValueEnumId = inValueEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAgreementTermId the outAgreementTermId to set
    */
    public void setOutAgreementTermId(String outAgreementTermId) {
        this.outParameters.add("agreementTermId");
        this.outAgreementTermId = outAgreementTermId;
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
        if (inParameters.contains("agreementId")) mapValue.put("agreementId", getInAgreementId());
        if (inParameters.contains("agreementItemSeqId")) mapValue.put("agreementItemSeqId", getInAgreementItemSeqId());
        if (inParameters.contains("agreementTermId")) mapValue.put("agreementTermId", getInAgreementTermId());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("invoiceItemTypeId")) mapValue.put("invoiceItemTypeId", getInInvoiceItemTypeId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maxQuantity")) mapValue.put("maxQuantity", getInMaxQuantity());
        if (inParameters.contains("minQuantity")) mapValue.put("minQuantity", getInMinQuantity());
        if (inParameters.contains("partyClassificationGroupId")) mapValue.put("partyClassificationGroupId", getInPartyClassificationGroupId());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productCategoryId")) mapValue.put("productCategoryId", getInProductCategoryId());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("roleTypeId")) mapValue.put("roleTypeId", getInRoleTypeId());
        if (inParameters.contains("termDays")) mapValue.put("termDays", getInTermDays());
        if (inParameters.contains("termTypeId")) mapValue.put("termTypeId", getInTermTypeId());
        if (inParameters.contains("termValue")) mapValue.put("termValue", getInTermValue());
        if (inParameters.contains("textValue")) mapValue.put("textValue", getInTextValue());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("uomId")) mapValue.put("uomId", getInUomId());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("valueEnumId")) mapValue.put("valueEnumId", getInValueEnumId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("agreementTermId")) mapValue.put("agreementTermId", getOutAgreementTermId());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("agreementId")) setInAgreementId((String) mapValue.get("agreementId"));
        if (mapValue.containsKey("agreementItemSeqId")) setInAgreementItemSeqId((String) mapValue.get("agreementItemSeqId"));
        if (mapValue.containsKey("agreementTermId")) setInAgreementTermId((String) mapValue.get("agreementTermId"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("invoiceItemTypeId")) setInInvoiceItemTypeId((String) mapValue.get("invoiceItemTypeId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maxQuantity")) setInMaxQuantity((Double) mapValue.get("maxQuantity"));
        if (mapValue.containsKey("minQuantity")) setInMinQuantity((Double) mapValue.get("minQuantity"));
        if (mapValue.containsKey("partyClassificationGroupId")) setInPartyClassificationGroupId((String) mapValue.get("partyClassificationGroupId"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productCategoryId")) setInProductCategoryId((String) mapValue.get("productCategoryId"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("roleTypeId")) setInRoleTypeId((String) mapValue.get("roleTypeId"));
        if (mapValue.containsKey("termDays")) setInTermDays((Long) mapValue.get("termDays"));
        if (mapValue.containsKey("termTypeId")) setInTermTypeId((String) mapValue.get("termTypeId"));
        if (mapValue.containsKey("termValue")) setInTermValue((BigDecimal) mapValue.get("termValue"));
        if (mapValue.containsKey("textValue")) setInTextValue((String) mapValue.get("textValue"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("uomId")) setInUomId((String) mapValue.get("uomId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("valueEnumId")) setInValueEnumId((String) mapValue.get("valueEnumId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("agreementTermId")) setOutAgreementTermId((String) mapValue.get("agreementTermId"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateAgreementTerm</code> from the input values of the given <code>CreateAgreementTerm</code>.
     * @param input a <code>CreateAgreementTerm</code>
     */
    public static CreateAgreementTerm fromInput(CreateAgreementTerm input) {
        CreateAgreementTerm service = new CreateAgreementTerm();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>CreateAgreementTerm</code> from the output values of the given <code>CreateAgreementTerm</code>.
     * @param output a <code>CreateAgreementTerm</code>
     */
    public static CreateAgreementTerm fromOutput(CreateAgreementTerm output) {
        CreateAgreementTerm service = new CreateAgreementTerm();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateAgreementTerm</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateAgreementTerm fromInput(Map<String, Object> mapValue) {
        CreateAgreementTerm service = new CreateAgreementTerm();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>CreateAgreementTerm</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateAgreementTerm fromOutput(Map<String, Object> mapValue) {
        CreateAgreementTerm service = new CreateAgreementTerm();
        service.putAllOutput(mapValue);
        return service;
    }
}
