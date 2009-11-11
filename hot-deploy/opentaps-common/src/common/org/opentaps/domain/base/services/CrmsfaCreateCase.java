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
 * Auto generated base service entity crmsfa.createCase.
 */
public class CrmsfaCreateCase extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "crmsfa.createCase";

    /** The enumeration of input parameters. */
    public static enum In {
        accountPartyId("accountPartyId"),
        contactPartyId("contactPartyId"),
        custRequestCategoryId("custRequestCategoryId"),
        custRequestName("custRequestName"),
        custRequestTypeId("custRequestTypeId"),
        description("description"),
        locale("locale"),
        note("note"),
        priority("priority"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        custRequestId("custRequestId"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private String inAccountPartyId;
    private String inContactPartyId;
    private String inCustRequestCategoryId;
    private String inCustRequestName;
    private String inCustRequestTypeId;
    private String inDescription;
    private Locale inLocale;
    private String inNote;
    private Double inPriority;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWorkEffortId;
    private String outCustRequestId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;
    private String outWorkEffortId;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAccountPartyId() {
        return this.inAccountPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContactPartyId() {
        return this.inContactPartyId;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCustRequestName() {
        return this.inCustRequestName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
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
    public String getInNote() {
        return this.inNote;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getInPriority() {
        return this.inPriority;
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
    public String getInWorkEffortId() {
        return this.inWorkEffortId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutCustRequestId() {
        return this.outCustRequestId;
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
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutWorkEffortId() {
        return this.outWorkEffortId;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAccountPartyId the inAccountPartyId to set
    */
    public void setInAccountPartyId(String inAccountPartyId) {
        this.inParameters.add("accountPartyId");
        this.inAccountPartyId = inAccountPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContactPartyId the inContactPartyId to set
    */
    public void setInContactPartyId(String inContactPartyId) {
        this.inParameters.add("contactPartyId");
        this.inContactPartyId = inContactPartyId;
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
     * This parameter is required.
     * @param inCustRequestName the inCustRequestName to set
    */
    public void setInCustRequestName(String inCustRequestName) {
        this.inParameters.add("custRequestName");
        this.inCustRequestName = inCustRequestName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
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
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNote the inNote to set
    */
    public void setInNote(String inNote) {
        this.inParameters.add("note");
        this.inNote = inNote;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPriority the inPriority to set
    */
    public void setInPriority(Double inPriority) {
        this.inParameters.add("priority");
        this.inPriority = inPriority;
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
     * @param inWorkEffortId the inWorkEffortId to set
    */
    public void setInWorkEffortId(String inWorkEffortId) {
        this.inParameters.add("workEffortId");
        this.inWorkEffortId = inWorkEffortId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outCustRequestId the outCustRequestId to set
    */
    public void setOutCustRequestId(String outCustRequestId) {
        this.outParameters.add("custRequestId");
        this.outCustRequestId = outCustRequestId;
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
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outWorkEffortId the outWorkEffortId to set
    */
    public void setOutWorkEffortId(String outWorkEffortId) {
        this.outParameters.add("workEffortId");
        this.outWorkEffortId = outWorkEffortId;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("accountPartyId")) mapValue.put("accountPartyId", getInAccountPartyId());
        if (inParameters.contains("contactPartyId")) mapValue.put("contactPartyId", getInContactPartyId());
        if (inParameters.contains("custRequestCategoryId")) mapValue.put("custRequestCategoryId", getInCustRequestCategoryId());
        if (inParameters.contains("custRequestName")) mapValue.put("custRequestName", getInCustRequestName());
        if (inParameters.contains("custRequestTypeId")) mapValue.put("custRequestTypeId", getInCustRequestTypeId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("note")) mapValue.put("note", getInNote());
        if (inParameters.contains("priority")) mapValue.put("priority", getInPriority());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("custRequestId")) mapValue.put("custRequestId", getOutCustRequestId());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        if (outParameters.contains("workEffortId")) mapValue.put("workEffortId", getOutWorkEffortId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("accountPartyId")) setInAccountPartyId((String) mapValue.get("accountPartyId"));
        if (mapValue.containsKey("contactPartyId")) setInContactPartyId((String) mapValue.get("contactPartyId"));
        if (mapValue.containsKey("custRequestCategoryId")) setInCustRequestCategoryId((String) mapValue.get("custRequestCategoryId"));
        if (mapValue.containsKey("custRequestName")) setInCustRequestName((String) mapValue.get("custRequestName"));
        if (mapValue.containsKey("custRequestTypeId")) setInCustRequestTypeId((String) mapValue.get("custRequestTypeId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("note")) setInNote((String) mapValue.get("note"));
        if (mapValue.containsKey("priority")) setInPriority((Double) mapValue.get("priority"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("custRequestId")) setOutCustRequestId((String) mapValue.get("custRequestId"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setOutWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /**
     * Construct a <code>CrmsfaCreateCase</code> from the input values of the given <code>CrmsfaCreateCase</code>.
     * @param input a <code>CrmsfaCreateCase</code>
     */
    public static CrmsfaCreateCase fromInput(CrmsfaCreateCase input) {
        CrmsfaCreateCase service = new CrmsfaCreateCase();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>CrmsfaCreateCase</code> from the output values of the given <code>CrmsfaCreateCase</code>.
     * @param output a <code>CrmsfaCreateCase</code>
     */
    public static CrmsfaCreateCase fromOutput(CrmsfaCreateCase output) {
        CrmsfaCreateCase service = new CrmsfaCreateCase();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CrmsfaCreateCase</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CrmsfaCreateCase fromInput(Map<String, Object> mapValue) {
        CrmsfaCreateCase service = new CrmsfaCreateCase();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>CrmsfaCreateCase</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CrmsfaCreateCase fromOutput(Map<String, Object> mapValue) {
        CrmsfaCreateCase service = new CrmsfaCreateCase();
        service.putAllOutput(mapValue);
        return service;
    }
}
