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
 * Auto generated base service entity getCurrentPartyEmploymentData.
 */
public class GetCurrentPartyEmploymentData extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getCurrentPartyEmploymentData";

    /** The enumeration of input parameters. */
    public static enum In {
        locale("locale"),
        partyId("partyId"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        emplPosition("emplPosition"),
        emplPositionRateAmount("emplPositionRateAmount"),
        emplPositionRateType("emplPositionRateType"),
        emplPositionType("emplPositionType"),
        employment("employment"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        partyBenefitTypes("partyBenefitTypes"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private Locale inLocale;
    private String inPartyId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private GenericValue outEmplPosition;
    private GenericValue outEmplPositionRateAmount;
    private GenericValue outEmplPositionRateType;
    private GenericValue outEmplPositionType;
    private GenericValue outEmployment;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private List outPartyBenefitTypes;
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
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInPartyId() {
        return this.inPartyId;
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
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutEmplPosition() {
        return this.outEmplPosition;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutEmplPositionRateAmount() {
        return this.outEmplPositionRateAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutEmplPositionRateType() {
        return this.outEmplPositionRateType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutEmplPositionType() {
        return this.outEmplPositionType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutEmployment() {
        return this.outEmployment;
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
    public List getOutPartyBenefitTypes() {
        return this.outPartyBenefitTypes;
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
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
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
     * @param outEmplPosition the outEmplPosition to set
    */
    public void setOutEmplPosition(GenericValue outEmplPosition) {
        this.outParameters.add("emplPosition");
        this.outEmplPosition = outEmplPosition;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outEmplPositionRateAmount the outEmplPositionRateAmount to set
    */
    public void setOutEmplPositionRateAmount(GenericValue outEmplPositionRateAmount) {
        this.outParameters.add("emplPositionRateAmount");
        this.outEmplPositionRateAmount = outEmplPositionRateAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outEmplPositionRateType the outEmplPositionRateType to set
    */
    public void setOutEmplPositionRateType(GenericValue outEmplPositionRateType) {
        this.outParameters.add("emplPositionRateType");
        this.outEmplPositionRateType = outEmplPositionRateType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outEmplPositionType the outEmplPositionType to set
    */
    public void setOutEmplPositionType(GenericValue outEmplPositionType) {
        this.outParameters.add("emplPositionType");
        this.outEmplPositionType = outEmplPositionType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outEmployment the outEmployment to set
    */
    public void setOutEmployment(GenericValue outEmployment) {
        this.outParameters.add("employment");
        this.outEmployment = outEmployment;
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
     * @param outPartyBenefitTypes the outPartyBenefitTypes to set
    */
    public void setOutPartyBenefitTypes(List outPartyBenefitTypes) {
        this.outParameters.add("partyBenefitTypes");
        this.outPartyBenefitTypes = outPartyBenefitTypes;
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
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("emplPosition")) mapValue.put("emplPosition", getOutEmplPosition());
        if (outParameters.contains("emplPositionRateAmount")) mapValue.put("emplPositionRateAmount", getOutEmplPositionRateAmount());
        if (outParameters.contains("emplPositionRateType")) mapValue.put("emplPositionRateType", getOutEmplPositionRateType());
        if (outParameters.contains("emplPositionType")) mapValue.put("emplPositionType", getOutEmplPositionType());
        if (outParameters.contains("employment")) mapValue.put("employment", getOutEmployment());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("partyBenefitTypes")) mapValue.put("partyBenefitTypes", getOutPartyBenefitTypes());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("emplPosition")) setOutEmplPosition((GenericValue) mapValue.get("emplPosition"));
        if (mapValue.containsKey("emplPositionRateAmount")) setOutEmplPositionRateAmount((GenericValue) mapValue.get("emplPositionRateAmount"));
        if (mapValue.containsKey("emplPositionRateType")) setOutEmplPositionRateType((GenericValue) mapValue.get("emplPositionRateType"));
        if (mapValue.containsKey("emplPositionType")) setOutEmplPositionType((GenericValue) mapValue.get("emplPositionType"));
        if (mapValue.containsKey("employment")) setOutEmployment((GenericValue) mapValue.get("employment"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyBenefitTypes")) setOutPartyBenefitTypes((List) mapValue.get("partyBenefitTypes"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>GetCurrentPartyEmploymentData</code> from the input values of the given <code>GetCurrentPartyEmploymentData</code>.
     * @param input a <code>GetCurrentPartyEmploymentData</code>
     */
    public static GetCurrentPartyEmploymentData fromInput(GetCurrentPartyEmploymentData input) {
        GetCurrentPartyEmploymentData service = new GetCurrentPartyEmploymentData();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>GetCurrentPartyEmploymentData</code> from the output values of the given <code>GetCurrentPartyEmploymentData</code>.
     * @param output a <code>GetCurrentPartyEmploymentData</code>
     */
    public static GetCurrentPartyEmploymentData fromOutput(GetCurrentPartyEmploymentData output) {
        GetCurrentPartyEmploymentData service = new GetCurrentPartyEmploymentData();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetCurrentPartyEmploymentData</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetCurrentPartyEmploymentData fromInput(Map<String, Object> mapValue) {
        GetCurrentPartyEmploymentData service = new GetCurrentPartyEmploymentData();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>GetCurrentPartyEmploymentData</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetCurrentPartyEmploymentData fromOutput(Map<String, Object> mapValue) {
        GetCurrentPartyEmploymentData service = new GetCurrentPartyEmploymentData();
        service.putAllOutput(mapValue);
        return service;
    }
}
