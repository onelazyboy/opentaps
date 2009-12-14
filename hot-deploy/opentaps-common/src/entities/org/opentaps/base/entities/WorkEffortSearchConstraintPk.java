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
public class WorkEffortSearchConstraintPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="WORK_EFFORT_SEARCH_RESULT_ID")
    private String workEffortSearchResultId;
    @Column(name="CONSTRAINT_SEQ_ID")
    private String constraintSeqId;

    /**
     * Auto generated value setter.
     * @param workEffortSearchResultId the workEffortSearchResultId to set
     */
    public void setWorkEffortSearchResultId(String workEffortSearchResultId) {
        this.workEffortSearchResultId = workEffortSearchResultId;
    }
    /**
     * Auto generated value setter.
     * @param constraintSeqId the constraintSeqId to set
     */
    public void setConstraintSeqId(String constraintSeqId) {
        this.constraintSeqId = constraintSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortSearchResultId() {
        return this.workEffortSearchResultId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConstraintSeqId() {
        return this.constraintSeqId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(workEffortSearchResultId).append("*");
            sb.append(constraintSeqId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof WorkEffortSearchConstraintPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
