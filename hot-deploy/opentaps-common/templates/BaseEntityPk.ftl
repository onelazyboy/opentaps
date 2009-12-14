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

<#-- imports for all the fields' types -->
<#list pkFieldTypes as pkFieldType>
import ${pkFieldType};
</#list>

@Embeddable
public class ${pkName} implements Serializable {

    @Transient
    private int _cached_hc = 0;

    <#list primaryKeys as primaryKey>
    <#if (pkTypes.size() > 0) && pkTypes.get(primaryKey)?has_content>
    @Column(name="${columnNames.get(primaryKey)}")
    private ${pkTypes.get(primaryKey)} ${primaryKey};
    </#if>
    </#list>

<#-- set methods -->
  <#list primaryKeys as primaryKey>
  <#if (pkTypes.size() > 0) && pkTypes.get(primaryKey)?has_content>
    /**
     * Auto generated value setter.
     * @param ${primaryKey} the ${primaryKey} to set
     */
    public void ${setPkMethodNames.get(primaryKey)}(${pkTypes.get(primaryKey)} ${primaryKey}) {
        this.${primaryKey} = ${primaryKey};
    }
  </#if>
  </#list>

  <#-- get methods -->
  <#list primaryKeys as primaryKey>
  <#if (pkTypes.size() > 0) && pkTypes.get(primaryKey)?has_content>
    /**
     * Auto generated value accessor.
     * @return <code>${pkTypes.get(primaryKey)}</code>
     */
    public ${pkTypes.get(primaryKey)} ${getPkMethodNames.get(primaryKey)}() {
        return this.${primaryKey};
    }
  </#if>
  </#list>

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
          <#list primaryKeys as primaryKey>
            sb.append(${primaryKey}).append("*");
          </#list>
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof ${pkName}) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
