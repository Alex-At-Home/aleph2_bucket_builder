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
package com.ikanow.aleph2.builder_ui.data_model

trait UndoRedoElement {}

case class AddElement(new_element: ElementNodeJs) extends UndoRedoElement

case class DeleteElement(old_element: ElementNodeJs) extends UndoRedoElement

/** When built externally, just repeat the same element (ie the one about to be -but not yet- mutated) as both args
 * @author alex
 */
case class ModifyElement(about_to_modify_copy: ElementNodeJs, about_to_modify_ref: ElementNodeJs) extends UndoRedoElement

case class EnableOrDisableElement(about_to_modify: ElementNodeJs, old_state: Boolean, new_state: Boolean) extends UndoRedoElement

case class MoveOrResizeElements(rearranged_parent: ElementNodeJs, old_topology: List[Tuple4[Int, Int, Int, Int]], new_topology: List[Tuple4[Int, Int, Int, Int]]) extends UndoRedoElement
