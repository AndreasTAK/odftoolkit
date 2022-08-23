/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.style.StyleMapElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;
import org.odftoolkit.odfdom.dom.attribute.number.NumberAutomaticOrderAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element number:currency-style}.
 *
 */
public class NumberCurrencyStyleElement extends NumberDataStyleElementBase {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.NUMBER, "currency-style");

	/**
	 * Create the instance of <code>NumberCurrencyStyleElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public NumberCurrencyStyleElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element number:currency-style}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberAutomaticOrderAttribute</code> , See {@odf.attribute number:automatic-order}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getNumberAutomaticOrderAttribute() {
		NumberAutomaticOrderAttribute attr = (NumberAutomaticOrderAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "automatic-order");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(NumberAutomaticOrderAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberAutomaticOrderAttribute</code> , See {@odf.attribute number:automatic-order}
	 *
	 * @param numberAutomaticOrderValue   The type is <code>Boolean</code>
	 */
	public void setNumberAutomaticOrderAttribute(Boolean numberAutomaticOrderValue) {
		NumberAutomaticOrderAttribute attr = new NumberAutomaticOrderAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(numberAutomaticOrderValue.booleanValue());
	}

	/**
	 * Create child element {@odf.element number:currency-symbol}.
	 *
	 * @return the element {@odf.element number:currency-symbol}
	 */
	public NumberCurrencySymbolElement newNumberCurrencySymbolElement() {
		NumberCurrencySymbolElement numberCurrencySymbol = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberCurrencySymbolElement.class);
		this.appendChild(numberCurrencySymbol);
		return numberCurrencySymbol;
	}

	/**
	 * Create child element {@odf.element number:number}.
	 *
	 * @return the element {@odf.element number:number}
	 */
	public NumberNumberElement newNumberNumberElement() {
		NumberNumberElement numberNumber = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberNumberElement.class);
		this.appendChild(numberNumber);
		return numberNumber;
	}

	/**
	 * Create child element {@odf.element number:text}.
	 *
	 * @return the element {@odf.element number:text}
	 */
	public NumberTextElement newNumberTextElement() {
		NumberTextElement numberText = ((OdfFileDom) this.ownerDocument).newOdfElement(NumberTextElement.class);
		this.appendChild(numberText);
		return numberText;
	}

	/**
	 * Create child element {@odf.element style:map}.
	 *
	 * @param styleApplyStyleNameValue  the <code>String</code> value of <code>StyleApplyStyleNameAttribute</code>, see {@odf.attribute  style:apply-style-name} at specification
	 * @param styleConditionValue  the <code>String</code> value of <code>StyleConditionAttribute</code>, see {@odf.attribute  style:condition} at specification
	 * @return the element {@odf.element style:map}
	 */
	 public StyleMapElement newStyleMapElement(String styleApplyStyleNameValue, String styleConditionValue) {
		StyleMapElement styleMap = ((OdfFileDom) this.ownerDocument).newOdfElement(StyleMapElement.class);
		styleMap.setStyleApplyStyleNameAttribute(styleApplyStyleNameValue);
		styleMap.setStyleConditionAttribute(styleConditionValue);
		this.appendChild(styleMap);
		return styleMap;
	}

	/**
	 * Create child element {@odf.element style:text-properties}.
	 *
	 * @param textDisplayValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @return the element {@odf.element style:text-properties}
	 */
	 public StyleTextPropertiesElement newStyleTextPropertiesElement(String textDisplayValue) {
		StyleTextPropertiesElement styleTextProperties = ((OdfFileDom) this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
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
