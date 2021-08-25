/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.style.StyleMapElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element number:number-style}. */
public abstract class NumberNumberStyleElement extends NumberDataStyleElementBase {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.NUMBER, "number-style");

  /**
   * Create the instance of <code>NumberNumberStyleElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public NumberNumberStyleElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element number:number-style}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Create child element {@odf.element number:fraction}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element number:fraction}
   */
  public NumberFractionElement newNumberFractionElement() {
    NumberFractionElement numberFraction =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberFractionElement.class);
    this.appendChild(numberFraction);
    return numberFraction;
  }

  /**
   * Create child element {@odf.element number:number}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element number:number}
   */
  public NumberNumberElement newNumberNumberElement() {
    NumberNumberElement numberNumber =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberNumberElement.class);
    this.appendChild(numberNumber);
    return numberNumber;
  }

  /**
   * Create child element {@odf.element number:scientific-number}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element number:scientific-number}
   */
  public NumberScientificNumberElement newNumberScientificNumberElement() {
    NumberScientificNumberElement numberScientificNumber =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberScientificNumberElement.class);
    this.appendChild(numberScientificNumber);
    return numberScientificNumber;
  }

  /**
   * Create child element {@odf.element number:text}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element number:text}
   */
  public NumberTextElement newNumberTextElement() {
    NumberTextElement numberText =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberTextElement.class);
    this.appendChild(numberText);
    return numberText;
  }

  /**
   * Create child element {@odf.element style:map}.
   *
   * @param styleApplyStyleNameValue the <code>String</code> value of <code>
   *     StyleApplyStyleNameAttribute</code>, see {@odf.attribute style:apply-style-name} at
   *     specification
   * @param styleConditionValue the <code>String</code> value of <code>StyleConditionAttribute
   *     </code>, see {@odf.attribute style:condition} at specification
   * @return the element {@odf.element style:map}
   */
  public StyleMapElement newStyleMapElement(
      String styleApplyStyleNameValue, String styleConditionValue) {
    StyleMapElement styleMap =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleMapElement.class);
    styleMap.setStyleApplyStyleNameAttribute(styleApplyStyleNameValue);
    styleMap.setStyleConditionAttribute(styleConditionValue);
    this.appendChild(styleMap);
    return styleMap;
  }

  /**
   * Create child element {@odf.element style:text-properties}.
   *
   * @param textDisplayValue the <code>String</code> value of <code>TextDisplayAttribute</code>, see
   *     {@odf.attribute text:display} at specification
   * @return the element {@odf.element style:text-properties}
   */
  public StyleTextPropertiesElement newStyleTextPropertiesElement(String textDisplayValue) {
    StyleTextPropertiesElement styleTextProperties =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
    styleTextProperties.setTextDisplayAttribute(textDisplayValue);
    this.appendChild(styleTextProperties);
    return styleTextProperties;
  }

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
  @Override
  public void accept(ElementVisitor visitor) {
    if (visitor instanceof DefaultElementVisitor) {
      DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
      defaultVisitor.visit(this);
    } else {
      visitor.visit(this);
    }
  }
}
