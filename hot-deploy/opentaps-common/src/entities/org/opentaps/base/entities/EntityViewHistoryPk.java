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
public class EntityViewHistoryPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="ENTITY_NAME")
    private String entityName;
    @Column(name="USER_LOGIN_ID")
    private String userLoginId;
    @Column(name="PRIMARY_KEY_ID")
    private String primaryKeyId;

    /**
     * Auto generated value setter.
     * @param entityName the entityName to set
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
    /**
     * Auto generated value setter.
     * @param primaryKeyId the primaryKeyId to set
     */
    public void setPrimaryKeyId(String primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEntityName() {
        return this.entityName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserLoginId() {
        return this.userLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrimaryKeyId() {
        return this.primaryKeyId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(entityName).append("*");
            sb.append(userLoginId).append("*");
            sb.append(primaryKeyId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof EntityViewHistoryPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
