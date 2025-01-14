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

package org.jraf.klibnotion.model.oauth

import org.jraf.klibnotion.model.base.UuidString

/**
 * See [Reference](https://developers.notion.com/docs/authorization#exchanging-the-grant-for-an-access-token).
 */
interface OAuthGetAccessTokenResult {
    /**
     * An access token used to authorize requests to the Notion API.
     */
    val accessToken: String

    /**
     * The ID of the workspace where this authorization took place.
     */
    val workspaceId: UuidString

    /**
     * A human-readable name which can be used to display this authorization in UI.
     */
    val workspaceName: String

    /**
     * A URL to an image which can be used to display this authorization in UI.
     */
    val workspaceIcon: String?

    /**
     * An identifier for this authorization.
     */
    val botId: String
}