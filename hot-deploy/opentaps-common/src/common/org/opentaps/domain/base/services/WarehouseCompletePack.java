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
import java.util.Map;
import java.util.TimeZone;
import org.ofbiz.entity.GenericValue;

/**
 * Auto generated base service entity warehouseCompletePack.
 */
public class WarehouseCompletePack extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "warehouseCompletePack";

    /** The enumeration of input parameters. */
    public static enum In {
        additionalShippingCharge("additionalShippingCharge"),
        additionalShippingChargeDescription("additionalShippingChargeDescription"),
        forceComplete("forceComplete"),
        handlingInstructions("handlingInstructions"),
        locale("locale"),
        packageBoxTypeIds("packageBoxTypeIds"),
        packageTrackingCodes("packageTrackingCodes"),
        packageWeights("packageWeights"),
        packingSession("packingSession"),
        pickerPartyId("pickerPartyId"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        weightUomId("weightUomId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        shipmentId("shipmentId"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private BigDecimal inAdditionalShippingCharge;
    private String inAdditionalShippingChargeDescription;
    private Boolean inForceComplete;
    private String inHandlingInstructions;
    private Locale inLocale;
    private Map inPackageBoxTypeIds;
    private Map inPackageTrackingCodes;
    private Map inPackageWeights;
    private Object inPackingSession;
    private String inPickerPartyId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWeightUomId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outShipmentId;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAdditionalShippingCharge() {
        return this.inAdditionalShippingCharge;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAdditionalShippingChargeDescription() {
        return this.inAdditionalShippingChargeDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getInForceComplete() {
        return this.inForceComplete;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInHandlingInstructions() {
        return this.inHandlingInstructions;
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
     * @return <code>Map</code>
     */
    public Map getInPackageBoxTypeIds() {
        return this.inPackageBoxTypeIds;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInPackageTrackingCodes() {
        return this.inPackageTrackingCodes;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInPackageWeights() {
        return this.inPackageWeights;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Object</code>
     */
    public Object getInPackingSession() {
        return this.inPackingSession;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPickerPartyId() {
        return this.inPickerPartyId;
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
    public String getInWeightUomId() {
        return this.inWeightUomId;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutShipmentId() {
        return this.outShipmentId;
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
     * @param inAdditionalShippingCharge the inAdditionalShippingCharge to set
    */
    public void setInAdditionalShippingCharge(BigDecimal inAdditionalShippingCharge) {
        this.inParameters.add("additionalShippingCharge");
        this.inAdditionalShippingCharge = inAdditionalShippingCharge;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAdditionalShippingChargeDescription the inAdditionalShippingChargeDescription to set
    */
    public void setInAdditionalShippingChargeDescription(String inAdditionalShippingChargeDescription) {
        this.inParameters.add("additionalShippingChargeDescription");
        this.inAdditionalShippingChargeDescription = inAdditionalShippingChargeDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inForceComplete the inForceComplete to set
    */
    public void setInForceComplete(Boolean inForceComplete) {
        this.inParameters.add("forceComplete");
        this.inForceComplete = inForceComplete;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inHandlingInstructions the inHandlingInstructions to set
    */
    public void setInHandlingInstructions(String inHandlingInstructions) {
        this.inParameters.add("handlingInstructions");
        this.inHandlingInstructions = inHandlingInstructions;
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
     * @param inPackageBoxTypeIds the inPackageBoxTypeIds to set
    */
    public void setInPackageBoxTypeIds(Map inPackageBoxTypeIds) {
        this.inParameters.add("packageBoxTypeIds");
        this.inPackageBoxTypeIds = inPackageBoxTypeIds;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPackageTrackingCodes the inPackageTrackingCodes to set
    */
    public void setInPackageTrackingCodes(Map inPackageTrackingCodes) {
        this.inParameters.add("packageTrackingCodes");
        this.inPackageTrackingCodes = inPackageTrackingCodes;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPackageWeights the inPackageWeights to set
    */
    public void setInPackageWeights(Map inPackageWeights) {
        this.inParameters.add("packageWeights");
        this.inPackageWeights = inPackageWeights;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPackingSession the inPackingSession to set
    */
    public void setInPackingSession(Object inPackingSession) {
        this.inParameters.add("packingSession");
        this.inPackingSession = inPackingSession;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPickerPartyId the inPickerPartyId to set
    */
    public void setInPickerPartyId(String inPickerPartyId) {
        this.inParameters.add("pickerPartyId");
        this.inPickerPartyId = inPickerPartyId;
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
     * @param inWeightUomId the inWeightUomId to set
    */
    public void setInWeightUomId(String inWeightUomId) {
        this.inParameters.add("weightUomId");
        this.inWeightUomId = inWeightUomId;
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
     * This parameter is required.
     * @param outShipmentId the outShipmentId to set
    */
    public void setOutShipmentId(String outShipmentId) {
        this.outParameters.add("shipmentId");
        this.outShipmentId = outShipmentId;
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
        if (inParameters.contains("additionalShippingCharge")) mapValue.put("additionalShippingCharge", getInAdditionalShippingCharge());
        if (inParameters.contains("additionalShippingChargeDescription")) mapValue.put("additionalShippingChargeDescription", getInAdditionalShippingChargeDescription());
        if (inParameters.contains("forceComplete")) mapValue.put("forceComplete", getInForceComplete());
        if (inParameters.contains("handlingInstructions")) mapValue.put("handlingInstructions", getInHandlingInstructions());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("packageBoxTypeIds")) mapValue.put("packageBoxTypeIds", getInPackageBoxTypeIds());
        if (inParameters.contains("packageTrackingCodes")) mapValue.put("packageTrackingCodes", getInPackageTrackingCodes());
        if (inParameters.contains("packageWeights")) mapValue.put("packageWeights", getInPackageWeights());
        if (inParameters.contains("packingSession")) mapValue.put("packingSession", getInPackingSession());
        if (inParameters.contains("pickerPartyId")) mapValue.put("pickerPartyId", getInPickerPartyId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("weightUomId")) mapValue.put("weightUomId", getInWeightUomId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("shipmentId")) mapValue.put("shipmentId", getOutShipmentId());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("additionalShippingCharge")) setInAdditionalShippingCharge((BigDecimal) mapValue.get("additionalShippingCharge"));
        if (mapValue.containsKey("additionalShippingChargeDescription")) setInAdditionalShippingChargeDescription((String) mapValue.get("additionalShippingChargeDescription"));
        if (mapValue.containsKey("forceComplete")) setInForceComplete((Boolean) mapValue.get("forceComplete"));
        if (mapValue.containsKey("handlingInstructions")) setInHandlingInstructions((String) mapValue.get("handlingInstructions"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("packageBoxTypeIds")) setInPackageBoxTypeIds((Map) mapValue.get("packageBoxTypeIds"));
        if (mapValue.containsKey("packageTrackingCodes")) setInPackageTrackingCodes((Map) mapValue.get("packageTrackingCodes"));
        if (mapValue.containsKey("packageWeights")) setInPackageWeights((Map) mapValue.get("packageWeights"));
        if (mapValue.containsKey("packingSession")) setInPackingSession((Object) mapValue.get("packingSession"));
        if (mapValue.containsKey("pickerPartyId")) setInPickerPartyId((String) mapValue.get("pickerPartyId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("weightUomId")) setInWeightUomId((String) mapValue.get("weightUomId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("shipmentId")) setOutShipmentId((String) mapValue.get("shipmentId"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>WarehouseCompletePack</code> from the input values of the given <code>WarehouseCompletePack</code>.
     * @param input a <code>WarehouseCompletePack</code>
     */
    public static WarehouseCompletePack fromInput(WarehouseCompletePack input) {
        WarehouseCompletePack service = new WarehouseCompletePack();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>WarehouseCompletePack</code> from the output values of the given <code>WarehouseCompletePack</code>.
     * @param output a <code>WarehouseCompletePack</code>
     */
    public static WarehouseCompletePack fromOutput(WarehouseCompletePack output) {
        WarehouseCompletePack service = new WarehouseCompletePack();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>WarehouseCompletePack</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static WarehouseCompletePack fromInput(Map<String, Object> mapValue) {
        WarehouseCompletePack service = new WarehouseCompletePack();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>WarehouseCompletePack</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static WarehouseCompletePack fromOutput(Map<String, Object> mapValue) {
        WarehouseCompletePack service = new WarehouseCompletePack();
        service.putAllOutput(mapValue);
        return service;
    }
}
