package org.opentaps.base.entities.bridge;

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

import java.util.Date;
import java.sql.Timestamp;
import java.math.BigDecimal;
import org.hibernate.search.annotations.Resolution;
import org.hibernate.search.bridge.builtin.*;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.Field.TermVector;
import org.hibernate.search.bridge.LuceneOptions;
import org.hibernate.search.bridge.TwoWayFieldBridge;
import org.opentaps.base.entities.AgreementEmploymentApplPk;

/**
 * A FieldBridge for AgreementEmploymentApplPk.
 */
public class AgreementEmploymentApplPkBridge implements TwoWayFieldBridge {

    /**
     * getter method, return the AgreementEmploymentApplPk.
     * @param name a <code>String</code> value
     * @param document a <code>Document</code> value
     * @return a <code>Object</code> value
     */
    public Object get(String name, Document document) {
        AgreementEmploymentApplPk id = new AgreementEmploymentApplPk();
        Field field = null;
        field = document.getField(name + ".agreementId");
        id.setAgreementId(field.stringValue());
        field = document.getField(name + ".agreementItemSeqId");
        id.setAgreementItemSeqId(field.stringValue());
        field = document.getField(name + ".partyIdTo");
        id.setPartyIdTo(field.stringValue());
        field = document.getField(name + ".partyIdFrom");
        id.setPartyIdFrom(field.stringValue());
        field = document.getField(name + ".roleTypeIdTo");
        id.setRoleTypeIdTo(field.stringValue());
        field = document.getField(name + ".roleTypeIdFrom");
        id.setRoleTypeIdFrom(field.stringValue());
        field = document.getField(name + ".fromDate");
        if (field.stringValue() != null && !field.stringValue().equals("")) {
            id.setFromDate(new Timestamp(((Date) (new DateBridge(Resolution.DAY)).stringToObject(field.stringValue())).getTime()));
        }
        return id;
    }

    /**
     * change object to String.
     * @param object a <code>Object</code> PK value
     * @return a <code>String</code> value
     */
    public String objectToString(Object object) {
        AgreementEmploymentApplPk id = (AgreementEmploymentApplPk) object;
        StringBuilder sb = new StringBuilder();
        sb.append(id.getAgreementId());
        sb.append("_");
        sb.append(id.getAgreementItemSeqId());
        sb.append("_");
        sb.append(id.getPartyIdTo());
        sb.append("_");
        sb.append(id.getPartyIdFrom());
        sb.append("_");
        sb.append(id.getRoleTypeIdTo());
        sb.append("_");
        sb.append(id.getRoleTypeIdFrom());
        sb.append("_");
        sb.append(id.getFromDate());
        return sb.toString();
    }

    /**
     * set field value by pk.
     * @param name a <code>String</code> field name
     * @param value a <code>Object</code> value
     * @param document a <code>Document</code> value
     * @param luceneOptions a <code>LuceneOptions</code> value
     */
    public void set(String name, Object value, Document document, LuceneOptions luceneOptions) {
        AgreementEmploymentApplPk id = (AgreementEmploymentApplPk) value;
        Store store = luceneOptions.getStore();
        Index index = luceneOptions.getIndex();
        TermVector termVector = luceneOptions.getTermVector();
        Float boost = luceneOptions.getBoost();

        Field field = null;
        field = new Field(name + ".agreementId", id.getAgreementId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".agreementItemSeqId", id.getAgreementItemSeqId(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".partyIdTo", id.getPartyIdTo(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".partyIdFrom", id.getPartyIdFrom(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".roleTypeIdTo", id.getRoleTypeIdTo(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".roleTypeIdFrom", id.getRoleTypeIdFrom(), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
        field = new Field(name + ".fromDate", (new DateBridge(Resolution.DAY)).objectToString(id.getFromDate()), store, index, termVector);
        field.setBoost(boost);
        document.add(field);

        field = new Field(name, objectToString(id), store, index, termVector);
        field.setBoost(boost);
        document.add(field);
    }

}
