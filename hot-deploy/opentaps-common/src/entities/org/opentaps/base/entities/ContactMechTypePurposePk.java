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
public class ContactMechTypePurposePk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="CONTACT_MECH_TYPE_ID")
    private String contactMechTypeId;
    @Column(name="CONTACT_MECH_PURPOSE_TYPE_ID")
    private String contactMechPurposeTypeId;

    /**
     * Auto generated value setter.
     * @param contactMechTypeId the contactMechTypeId to set
     */
    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechPurposeTypeId the contactMechPurposeTypeId to set
     */
    public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechTypeId() {
        return this.contactMechTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechPurposeTypeId() {
        return this.contactMechPurposeTypeId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(contactMechTypeId).append("*");
            sb.append(contactMechPurposeTypeId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof ContactMechTypePurposePk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
