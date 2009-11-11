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
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.ofbiz.entity.GenericValue;

/**
 * Auto generated base service entity processAuthResult.
 */
public class ProcessAuthResult extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "processAuthResult";

    /** The enumeration of input parameters. */
    public static enum In {
        authAltRefNum("authAltRefNum"),
        authCode("authCode"),
        authFlag("authFlag"),
        authMessage("authMessage"),
        authRefNum("authRefNum"),
        authResult("authResult"),
        avsCode("avsCode"),
        currencyUomId("currencyUomId"),
        cvCode("cvCode"),
        internalRespMsgs("internalRespMsgs"),
        locale("locale"),
        orderPaymentPreference("orderPaymentPreference"),
        processAmount("processAmount"),
        scoreCode("scoreCode"),
        serviceTypeEnum("serviceTypeEnum"),
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
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private String inAuthAltRefNum;
    private String inAuthCode;
    private String inAuthFlag;
    private String inAuthMessage;
    private String inAuthRefNum;
    private Boolean inAuthResult;
    private String inAvsCode;
    private String inCurrencyUomId;
    private String inCvCode;
    private List inInternalRespMsgs;
    private Locale inLocale;
    private GenericValue inOrderPaymentPreference;
    private BigDecimal inProcessAmount;
    private String inScoreCode;
    private String inServiceTypeEnum;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
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
    public String getInAuthAltRefNum() {
        return this.inAuthAltRefNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAuthCode() {
        return this.inAuthCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAuthFlag() {
        return this.inAuthFlag;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAuthMessage() {
        return this.inAuthMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInAuthRefNum() {
        return this.inAuthRefNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Boolean</code>
     */
    public Boolean getInAuthResult() {
        return this.inAuthResult;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAvsCode() {
        return this.inAvsCode;
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
    public String getInCvCode() {
        return this.inCvCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInInternalRespMsgs() {
        return this.inInternalRespMsgs;
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
     * This parameter is required.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInOrderPaymentPreference() {
        return this.inOrderPaymentPreference;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInProcessAmount() {
        return this.inProcessAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInScoreCode() {
        return this.inScoreCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInServiceTypeEnum() {
        return this.inServiceTypeEnum;
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
     * @param inAuthAltRefNum the inAuthAltRefNum to set
    */
    public void setInAuthAltRefNum(String inAuthAltRefNum) {
        this.inParameters.add("authAltRefNum");
        this.inAuthAltRefNum = inAuthAltRefNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAuthCode the inAuthCode to set
    */
    public void setInAuthCode(String inAuthCode) {
        this.inParameters.add("authCode");
        this.inAuthCode = inAuthCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAuthFlag the inAuthFlag to set
    */
    public void setInAuthFlag(String inAuthFlag) {
        this.inParameters.add("authFlag");
        this.inAuthFlag = inAuthFlag;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAuthMessage the inAuthMessage to set
    */
    public void setInAuthMessage(String inAuthMessage) {
        this.inParameters.add("authMessage");
        this.inAuthMessage = inAuthMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inAuthRefNum the inAuthRefNum to set
    */
    public void setInAuthRefNum(String inAuthRefNum) {
        this.inParameters.add("authRefNum");
        this.inAuthRefNum = inAuthRefNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inAuthResult the inAuthResult to set
    */
    public void setInAuthResult(Boolean inAuthResult) {
        this.inParameters.add("authResult");
        this.inAuthResult = inAuthResult;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAvsCode the inAvsCode to set
    */
    public void setInAvsCode(String inAvsCode) {
        this.inParameters.add("avsCode");
        this.inAvsCode = inAvsCode;
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
     * @param inCvCode the inCvCode to set
    */
    public void setInCvCode(String inCvCode) {
        this.inParameters.add("cvCode");
        this.inCvCode = inCvCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInternalRespMsgs the inInternalRespMsgs to set
    */
    public void setInInternalRespMsgs(List inInternalRespMsgs) {
        this.inParameters.add("internalRespMsgs");
        this.inInternalRespMsgs = inInternalRespMsgs;
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
     * @param inOrderPaymentPreference the inOrderPaymentPreference to set
    */
    public void setInOrderPaymentPreference(GenericValue inOrderPaymentPreference) {
        this.inParameters.add("orderPaymentPreference");
        this.inOrderPaymentPreference = inOrderPaymentPreference;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProcessAmount the inProcessAmount to set
    */
    public void setInProcessAmount(BigDecimal inProcessAmount) {
        this.inParameters.add("processAmount");
        this.inProcessAmount = inProcessAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inScoreCode the inScoreCode to set
    */
    public void setInScoreCode(String inScoreCode) {
        this.inParameters.add("scoreCode");
        this.inScoreCode = inScoreCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inServiceTypeEnum the inServiceTypeEnum to set
    */
    public void setInServiceTypeEnum(String inServiceTypeEnum) {
        this.inParameters.add("serviceTypeEnum");
        this.inServiceTypeEnum = inServiceTypeEnum;
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
        if (inParameters.contains("authAltRefNum")) mapValue.put("authAltRefNum", getInAuthAltRefNum());
        if (inParameters.contains("authCode")) mapValue.put("authCode", getInAuthCode());
        if (inParameters.contains("authFlag")) mapValue.put("authFlag", getInAuthFlag());
        if (inParameters.contains("authMessage")) mapValue.put("authMessage", getInAuthMessage());
        if (inParameters.contains("authRefNum")) mapValue.put("authRefNum", getInAuthRefNum());
        if (inParameters.contains("authResult")) mapValue.put("authResult", getInAuthResult());
        if (inParameters.contains("avsCode")) mapValue.put("avsCode", getInAvsCode());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("cvCode")) mapValue.put("cvCode", getInCvCode());
        if (inParameters.contains("internalRespMsgs")) mapValue.put("internalRespMsgs", getInInternalRespMsgs());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderPaymentPreference")) mapValue.put("orderPaymentPreference", getInOrderPaymentPreference());
        if (inParameters.contains("processAmount")) mapValue.put("processAmount", getInProcessAmount());
        if (inParameters.contains("scoreCode")) mapValue.put("scoreCode", getInScoreCode());
        if (inParameters.contains("serviceTypeEnum")) mapValue.put("serviceTypeEnum", getInServiceTypeEnum());
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
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("authAltRefNum")) setInAuthAltRefNum((String) mapValue.get("authAltRefNum"));
        if (mapValue.containsKey("authCode")) setInAuthCode((String) mapValue.get("authCode"));
        if (mapValue.containsKey("authFlag")) setInAuthFlag((String) mapValue.get("authFlag"));
        if (mapValue.containsKey("authMessage")) setInAuthMessage((String) mapValue.get("authMessage"));
        if (mapValue.containsKey("authRefNum")) setInAuthRefNum((String) mapValue.get("authRefNum"));
        if (mapValue.containsKey("authResult")) setInAuthResult((Boolean) mapValue.get("authResult"));
        if (mapValue.containsKey("avsCode")) setInAvsCode((String) mapValue.get("avsCode"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("cvCode")) setInCvCode((String) mapValue.get("cvCode"));
        if (mapValue.containsKey("internalRespMsgs")) setInInternalRespMsgs((List) mapValue.get("internalRespMsgs"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderPaymentPreference")) setInOrderPaymentPreference((GenericValue) mapValue.get("orderPaymentPreference"));
        if (mapValue.containsKey("processAmount")) setInProcessAmount((BigDecimal) mapValue.get("processAmount"));
        if (mapValue.containsKey("scoreCode")) setInScoreCode((String) mapValue.get("scoreCode"));
        if (mapValue.containsKey("serviceTypeEnum")) setInServiceTypeEnum((String) mapValue.get("serviceTypeEnum"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
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
     * Construct a <code>ProcessAuthResult</code> from the input values of the given <code>ProcessAuthResult</code>.
     * @param input a <code>ProcessAuthResult</code>
     */
    public static ProcessAuthResult fromInput(ProcessAuthResult input) {
        ProcessAuthResult service = new ProcessAuthResult();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>ProcessAuthResult</code> from the output values of the given <code>ProcessAuthResult</code>.
     * @param output a <code>ProcessAuthResult</code>
     */
    public static ProcessAuthResult fromOutput(ProcessAuthResult output) {
        ProcessAuthResult service = new ProcessAuthResult();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>ProcessAuthResult</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static ProcessAuthResult fromInput(Map<String, Object> mapValue) {
        ProcessAuthResult service = new ProcessAuthResult();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>ProcessAuthResult</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static ProcessAuthResult fromOutput(Map<String, Object> mapValue) {
        ProcessAuthResult service = new ProcessAuthResult();
        service.putAllOutput(mapValue);
        return service;
    }
}
