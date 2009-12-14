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
public class TemporalExpressionAssocPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="FROM_TEMP_EXPR_ID")
    private String fromTempExprId;
    @Column(name="TO_TEMP_EXPR_ID")
    private String toTempExprId;

    /**
     * Auto generated value setter.
     * @param fromTempExprId the fromTempExprId to set
     */
    public void setFromTempExprId(String fromTempExprId) {
        this.fromTempExprId = fromTempExprId;
    }
    /**
     * Auto generated value setter.
     * @param toTempExprId the toTempExprId to set
     */
    public void setToTempExprId(String toTempExprId) {
        this.toTempExprId = toTempExprId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFromTempExprId() {
        return this.fromTempExprId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToTempExprId() {
        return this.toTempExprId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(fromTempExprId).append("*");
            sb.append(toTempExprId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof TemporalExpressionAssocPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
