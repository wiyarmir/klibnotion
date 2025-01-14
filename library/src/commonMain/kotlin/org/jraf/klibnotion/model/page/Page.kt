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

package org.jraf.klibnotion.model.page

import org.jraf.klibnotion.model.base.EmojiOrFile
import org.jraf.klibnotion.model.base.UuidString
import org.jraf.klibnotion.model.base.reference.Reference
import org.jraf.klibnotion.model.date.Timestamp
import org.jraf.klibnotion.model.file.File
import org.jraf.klibnotion.model.property.value.PropertyValue

/**
 * See [Reference](https://developers.notion.com/reference/page).
 */
interface Page {
    val id: UuidString
    val parent: Reference
    val propertyValues: List<PropertyValue<*>>
    val archived: Boolean
    val created: Timestamp
    val lastEdited: Timestamp
    val url: String
    val icon: EmojiOrFile?
    val cover: File?
}