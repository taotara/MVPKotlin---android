/*
 *
 *  * Copyright (C) 2017 Oluwatobi Akinpelu.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.padipady.mvpkotlin.androidmvpkotlin.main

import android.os.Handler

import java.util.Arrays

class FindItemsInteractorImpl : FindItemsInteractor {
    override fun findItems(listener: FindItemsInteractor.OnFinishedListener) {
        Handler().postDelayed({ listener.onFinished(createArrayList()) }, 2000)
    }

    private fun createArrayList(): List<String> {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10"
        )
    }
}
