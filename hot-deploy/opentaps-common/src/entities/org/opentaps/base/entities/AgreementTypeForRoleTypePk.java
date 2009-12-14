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
public class AgreementTypeForRoleTypePk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Column(name="ROLE_TYPE_ID")
    private String roleTypeId;
    @Column(name="AGREEMENT_TYPE_ID")
    private String agreementTypeId;

    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param agreementTypeId the agreementTypeId to set
     */
    public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.roleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgreementTypeId() {
        return this.agreementTypeId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(organizationPartyId).append("*");
            sb.append(roleTypeId).append("*");
            sb.append(agreementTypeId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof AgreementTypeForRoleTypePk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
