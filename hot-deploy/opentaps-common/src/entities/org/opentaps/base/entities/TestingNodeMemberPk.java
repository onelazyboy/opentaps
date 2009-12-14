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
import java.sql.Timestamp;

@Embeddable
public class TestingNodeMemberPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="TESTING_NODE_ID")
    private String testingNodeId;
    @Column(name="TESTING_ID")
    private String testingId;
    @Column(name="FROM_DATE")
    private Timestamp fromDate;

    /**
     * Auto generated value setter.
     * @param testingNodeId the testingNodeId to set
     */
    public void setTestingNodeId(String testingNodeId) {
        this.testingNodeId = testingNodeId;
    }
    /**
     * Auto generated value setter.
     * @param testingId the testingId to set
     */
    public void setTestingId(String testingId) {
        this.testingId = testingId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestingNodeId() {
        return this.testingNodeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTestingId() {
        return this.testingId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(testingNodeId).append("*");
            sb.append(testingId).append("*");
            sb.append(fromDate).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof TestingNodeMemberPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
