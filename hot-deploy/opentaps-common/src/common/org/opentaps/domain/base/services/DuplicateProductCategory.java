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
 * Auto generated base service entity duplicateProductCategory.
 */
public class DuplicateProductCategory extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "duplicateProductCategory";

    /** The enumeration of input parameters. */
    public static enum In {
        duplicateAttributes("duplicateAttributes"),
        duplicateCatalogs("duplicateCatalogs"),
        duplicateChildRollup("duplicateChildRollup"),
        duplicateContent("duplicateContent"),
        duplicateFeatures("duplicateFeatures"),
        duplicateMembers("duplicateMembers"),
        duplicateParentRollup("duplicateParentRollup"),
        duplicateRoles("duplicateRoles"),
        locale("locale"),
        oldProductCategoryId("oldProductCategoryId"),
        productCategoryId("productCategoryId"),
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

    private String inDuplicateAttributes;
    private String inDuplicateCatalogs;
    private String inDuplicateChildRollup;
    private String inDuplicateContent;
    private String inDuplicateFeatures;
    private String inDuplicateMembers;
    private String inDuplicateParentRollup;
    private String inDuplicateRoles;
    private Locale inLocale;
    private String inOldProductCategoryId;
    private String inProductCategoryId;
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
    public String getInDuplicateAttributes() {
        return this.inDuplicateAttributes;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateCatalogs() {
        return this.inDuplicateCatalogs;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateChildRollup() {
        return this.inDuplicateChildRollup;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateContent() {
        return this.inDuplicateContent;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateFeatures() {
        return this.inDuplicateFeatures;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateMembers() {
        return this.inDuplicateMembers;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateParentRollup() {
        return this.inDuplicateParentRollup;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateRoles() {
        return this.inDuplicateRoles;
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
     * @return <code>String</code>
     */
    public String getInOldProductCategoryId() {
        return this.inOldProductCategoryId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductCategoryId() {
        return this.inProductCategoryId;
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
     * @param inDuplicateAttributes the inDuplicateAttributes to set
    */
    public void setInDuplicateAttributes(String inDuplicateAttributes) {
        this.inParameters.add("duplicateAttributes");
        this.inDuplicateAttributes = inDuplicateAttributes;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateCatalogs the inDuplicateCatalogs to set
    */
    public void setInDuplicateCatalogs(String inDuplicateCatalogs) {
        this.inParameters.add("duplicateCatalogs");
        this.inDuplicateCatalogs = inDuplicateCatalogs;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateChildRollup the inDuplicateChildRollup to set
    */
    public void setInDuplicateChildRollup(String inDuplicateChildRollup) {
        this.inParameters.add("duplicateChildRollup");
        this.inDuplicateChildRollup = inDuplicateChildRollup;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateContent the inDuplicateContent to set
    */
    public void setInDuplicateContent(String inDuplicateContent) {
        this.inParameters.add("duplicateContent");
        this.inDuplicateContent = inDuplicateContent;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateFeatures the inDuplicateFeatures to set
    */
    public void setInDuplicateFeatures(String inDuplicateFeatures) {
        this.inParameters.add("duplicateFeatures");
        this.inDuplicateFeatures = inDuplicateFeatures;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateMembers the inDuplicateMembers to set
    */
    public void setInDuplicateMembers(String inDuplicateMembers) {
        this.inParameters.add("duplicateMembers");
        this.inDuplicateMembers = inDuplicateMembers;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateParentRollup the inDuplicateParentRollup to set
    */
    public void setInDuplicateParentRollup(String inDuplicateParentRollup) {
        this.inParameters.add("duplicateParentRollup");
        this.inDuplicateParentRollup = inDuplicateParentRollup;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateRoles the inDuplicateRoles to set
    */
    public void setInDuplicateRoles(String inDuplicateRoles) {
        this.inParameters.add("duplicateRoles");
        this.inDuplicateRoles = inDuplicateRoles;
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
     * @param inOldProductCategoryId the inOldProductCategoryId to set
    */
    public void setInOldProductCategoryId(String inOldProductCategoryId) {
        this.inParameters.add("oldProductCategoryId");
        this.inOldProductCategoryId = inOldProductCategoryId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductCategoryId the inProductCategoryId to set
    */
    public void setInProductCategoryId(String inProductCategoryId) {
        this.inParameters.add("productCategoryId");
        this.inProductCategoryId = inProductCategoryId;
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
        if (inParameters.contains("duplicateAttributes")) mapValue.put("duplicateAttributes", getInDuplicateAttributes());
        if (inParameters.contains("duplicateCatalogs")) mapValue.put("duplicateCatalogs", getInDuplicateCatalogs());
        if (inParameters.contains("duplicateChildRollup")) mapValue.put("duplicateChildRollup", getInDuplicateChildRollup());
        if (inParameters.contains("duplicateContent")) mapValue.put("duplicateContent", getInDuplicateContent());
        if (inParameters.contains("duplicateFeatures")) mapValue.put("duplicateFeatures", getInDuplicateFeatures());
        if (inParameters.contains("duplicateMembers")) mapValue.put("duplicateMembers", getInDuplicateMembers());
        if (inParameters.contains("duplicateParentRollup")) mapValue.put("duplicateParentRollup", getInDuplicateParentRollup());
        if (inParameters.contains("duplicateRoles")) mapValue.put("duplicateRoles", getInDuplicateRoles());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("oldProductCategoryId")) mapValue.put("oldProductCategoryId", getInOldProductCategoryId());
        if (inParameters.contains("productCategoryId")) mapValue.put("productCategoryId", getInProductCategoryId());
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
        if (mapValue.containsKey("duplicateAttributes")) setInDuplicateAttributes((String) mapValue.get("duplicateAttributes"));
        if (mapValue.containsKey("duplicateCatalogs")) setInDuplicateCatalogs((String) mapValue.get("duplicateCatalogs"));
        if (mapValue.containsKey("duplicateChildRollup")) setInDuplicateChildRollup((String) mapValue.get("duplicateChildRollup"));
        if (mapValue.containsKey("duplicateContent")) setInDuplicateContent((String) mapValue.get("duplicateContent"));
        if (mapValue.containsKey("duplicateFeatures")) setInDuplicateFeatures((String) mapValue.get("duplicateFeatures"));
        if (mapValue.containsKey("duplicateMembers")) setInDuplicateMembers((String) mapValue.get("duplicateMembers"));
        if (mapValue.containsKey("duplicateParentRollup")) setInDuplicateParentRollup((String) mapValue.get("duplicateParentRollup"));
        if (mapValue.containsKey("duplicateRoles")) setInDuplicateRoles((String) mapValue.get("duplicateRoles"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("oldProductCategoryId")) setInOldProductCategoryId((String) mapValue.get("oldProductCategoryId"));
        if (mapValue.containsKey("productCategoryId")) setInProductCategoryId((String) mapValue.get("productCategoryId"));
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
     * Construct a <code>DuplicateProductCategory</code> from the input values of the given <code>DuplicateProductCategory</code>.
     * @param input a <code>DuplicateProductCategory</code>
     */
    public static DuplicateProductCategory fromInput(DuplicateProductCategory input) {
        DuplicateProductCategory service = new DuplicateProductCategory();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>DuplicateProductCategory</code> from the output values of the given <code>DuplicateProductCategory</code>.
     * @param output a <code>DuplicateProductCategory</code>
     */
    public static DuplicateProductCategory fromOutput(DuplicateProductCategory output) {
        DuplicateProductCategory service = new DuplicateProductCategory();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>DuplicateProductCategory</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static DuplicateProductCategory fromInput(Map<String, Object> mapValue) {
        DuplicateProductCategory service = new DuplicateProductCategory();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>DuplicateProductCategory</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static DuplicateProductCategory fromOutput(Map<String, Object> mapValue) {
        DuplicateProductCategory service = new DuplicateProductCategory();
        service.putAllOutput(mapValue);
        return service;
    }
}
