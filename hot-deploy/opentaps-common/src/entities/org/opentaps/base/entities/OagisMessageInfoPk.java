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
public class OagisMessageInfoPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="LOGICAL_ID")
    private String logicalId;
    @Column(name="COMPONENT")
    private String component;
    @Column(name="TASK")
    private String task;
    @Column(name="REFERENCE_ID")
    private String referenceId;

    /**
     * Auto generated value setter.
     * @param logicalId the logicalId to set
     */
    public void setLogicalId(String logicalId) {
        this.logicalId = logicalId;
    }
    /**
     * Auto generated value setter.
     * @param component the component to set
     */
    public void setComponent(String component) {
        this.component = component;
    }
    /**
     * Auto generated value setter.
     * @param task the task to set
     */
    public void setTask(String task) {
        this.task = task;
    }
    /**
     * Auto generated value setter.
     * @param referenceId the referenceId to set
     */
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLogicalId() {
        return this.logicalId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComponent() {
        return this.component;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTask() {
        return this.task;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReferenceId() {
        return this.referenceId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(logicalId).append("*");
            sb.append(component).append("*");
            sb.append(task).append("*");
            sb.append(referenceId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof OagisMessageInfoPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
