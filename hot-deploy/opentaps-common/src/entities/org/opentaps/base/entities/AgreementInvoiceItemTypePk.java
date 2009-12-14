package org.opentaps.base.entities;

/*
* Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.io.Serializable;
import javax.persistence.*;

import java.lang.String;

@Embeddable
public class AgreementInvoiceItemTypePk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="AGREEMENT_TYPE_ID")
    private String agreementTypeId;
    @Column(name="INVOICE_ITEM_TYPE_ID_FROM")
    private String invoiceItemTypeIdFrom;
    @Column(name="INVOICE_ITEM_TYPE_ID_TO")
    private String invoiceItemTypeIdTo;

    /**
     * Auto generated value setter.
     * @param agreementTypeId the agreementTypeId to set
     */
    public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceItemTypeIdFrom the invoiceItemTypeIdFrom to set
     */
    public void setInvoiceItemTypeIdFrom(String invoiceItemTypeIdFrom) {
        this.invoiceItemTypeIdFrom = invoiceItemTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param invoiceItemTypeIdTo the invoiceItemTypeIdTo to set
     */
    public void setInvoiceItemTypeIdTo(String invoiceItemTypeIdTo) {
        this.invoiceItemTypeIdTo = invoiceItemTypeIdTo;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgreementTypeId() {
        return this.agreementTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceItemTypeIdFrom() {
        return this.invoiceItemTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceItemTypeIdTo() {
        return this.invoiceItemTypeIdTo;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(agreementTypeId).append("*");
            sb.append(invoiceItemTypeIdFrom).append("*");
            sb.append(invoiceItemTypeIdTo).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof AgreementInvoiceItemTypePk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
