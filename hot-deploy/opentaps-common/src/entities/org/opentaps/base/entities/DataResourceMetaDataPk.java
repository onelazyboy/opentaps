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
public class DataResourceMetaDataPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="DATA_RESOURCE_ID")
    private String dataResourceId;
    @Column(name="META_DATA_PREDICATE_ID")
    private String metaDataPredicateId;
    @Column(name="META_DATA_VALUE")
    private String metaDataValue;

    /**
     * Auto generated value setter.
     * @param dataResourceId the dataResourceId to set
     */
    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }
    /**
     * Auto generated value setter.
     * @param metaDataPredicateId the metaDataPredicateId to set
     */
    public void setMetaDataPredicateId(String metaDataPredicateId) {
        this.metaDataPredicateId = metaDataPredicateId;
    }
    /**
     * Auto generated value setter.
     * @param metaDataValue the metaDataValue to set
     */
    public void setMetaDataValue(String metaDataValue) {
        this.metaDataValue = metaDataValue;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDataResourceId() {
        return this.dataResourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMetaDataPredicateId() {
        return this.metaDataPredicateId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMetaDataValue() {
        return this.metaDataValue;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(dataResourceId).append("*");
            sb.append(metaDataPredicateId).append("*");
            sb.append(metaDataValue).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof DataResourceMetaDataPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
