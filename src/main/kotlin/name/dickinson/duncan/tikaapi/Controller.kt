/*
 * Copyright 2017 Duncan Dickinson
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package name.dickinson.duncan.tikaapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

const val PATH_HOME = "/"
const val PATH_VERSION = "/version"

@RestController
class Controller {

    @GetMapping(PATH_HOME)
    fun home() = hashMapOf("name" to "Tika API")

    @GetMapping(PATH_VERSION)
    fun version() = TikaDetails(version = "1.16")

}
