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
 * Auto generated base service entity opentaps.calculateProductPrice.
 */
public class OpentapsCalculateProductPrice extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "opentaps.calculateProductPrice";

    /** The enumeration of input parameters. */
    public static enum In {
        agreementId("agreementId"),
        autoUserLogin("autoUserLogin"),
        checkIncludeVat("checkIncludeVat"),
        currencyUomId("currencyUomId"),
        findAllQuantityPrices("findAllQuantityPrices"),
        locale("locale"),
        partyId("partyId"),
        prodCatalogId("prodCatalogId"),
        product("product"),
        productPricePurposeId("productPricePurposeId"),
        productStoreGroupId("productStoreGroupId"),
        productStoreId("productStoreId"),
        quantity("quantity"),
        termUomId("termUomId"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        webSiteId("webSiteId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        allQuantityPrices("allQuantityPrices"),
        averageCost("averageCost"),
        basePrice("basePrice"),
        competitivePrice("competitivePrice"),
        currencyUsed("currencyUsed"),
        defaultPrice("defaultPrice"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        isSale("isSale"),
        listPrice("listPrice"),
        locale("locale"),
        minAdvPrice("minAdvPrice"),
        orderItemPriceInfos("orderItemPriceInfos"),
        price("price"),
        promoPrice("promoPrice"),
        responseMessage("responseMessage"),
        specialPromoPrice("specialPromoPrice"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        validPriceFound("validPriceFound");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    private String inAgreementId;
    private GenericValue inAutoUserLogin;
    private String inCheckIncludeVat;
    private String inCurrencyUomId;
    private String inFindAllQuantityPrices;
    private Locale inLocale;
    private String inPartyId;
    private String inProdCatalogId;
    private GenericValue inProduct;
    private String inProductPricePurposeId;
    private String inProductStoreGroupId;
    private String inProductStoreId;
    private Double inQuantity;
    private String inTermUomId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWebSiteId;
    private List outAllQuantityPrices;
    private Double outAverageCost;
    private Double outBasePrice;
    private Double outCompetitivePrice;
    private String outCurrencyUsed;
    private Double outDefaultPrice;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Boolean outIsSale;
    private Double outListPrice;
    private Locale outLocale;
    private Double outMinAdvPrice;
    private List outOrderItemPriceInfos;
    private Double outPrice;
    private Double outPromoPrice;
    private String outResponseMessage;
    private Double outSpecialPromoPrice;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;
    private Boolean outValidPriceFound;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAgreementId() {
        return this.inAgreementId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInAutoUserLogin() {
        return this.inAutoUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCheckIncludeVat() {
        return this.inCheckIncludeVat;
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
    public String getInFindAllQuantityPrices() {
        return this.inFindAllQuantityPrices;
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
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProdCatalogId() {
        return this.inProdCatalogId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInProduct() {
        return this.inProduct;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductPricePurposeId() {
        return this.inProductPricePurposeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductStoreGroupId() {
        return this.inProductStoreGroupId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getInQuantity() {
        return this.inQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTermUomId() {
        return this.inTermUomId;
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
     * @return <code>List</code>
     */
    public List getOutAllQuantityPrices() {
        return this.outAllQuantityPrices;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getOutAverageCost() {
        return this.outAverageCost;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Double</code>
     */
    public Double getOutBasePrice() {
        return this.outBasePrice;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getOutCompetitivePrice() {
        return this.outCompetitivePrice;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutCurrencyUsed() {
        return this.outCurrencyUsed;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getOutDefaultPrice() {
        return this.outDefaultPrice;
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
     * This parameter is required.
     * @return <code>Boolean</code>
     */
    public Boolean getOutIsSale() {
        return this.outIsSale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getOutListPrice() {
        return this.outListPrice;
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
     * @return <code>Double</code>
     */
    public Double getOutMinAdvPrice() {
        return this.outMinAdvPrice;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getOutOrderItemPriceInfos() {
        return this.outOrderItemPriceInfos;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Double</code>
     */
    public Double getOutPrice() {
        return this.outPrice;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Double</code>
     */
    public Double getOutPromoPrice() {
        return this.outPromoPrice;
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
     * @return <code>Double</code>
     */
    public Double getOutSpecialPromoPrice() {
        return this.outSpecialPromoPrice;
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
     * This parameter is required.
     * @return <code>Boolean</code>
     */
    public Boolean getOutValidPriceFound() {
        return this.outValidPriceFound;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAgreementId the inAgreementId to set
    */
    public void setInAgreementId(String inAgreementId) {
        this.inParameters.add("agreementId");
        this.inAgreementId = inAgreementId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAutoUserLogin the inAutoUserLogin to set
    */
    public void setInAutoUserLogin(GenericValue inAutoUserLogin) {
        this.inParameters.add("autoUserLogin");
        this.inAutoUserLogin = inAutoUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCheckIncludeVat the inCheckIncludeVat to set
    */
    public void setInCheckIncludeVat(String inCheckIncludeVat) {
        this.inParameters.add("checkIncludeVat");
        this.inCheckIncludeVat = inCheckIncludeVat;
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
     * @param inFindAllQuantityPrices the inFindAllQuantityPrices to set
    */
    public void setInFindAllQuantityPrices(String inFindAllQuantityPrices) {
        this.inParameters.add("findAllQuantityPrices");
        this.inFindAllQuantityPrices = inFindAllQuantityPrices;
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
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProdCatalogId the inProdCatalogId to set
    */
    public void setInProdCatalogId(String inProdCatalogId) {
        this.inParameters.add("prodCatalogId");
        this.inProdCatalogId = inProdCatalogId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProduct the inProduct to set
    */
    public void setInProduct(GenericValue inProduct) {
        this.inParameters.add("product");
        this.inProduct = inProduct;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductPricePurposeId the inProductPricePurposeId to set
    */
    public void setInProductPricePurposeId(String inProductPricePurposeId) {
        this.inParameters.add("productPricePurposeId");
        this.inProductPricePurposeId = inProductPricePurposeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductStoreGroupId the inProductStoreGroupId to set
    */
    public void setInProductStoreGroupId(String inProductStoreGroupId) {
        this.inParameters.add("productStoreGroupId");
        this.inProductStoreGroupId = inProductStoreGroupId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuantity the inQuantity to set
    */
    public void setInQuantity(Double inQuantity) {
        this.inParameters.add("quantity");
        this.inQuantity = inQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTermUomId the inTermUomId to set
    */
    public void setInTermUomId(String inTermUomId) {
        this.inParameters.add("termUomId");
        this.inTermUomId = inTermUomId;
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
     * @param outAllQuantityPrices the outAllQuantityPrices to set
    */
    public void setOutAllQuantityPrices(List outAllQuantityPrices) {
        this.outParameters.add("allQuantityPrices");
        this.outAllQuantityPrices = outAllQuantityPrices;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAverageCost the outAverageCost to set
    */
    public void setOutAverageCost(Double outAverageCost) {
        this.outParameters.add("averageCost");
        this.outAverageCost = outAverageCost;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outBasePrice the outBasePrice to set
    */
    public void setOutBasePrice(Double outBasePrice) {
        this.outParameters.add("basePrice");
        this.outBasePrice = outBasePrice;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCompetitivePrice the outCompetitivePrice to set
    */
    public void setOutCompetitivePrice(Double outCompetitivePrice) {
        this.outParameters.add("competitivePrice");
        this.outCompetitivePrice = outCompetitivePrice;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outCurrencyUsed the outCurrencyUsed to set
    */
    public void setOutCurrencyUsed(String outCurrencyUsed) {
        this.outParameters.add("currencyUsed");
        this.outCurrencyUsed = outCurrencyUsed;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outDefaultPrice the outDefaultPrice to set
    */
    public void setOutDefaultPrice(Double outDefaultPrice) {
        this.outParameters.add("defaultPrice");
        this.outDefaultPrice = outDefaultPrice;
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
     * This parameter is required.
     * @param outIsSale the outIsSale to set
    */
    public void setOutIsSale(Boolean outIsSale) {
        this.outParameters.add("isSale");
        this.outIsSale = outIsSale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outListPrice the outListPrice to set
    */
    public void setOutListPrice(Double outListPrice) {
        this.outParameters.add("listPrice");
        this.outListPrice = outListPrice;
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
     * @param outMinAdvPrice the outMinAdvPrice to set
    */
    public void setOutMinAdvPrice(Double outMinAdvPrice) {
        this.outParameters.add("minAdvPrice");
        this.outMinAdvPrice = outMinAdvPrice;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outOrderItemPriceInfos the outOrderItemPriceInfos to set
    */
    public void setOutOrderItemPriceInfos(List outOrderItemPriceInfos) {
        this.outParameters.add("orderItemPriceInfos");
        this.outOrderItemPriceInfos = outOrderItemPriceInfos;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outPrice the outPrice to set
    */
    public void setOutPrice(Double outPrice) {
        this.outParameters.add("price");
        this.outPrice = outPrice;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outPromoPrice the outPromoPrice to set
    */
    public void setOutPromoPrice(Double outPromoPrice) {
        this.outParameters.add("promoPrice");
        this.outPromoPrice = outPromoPrice;
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
     * @param outSpecialPromoPrice the outSpecialPromoPrice to set
    */
    public void setOutSpecialPromoPrice(Double outSpecialPromoPrice) {
        this.outParameters.add("specialPromoPrice");
        this.outSpecialPromoPrice = outSpecialPromoPrice;
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
     * This parameter is required.
     * @param outValidPriceFound the outValidPriceFound to set
    */
    public void setOutValidPriceFound(Boolean outValidPriceFound) {
        this.outParameters.add("validPriceFound");
        this.outValidPriceFound = outValidPriceFound;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("agreementId")) mapValue.put("agreementId", getInAgreementId());
        if (inParameters.contains("autoUserLogin")) mapValue.put("autoUserLogin", getInAutoUserLogin());
        if (inParameters.contains("checkIncludeVat")) mapValue.put("checkIncludeVat", getInCheckIncludeVat());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("findAllQuantityPrices")) mapValue.put("findAllQuantityPrices", getInFindAllQuantityPrices());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("prodCatalogId")) mapValue.put("prodCatalogId", getInProdCatalogId());
        if (inParameters.contains("product")) mapValue.put("product", getInProduct());
        if (inParameters.contains("productPricePurposeId")) mapValue.put("productPricePurposeId", getInProductPricePurposeId());
        if (inParameters.contains("productStoreGroupId")) mapValue.put("productStoreGroupId", getInProductStoreGroupId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("quantity")) mapValue.put("quantity", getInQuantity());
        if (inParameters.contains("termUomId")) mapValue.put("termUomId", getInTermUomId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("webSiteId")) mapValue.put("webSiteId", getInWebSiteId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("allQuantityPrices")) mapValue.put("allQuantityPrices", getOutAllQuantityPrices());
        if (outParameters.contains("averageCost")) mapValue.put("averageCost", getOutAverageCost());
        if (outParameters.contains("basePrice")) mapValue.put("basePrice", getOutBasePrice());
        if (outParameters.contains("competitivePrice")) mapValue.put("competitivePrice", getOutCompetitivePrice());
        if (outParameters.contains("currencyUsed")) mapValue.put("currencyUsed", getOutCurrencyUsed());
        if (outParameters.contains("defaultPrice")) mapValue.put("defaultPrice", getOutDefaultPrice());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("isSale")) mapValue.put("isSale", getOutIsSale());
        if (outParameters.contains("listPrice")) mapValue.put("listPrice", getOutListPrice());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("minAdvPrice")) mapValue.put("minAdvPrice", getOutMinAdvPrice());
        if (outParameters.contains("orderItemPriceInfos")) mapValue.put("orderItemPriceInfos", getOutOrderItemPriceInfos());
        if (outParameters.contains("price")) mapValue.put("price", getOutPrice());
        if (outParameters.contains("promoPrice")) mapValue.put("promoPrice", getOutPromoPrice());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("specialPromoPrice")) mapValue.put("specialPromoPrice", getOutSpecialPromoPrice());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        if (outParameters.contains("validPriceFound")) mapValue.put("validPriceFound", getOutValidPriceFound());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("agreementId")) setInAgreementId((String) mapValue.get("agreementId"));
        if (mapValue.containsKey("autoUserLogin")) setInAutoUserLogin((GenericValue) mapValue.get("autoUserLogin"));
        if (mapValue.containsKey("checkIncludeVat")) setInCheckIncludeVat((String) mapValue.get("checkIncludeVat"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("findAllQuantityPrices")) setInFindAllQuantityPrices((String) mapValue.get("findAllQuantityPrices"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("prodCatalogId")) setInProdCatalogId((String) mapValue.get("prodCatalogId"));
        if (mapValue.containsKey("product")) setInProduct((GenericValue) mapValue.get("product"));
        if (mapValue.containsKey("productPricePurposeId")) setInProductPricePurposeId((String) mapValue.get("productPricePurposeId"));
        if (mapValue.containsKey("productStoreGroupId")) setInProductStoreGroupId((String) mapValue.get("productStoreGroupId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("quantity")) setInQuantity((Double) mapValue.get("quantity"));
        if (mapValue.containsKey("termUomId")) setInTermUomId((String) mapValue.get("termUomId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("webSiteId")) setInWebSiteId((String) mapValue.get("webSiteId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("allQuantityPrices")) setOutAllQuantityPrices((List) mapValue.get("allQuantityPrices"));
        if (mapValue.containsKey("averageCost")) setOutAverageCost((Double) mapValue.get("averageCost"));
        if (mapValue.containsKey("basePrice")) setOutBasePrice((Double) mapValue.get("basePrice"));
        if (mapValue.containsKey("competitivePrice")) setOutCompetitivePrice((Double) mapValue.get("competitivePrice"));
        if (mapValue.containsKey("currencyUsed")) setOutCurrencyUsed((String) mapValue.get("currencyUsed"));
        if (mapValue.containsKey("defaultPrice")) setOutDefaultPrice((Double) mapValue.get("defaultPrice"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("isSale")) setOutIsSale((Boolean) mapValue.get("isSale"));
        if (mapValue.containsKey("listPrice")) setOutListPrice((Double) mapValue.get("listPrice"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("minAdvPrice")) setOutMinAdvPrice((Double) mapValue.get("minAdvPrice"));
        if (mapValue.containsKey("orderItemPriceInfos")) setOutOrderItemPriceInfos((List) mapValue.get("orderItemPriceInfos"));
        if (mapValue.containsKey("price")) setOutPrice((Double) mapValue.get("price"));
        if (mapValue.containsKey("promoPrice")) setOutPromoPrice((Double) mapValue.get("promoPrice"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("specialPromoPrice")) setOutSpecialPromoPrice((Double) mapValue.get("specialPromoPrice"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("validPriceFound")) setOutValidPriceFound((Boolean) mapValue.get("validPriceFound"));
    }

    /**
     * Construct a <code>OpentapsCalculateProductPrice</code> from the input values of the given <code>OpentapsCalculateProductPrice</code>.
     * @param input a <code>OpentapsCalculateProductPrice</code>
     */
    public static OpentapsCalculateProductPrice fromInput(OpentapsCalculateProductPrice input) {
        OpentapsCalculateProductPrice service = new OpentapsCalculateProductPrice();
        service.putAllInput(input.inputMap());
        return service;
    }

    /**
     * Construct a <code>OpentapsCalculateProductPrice</code> from the output values of the given <code>OpentapsCalculateProductPrice</code>.
     * @param output a <code>OpentapsCalculateProductPrice</code>
     */
    public static OpentapsCalculateProductPrice fromOutput(OpentapsCalculateProductPrice output) {
        OpentapsCalculateProductPrice service = new OpentapsCalculateProductPrice();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>OpentapsCalculateProductPrice</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static OpentapsCalculateProductPrice fromInput(Map<String, Object> mapValue) {
        OpentapsCalculateProductPrice service = new OpentapsCalculateProductPrice();
        service.putAllInput(mapValue);
        return service;
    }

    /**
     * Construct a <code>OpentapsCalculateProductPrice</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static OpentapsCalculateProductPrice fromOutput(Map<String, Object> mapValue) {
        OpentapsCalculateProductPrice service = new OpentapsCalculateProductPrice();
        service.putAllOutput(mapValue);
        return service;
    }
}
