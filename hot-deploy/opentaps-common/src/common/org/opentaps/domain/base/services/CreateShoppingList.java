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
 * Auto generated base service entity createShoppingList.
 */
public class CreateShoppingList extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createShoppingList";

    /** The enumeration of input parameters. */
    public static enum In {
        carrierPartyId("carrierPartyId"),
        carrierRoleTypeId("carrierRoleTypeId"),
        contactMechId("contactMechId"),
        currencyUom("currencyUom"),
        description("description"),
        endDateTime("endDateTime"),
        frequency("frequency"),
        intervalNumber("intervalNumber"),
        isActive("isActive"),
        isPublic("isPublic"),
        lastAdminModified("lastAdminModified"),
        lastOrderedDate("lastOrderedDate"),
        listName("listName"),
        locale("locale"),
        parentShoppingListId("parentShoppingListId"),
        partyId("partyId"),
        paymentMethodId("paymentMethodId"),
        productPromoCodeId("productPromoCodeId"),
        productStoreId("productStoreId"),
        recurrenceInfoId("recurrenceInfoId"),
        shipmentMethodTypeId("shipmentMethodTypeId"),
        shippingMethodString("shippingMethodString"),
        shoppingListTypeId("shoppingListTypeId"),
        startDateTime("startDateTime"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        visitorId("visitorId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        recurrenceInfoId("recurrenceInfoId"),
        responseMessage("responseMessage"),
        shoppingListId("shoppingListId"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private String inCarrierPartyId;
    private String inCarrierRoleTypeId;
    private String inContactMechId;
    private String inCurrencyUom;
    private String inDescription;
    private Timestamp inEndDateTime;
    private Integer inFrequency;
    private Integer inIntervalNumber;
    private String inIsActive;
    private String inIsPublic;
    private Timestamp inLastAdminModified;
    private Timestamp inLastOrderedDate;
    private String inListName;
    private Locale inLocale;
    private String inParentShoppingListId;
    private String inPartyId;
    private String inPaymentMethodId;
    private String inProductPromoCodeId;
    private String inProductStoreId;
    private String inRecurrenceInfoId;
    private String inShipmentMethodTypeId;
    private String inShippingMethodString;
    private String inShoppingListTypeId;
    private Timestamp inStartDateTime;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inVisitorId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outRecurrenceInfoId;
    private String outResponseMessage;
    private String outShoppingListId;
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
    public String getInCarrierPartyId() {
        return this.inCarrierPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCarrierRoleTypeId() {
        return this.inCarrierRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactMechId() {
        return this.inContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrencyUom() {
        return this.inCurrencyUom;
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
    public Timestamp getInEndDateTime() {
        return this.inEndDateTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Integer</code>
     */
    public Integer getInFrequency() {
        return this.inFrequency;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Integer</code>
     */
    public Integer getInIntervalNumber() {
        return this.inIntervalNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsActive() {
        return this.inIsActive;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsPublic() {
        return this.inIsPublic;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastAdminModified() {
        return this.inLastAdminModified;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastOrderedDate() {
        return this.inLastOrderedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInListName() {
        return this.inListName;
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
    public String getInParentShoppingListId() {
        return this.inParentShoppingListId;
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
    public String getInPaymentMethodId() {
        return this.inPaymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductPromoCodeId() {
        return this.inProductPromoCodeId;
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
    public String getInRecurrenceInfoId() {
        return this.inRecurrenceInfoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipmentMethodTypeId() {
        return this.inShipmentMethodTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShippingMethodString() {
        return this.inShippingMethodString;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShoppingListTypeId() {
        return this.inShoppingListTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInStartDateTime() {
        return this.inStartDateTime;
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
    public String getInVisitorId() {
        return this.inVisitorId;
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
    public String getOutRecurrenceInfoId() {
        return this.outRecurrenceInfoId;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutShoppingListId() {
        return this.outShoppingListId;
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
     * @param inCarrierPartyId the inCarrierPartyId to set
    */
    public void setInCarrierPartyId(String inCarrierPartyId) {
        this.inParameters.add("carrierPartyId");
        this.inCarrierPartyId = inCarrierPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCarrierRoleTypeId the inCarrierRoleTypeId to set
    */
    public void setInCarrierRoleTypeId(String inCarrierRoleTypeId) {
        this.inParameters.add("carrierRoleTypeId");
        this.inCarrierRoleTypeId = inCarrierRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactMechId the inContactMechId to set
    */
    public void setInContactMechId(String inContactMechId) {
        this.inParameters.add("contactMechId");
        this.inContactMechId = inContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrencyUom the inCurrencyUom to set
    */
    public void setInCurrencyUom(String inCurrencyUom) {
        this.inParameters.add("currencyUom");
        this.inCurrencyUom = inCurrencyUom;
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
     * @param inEndDateTime the inEndDateTime to set
    */
    public void setInEndDateTime(Timestamp inEndDateTime) {
        this.inParameters.add("endDateTime");
        this.inEndDateTime = inEndDateTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFrequency the inFrequency to set
    */
    public void setInFrequency(Integer inFrequency) {
        this.inParameters.add("frequency");
        this.inFrequency = inFrequency;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIntervalNumber the inIntervalNumber to set
    */
    public void setInIntervalNumber(Integer inIntervalNumber) {
        this.inParameters.add("intervalNumber");
        this.inIntervalNumber = inIntervalNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsActive the inIsActive to set
    */
    public void setInIsActive(String inIsActive) {
        this.inParameters.add("isActive");
        this.inIsActive = inIsActive;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsPublic the inIsPublic to set
    */
    public void setInIsPublic(String inIsPublic) {
        this.inParameters.add("isPublic");
        this.inIsPublic = inIsPublic;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastAdminModified the inLastAdminModified to set
    */
    public void setInLastAdminModified(Timestamp inLastAdminModified) {
        this.inParameters.add("lastAdminModified");
        this.inLastAdminModified = inLastAdminModified;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastOrderedDate the inLastOrderedDate to set
    */
    public void setInLastOrderedDate(Timestamp inLastOrderedDate) {
        this.inParameters.add("lastOrderedDate");
        this.inLastOrderedDate = inLastOrderedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inListName the inListName to set
    */
    public void setInListName(String inListName) {
        this.inParameters.add("listName");
        this.inListName = inListName;
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
     * @param inParentShoppingListId the inParentShoppingListId to set
    */
    public void setInParentShoppingListId(String inParentShoppingListId) {
        this.inParameters.add("parentShoppingListId");
        this.inParentShoppingListId = inParentShoppingListId;
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
     * @param inPaymentMethodId the inPaymentMethodId to set
    */
    public void setInPaymentMethodId(String inPaymentMethodId) {
        this.inParameters.add("paymentMethodId");
        this.inPaymentMethodId = inPaymentMethodId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductPromoCodeId the inProductPromoCodeId to set
    */
    public void setInProductPromoCodeId(String inProductPromoCodeId) {
        this.inParameters.add("productPromoCodeId");
        this.inProductPromoCodeId = inProductPromoCodeId;
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
     * @param inRecurrenceInfoId the inRecurrenceInfoId to set
    */
    public void setInRecurrenceInfoId(String inRecurrenceInfoId) {
        this.inParameters.add("recurrenceInfoId");
        this.inRecurrenceInfoId = inRecurrenceInfoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipmentMethodTypeId the inShipmentMethodTypeId to set
    */
    public void setInShipmentMethodTypeId(String inShipmentMethodTypeId) {
        this.inParameters.add("shipmentMethodTypeId");
        this.inShipmentMethodTypeId = inShipmentMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShippingMethodString the inShippingMethodString to set
    */
    public void setInShippingMethodString(String inShippingMethodString) {
        this.inParameters.add("shippingMethodString");
        this.inShippingMethodString = inShippingMethodString;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShoppingListTypeId the inShoppingListTypeId to set
    */
    public void setInShoppingListTypeId(String inShoppingListTypeId) {
        this.inParameters.add("shoppingListTypeId");
        this.inShoppingListTypeId = inShoppingListTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inStartDateTime the inStartDateTime to set
    */
    public void setInStartDateTime(Timestamp inStartDateTime) {
        this.inParameters.add("startDateTime");
        this.inStartDateTime = inStartDateTime;
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
     * @param inVisitorId the inVisitorId to set
    */
    public void setInVisitorId(String inVisitorId) {
        this.inParameters.add("visitorId");
        this.inVisitorId = inVisitorId;
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
     * @param outRecurrenceInfoId the outRecurrenceInfoId to set
    */
    public void setOutRecurrenceInfoId(String outRecurrenceInfoId) {
        this.outParameters.add("recurrenceInfoId");
        this.outRecurrenceInfoId = outRecurrenceInfoId;
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
     * This parameter is required.
     * @param outShoppingListId the outShoppingListId to set
    */
    public void setOutShoppingListId(String outShoppingListId) {
        this.outParameters.add("shoppingListId");
        this.outShoppingListId = outShoppingListId;
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
        if (inParameters.contains("carrierPartyId")) mapValue.put("carrierPartyId", getInCarrierPartyId());
        if (inParameters.contains("carrierRoleTypeId")) mapValue.put("carrierRoleTypeId", getInCarrierRoleTypeId());
        if (inParameters.contains("contactMechId")) mapValue.put("contactMechId", getInContactMechId());
        if (inParameters.contains("currencyUom")) mapValue.put("currencyUom", getInCurrencyUom());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("endDateTime")) mapValue.put("endDateTime", getInEndDateTime());
        if (inParameters.contains("frequency")) mapValue.put("frequency", getInFrequency());
        if (inParameters.contains("intervalNumber")) mapValue.put("intervalNumber", getInIntervalNumber());
        if (inParameters.contains("isActive")) mapValue.put("isActive", getInIsActive());
        if (inParameters.contains("isPublic")) mapValue.put("isPublic", getInIsPublic());
        if (inParameters.contains("lastAdminModified")) mapValue.put("lastAdminModified", getInLastAdminModified());
        if (inParameters.contains("lastOrderedDate")) mapValue.put("lastOrderedDate", getInLastOrderedDate());
        if (inParameters.contains("listName")) mapValue.put("listName", getInListName());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("parentShoppingListId")) mapValue.put("parentShoppingListId", getInParentShoppingListId());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("paymentMethodId")) mapValue.put("paymentMethodId", getInPaymentMethodId());
        if (inParameters.contains("productPromoCodeId")) mapValue.put("productPromoCodeId", getInProductPromoCodeId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("recurrenceInfoId")) mapValue.put("recurrenceInfoId", getInRecurrenceInfoId());
        if (inParameters.contains("shipmentMethodTypeId")) mapValue.put("shipmentMethodTypeId", getInShipmentMethodTypeId());
        if (inParameters.contains("shippingMethodString")) mapValue.put("shippingMethodString", getInShippingMethodString());
        if (inParameters.contains("shoppingListTypeId")) mapValue.put("shoppingListTypeId", getInShoppingListTypeId());
        if (inParameters.contains("startDateTime")) mapValue.put("startDateTime", getInStartDateTime());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("visitorId")) mapValue.put("visitorId", getInVisitorId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("recurrenceInfoId")) mapValue.put("recurrenceInfoId", getOutRecurrenceInfoId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("shoppingListId")) mapValue.put("shoppingListId", getOutShoppingListId());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("carrierPartyId")) setInCarrierPartyId((String) mapValue.get("carrierPartyId"));
        if (mapValue.containsKey("carrierRoleTypeId")) setInCarrierRoleTypeId((String) mapValue.get("carrierRoleTypeId"));
        if (mapValue.containsKey("contactMechId")) setInContactMechId((String) mapValue.get("contactMechId"));
        if (mapValue.containsKey("currencyUom")) setInCurrencyUom((String) mapValue.get("currencyUom"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("endDateTime")) setInEndDateTime((Timestamp) mapValue.get("endDateTime"));
        if (mapValue.containsKey("frequency")) setInFrequency((Integer) mapValue.get("frequency"));
        if (mapValue.containsKey("intervalNumber")) setInIntervalNumber((Integer) mapValue.get("intervalNumber"));
        if (mapValue.containsKey("isActive")) setInIsActive((String) mapValue.get("isActive"));
        if (mapValue.containsKey("isPublic")) setInIsPublic((String) mapValue.get("isPublic"));
        if (mapValue.containsKey("lastAdminModified")) setInLastAdminModified((Timestamp) mapValue.get("lastAdminModified"));
        if (mapValue.containsKey("lastOrderedDate")) setInLastOrderedDate((Timestamp) mapValue.get("lastOrderedDate"));
        if (mapValue.containsKey("listName")) setInListName((String) mapValue.get("listName"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("parentShoppingListId")) setInParentShoppingListId((String) mapValue.get("parentShoppingListId"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("paymentMethodId")) setInPaymentMethodId((String) mapValue.get("paymentMethodId"));
        if (mapValue.containsKey("productPromoCodeId")) setInProductPromoCodeId((String) mapValue.get("productPromoCodeId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("recurrenceInfoId")) setInRecurrenceInfoId((String) mapValue.get("recurrenceInfoId"));
        if (mapValue.containsKey("shipmentMethodTypeId")) setInShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        if (mapValue.containsKey("shippingMethodString")) setInShippingMethodString((String) mapValue.get("shippingMethodString"));
        if (mapValue.containsKey("shoppingListTypeId")) setInShoppingListTypeId((String) mapValue.get("shoppingListTypeId"));
        if (mapValue.containsKey("startDateTime")) setInStartDateTime((Timestamp) mapValue.get("startDateTime"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("visitorId")) setInVisitorId((String) mapValue.get("visitorId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("recurrenceInfoId")) setOutRecurrenceInfoId((String) mapValue.get("recurrenceInfoId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("shoppingListId")) setOutShoppingListId((String) mapValue.get("shoppingListId"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateShoppingList</code> from the input values of the given <code>CreateShoppingList</code>.
     * @param input a <code>CreateShoppingList</code>
     */
    public static CreateShoppingList fromInput(CreateShoppingList input) {
        CreateShoppingList service = new CreateShoppingList();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>CreateShoppingList</code> from the output values of the given <code>CreateShoppingList</code>.
     * @param output a <code>CreateShoppingList</code>
     */
    public static CreateShoppingList fromOutput(CreateShoppingList output) {
        CreateShoppingList service = new CreateShoppingList();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateShoppingList</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateShoppingList fromInput(Map<String, Object> mapValue) {
        CreateShoppingList service = new CreateShoppingList();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>CreateShoppingList</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateShoppingList fromOutput(Map<String, Object> mapValue) {
        CreateShoppingList service = new CreateShoppingList();
        service.putAllOutput(mapValue);
        return service;
    }
}
