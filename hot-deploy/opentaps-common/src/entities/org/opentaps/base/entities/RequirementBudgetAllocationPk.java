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
public class RequirementBudgetAllocationPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="BUDGET_ID")
    private String budgetId;
    @Column(name="BUDGET_ITEM_SEQ_ID")
    private String budgetItemSeqId;
    @Column(name="REQUIREMENT_ID")
    private String requirementId;

    /**
     * Auto generated value setter.
     * @param budgetId the budgetId to set
     */
    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }
    /**
     * Auto generated value setter.
     * @param budgetItemSeqId the budgetItemSeqId to set
     */
    public void setBudgetItemSeqId(String budgetItemSeqId) {
        this.budgetItemSeqId = budgetItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param requirementId the requirementId to set
     */
    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBudgetId() {
        return this.budgetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBudgetItemSeqId() {
        return this.budgetItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirementId() {
        return this.requirementId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(budgetId).append("*");
            sb.append(budgetItemSeqId).append("*");
            sb.append(requirementId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof RequirementBudgetAllocationPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
