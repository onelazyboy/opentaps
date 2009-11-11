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
 * Auto generated base service entity opentaps.initInventoryEventPlanned.
 */
public class OpentapsInitInventoryEventPlanned extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "opentaps.initInventoryEventPlanned";

    /** The enumeration of input parameters. */
    public static enum In {
        defaultYearsOffset("defaultYearsOffset"),
        facilityId("facilityId"),
        locale("locale"),
        now("now"),
        percentageOfSalesForecast("percentageOfSalesForecast"),
        productId("productId"),
        productStoreGroupId("productStoreGroupId"),
        productStoreId("productStoreId"),
        reInitialize("reInitialize"),
        receiptEventBufferMilliseconds("receiptEventBufferMilliseconds"),
        supplierPartyId("supplierPartyId"),
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
        mrpRunProductIds("mrpRunProductIds"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private Integer inDefaultYearsOffset;
    private String inFacilityId;
    private Locale inLocale;
    private Timestamp inNow;
    private BigDecimal inPercentageOfSalesForecast;
    private String inProductId;
    private String inProductStoreGroupId;
    private String inProductStoreId;
    private Boolean inReInitialize;
    private BigDecimal inReceiptEventBufferMilliseconds;
    private String inSupplierPartyId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private List outMrpRunProductIds;
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
     * @return <code>Integer</code>
     */
    public Integer getInDefaultYearsOffset() {
        return this.inDefaultYearsOffset;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFacilityId() {
        return this.inFacilityId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getInNow() {
        return this.inNow;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPercentageOfSalesForecast() {
        return this.inPercentageOfSalesForecast;
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
    public String getInProductStoreGroupId() {
        return this.inProductStoreGroupId;
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
     * This parameter is required.
     * @return <code>Boolean</code>
     */
    public Boolean getInReInitialize() {
        return this.inReInitialize;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInReceiptEventBufferMilliseconds() {
        return this.inReceiptEventBufferMilliseconds;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSupplierPartyId() {
        return this.inSupplierPartyId;
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
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutMrpRunProductIds() {
        return this.outMrpRunProductIds;
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
     * @param inDefaultYearsOffset the inDefaultYearsOffset to set
    */
    public void setInDefaultYearsOffset(Integer inDefaultYearsOffset) {
        this.inParameters.add("defaultYearsOffset");
        this.inDefaultYearsOffset = inDefaultYearsOffset;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFacilityId the inFacilityId to set
    */
    public void setInFacilityId(String inFacilityId) {
        this.inParameters.add("facilityId");
        this.inFacilityId = inFacilityId;
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
     * @param inNow the inNow to set
    */
    public void setInNow(Timestamp inNow) {
        this.inParameters.add("now");
        this.inNow = inNow;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPercentageOfSalesForecast the inPercentageOfSalesForecast to set
    */
    public void setInPercentageOfSalesForecast(BigDecimal inPercentageOfSalesForecast) {
        this.inParameters.add("percentageOfSalesForecast");
        this.inPercentageOfSalesForecast = inPercentageOfSalesForecast;
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
     * @param inProductStoreGroupId the inProductStoreGroupId to set
    */
    public void setInProductStoreGroupId(String inProductStoreGroupId) {
        this.inParameters.add("productStoreGroupId");
        this.inProductStoreGroupId = inProductStoreGroupId;
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
     * This parameter is required.
     * @param inReInitialize the inReInitialize to set
    */
    public void setInReInitialize(Boolean inReInitialize) {
        this.inParameters.add("reInitialize");
        this.inReInitialize = inReInitialize;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReceiptEventBufferMilliseconds the inReceiptEventBufferMilliseconds to set
    */
    public void setInReceiptEventBufferMilliseconds(BigDecimal inReceiptEventBufferMilliseconds) {
        this.inParameters.add("receiptEventBufferMilliseconds");
        this.inReceiptEventBufferMilliseconds = inReceiptEventBufferMilliseconds;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSupplierPartyId the inSupplierPartyId to set
    */
    public void setInSupplierPartyId(String inSupplierPartyId) {
        this.inParameters.add("supplierPartyId");
        this.inSupplierPartyId = inSupplierPartyId;
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
     * This parameter is optional.
     * @param outMrpRunProductIds the outMrpRunProductIds to set
    */
    public void setOutMrpRunProductIds(List outMrpRunProductIds) {
        this.outParameters.add("mrpRunProductIds");
        this.outMrpRunProductIds = outMrpRunProductIds;
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
        if (inParameters.contains("defaultYearsOffset")) mapValue.put("defaultYearsOffset", getInDefaultYearsOffset());
        if (inParameters.contains("facilityId")) mapValue.put("facilityId", getInFacilityId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("now")) mapValue.put("now", getInNow());
        if (inParameters.contains("percentageOfSalesForecast")) mapValue.put("percentageOfSalesForecast", getInPercentageOfSalesForecast());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("productStoreGroupId")) mapValue.put("productStoreGroupId", getInProductStoreGroupId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("reInitialize")) mapValue.put("reInitialize", getInReInitialize());
        if (inParameters.contains("receiptEventBufferMilliseconds")) mapValue.put("receiptEventBufferMilliseconds", getInReceiptEventBufferMilliseconds());
        if (inParameters.contains("supplierPartyId")) mapValue.put("supplierPartyId", getInSupplierPartyId());
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
        if (outParameters.contains("mrpRunProductIds")) mapValue.put("mrpRunProductIds", getOutMrpRunProductIds());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("defaultYearsOffset")) setInDefaultYearsOffset((Integer) mapValue.get("defaultYearsOffset"));
        if (mapValue.containsKey("facilityId")) setInFacilityId((String) mapValue.get("facilityId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("now")) setInNow((Timestamp) mapValue.get("now"));
        if (mapValue.containsKey("percentageOfSalesForecast")) setInPercentageOfSalesForecast((BigDecimal) mapValue.get("percentageOfSalesForecast"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("productStoreGroupId")) setInProductStoreGroupId((String) mapValue.get("productStoreGroupId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("reInitialize")) setInReInitialize((Boolean) mapValue.get("reInitialize"));
        if (mapValue.containsKey("receiptEventBufferMilliseconds")) setInReceiptEventBufferMilliseconds((BigDecimal) mapValue.get("receiptEventBufferMilliseconds"));
        if (mapValue.containsKey("supplierPartyId")) setInSupplierPartyId((String) mapValue.get("supplierPartyId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("mrpRunProductIds")) setOutMrpRunProductIds((List) mapValue.get("mrpRunProductIds"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>OpentapsInitInventoryEventPlanned</code> from the input values of the given <code>OpentapsInitInventoryEventPlanned</code>.
     * @param input a <code>OpentapsInitInventoryEventPlanned</code>
     */
    public static OpentapsInitInventoryEventPlanned fromInput(OpentapsInitInventoryEventPlanned input) {
        OpentapsInitInventoryEventPlanned service = new OpentapsInitInventoryEventPlanned();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>OpentapsInitInventoryEventPlanned</code> from the output values of the given <code>OpentapsInitInventoryEventPlanned</code>.
     * @param output a <code>OpentapsInitInventoryEventPlanned</code>
     */
    public static OpentapsInitInventoryEventPlanned fromOutput(OpentapsInitInventoryEventPlanned output) {
        OpentapsInitInventoryEventPlanned service = new OpentapsInitInventoryEventPlanned();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>OpentapsInitInventoryEventPlanned</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static OpentapsInitInventoryEventPlanned fromInput(Map<String, Object> mapValue) {
        OpentapsInitInventoryEventPlanned service = new OpentapsInitInventoryEventPlanned();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>OpentapsInitInventoryEventPlanned</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static OpentapsInitInventoryEventPlanned fromOutput(Map<String, Object> mapValue) {
        OpentapsInitInventoryEventPlanned service = new OpentapsInitInventoryEventPlanned();
        service.putAllOutput(mapValue);
        return service;
    }
}
