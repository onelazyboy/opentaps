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

import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.ofbiz.entity.GenericValue;

/**
 * Auto generated base service entity purchasing.createSupplier.
 */
public class PurchasingCreateSupplier extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "purchasing.createSupplier";

    /** The enumeration of input parameters. */
    public static enum In {
        federalTaxId("federalTaxId"),
        generalAddress1("generalAddress1"),
        generalAddress2("generalAddress2"),
        generalAttnName("generalAttnName"),
        generalCity("generalCity"),
        generalCountryGeoId("generalCountryGeoId"),
        generalPostalCode("generalPostalCode"),
        generalStateProvinceGeoId("generalStateProvinceGeoId"),
        generalToName("generalToName"),
        groupName("groupName"),
        isIncorporated("isIncorporated"),
        locale("locale"),
        partyId("partyId"),
        primaryEmail("primaryEmail"),
        primaryFaxAreaCode("primaryFaxAreaCode"),
        primaryFaxCountryCode("primaryFaxCountryCode"),
        primaryFaxExtension("primaryFaxExtension"),
        primaryFaxNumber("primaryFaxNumber"),
        primaryPhoneAreaCode("primaryPhoneAreaCode"),
        primaryPhoneCountryCode("primaryPhoneCountryCode"),
        primaryPhoneExtension("primaryPhoneExtension"),
        primaryPhoneNumber("primaryPhoneNumber"),
        primaryWebUrl("primaryWebUrl"),
        requires1099("requires1099"),
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
        partyId("partyId"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private String inFederalTaxId;
    private String inGeneralAddress1;
    private String inGeneralAddress2;
    private String inGeneralAttnName;
    private String inGeneralCity;
    private String inGeneralCountryGeoId;
    private String inGeneralPostalCode;
    private String inGeneralStateProvinceGeoId;
    private String inGeneralToName;
    private String inGroupName;
    private String inIsIncorporated;
    private Locale inLocale;
    private String inPartyId;
    private String inPrimaryEmail;
    private String inPrimaryFaxAreaCode;
    private String inPrimaryFaxCountryCode;
    private String inPrimaryFaxExtension;
    private String inPrimaryFaxNumber;
    private String inPrimaryPhoneAreaCode;
    private String inPrimaryPhoneCountryCode;
    private String inPrimaryPhoneExtension;
    private String inPrimaryPhoneNumber;
    private String inPrimaryWebUrl;
    private String inRequires1099;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outPartyId;
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
    public String getInFederalTaxId() {
        return this.inFederalTaxId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralAddress1() {
        return this.inGeneralAddress1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralAddress2() {
        return this.inGeneralAddress2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralAttnName() {
        return this.inGeneralAttnName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralCity() {
        return this.inGeneralCity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralCountryGeoId() {
        return this.inGeneralCountryGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralPostalCode() {
        return this.inGeneralPostalCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralStateProvinceGeoId() {
        return this.inGeneralStateProvinceGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGeneralToName() {
        return this.inGeneralToName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInGroupName() {
        return this.inGroupName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsIncorporated() {
        return this.inIsIncorporated;
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
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryEmail() {
        return this.inPrimaryEmail;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryFaxAreaCode() {
        return this.inPrimaryFaxAreaCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryFaxCountryCode() {
        return this.inPrimaryFaxCountryCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryFaxExtension() {
        return this.inPrimaryFaxExtension;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryFaxNumber() {
        return this.inPrimaryFaxNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryPhoneAreaCode() {
        return this.inPrimaryPhoneAreaCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryPhoneCountryCode() {
        return this.inPrimaryPhoneCountryCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryPhoneExtension() {
        return this.inPrimaryPhoneExtension;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryPhoneNumber() {
        return this.inPrimaryPhoneNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPrimaryWebUrl() {
        return this.inPrimaryWebUrl;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInRequires1099() {
        return this.inRequires1099;
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
     * @return <code>String</code>
     */
    public String getOutPartyId() {
        return this.outPartyId;
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
     * @param inFederalTaxId the inFederalTaxId to set
    */
    public void setInFederalTaxId(String inFederalTaxId) {
        this.inParameters.add("federalTaxId");
        this.inFederalTaxId = inFederalTaxId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralAddress1 the inGeneralAddress1 to set
    */
    public void setInGeneralAddress1(String inGeneralAddress1) {
        this.inParameters.add("generalAddress1");
        this.inGeneralAddress1 = inGeneralAddress1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralAddress2 the inGeneralAddress2 to set
    */
    public void setInGeneralAddress2(String inGeneralAddress2) {
        this.inParameters.add("generalAddress2");
        this.inGeneralAddress2 = inGeneralAddress2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralAttnName the inGeneralAttnName to set
    */
    public void setInGeneralAttnName(String inGeneralAttnName) {
        this.inParameters.add("generalAttnName");
        this.inGeneralAttnName = inGeneralAttnName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralCity the inGeneralCity to set
    */
    public void setInGeneralCity(String inGeneralCity) {
        this.inParameters.add("generalCity");
        this.inGeneralCity = inGeneralCity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralCountryGeoId the inGeneralCountryGeoId to set
    */
    public void setInGeneralCountryGeoId(String inGeneralCountryGeoId) {
        this.inParameters.add("generalCountryGeoId");
        this.inGeneralCountryGeoId = inGeneralCountryGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralPostalCode the inGeneralPostalCode to set
    */
    public void setInGeneralPostalCode(String inGeneralPostalCode) {
        this.inParameters.add("generalPostalCode");
        this.inGeneralPostalCode = inGeneralPostalCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralStateProvinceGeoId the inGeneralStateProvinceGeoId to set
    */
    public void setInGeneralStateProvinceGeoId(String inGeneralStateProvinceGeoId) {
        this.inParameters.add("generalStateProvinceGeoId");
        this.inGeneralStateProvinceGeoId = inGeneralStateProvinceGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGeneralToName the inGeneralToName to set
    */
    public void setInGeneralToName(String inGeneralToName) {
        this.inParameters.add("generalToName");
        this.inGeneralToName = inGeneralToName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inGroupName the inGroupName to set
    */
    public void setInGroupName(String inGroupName) {
        this.inParameters.add("groupName");
        this.inGroupName = inGroupName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsIncorporated the inIsIncorporated to set
    */
    public void setInIsIncorporated(String inIsIncorporated) {
        this.inParameters.add("isIncorporated");
        this.inIsIncorporated = inIsIncorporated;
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
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryEmail the inPrimaryEmail to set
    */
    public void setInPrimaryEmail(String inPrimaryEmail) {
        this.inParameters.add("primaryEmail");
        this.inPrimaryEmail = inPrimaryEmail;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryFaxAreaCode the inPrimaryFaxAreaCode to set
    */
    public void setInPrimaryFaxAreaCode(String inPrimaryFaxAreaCode) {
        this.inParameters.add("primaryFaxAreaCode");
        this.inPrimaryFaxAreaCode = inPrimaryFaxAreaCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryFaxCountryCode the inPrimaryFaxCountryCode to set
    */
    public void setInPrimaryFaxCountryCode(String inPrimaryFaxCountryCode) {
        this.inParameters.add("primaryFaxCountryCode");
        this.inPrimaryFaxCountryCode = inPrimaryFaxCountryCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryFaxExtension the inPrimaryFaxExtension to set
    */
    public void setInPrimaryFaxExtension(String inPrimaryFaxExtension) {
        this.inParameters.add("primaryFaxExtension");
        this.inPrimaryFaxExtension = inPrimaryFaxExtension;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryFaxNumber the inPrimaryFaxNumber to set
    */
    public void setInPrimaryFaxNumber(String inPrimaryFaxNumber) {
        this.inParameters.add("primaryFaxNumber");
        this.inPrimaryFaxNumber = inPrimaryFaxNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryPhoneAreaCode the inPrimaryPhoneAreaCode to set
    */
    public void setInPrimaryPhoneAreaCode(String inPrimaryPhoneAreaCode) {
        this.inParameters.add("primaryPhoneAreaCode");
        this.inPrimaryPhoneAreaCode = inPrimaryPhoneAreaCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryPhoneCountryCode the inPrimaryPhoneCountryCode to set
    */
    public void setInPrimaryPhoneCountryCode(String inPrimaryPhoneCountryCode) {
        this.inParameters.add("primaryPhoneCountryCode");
        this.inPrimaryPhoneCountryCode = inPrimaryPhoneCountryCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryPhoneExtension the inPrimaryPhoneExtension to set
    */
    public void setInPrimaryPhoneExtension(String inPrimaryPhoneExtension) {
        this.inParameters.add("primaryPhoneExtension");
        this.inPrimaryPhoneExtension = inPrimaryPhoneExtension;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryPhoneNumber the inPrimaryPhoneNumber to set
    */
    public void setInPrimaryPhoneNumber(String inPrimaryPhoneNumber) {
        this.inParameters.add("primaryPhoneNumber");
        this.inPrimaryPhoneNumber = inPrimaryPhoneNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPrimaryWebUrl the inPrimaryWebUrl to set
    */
    public void setInPrimaryWebUrl(String inPrimaryWebUrl) {
        this.inParameters.add("primaryWebUrl");
        this.inPrimaryWebUrl = inPrimaryWebUrl;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inRequires1099 the inRequires1099 to set
    */
    public void setInRequires1099(String inRequires1099) {
        this.inParameters.add("requires1099");
        this.inRequires1099 = inRequires1099;
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
     * @param outPartyId the outPartyId to set
    */
    public void setOutPartyId(String outPartyId) {
        this.outParameters.add("partyId");
        this.outPartyId = outPartyId;
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
        if (inParameters.contains("federalTaxId")) mapValue.put("federalTaxId", getInFederalTaxId());
        if (inParameters.contains("generalAddress1")) mapValue.put("generalAddress1", getInGeneralAddress1());
        if (inParameters.contains("generalAddress2")) mapValue.put("generalAddress2", getInGeneralAddress2());
        if (inParameters.contains("generalAttnName")) mapValue.put("generalAttnName", getInGeneralAttnName());
        if (inParameters.contains("generalCity")) mapValue.put("generalCity", getInGeneralCity());
        if (inParameters.contains("generalCountryGeoId")) mapValue.put("generalCountryGeoId", getInGeneralCountryGeoId());
        if (inParameters.contains("generalPostalCode")) mapValue.put("generalPostalCode", getInGeneralPostalCode());
        if (inParameters.contains("generalStateProvinceGeoId")) mapValue.put("generalStateProvinceGeoId", getInGeneralStateProvinceGeoId());
        if (inParameters.contains("generalToName")) mapValue.put("generalToName", getInGeneralToName());
        if (inParameters.contains("groupName")) mapValue.put("groupName", getInGroupName());
        if (inParameters.contains("isIncorporated")) mapValue.put("isIncorporated", getInIsIncorporated());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("primaryEmail")) mapValue.put("primaryEmail", getInPrimaryEmail());
        if (inParameters.contains("primaryFaxAreaCode")) mapValue.put("primaryFaxAreaCode", getInPrimaryFaxAreaCode());
        if (inParameters.contains("primaryFaxCountryCode")) mapValue.put("primaryFaxCountryCode", getInPrimaryFaxCountryCode());
        if (inParameters.contains("primaryFaxExtension")) mapValue.put("primaryFaxExtension", getInPrimaryFaxExtension());
        if (inParameters.contains("primaryFaxNumber")) mapValue.put("primaryFaxNumber", getInPrimaryFaxNumber());
        if (inParameters.contains("primaryPhoneAreaCode")) mapValue.put("primaryPhoneAreaCode", getInPrimaryPhoneAreaCode());
        if (inParameters.contains("primaryPhoneCountryCode")) mapValue.put("primaryPhoneCountryCode", getInPrimaryPhoneCountryCode());
        if (inParameters.contains("primaryPhoneExtension")) mapValue.put("primaryPhoneExtension", getInPrimaryPhoneExtension());
        if (inParameters.contains("primaryPhoneNumber")) mapValue.put("primaryPhoneNumber", getInPrimaryPhoneNumber());
        if (inParameters.contains("primaryWebUrl")) mapValue.put("primaryWebUrl", getInPrimaryWebUrl());
        if (inParameters.contains("requires1099")) mapValue.put("requires1099", getInRequires1099());
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
        if (outParameters.contains("partyId")) mapValue.put("partyId", getOutPartyId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("federalTaxId")) setInFederalTaxId((String) mapValue.get("federalTaxId"));
        if (mapValue.containsKey("generalAddress1")) setInGeneralAddress1((String) mapValue.get("generalAddress1"));
        if (mapValue.containsKey("generalAddress2")) setInGeneralAddress2((String) mapValue.get("generalAddress2"));
        if (mapValue.containsKey("generalAttnName")) setInGeneralAttnName((String) mapValue.get("generalAttnName"));
        if (mapValue.containsKey("generalCity")) setInGeneralCity((String) mapValue.get("generalCity"));
        if (mapValue.containsKey("generalCountryGeoId")) setInGeneralCountryGeoId((String) mapValue.get("generalCountryGeoId"));
        if (mapValue.containsKey("generalPostalCode")) setInGeneralPostalCode((String) mapValue.get("generalPostalCode"));
        if (mapValue.containsKey("generalStateProvinceGeoId")) setInGeneralStateProvinceGeoId((String) mapValue.get("generalStateProvinceGeoId"));
        if (mapValue.containsKey("generalToName")) setInGeneralToName((String) mapValue.get("generalToName"));
        if (mapValue.containsKey("groupName")) setInGroupName((String) mapValue.get("groupName"));
        if (mapValue.containsKey("isIncorporated")) setInIsIncorporated((String) mapValue.get("isIncorporated"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("primaryEmail")) setInPrimaryEmail((String) mapValue.get("primaryEmail"));
        if (mapValue.containsKey("primaryFaxAreaCode")) setInPrimaryFaxAreaCode((String) mapValue.get("primaryFaxAreaCode"));
        if (mapValue.containsKey("primaryFaxCountryCode")) setInPrimaryFaxCountryCode((String) mapValue.get("primaryFaxCountryCode"));
        if (mapValue.containsKey("primaryFaxExtension")) setInPrimaryFaxExtension((String) mapValue.get("primaryFaxExtension"));
        if (mapValue.containsKey("primaryFaxNumber")) setInPrimaryFaxNumber((String) mapValue.get("primaryFaxNumber"));
        if (mapValue.containsKey("primaryPhoneAreaCode")) setInPrimaryPhoneAreaCode((String) mapValue.get("primaryPhoneAreaCode"));
        if (mapValue.containsKey("primaryPhoneCountryCode")) setInPrimaryPhoneCountryCode((String) mapValue.get("primaryPhoneCountryCode"));
        if (mapValue.containsKey("primaryPhoneExtension")) setInPrimaryPhoneExtension((String) mapValue.get("primaryPhoneExtension"));
        if (mapValue.containsKey("primaryPhoneNumber")) setInPrimaryPhoneNumber((String) mapValue.get("primaryPhoneNumber"));
        if (mapValue.containsKey("primaryWebUrl")) setInPrimaryWebUrl((String) mapValue.get("primaryWebUrl"));
        if (mapValue.containsKey("requires1099")) setInRequires1099((String) mapValue.get("requires1099"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setOutPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>PurchasingCreateSupplier</code> from the input values of the given <code>PurchasingCreateSupplier</code>.
     * @param input a <code>PurchasingCreateSupplier</code>
     */
    public static PurchasingCreateSupplier fromInput(PurchasingCreateSupplier input) {
        PurchasingCreateSupplier service = new PurchasingCreateSupplier();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>PurchasingCreateSupplier</code> from the output values of the given <code>PurchasingCreateSupplier</code>.
     * @param output a <code>PurchasingCreateSupplier</code>
     */
    public static PurchasingCreateSupplier fromOutput(PurchasingCreateSupplier output) {
        PurchasingCreateSupplier service = new PurchasingCreateSupplier();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>PurchasingCreateSupplier</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static PurchasingCreateSupplier fromInput(Map<String, Object> mapValue) {
        PurchasingCreateSupplier service = new PurchasingCreateSupplier();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>PurchasingCreateSupplier</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static PurchasingCreateSupplier fromOutput(Map<String, Object> mapValue) {
        PurchasingCreateSupplier service = new PurchasingCreateSupplier();
        service.putAllOutput(mapValue);
        return service;
    }
}
