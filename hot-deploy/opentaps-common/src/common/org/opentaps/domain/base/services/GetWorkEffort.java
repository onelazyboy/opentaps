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

import java.lang.Boolean;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.ofbiz.entity.GenericValue;

/**
 * Auto generated base service entity getWorkEffort.
 */
public class GetWorkEffort extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getWorkEffort";

    /** The enumeration of input parameters. */
    public static enum In {
        currentStatusId("currentStatusId"),
        locale("locale"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        canView("canView"),
        currentStatusItem("currentStatusItem"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        partyAssigns("partyAssigns"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        tryEntity("tryEntity"),
        userLogin("userLogin"),
        workEffort("workEffort"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private String inCurrentStatusId;
    private Locale inLocale;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWorkEffortId;
    private Boolean outCanView;
    private GenericValue outCurrentStatusItem;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private Collection outPartyAssigns;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private Boolean outTryEntity;
    private GenericValue outUserLogin;
    private GenericValue outWorkEffort;
    private String outWorkEffortId;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrentStatusId() {
        return this.inCurrentStatusId;
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
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getOutCanView() {
        return this.outCanView;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutCurrentStatusItem() {
        return this.outCurrentStatusItem;
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
     * @return <code>Collection</code>
     */
    public Collection getOutPartyAssigns() {
        return this.outPartyAssigns;
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
     * @return <code>Boolean</code>
     */
    public Boolean getOutTryEntity() {
        return this.outTryEntity;
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
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutWorkEffort() {
        return this.outWorkEffort;
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
     * @param inCurrentStatusId the inCurrentStatusId to set
    */
    public void setInCurrentStatusId(String inCurrentStatusId) {
        this.inParameters.add("currentStatusId");
        this.inCurrentStatusId = inCurrentStatusId;
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
     * This parameter is optional.
     * @param outCanView the outCanView to set
    */
    public void setOutCanView(Boolean outCanView) {
        this.outParameters.add("canView");
        this.outCanView = outCanView;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCurrentStatusItem the outCurrentStatusItem to set
    */
    public void setOutCurrentStatusItem(GenericValue outCurrentStatusItem) {
        this.outParameters.add("currentStatusItem");
        this.outCurrentStatusItem = outCurrentStatusItem;
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
     * @param outPartyAssigns the outPartyAssigns to set
    */
    public void setOutPartyAssigns(Collection outPartyAssigns) {
        this.outParameters.add("partyAssigns");
        this.outPartyAssigns = outPartyAssigns;
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
     * @param outTryEntity the outTryEntity to set
    */
    public void setOutTryEntity(Boolean outTryEntity) {
        this.outParameters.add("tryEntity");
        this.outTryEntity = outTryEntity;
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
     * @param outWorkEffort the outWorkEffort to set
    */
    public void setOutWorkEffort(GenericValue outWorkEffort) {
        this.outParameters.add("workEffort");
        this.outWorkEffort = outWorkEffort;
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
        if (inParameters.contains("currentStatusId")) mapValue.put("currentStatusId", getInCurrentStatusId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("canView")) mapValue.put("canView", getOutCanView());
        if (outParameters.contains("currentStatusItem")) mapValue.put("currentStatusItem", getOutCurrentStatusItem());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("partyAssigns")) mapValue.put("partyAssigns", getOutPartyAssigns());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("tryEntity")) mapValue.put("tryEntity", getOutTryEntity());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        if (outParameters.contains("workEffort")) mapValue.put("workEffort", getOutWorkEffort());
        if (outParameters.contains("workEffortId")) mapValue.put("workEffortId", getOutWorkEffortId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("currentStatusId")) setInCurrentStatusId((String) mapValue.get("currentStatusId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("canView")) setOutCanView((Boolean) mapValue.get("canView"));
        if (mapValue.containsKey("currentStatusItem")) setOutCurrentStatusItem((GenericValue) mapValue.get("currentStatusItem"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyAssigns")) setOutPartyAssigns((Collection) mapValue.get("partyAssigns"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("tryEntity")) setOutTryEntity((Boolean) mapValue.get("tryEntity"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffort")) setOutWorkEffort((GenericValue) mapValue.get("workEffort"));
        if (mapValue.containsKey("workEffortId")) setOutWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /**
     * Construct a <code>GetWorkEffort</code> from the input values of the given <code>GetWorkEffort</code>.
     * @param input a <code>GetWorkEffort</code>
     */
    public static GetWorkEffort fromInput(GetWorkEffort input) {
        GetWorkEffort service = new GetWorkEffort();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>GetWorkEffort</code> from the output values of the given <code>GetWorkEffort</code>.
     * @param output a <code>GetWorkEffort</code>
     */
    public static GetWorkEffort fromOutput(GetWorkEffort output) {
        GetWorkEffort service = new GetWorkEffort();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetWorkEffort</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetWorkEffort fromInput(Map<String, Object> mapValue) {
        GetWorkEffort service = new GetWorkEffort();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>GetWorkEffort</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetWorkEffort fromOutput(Map<String, Object> mapValue) {
        GetWorkEffort service = new GetWorkEffort();
        service.putAllOutput(mapValue);
        return service;
    }
}
