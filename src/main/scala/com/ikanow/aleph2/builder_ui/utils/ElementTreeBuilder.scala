/*******************************************************************************
* Copyright 2015, The IKANOW Open Source Project.
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*   http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
******************************************************************************/
package com.ikanow.aleph2.builder_ui.utils

import com.ikanow.aleph2.builder_ui.data_model._

import com.greencatsoft.angularjs.core._
import scala.scalajs.js
import com.greencatsoft.angularjs._

/** Utilities to build the element and element template trees
 * @author alex
 */
object ElementTreeBuilder {
  
    def getTemplateTree(breadcrumb: js.Array[String], templates: Seq[ElementTemplateBean]): js.Array[ElementTemplateNode] = {
      val breadcrumb_str = breadcrumb.mkString(".")
      
      //TODO
      return js.Array()
    }  
}
