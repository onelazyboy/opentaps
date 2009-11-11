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

import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.ofbiz.entity.GenericValue;

/**
 * Auto generated base service entity createBulkProductPromoCode.
 */
public class CreateBulkProductPromoCode extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createBulkProductPromoCode";

    /** The enumeration of input parameters. */
    public static enum In {
        uploadedFileContentType("_uploadedFile_contentType"),
        uploadedFileFileName("_uploadedFile_fileName"),
        createdByUserLogin("createdByUserLogin"),
        createdDate("createdDate"),
        fromDate("fromDate"),
        lastModifiedByUserLogin("lastModifiedByUserLogin"),
        lastModifiedDate("lastModifiedDate"),
        locale("locale"),
        productPromoId("productPromoId"),
        requireEmailOrParty("requireEmailOrParty"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        uploadedFile("uploadedFile"),
        useLimitPerCode("useLimitPerCode"),
        useLimitPerCustomer("useLimitPerCustomer"),
        userEntered("userEntered"),
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

    private String inUploadedFileContentType;
    private String inUploadedFileFileName;
    private String inCreatedByUserLogin;
    private Timestamp inCreatedDate;
    private Timestamp inFromDate;
    private String inLastModifiedByUserLogin;
    private Timestamp inLastModifiedDate;
    private Locale inLocale;
    private String inProductPromoId;
    private String inRequireEmailOrParty;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private ByteBuffer inUploadedFile;
    private Long inUseLimitPerCode;
    private Long inUseLimitPerCustomer;
    private String inUserEntered;
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
    public String getInUploadedFileContentType() {
        return this.inUploadedFileContentType;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUploadedFileFileName() {
        return this.inUploadedFileFileName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCreatedByUserLogin() {
        return this.inCreatedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInCreatedDate() {
        return this.inCreatedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate() {
        return this.inFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLastModifiedByUserLogin() {
        return this.inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastModifiedDate() {
        return this.inLastModifiedDate;
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
    public String getInProductPromoId() {
        return this.inProductPromoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRequireEmailOrParty() {
        return this.inRequireEmailOrParty;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInThruDate() {
        return this.inThruDate;
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
     * @return <code>ByteBuffer</code>
     */
    public ByteBuffer getInUploadedFile() {
        return this.inUploadedFile;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInUseLimitPerCode() {
        return this.inUseLimitPerCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInUseLimitPerCustomer() {
        return this.inUseLimitPerCustomer;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUserEntered() {
        return this.inUserEntered;
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
     * @param inUploadedFileContentType the inUploadedFileContentType to set
    */
    public void setInUploadedFileContentType(String inUploadedFileContentType) {
        this.inParameters.add("_uploadedFile_contentType");
        this.inUploadedFileContentType = inUploadedFileContentType;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUploadedFileFileName the inUploadedFileFileName to set
    */
    public void setInUploadedFileFileName(String inUploadedFileFileName) {
        this.inParameters.add("_uploadedFile_fileName");
        this.inUploadedFileFileName = inUploadedFileFileName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedByUserLogin the inCreatedByUserLogin to set
    */
    public void setInCreatedByUserLogin(String inCreatedByUserLogin) {
        this.inParameters.add("createdByUserLogin");
        this.inCreatedByUserLogin = inCreatedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedDate the inCreatedDate to set
    */
    public void setInCreatedDate(Timestamp inCreatedDate) {
        this.inParameters.add("createdDate");
        this.inCreatedDate = inCreatedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedByUserLogin the inLastModifiedByUserLogin to set
    */
    public void setInLastModifiedByUserLogin(String inLastModifiedByUserLogin) {
        this.inParameters.add("lastModifiedByUserLogin");
        this.inLastModifiedByUserLogin = inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedDate the inLastModifiedDate to set
    */
    public void setInLastModifiedDate(Timestamp inLastModifiedDate) {
        this.inParameters.add("lastModifiedDate");
        this.inLastModifiedDate = inLastModifiedDate;
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
     * @param inProductPromoId the inProductPromoId to set
    */
    public void setInProductPromoId(String inProductPromoId) {
        this.inParameters.add("productPromoId");
        this.inProductPromoId = inProductPromoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRequireEmailOrParty the inRequireEmailOrParty to set
    */
    public void setInRequireEmailOrParty(String inRequireEmailOrParty) {
        this.inParameters.add("requireEmailOrParty");
        this.inRequireEmailOrParty = inRequireEmailOrParty;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThruDate the inThruDate to set
    */
    public void setInThruDate(Timestamp inThruDate) {
        this.inParameters.add("thruDate");
        this.inThruDate = inThruDate;
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
     * @param inUploadedFile the inUploadedFile to set
    */
    public void setInUploadedFile(ByteBuffer inUploadedFile) {
        this.inParameters.add("uploadedFile");
        this.inUploadedFile = inUploadedFile;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseLimitPerCode the inUseLimitPerCode to set
    */
    public void setInUseLimitPerCode(Long inUseLimitPerCode) {
        this.inParameters.add("useLimitPerCode");
        this.inUseLimitPerCode = inUseLimitPerCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseLimitPerCustomer the inUseLimitPerCustomer to set
    */
    public void setInUseLimitPerCustomer(Long inUseLimitPerCustomer) {
        this.inParameters.add("useLimitPerCustomer");
        this.inUseLimitPerCustomer = inUseLimitPerCustomer;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserEntered the inUserEntered to set
    */
    public void setInUserEntered(String inUserEntered) {
        this.inParameters.add("userEntered");
        this.inUserEntered = inUserEntered;
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
        if (inParameters.contains("_uploadedFile_contentType")) mapValue.put("_uploadedFile_contentType", getInUploadedFileContentType());
        if (inParameters.contains("_uploadedFile_fileName")) mapValue.put("_uploadedFile_fileName", getInUploadedFileFileName());
        if (inParameters.contains("createdByUserLogin")) mapValue.put("createdByUserLogin", getInCreatedByUserLogin());
        if (inParameters.contains("createdDate")) mapValue.put("createdDate", getInCreatedDate());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("lastModifiedByUserLogin")) mapValue.put("lastModifiedByUserLogin", getInLastModifiedByUserLogin());
        if (inParameters.contains("lastModifiedDate")) mapValue.put("lastModifiedDate", getInLastModifiedDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("productPromoId")) mapValue.put("productPromoId", getInProductPromoId());
        if (inParameters.contains("requireEmailOrParty")) mapValue.put("requireEmailOrParty", getInRequireEmailOrParty());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("uploadedFile")) mapValue.put("uploadedFile", getInUploadedFile());
        if (inParameters.contains("useLimitPerCode")) mapValue.put("useLimitPerCode", getInUseLimitPerCode());
        if (inParameters.contains("useLimitPerCustomer")) mapValue.put("useLimitPerCustomer", getInUseLimitPerCustomer());
        if (inParameters.contains("userEntered")) mapValue.put("userEntered", getInUserEntered());
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
        if (mapValue.containsKey("_uploadedFile_contentType")) setInUploadedFileContentType((String) mapValue.get("_uploadedFile_contentType"));
        if (mapValue.containsKey("_uploadedFile_fileName")) setInUploadedFileFileName((String) mapValue.get("_uploadedFile_fileName"));
        if (mapValue.containsKey("createdByUserLogin")) setInCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        if (mapValue.containsKey("createdDate")) setInCreatedDate((Timestamp) mapValue.get("createdDate"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("lastModifiedByUserLogin")) setInLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        if (mapValue.containsKey("lastModifiedDate")) setInLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("productPromoId")) setInProductPromoId((String) mapValue.get("productPromoId"));
        if (mapValue.containsKey("requireEmailOrParty")) setInRequireEmailOrParty((String) mapValue.get("requireEmailOrParty"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("uploadedFile")) setInUploadedFile((ByteBuffer) mapValue.get("uploadedFile"));
        if (mapValue.containsKey("useLimitPerCode")) setInUseLimitPerCode((Long) mapValue.get("useLimitPerCode"));
        if (mapValue.containsKey("useLimitPerCustomer")) setInUseLimitPerCustomer((Long) mapValue.get("useLimitPerCustomer"));
        if (mapValue.containsKey("userEntered")) setInUserEntered((String) mapValue.get("userEntered"));
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
     * Construct a <code>CreateBulkProductPromoCode</code> from the input values of the given <code>CreateBulkProductPromoCode</code>.
     * @param input a <code>CreateBulkProductPromoCode</code>
     */
    public static CreateBulkProductPromoCode fromInput(CreateBulkProductPromoCode input) {
        CreateBulkProductPromoCode service = new CreateBulkProductPromoCode();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>CreateBulkProductPromoCode</code> from the output values of the given <code>CreateBulkProductPromoCode</code>.
     * @param output a <code>CreateBulkProductPromoCode</code>
     */
    public static CreateBulkProductPromoCode fromOutput(CreateBulkProductPromoCode output) {
        CreateBulkProductPromoCode service = new CreateBulkProductPromoCode();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateBulkProductPromoCode</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateBulkProductPromoCode fromInput(Map<String, Object> mapValue) {
        CreateBulkProductPromoCode service = new CreateBulkProductPromoCode();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>CreateBulkProductPromoCode</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateBulkProductPromoCode fromOutput(Map<String, Object> mapValue) {
        CreateBulkProductPromoCode service = new CreateBulkProductPromoCode();
        service.putAllOutput(mapValue);
        return service;
    }
}
