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
import java.util.Map;
import java.util.TimeZone;
import org.ofbiz.entity.GenericValue;

/**
 * Auto generated base service entity sendNotificationInterface.
 */
public class SendNotificationInterface extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "sendNotificationInterface";

    /** The enumeration of input parameters. */
    public static enum In {
        authPass("authPass"),
        authUser("authUser"),
        baseUrl("baseUrl"),
        body("body"),
        contentType("contentType"),
        emailType("emailType"),
        locale("locale"),
        messageId("messageId"),
        partyId("partyId"),
        sendBcc("sendBcc"),
        sendCc("sendCc"),
        sendFrom("sendFrom"),
        sendTo("sendTo"),
        sendType("sendType"),
        sendVia("sendVia"),
        subject("subject"),
        templateData("templateData"),
        templateName("templateName"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        webSiteId("webSiteId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        body("body"),
        contentType("contentType"),
        emailType("emailType"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        messageId("messageId"),
        partyId("partyId"),
        responseMessage("responseMessage"),
        subject("subject"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private String inAuthPass;
    private String inAuthUser;
    private String inBaseUrl;
    private String inBody;
    private String inContentType;
    private String inEmailType;
    private Locale inLocale;
    private String inMessageId;
    private String inPartyId;
    private String inSendBcc;
    private String inSendCc;
    private String inSendFrom;
    private String inSendTo;
    private String inSendType;
    private String inSendVia;
    private String inSubject;
    private Map inTemplateData;
    private String inTemplateName;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWebSiteId;
    private String outBody;
    private String outContentType;
    private String outEmailType;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outMessageId;
    private String outPartyId;
    private String outResponseMessage;
    private String outSubject;
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
    public String getInAuthPass() {
        return this.inAuthPass;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAuthUser() {
        return this.inAuthUser;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBaseUrl() {
        return this.inBaseUrl;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBody() {
        return this.inBody;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContentType() {
        return this.inContentType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInEmailType() {
        return this.inEmailType;
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
    public String getInMessageId() {
        return this.inMessageId;
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
    public String getInSendBcc() {
        return this.inSendBcc;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSendCc() {
        return this.inSendCc;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSendFrom() {
        return this.inSendFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSendTo() {
        return this.inSendTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSendType() {
        return this.inSendType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSendVia() {
        return this.inSendVia;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSubject() {
        return this.inSubject;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTemplateData() {
        return this.inTemplateData;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInTemplateName() {
        return this.inTemplateName;
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
    public String getInWebSiteId() {
        return this.inWebSiteId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutBody() {
        return this.outBody;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutContentType() {
        return this.outContentType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutEmailType() {
        return this.outEmailType;
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
    public String getOutMessageId() {
        return this.outMessageId;
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
    public String getOutSubject() {
        return this.outSubject;
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
     * @param inAuthPass the inAuthPass to set
    */
    public void setInAuthPass(String inAuthPass) {
        this.inParameters.add("authPass");
        this.inAuthPass = inAuthPass;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAuthUser the inAuthUser to set
    */
    public void setInAuthUser(String inAuthUser) {
        this.inParameters.add("authUser");
        this.inAuthUser = inAuthUser;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBaseUrl the inBaseUrl to set
    */
    public void setInBaseUrl(String inBaseUrl) {
        this.inParameters.add("baseUrl");
        this.inBaseUrl = inBaseUrl;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBody the inBody to set
    */
    public void setInBody(String inBody) {
        this.inParameters.add("body");
        this.inBody = inBody;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentType the inContentType to set
    */
    public void setInContentType(String inContentType) {
        this.inParameters.add("contentType");
        this.inContentType = inContentType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEmailType the inEmailType to set
    */
    public void setInEmailType(String inEmailType) {
        this.inParameters.add("emailType");
        this.inEmailType = inEmailType;
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
     * @param inMessageId the inMessageId to set
    */
    public void setInMessageId(String inMessageId) {
        this.inParameters.add("messageId");
        this.inMessageId = inMessageId;
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
     * @param inSendBcc the inSendBcc to set
    */
    public void setInSendBcc(String inSendBcc) {
        this.inParameters.add("sendBcc");
        this.inSendBcc = inSendBcc;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSendCc the inSendCc to set
    */
    public void setInSendCc(String inSendCc) {
        this.inParameters.add("sendCc");
        this.inSendCc = inSendCc;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSendFrom the inSendFrom to set
    */
    public void setInSendFrom(String inSendFrom) {
        this.inParameters.add("sendFrom");
        this.inSendFrom = inSendFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSendTo the inSendTo to set
    */
    public void setInSendTo(String inSendTo) {
        this.inParameters.add("sendTo");
        this.inSendTo = inSendTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSendType the inSendType to set
    */
    public void setInSendType(String inSendType) {
        this.inParameters.add("sendType");
        this.inSendType = inSendType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSendVia the inSendVia to set
    */
    public void setInSendVia(String inSendVia) {
        this.inParameters.add("sendVia");
        this.inSendVia = inSendVia;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSubject the inSubject to set
    */
    public void setInSubject(String inSubject) {
        this.inParameters.add("subject");
        this.inSubject = inSubject;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTemplateData the inTemplateData to set
    */
    public void setInTemplateData(Map inTemplateData) {
        this.inParameters.add("templateData");
        this.inTemplateData = inTemplateData;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inTemplateName the inTemplateName to set
    */
    public void setInTemplateName(String inTemplateName) {
        this.inParameters.add("templateName");
        this.inTemplateName = inTemplateName;
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
     * @param inWebSiteId the inWebSiteId to set
    */
    public void setInWebSiteId(String inWebSiteId) {
        this.inParameters.add("webSiteId");
        this.inWebSiteId = inWebSiteId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outBody the outBody to set
    */
    public void setOutBody(String outBody) {
        this.outParameters.add("body");
        this.outBody = outBody;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outContentType the outContentType to set
    */
    public void setOutContentType(String outContentType) {
        this.outParameters.add("contentType");
        this.outContentType = outContentType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outEmailType the outEmailType to set
    */
    public void setOutEmailType(String outEmailType) {
        this.outParameters.add("emailType");
        this.outEmailType = outEmailType;
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
     * @param outMessageId the outMessageId to set
    */
    public void setOutMessageId(String outMessageId) {
        this.outParameters.add("messageId");
        this.outMessageId = outMessageId;
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
     * @param outSubject the outSubject to set
    */
    public void setOutSubject(String outSubject) {
        this.outParameters.add("subject");
        this.outSubject = outSubject;
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
        if (inParameters.contains("authPass")) mapValue.put("authPass", getInAuthPass());
        if (inParameters.contains("authUser")) mapValue.put("authUser", getInAuthUser());
        if (inParameters.contains("baseUrl")) mapValue.put("baseUrl", getInBaseUrl());
        if (inParameters.contains("body")) mapValue.put("body", getInBody());
        if (inParameters.contains("contentType")) mapValue.put("contentType", getInContentType());
        if (inParameters.contains("emailType")) mapValue.put("emailType", getInEmailType());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("messageId")) mapValue.put("messageId", getInMessageId());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("sendBcc")) mapValue.put("sendBcc", getInSendBcc());
        if (inParameters.contains("sendCc")) mapValue.put("sendCc", getInSendCc());
        if (inParameters.contains("sendFrom")) mapValue.put("sendFrom", getInSendFrom());
        if (inParameters.contains("sendTo")) mapValue.put("sendTo", getInSendTo());
        if (inParameters.contains("sendType")) mapValue.put("sendType", getInSendType());
        if (inParameters.contains("sendVia")) mapValue.put("sendVia", getInSendVia());
        if (inParameters.contains("subject")) mapValue.put("subject", getInSubject());
        if (inParameters.contains("templateData")) mapValue.put("templateData", getInTemplateData());
        if (inParameters.contains("templateName")) mapValue.put("templateName", getInTemplateName());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("webSiteId")) mapValue.put("webSiteId", getInWebSiteId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("body")) mapValue.put("body", getOutBody());
        if (outParameters.contains("contentType")) mapValue.put("contentType", getOutContentType());
        if (outParameters.contains("emailType")) mapValue.put("emailType", getOutEmailType());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("messageId")) mapValue.put("messageId", getOutMessageId());
        if (outParameters.contains("partyId")) mapValue.put("partyId", getOutPartyId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("subject")) mapValue.put("subject", getOutSubject());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("authPass")) setInAuthPass((String) mapValue.get("authPass"));
        if (mapValue.containsKey("authUser")) setInAuthUser((String) mapValue.get("authUser"));
        if (mapValue.containsKey("baseUrl")) setInBaseUrl((String) mapValue.get("baseUrl"));
        if (mapValue.containsKey("body")) setInBody((String) mapValue.get("body"));
        if (mapValue.containsKey("contentType")) setInContentType((String) mapValue.get("contentType"));
        if (mapValue.containsKey("emailType")) setInEmailType((String) mapValue.get("emailType"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("messageId")) setInMessageId((String) mapValue.get("messageId"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("sendBcc")) setInSendBcc((String) mapValue.get("sendBcc"));
        if (mapValue.containsKey("sendCc")) setInSendCc((String) mapValue.get("sendCc"));
        if (mapValue.containsKey("sendFrom")) setInSendFrom((String) mapValue.get("sendFrom"));
        if (mapValue.containsKey("sendTo")) setInSendTo((String) mapValue.get("sendTo"));
        if (mapValue.containsKey("sendType")) setInSendType((String) mapValue.get("sendType"));
        if (mapValue.containsKey("sendVia")) setInSendVia((String) mapValue.get("sendVia"));
        if (mapValue.containsKey("subject")) setInSubject((String) mapValue.get("subject"));
        if (mapValue.containsKey("templateData")) setInTemplateData((Map) mapValue.get("templateData"));
        if (mapValue.containsKey("templateName")) setInTemplateName((String) mapValue.get("templateName"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("webSiteId")) setInWebSiteId((String) mapValue.get("webSiteId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("body")) setOutBody((String) mapValue.get("body"));
        if (mapValue.containsKey("contentType")) setOutContentType((String) mapValue.get("contentType"));
        if (mapValue.containsKey("emailType")) setOutEmailType((String) mapValue.get("emailType"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("messageId")) setOutMessageId((String) mapValue.get("messageId"));
        if (mapValue.containsKey("partyId")) setOutPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("subject")) setOutSubject((String) mapValue.get("subject"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>SendNotificationInterface</code> from the input values of the given <code>SendNotificationInterface</code>.
     * @param input a <code>SendNotificationInterface</code>
     */
    public static SendNotificationInterface fromInput(SendNotificationInterface input) {
        SendNotificationInterface service = new SendNotificationInterface();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>SendNotificationInterface</code> from the output values of the given <code>SendNotificationInterface</code>.
     * @param output a <code>SendNotificationInterface</code>
     */
    public static SendNotificationInterface fromOutput(SendNotificationInterface output) {
        SendNotificationInterface service = new SendNotificationInterface();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>SendNotificationInterface</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static SendNotificationInterface fromInput(Map<String, Object> mapValue) {
        SendNotificationInterface service = new SendNotificationInterface();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>SendNotificationInterface</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static SendNotificationInterface fromOutput(Map<String, Object> mapValue) {
        SendNotificationInterface service = new SendNotificationInterface();
        service.putAllOutput(mapValue);
        return service;
    }
}
