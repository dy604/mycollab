/**
 * mycollab-services - Parent pom providing dependency and plugin management for applications
		built with Maven
 * Copyright © ${project.inceptionYear} MyCollab (support@mycollab.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.aspect

import java.util.ArrayList

/**
 * @author MyCollab Ltd.
 * @since 5.0.1
 */
class ClassInfo(var module: String?, var type: String?) {
    private val excludeHistoryFields: MutableList<String>

    init {
        excludeHistoryFields = ArrayList()
        excludeHistoryFields.add("id")
        excludeHistoryFields.add("lastupdatedtime")
        excludeHistoryFields.add("createdtime")
    }

    fun addExcludeHistoryField(field: String) {
        excludeHistoryFields.add(field)
    }

    fun getExcludeHistoryFields(): List<String> {
        return excludeHistoryFields
    }
}