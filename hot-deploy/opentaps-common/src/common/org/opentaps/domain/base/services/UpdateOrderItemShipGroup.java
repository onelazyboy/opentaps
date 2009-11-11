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
 * Auto generated base service entity updateOrderItemShipGroup.
 */
public class UpdateOrderItemShipGroup extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateOrderItemShipGroup";

    /** The enumeration of input parameters. */
    public static enum In {
        carrierPartyId("carrierPartyId"),
        carrierRoleTypeId("carrierRoleTypeId"),
        contactMechId("contactMechId"),
        contactMechPurposeTypeId("contactMechPurposeTypeId"),
        estimatedDeliveryDate("estimatedDeliveryDate"),
        estimatedShipDate("estimatedShipDate"),
        facilityId("facilityId"),
        giftMessage("giftMessage"),
        isGift("isGift"),
        locale("locale"),
        maySplit("maySplit"),
        oldContactMechId("oldContactMechId"),
        orderId("orderId"),
        shipAfterDate("shipAfterDate"),
        shipByDate("shipByDate"),
        shipGroupSeqId("shipGroupSeqId"),
        shipmentMethod("shipmentMethod"),
        shipmentMethodTypeId("shipmentMethodTypeId"),
        shippingInstructions("shippingInstructions"),
        statusId("statusId"),
        supplierPartyId("supplierPartyId"),
        telecomContactMechId("telecomContactMechId"),
        thirdPartyAccountNumber("thirdPartyAccountNumber"),
        thirdPartyCountryGeoCode("thirdPartyCountryGeoCode"),
        thirdPartyPostalCode("thirdPartyPostalCode"),
        timeZone("timeZone"),
        trackingNumber("trackingNumber"),
        userLogin("userLogin"),
        vendorPartyId("vendorPartyId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
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

    private String inCarrierPartyId;
    private String inCarrierRoleTypeId;
    private String inContactMechId;
    private String inContactMechPurposeTypeId;
    private Timestamp inEstimatedDeliveryDate;
    private Timestamp inEstimatedShipDate;
    private String inFacilityId;
    private String inGiftMessage;
    private String inIsGift;
    private Locale inLocale;
    private String inMaySplit;
    private String inOldContactMechId;
    private String inOrderId;
    private Timestamp inShipAfterDate;
    private Timestamp inShipByDate;
    private String inShipGroupSeqId;
    private String inShipmentMethod;
    private String inShipmentMethodTypeId;
    private String inShippingInstructions;
    private String inStatusId;
    private String inSupplierPartyId;
    private String inTelecomContactMechId;
    private String inThirdPartyAccountNumber;
    private String inThirdPartyCountryGeoCode;
    private String inThirdPartyPostalCode;
    private TimeZone inTimeZone;
    private String inTrackingNumber;
    private GenericValue inUserLogin;
    private String inVendorPartyId;
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
    public String getInContactMechPurposeTypeId() {
        return this.inContactMechPurposeTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEstimatedDeliveryDate() {
        return this.inEstimatedDeliveryDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEstimatedShipDate() {
        return this.inEstimatedShipDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFacilityId() {
        return this.inFacilityId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGiftMessage() {
        return this.inGiftMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsGift() {
        return this.inIsGift;
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
    public String getInMaySplit() {
        return this.inMaySplit;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOldContactMechId() {
        return this.inOldContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInOrderId() {
        return this.inOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInShipAfterDate() {
        return this.inShipAfterDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInShipByDate() {
        return this.inShipByDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipGroupSeqId() {
        return this.inShipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipmentMethod() {
        return this.inShipmentMethod;
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
    public String getInShippingInstructions() {
        return this.inShippingInstructions;
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
     * @return <code>String</code>
     */
    public String getInSupplierPartyId() {
        return this.inSupplierPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTelecomContactMechId() {
        return this.inTelecomContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInThirdPartyAccountNumber() {
        return this.inThirdPartyAccountNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInThirdPartyCountryGeoCode() {
        return this.inThirdPartyCountryGeoCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInThirdPartyPostalCode() {
        return this.inThirdPartyPostalCode;
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
    public String getInTrackingNumber() {
        return this.inTrackingNumber;
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
    public String getInVendorPartyId() {
        return this.inVendorPartyId;
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
     * @param inContactMechPurposeTypeId the inContactMechPurposeTypeId to set
    */
    public void setInContactMechPurposeTypeId(String inContactMechPurposeTypeId) {
        this.inParameters.add("contactMechPurposeTypeId");
        this.inContactMechPurposeTypeId = inContactMechPurposeTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEstimatedDeliveryDate the inEstimatedDeliveryDate to set
    */
    public void setInEstimatedDeliveryDate(Timestamp inEstimatedDeliveryDate) {
        this.inParameters.add("estimatedDeliveryDate");
        this.inEstimatedDeliveryDate = inEstimatedDeliveryDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEstimatedShipDate the inEstimatedShipDate to set
    */
    public void setInEstimatedShipDate(Timestamp inEstimatedShipDate) {
        this.inParameters.add("estimatedShipDate");
        this.inEstimatedShipDate = inEstimatedShipDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFacilityId the inFacilityId to set
    */
    public void setInFacilityId(String inFacilityId) {
        this.inParameters.add("facilityId");
        this.inFacilityId = inFacilityId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGiftMessage the inGiftMessage to set
    */
    public void setInGiftMessage(String inGiftMessage) {
        this.inParameters.add("giftMessage");
        this.inGiftMessage = inGiftMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsGift the inIsGift to set
    */
    public void setInIsGift(String inIsGift) {
        this.inParameters.add("isGift");
        this.inIsGift = inIsGift;
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
     * @param inMaySplit the inMaySplit to set
    */
    public void setInMaySplit(String inMaySplit) {
        this.inParameters.add("maySplit");
        this.inMaySplit = inMaySplit;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOldContactMechId the inOldContactMechId to set
    */
    public void setInOldContactMechId(String inOldContactMechId) {
        this.inParameters.add("oldContactMechId");
        this.inOldContactMechId = inOldContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOrderId the inOrderId to set
    */
    public void setInOrderId(String inOrderId) {
        this.inParameters.add("orderId");
        this.inOrderId = inOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipAfterDate the inShipAfterDate to set
    */
    public void setInShipAfterDate(Timestamp inShipAfterDate) {
        this.inParameters.add("shipAfterDate");
        this.inShipAfterDate = inShipAfterDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipByDate the inShipByDate to set
    */
    public void setInShipByDate(Timestamp inShipByDate) {
        this.inParameters.add("shipByDate");
        this.inShipByDate = inShipByDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipGroupSeqId the inShipGroupSeqId to set
    */
    public void setInShipGroupSeqId(String inShipGroupSeqId) {
        this.inParameters.add("shipGroupSeqId");
        this.inShipGroupSeqId = inShipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipmentMethod the inShipmentMethod to set
    */
    public void setInShipmentMethod(String inShipmentMethod) {
        this.inParameters.add("shipmentMethod");
        this.inShipmentMethod = inShipmentMethod;
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
     * @param inShippingInstructions the inShippingInstructions to set
    */
    public void setInShippingInstructions(String inShippingInstructions) {
        this.inParameters.add("shippingInstructions");
        this.inShippingInstructions = inShippingInstructions;
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
     * @param inSupplierPartyId the inSupplierPartyId to set
    */
    public void setInSupplierPartyId(String inSupplierPartyId) {
        this.inParameters.add("supplierPartyId");
        this.inSupplierPartyId = inSupplierPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTelecomContactMechId the inTelecomContactMechId to set
    */
    public void setInTelecomContactMechId(String inTelecomContactMechId) {
        this.inParameters.add("telecomContactMechId");
        this.inTelecomContactMechId = inTelecomContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThirdPartyAccountNumber the inThirdPartyAccountNumber to set
    */
    public void setInThirdPartyAccountNumber(String inThirdPartyAccountNumber) {
        this.inParameters.add("thirdPartyAccountNumber");
        this.inThirdPartyAccountNumber = inThirdPartyAccountNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThirdPartyCountryGeoCode the inThirdPartyCountryGeoCode to set
    */
    public void setInThirdPartyCountryGeoCode(String inThirdPartyCountryGeoCode) {
        this.inParameters.add("thirdPartyCountryGeoCode");
        this.inThirdPartyCountryGeoCode = inThirdPartyCountryGeoCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThirdPartyPostalCode the inThirdPartyPostalCode to set
    */
    public void setInThirdPartyPostalCode(String inThirdPartyPostalCode) {
        this.inParameters.add("thirdPartyPostalCode");
        this.inThirdPartyPostalCode = inThirdPartyPostalCode;
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
     * @param inTrackingNumber the inTrackingNumber to set
    */
    public void setInTrackingNumber(String inTrackingNumber) {
        this.inParameters.add("trackingNumber");
        this.inTrackingNumber = inTrackingNumber;
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
     * @param inVendorPartyId the inVendorPartyId to set
    */
    public void setInVendorPartyId(String inVendorPartyId) {
        this.inParameters.add("vendorPartyId");
        this.inVendorPartyId = inVendorPartyId;
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
        if (inParameters.contains("carrierPartyId")) mapValue.put("carrierPartyId", getInCarrierPartyId());
        if (inParameters.contains("carrierRoleTypeId")) mapValue.put("carrierRoleTypeId", getInCarrierRoleTypeId());
        if (inParameters.contains("contactMechId")) mapValue.put("contactMechId", getInContactMechId());
        if (inParameters.contains("contactMechPurposeTypeId")) mapValue.put("contactMechPurposeTypeId", getInContactMechPurposeTypeId());
        if (inParameters.contains("estimatedDeliveryDate")) mapValue.put("estimatedDeliveryDate", getInEstimatedDeliveryDate());
        if (inParameters.contains("estimatedShipDate")) mapValue.put("estimatedShipDate", getInEstimatedShipDate());
        if (inParameters.contains("facilityId")) mapValue.put("facilityId", getInFacilityId());
        if (inParameters.contains("giftMessage")) mapValue.put("giftMessage", getInGiftMessage());
        if (inParameters.contains("isGift")) mapValue.put("isGift", getInIsGift());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maySplit")) mapValue.put("maySplit", getInMaySplit());
        if (inParameters.contains("oldContactMechId")) mapValue.put("oldContactMechId", getInOldContactMechId());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("shipAfterDate")) mapValue.put("shipAfterDate", getInShipAfterDate());
        if (inParameters.contains("shipByDate")) mapValue.put("shipByDate", getInShipByDate());
        if (inParameters.contains("shipGroupSeqId")) mapValue.put("shipGroupSeqId", getInShipGroupSeqId());
        if (inParameters.contains("shipmentMethod")) mapValue.put("shipmentMethod", getInShipmentMethod());
        if (inParameters.contains("shipmentMethodTypeId")) mapValue.put("shipmentMethodTypeId", getInShipmentMethodTypeId());
        if (inParameters.contains("shippingInstructions")) mapValue.put("shippingInstructions", getInShippingInstructions());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("supplierPartyId")) mapValue.put("supplierPartyId", getInSupplierPartyId());
        if (inParameters.contains("telecomContactMechId")) mapValue.put("telecomContactMechId", getInTelecomContactMechId());
        if (inParameters.contains("thirdPartyAccountNumber")) mapValue.put("thirdPartyAccountNumber", getInThirdPartyAccountNumber());
        if (inParameters.contains("thirdPartyCountryGeoCode")) mapValue.put("thirdPartyCountryGeoCode", getInThirdPartyCountryGeoCode());
        if (inParameters.contains("thirdPartyPostalCode")) mapValue.put("thirdPartyPostalCode", getInThirdPartyPostalCode());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("trackingNumber")) mapValue.put("trackingNumber", getInTrackingNumber());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("vendorPartyId")) mapValue.put("vendorPartyId", getInVendorPartyId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
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
        if (mapValue.containsKey("carrierPartyId")) setInCarrierPartyId((String) mapValue.get("carrierPartyId"));
        if (mapValue.containsKey("carrierRoleTypeId")) setInCarrierRoleTypeId((String) mapValue.get("carrierRoleTypeId"));
        if (mapValue.containsKey("contactMechId")) setInContactMechId((String) mapValue.get("contactMechId"));
        if (mapValue.containsKey("contactMechPurposeTypeId")) setInContactMechPurposeTypeId((String) mapValue.get("contactMechPurposeTypeId"));
        if (mapValue.containsKey("estimatedDeliveryDate")) setInEstimatedDeliveryDate((Timestamp) mapValue.get("estimatedDeliveryDate"));
        if (mapValue.containsKey("estimatedShipDate")) setInEstimatedShipDate((Timestamp) mapValue.get("estimatedShipDate"));
        if (mapValue.containsKey("facilityId")) setInFacilityId((String) mapValue.get("facilityId"));
        if (mapValue.containsKey("giftMessage")) setInGiftMessage((String) mapValue.get("giftMessage"));
        if (mapValue.containsKey("isGift")) setInIsGift((String) mapValue.get("isGift"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maySplit")) setInMaySplit((String) mapValue.get("maySplit"));
        if (mapValue.containsKey("oldContactMechId")) setInOldContactMechId((String) mapValue.get("oldContactMechId"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("shipAfterDate")) setInShipAfterDate((Timestamp) mapValue.get("shipAfterDate"));
        if (mapValue.containsKey("shipByDate")) setInShipByDate((Timestamp) mapValue.get("shipByDate"));
        if (mapValue.containsKey("shipGroupSeqId")) setInShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        if (mapValue.containsKey("shipmentMethod")) setInShipmentMethod((String) mapValue.get("shipmentMethod"));
        if (mapValue.containsKey("shipmentMethodTypeId")) setInShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        if (mapValue.containsKey("shippingInstructions")) setInShippingInstructions((String) mapValue.get("shippingInstructions"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("supplierPartyId")) setInSupplierPartyId((String) mapValue.get("supplierPartyId"));
        if (mapValue.containsKey("telecomContactMechId")) setInTelecomContactMechId((String) mapValue.get("telecomContactMechId"));
        if (mapValue.containsKey("thirdPartyAccountNumber")) setInThirdPartyAccountNumber((String) mapValue.get("thirdPartyAccountNumber"));
        if (mapValue.containsKey("thirdPartyCountryGeoCode")) setInThirdPartyCountryGeoCode((String) mapValue.get("thirdPartyCountryGeoCode"));
        if (mapValue.containsKey("thirdPartyPostalCode")) setInThirdPartyPostalCode((String) mapValue.get("thirdPartyPostalCode"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("trackingNumber")) setInTrackingNumber((String) mapValue.get("trackingNumber"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("vendorPartyId")) setInVendorPartyId((String) mapValue.get("vendorPartyId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
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
     * Construct a <code>UpdateOrderItemShipGroup</code> from the input values of the given <code>UpdateOrderItemShipGroup</code>.
     * @param input a <code>UpdateOrderItemShipGroup</code>
     */
    public static UpdateOrderItemShipGroup fromInput(UpdateOrderItemShipGroup input) {
        UpdateOrderItemShipGroup service = new UpdateOrderItemShipGroup();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateOrderItemShipGroup</code> from the output values of the given <code>UpdateOrderItemShipGroup</code>.
     * @param output a <code>UpdateOrderItemShipGroup</code>
     */
    public static UpdateOrderItemShipGroup fromOutput(UpdateOrderItemShipGroup output) {
        UpdateOrderItemShipGroup service = new UpdateOrderItemShipGroup();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateOrderItemShipGroup</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateOrderItemShipGroup fromInput(Map<String, Object> mapValue) {
        UpdateOrderItemShipGroup service = new UpdateOrderItemShipGroup();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>UpdateOrderItemShipGroup</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateOrderItemShipGroup fromOutput(Map<String, Object> mapValue) {
        UpdateOrderItemShipGroup service = new UpdateOrderItemShipGroup();
        service.putAllOutput(mapValue);
        return service;
    }
}
