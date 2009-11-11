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
 * Auto generated base service entity testGCRelease.
 */
public class TestGCRelease extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "testGCRelease";

    /** The enumeration of input parameters. */
    public static enum In {
        authTrans("authTrans"),
        currency("currency"),
        locale("locale"),
        orderPaymentPreference("orderPaymentPreference"),
        paymentConfig("paymentConfig"),
        paymentGatewayConfigId("paymentGatewayConfigId"),
        releaseAmount("releaseAmount"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        internalRespMsgs("internalRespMsgs"),
        locale("locale"),
        releaseAltRefNum("releaseAltRefNum"),
        releaseAmount("releaseAmount"),
        releaseCode("releaseCode"),
        releaseFlag("releaseFlag"),
        releaseMessage("releaseMessage"),
        releaseRefNum("releaseRefNum"),
        releaseResult("releaseResult"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private GenericValue inAuthTrans;
    private String inCurrency;
    private Locale inLocale;
    private GenericValue inOrderPaymentPreference;
    private String inPaymentConfig;
    private String inPaymentGatewayConfigId;
    private BigDecimal inReleaseAmount;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private List outInternalRespMsgs;
    private Locale outLocale;
    private String outReleaseAltRefNum;
    private BigDecimal outReleaseAmount;
    private String outReleaseCode;
    private String outReleaseFlag;
    private String outReleaseMessage;
    private String outReleaseRefNum;
    private Boolean outReleaseResult;
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
     * @return <code>GenericValue</code>
     */
    public GenericValue getInAuthTrans() {
        return this.inAuthTrans;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrency() {
        return this.inCurrency;
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
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentConfig() {
        return this.inPaymentConfig;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentGatewayConfigId() {
        return this.inPaymentGatewayConfigId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInReleaseAmount() {
        return this.inReleaseAmount;
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
     * @return <code>List</code>
     */
    public List getOutInternalRespMsgs() {
        return this.outInternalRespMsgs;
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
    public String getOutReleaseAltRefNum() {
        return this.outReleaseAltRefNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutReleaseAmount() {
        return this.outReleaseAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutReleaseCode() {
        return this.outReleaseCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutReleaseFlag() {
        return this.outReleaseFlag;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutReleaseMessage() {
        return this.outReleaseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutReleaseRefNum() {
        return this.outReleaseRefNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getOutReleaseResult() {
        return this.outReleaseResult;
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
     * @param inAuthTrans the inAuthTrans to set
    */
    public void setInAuthTrans(GenericValue inAuthTrans) {
        this.inParameters.add("authTrans");
        this.inAuthTrans = inAuthTrans;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrency the inCurrency to set
    */
    public void setInCurrency(String inCurrency) {
        this.inParameters.add("currency");
        this.inCurrency = inCurrency;
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
     * This parameter is optional.
     * @param inPaymentConfig the inPaymentConfig to set
    */
    public void setInPaymentConfig(String inPaymentConfig) {
        this.inParameters.add("paymentConfig");
        this.inPaymentConfig = inPaymentConfig;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentGatewayConfigId the inPaymentGatewayConfigId to set
    */
    public void setInPaymentGatewayConfigId(String inPaymentGatewayConfigId) {
        this.inParameters.add("paymentGatewayConfigId");
        this.inPaymentGatewayConfigId = inPaymentGatewayConfigId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inReleaseAmount the inReleaseAmount to set
    */
    public void setInReleaseAmount(BigDecimal inReleaseAmount) {
        this.inParameters.add("releaseAmount");
        this.inReleaseAmount = inReleaseAmount;
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
     * @param outInternalRespMsgs the outInternalRespMsgs to set
    */
    public void setOutInternalRespMsgs(List outInternalRespMsgs) {
        this.outParameters.add("internalRespMsgs");
        this.outInternalRespMsgs = outInternalRespMsgs;
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
     * @param outReleaseAltRefNum the outReleaseAltRefNum to set
    */
    public void setOutReleaseAltRefNum(String outReleaseAltRefNum) {
        this.outParameters.add("releaseAltRefNum");
        this.outReleaseAltRefNum = outReleaseAltRefNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outReleaseAmount the outReleaseAmount to set
    */
    public void setOutReleaseAmount(BigDecimal outReleaseAmount) {
        this.outParameters.add("releaseAmount");
        this.outReleaseAmount = outReleaseAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outReleaseCode the outReleaseCode to set
    */
    public void setOutReleaseCode(String outReleaseCode) {
        this.outParameters.add("releaseCode");
        this.outReleaseCode = outReleaseCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outReleaseFlag the outReleaseFlag to set
    */
    public void setOutReleaseFlag(String outReleaseFlag) {
        this.outParameters.add("releaseFlag");
        this.outReleaseFlag = outReleaseFlag;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outReleaseMessage the outReleaseMessage to set
    */
    public void setOutReleaseMessage(String outReleaseMessage) {
        this.outParameters.add("releaseMessage");
        this.outReleaseMessage = outReleaseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outReleaseRefNum the outReleaseRefNum to set
    */
    public void setOutReleaseRefNum(String outReleaseRefNum) {
        this.outParameters.add("releaseRefNum");
        this.outReleaseRefNum = outReleaseRefNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outReleaseResult the outReleaseResult to set
    */
    public void setOutReleaseResult(Boolean outReleaseResult) {
        this.outParameters.add("releaseResult");
        this.outReleaseResult = outReleaseResult;
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
        if (inParameters.contains("authTrans")) mapValue.put("authTrans", getInAuthTrans());
        if (inParameters.contains("currency")) mapValue.put("currency", getInCurrency());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderPaymentPreference")) mapValue.put("orderPaymentPreference", getInOrderPaymentPreference());
        if (inParameters.contains("paymentConfig")) mapValue.put("paymentConfig", getInPaymentConfig());
        if (inParameters.contains("paymentGatewayConfigId")) mapValue.put("paymentGatewayConfigId", getInPaymentGatewayConfigId());
        if (inParameters.contains("releaseAmount")) mapValue.put("releaseAmount", getInReleaseAmount());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("internalRespMsgs")) mapValue.put("internalRespMsgs", getOutInternalRespMsgs());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("releaseAltRefNum")) mapValue.put("releaseAltRefNum", getOutReleaseAltRefNum());
        if (outParameters.contains("releaseAmount")) mapValue.put("releaseAmount", getOutReleaseAmount());
        if (outParameters.contains("releaseCode")) mapValue.put("releaseCode", getOutReleaseCode());
        if (outParameters.contains("releaseFlag")) mapValue.put("releaseFlag", getOutReleaseFlag());
        if (outParameters.contains("releaseMessage")) mapValue.put("releaseMessage", getOutReleaseMessage());
        if (outParameters.contains("releaseRefNum")) mapValue.put("releaseRefNum", getOutReleaseRefNum());
        if (outParameters.contains("releaseResult")) mapValue.put("releaseResult", getOutReleaseResult());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("authTrans")) setInAuthTrans((GenericValue) mapValue.get("authTrans"));
        if (mapValue.containsKey("currency")) setInCurrency((String) mapValue.get("currency"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderPaymentPreference")) setInOrderPaymentPreference((GenericValue) mapValue.get("orderPaymentPreference"));
        if (mapValue.containsKey("paymentConfig")) setInPaymentConfig((String) mapValue.get("paymentConfig"));
        if (mapValue.containsKey("paymentGatewayConfigId")) setInPaymentGatewayConfigId((String) mapValue.get("paymentGatewayConfigId"));
        if (mapValue.containsKey("releaseAmount")) setInReleaseAmount((BigDecimal) mapValue.get("releaseAmount"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("internalRespMsgs")) setOutInternalRespMsgs((List) mapValue.get("internalRespMsgs"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("releaseAltRefNum")) setOutReleaseAltRefNum((String) mapValue.get("releaseAltRefNum"));
        if (mapValue.containsKey("releaseAmount")) setOutReleaseAmount((BigDecimal) mapValue.get("releaseAmount"));
        if (mapValue.containsKey("releaseCode")) setOutReleaseCode((String) mapValue.get("releaseCode"));
        if (mapValue.containsKey("releaseFlag")) setOutReleaseFlag((String) mapValue.get("releaseFlag"));
        if (mapValue.containsKey("releaseMessage")) setOutReleaseMessage((String) mapValue.get("releaseMessage"));
        if (mapValue.containsKey("releaseRefNum")) setOutReleaseRefNum((String) mapValue.get("releaseRefNum"));
        if (mapValue.containsKey("releaseResult")) setOutReleaseResult((Boolean) mapValue.get("releaseResult"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>TestGCRelease</code> from the input values of the given <code>TestGCRelease</code>.
     * @param input a <code>TestGCRelease</code>
     */
    public static TestGCRelease fromInput(TestGCRelease input) {
        TestGCRelease service = new TestGCRelease();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>TestGCRelease</code> from the output values of the given <code>TestGCRelease</code>.
     * @param output a <code>TestGCRelease</code>
     */
    public static TestGCRelease fromOutput(TestGCRelease output) {
        TestGCRelease service = new TestGCRelease();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>TestGCRelease</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static TestGCRelease fromInput(Map<String, Object> mapValue) {
        TestGCRelease service = new TestGCRelease();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>TestGCRelease</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static TestGCRelease fromOutput(Map<String, Object> mapValue) {
        TestGCRelease service = new TestGCRelease();
        service.putAllOutput(mapValue);
        return service;
    }
}
