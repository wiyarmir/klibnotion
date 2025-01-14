/*
 * This source is part of the
 *      _____  ___   ____
 *  __ / / _ \/ _ | / __/___  _______ _
 * / // / , _/ __ |/ _/_/ _ \/ __/ _ `/
 * \___/_/|_/_/ |_/_/ (_)___/_/  \_, /
 *                              /___/
 * repository.
 *
 * Copyright (C) 2021-present Benoit 'BoD' Lubek (BoD@JRAF.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jraf.klibnotion.internal.api.model.property.value

import kotlinx.serialization.Serializable
import org.jraf.klibnotion.internal.api.model.date.ApiDate
import org.jraf.klibnotion.internal.api.model.property.ApiSelectOption
import org.jraf.klibnotion.internal.api.model.richtext.ApiRichText
import org.jraf.klibnotion.internal.api.model.user.ApiUser

/**
 * See [Reference](https://developers.notion.com/reference/page#all-property-values).
 */
@Serializable
internal data class ApiPropertyValue(
    /**
     * Can be omitted in case of rollup array properties.
     */
    val id: String = "",

    val type: String,
    val rich_text: List<ApiRichText>? = null,
    val number: String? = null,
    val select: ApiSelectOption? = null,
    val multi_select: List<ApiSelectOption>? = null,
    val date: ApiDate? = null,
    val formula: ApiPropertyValueFormula? = null,
    val relation: List<ApiPropertyValueRelation>? = null,
    val rollup: ApiPropertyValueRollup? = null,
    val title: List<ApiRichText>? = null,
    val people: List<ApiUser>? = null,
    val files: List<ApiPropertyValueFile>? = null,
    val checkbox: Boolean? = null,
    val url: String? = null,
    val email: String? = null,
    val phone_number: String? = null,
    val created_time: String? = null,
    val created_by: ApiUser? = null,
    val last_edited_time: String? = null,
    val last_edited_by: ApiUser? = null,
)