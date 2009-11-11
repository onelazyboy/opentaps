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
import org.ofbiz.order.shoppingcart.ShoppingCart;

/**
 * Auto generated base service entity updatePurchaseOrderItems.
 */
public class UpdatePurchaseOrderItems extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updatePurchaseOrderItems";

    /** The enumeration of input parameters. */
    public static enum In {
        itemDescriptionMap("itemDescriptionMap"),
        itemPriceMap("itemPriceMap"),
        itemQtyMap("itemQtyMap"),
        locale("locale"),
        orderId("orderId"),
        overridePriceMap("overridePriceMap"),
        tagsMap1("tagsMap1"),
        tagsMap10("tagsMap10"),
        tagsMap2("tagsMap2"),
        tagsMap3("tagsMap3"),
        tagsMap4("tagsMap4"),
        tagsMap5("tagsMap5"),
        tagsMap6("tagsMap6"),
        tagsMap7("tagsMap7"),
        tagsMap8("tagsMap8"),
        tagsMap9("tagsMap9"),
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
        orderId("orderId"),
        responseMessage("responseMessage"),
        shoppingCart("shoppingCart"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private Map inItemDescriptionMap;
    private Map inItemPriceMap;
    private Map inItemQtyMap;
    private Locale inLocale;
    private String inOrderId;
    private Map inOverridePriceMap;
    private Map inTagsMap1;
    private Map inTagsMap10;
    private Map inTagsMap2;
    private Map inTagsMap3;
    private Map inTagsMap4;
    private Map inTagsMap5;
    private Map inTagsMap6;
    private Map inTagsMap7;
    private Map inTagsMap8;
    private Map inTagsMap9;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outOrderId;
    private String outResponseMessage;
    private ShoppingCart outShoppingCart;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInItemDescriptionMap() {
        return this.inItemDescriptionMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInItemPriceMap() {
        return this.inItemPriceMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInItemQtyMap() {
        return this.inItemQtyMap;
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
    public String getInOrderId() {
        return this.inOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInOverridePriceMap() {
        return this.inOverridePriceMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap1() {
        return this.inTagsMap1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap10() {
        return this.inTagsMap10;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap2() {
        return this.inTagsMap2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap3() {
        return this.inTagsMap3;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap4() {
        return this.inTagsMap4;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap5() {
        return this.inTagsMap5;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap6() {
        return this.inTagsMap6;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap7() {
        return this.inTagsMap7;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap8() {
        return this.inTagsMap8;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Map</code>
     */
    public Map getInTagsMap9() {
        return this.inTagsMap9;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutOrderId() {
        return this.outOrderId;
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
     * @return <code>ShoppingCart</code>
     */
    public ShoppingCart getOutShoppingCart() {
        return this.outShoppingCart;
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
     * @param inItemDescriptionMap the inItemDescriptionMap to set
    */
    public void setInItemDescriptionMap(Map inItemDescriptionMap) {
        this.inParameters.add("itemDescriptionMap");
        this.inItemDescriptionMap = inItemDescriptionMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inItemPriceMap the inItemPriceMap to set
    */
    public void setInItemPriceMap(Map inItemPriceMap) {
        this.inParameters.add("itemPriceMap");
        this.inItemPriceMap = inItemPriceMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inItemQtyMap the inItemQtyMap to set
    */
    public void setInItemQtyMap(Map inItemQtyMap) {
        this.inParameters.add("itemQtyMap");
        this.inItemQtyMap = inItemQtyMap;
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
     * @param inOrderId the inOrderId to set
    */
    public void setInOrderId(String inOrderId) {
        this.inParameters.add("orderId");
        this.inOrderId = inOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOverridePriceMap the inOverridePriceMap to set
    */
    public void setInOverridePriceMap(Map inOverridePriceMap) {
        this.inParameters.add("overridePriceMap");
        this.inOverridePriceMap = inOverridePriceMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap1 the inTagsMap1 to set
    */
    public void setInTagsMap1(Map inTagsMap1) {
        this.inParameters.add("tagsMap1");
        this.inTagsMap1 = inTagsMap1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap10 the inTagsMap10 to set
    */
    public void setInTagsMap10(Map inTagsMap10) {
        this.inParameters.add("tagsMap10");
        this.inTagsMap10 = inTagsMap10;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap2 the inTagsMap2 to set
    */
    public void setInTagsMap2(Map inTagsMap2) {
        this.inParameters.add("tagsMap2");
        this.inTagsMap2 = inTagsMap2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap3 the inTagsMap3 to set
    */
    public void setInTagsMap3(Map inTagsMap3) {
        this.inParameters.add("tagsMap3");
        this.inTagsMap3 = inTagsMap3;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap4 the inTagsMap4 to set
    */
    public void setInTagsMap4(Map inTagsMap4) {
        this.inParameters.add("tagsMap4");
        this.inTagsMap4 = inTagsMap4;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap5 the inTagsMap5 to set
    */
    public void setInTagsMap5(Map inTagsMap5) {
        this.inParameters.add("tagsMap5");
        this.inTagsMap5 = inTagsMap5;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap6 the inTagsMap6 to set
    */
    public void setInTagsMap6(Map inTagsMap6) {
        this.inParameters.add("tagsMap6");
        this.inTagsMap6 = inTagsMap6;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap7 the inTagsMap7 to set
    */
    public void setInTagsMap7(Map inTagsMap7) {
        this.inParameters.add("tagsMap7");
        this.inTagsMap7 = inTagsMap7;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap8 the inTagsMap8 to set
    */
    public void setInTagsMap8(Map inTagsMap8) {
        this.inParameters.add("tagsMap8");
        this.inTagsMap8 = inTagsMap8;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTagsMap9 the inTagsMap9 to set
    */
    public void setInTagsMap9(Map inTagsMap9) {
        this.inParameters.add("tagsMap9");
        this.inTagsMap9 = inTagsMap9;
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
     * This parameter is required.
     * @param outOrderId the outOrderId to set
    */
    public void setOutOrderId(String outOrderId) {
        this.outParameters.add("orderId");
        this.outOrderId = outOrderId;
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
     * @param outShoppingCart the outShoppingCart to set
    */
    public void setOutShoppingCart(ShoppingCart outShoppingCart) {
        this.outParameters.add("shoppingCart");
        this.outShoppingCart = outShoppingCart;
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
        if (inParameters.contains("itemDescriptionMap")) mapValue.put("itemDescriptionMap", getInItemDescriptionMap());
        if (inParameters.contains("itemPriceMap")) mapValue.put("itemPriceMap", getInItemPriceMap());
        if (inParameters.contains("itemQtyMap")) mapValue.put("itemQtyMap", getInItemQtyMap());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("overridePriceMap")) mapValue.put("overridePriceMap", getInOverridePriceMap());
        if (inParameters.contains("tagsMap1")) mapValue.put("tagsMap1", getInTagsMap1());
        if (inParameters.contains("tagsMap10")) mapValue.put("tagsMap10", getInTagsMap10());
        if (inParameters.contains("tagsMap2")) mapValue.put("tagsMap2", getInTagsMap2());
        if (inParameters.contains("tagsMap3")) mapValue.put("tagsMap3", getInTagsMap3());
        if (inParameters.contains("tagsMap4")) mapValue.put("tagsMap4", getInTagsMap4());
        if (inParameters.contains("tagsMap5")) mapValue.put("tagsMap5", getInTagsMap5());
        if (inParameters.contains("tagsMap6")) mapValue.put("tagsMap6", getInTagsMap6());
        if (inParameters.contains("tagsMap7")) mapValue.put("tagsMap7", getInTagsMap7());
        if (inParameters.contains("tagsMap8")) mapValue.put("tagsMap8", getInTagsMap8());
        if (inParameters.contains("tagsMap9")) mapValue.put("tagsMap9", getInTagsMap9());
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
        if (outParameters.contains("orderId")) mapValue.put("orderId", getOutOrderId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("shoppingCart")) mapValue.put("shoppingCart", getOutShoppingCart());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("itemDescriptionMap")) setInItemDescriptionMap((Map) mapValue.get("itemDescriptionMap"));
        if (mapValue.containsKey("itemPriceMap")) setInItemPriceMap((Map) mapValue.get("itemPriceMap"));
        if (mapValue.containsKey("itemQtyMap")) setInItemQtyMap((Map) mapValue.get("itemQtyMap"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("overridePriceMap")) setInOverridePriceMap((Map) mapValue.get("overridePriceMap"));
        if (mapValue.containsKey("tagsMap1")) setInTagsMap1((Map) mapValue.get("tagsMap1"));
        if (mapValue.containsKey("tagsMap10")) setInTagsMap10((Map) mapValue.get("tagsMap10"));
        if (mapValue.containsKey("tagsMap2")) setInTagsMap2((Map) mapValue.get("tagsMap2"));
        if (mapValue.containsKey("tagsMap3")) setInTagsMap3((Map) mapValue.get("tagsMap3"));
        if (mapValue.containsKey("tagsMap4")) setInTagsMap4((Map) mapValue.get("tagsMap4"));
        if (mapValue.containsKey("tagsMap5")) setInTagsMap5((Map) mapValue.get("tagsMap5"));
        if (mapValue.containsKey("tagsMap6")) setInTagsMap6((Map) mapValue.get("tagsMap6"));
        if (mapValue.containsKey("tagsMap7")) setInTagsMap7((Map) mapValue.get("tagsMap7"));
        if (mapValue.containsKey("tagsMap8")) setInTagsMap8((Map) mapValue.get("tagsMap8"));
        if (mapValue.containsKey("tagsMap9")) setInTagsMap9((Map) mapValue.get("tagsMap9"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setOutOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("shoppingCart")) setOutShoppingCart((ShoppingCart) mapValue.get("shoppingCart"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdatePurchaseOrderItems</code> from the input values of the given <code>UpdatePurchaseOrderItems</code>.
     * @param input a <code>UpdatePurchaseOrderItems</code>
     */
    public static UpdatePurchaseOrderItems fromInput(UpdatePurchaseOrderItems input) {
        UpdatePurchaseOrderItems service = new UpdatePurchaseOrderItems();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>UpdatePurchaseOrderItems</code> from the output values of the given <code>UpdatePurchaseOrderItems</code>.
     * @param output a <code>UpdatePurchaseOrderItems</code>
     */
    public static UpdatePurchaseOrderItems fromOutput(UpdatePurchaseOrderItems output) {
        UpdatePurchaseOrderItems service = new UpdatePurchaseOrderItems();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdatePurchaseOrderItems</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdatePurchaseOrderItems fromInput(Map<String, Object> mapValue) {
        UpdatePurchaseOrderItems service = new UpdatePurchaseOrderItems();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>UpdatePurchaseOrderItems</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdatePurchaseOrderItems fromOutput(Map<String, Object> mapValue) {
        UpdatePurchaseOrderItems service = new UpdatePurchaseOrderItems();
        service.putAllOutput(mapValue);
        return service;
    }
}
