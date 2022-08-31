/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
                Affirmation(R.string.affirmation1, "https://www.realmadrid.com/landings/assets/images/content/decimocuarta-copa-europa/team.jpg"),
                Affirmation(R.string.affirmation2, "https://www.realmadrid.com/landings/assets/images/content/decimotercera-copa-europa/banner.png"),
                Affirmation(R.string.affirmation3, "https://www.realmadrid.com/landings/assets/images/content/duodecima-copa-europa/result.jpg"),
                Affirmation(R.string.affirmation4, "https://www.realmadrid.com/landings/assets/images/content/undecima-copa-europa/banner.jpg"),
                Affirmation(R.string.affirmation5, "https://www.realmadrid.com/landings/assets/images/content/decima-copa-europa/middle_banner.jpg"),
                Affirmation(R.string.affirmation6, "https://www.realmadrid.com/landings/assets/images/content/novena-copa-europa/middle_banner.jpg"),
                Affirmation(R.string.affirmation7, "https://www.realmadrid.com/landings/assets/images/content/octava-copa-europa/banner.jpg"),
                Affirmation(R.string.affirmation8, "https://www.realmadrid.com/landings/assets/images/content/septima-copa-europa/banner.jpg"),
                Affirmation(R.string.affirmation9, "https://www.realmadrid.com/landings/assets/images/content/sexta-copa-europa/banner.jpg"),
                Affirmation(R.string.affirmation10, "https://www.realmadrid.com/landings/assets/images/content/quinta-copa-europa/banner.jpg"))
    }
}

