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
import org.odftoolkit.odfdom.dom.attribute.number.NumberDecimalPlacesAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberExponentIntervalAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberForcedExponentSignAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberGroupingAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberMinDecimalPlacesAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberMinExponentDigitsAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberMinIntegerDigitsAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element number:scientific-number}.
 *
 */
public class NumberScientificNumberElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.NUMBER, "scientific-number");

	/**
	 * Create the instance of <code>NumberScientificNumberElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public NumberScientificNumberElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element number:scientific-number}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberDecimalPlacesAttribute</code> , See {@odf.attribute number:decimal-places}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberDecimalPlacesAttribute() {
		NumberDecimalPlacesAttribute attr = (NumberDecimalPlacesAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "decimal-places");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberDecimalPlacesAttribute</code> , See {@odf.attribute number:decimal-places}
	 *
	 * @param numberDecimalPlacesValue   The type is <code>Integer</code>
	 */
	public void setNumberDecimalPlacesAttribute(Integer numberDecimalPlacesValue) {
		NumberDecimalPlacesAttribute attr = new NumberDecimalPlacesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(numberDecimalPlacesValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberExponentIntervalAttribute</code> , See {@odf.attribute number:exponent-interval}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberExponentIntervalAttribute() {
		NumberExponentIntervalAttribute attr = (NumberExponentIntervalAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "exponent-interval");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberExponentIntervalAttribute</code> , See {@odf.attribute number:exponent-interval}
	 *
	 * @param numberExponentIntervalValue   The type is <code>Integer</code>
	 */
	public void setNumberExponentIntervalAttribute(Integer numberExponentIntervalValue) {
		NumberExponentIntervalAttribute attr = new NumberExponentIntervalAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(numberExponentIntervalValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberForcedExponentSignAttribute</code> , See {@odf.attribute number:forced-exponent-sign}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getNumberForcedExponentSignAttribute() {
		NumberForcedExponentSignAttribute attr = (NumberForcedExponentSignAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "forced-exponent-sign");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberForcedExponentSignAttribute</code> , See {@odf.attribute number:forced-exponent-sign}
	 *
	 * @param numberForcedExponentSignValue   The type is <code>Boolean</code>
	 */
	public void setNumberForcedExponentSignAttribute(Boolean numberForcedExponentSignValue) {
		NumberForcedExponentSignAttribute attr = new NumberForcedExponentSignAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(numberForcedExponentSignValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberGroupingAttribute</code> , See {@odf.attribute number:grouping}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getNumberGroupingAttribute() {
		NumberGroupingAttribute attr = (NumberGroupingAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "grouping");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(NumberGroupingAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberGroupingAttribute</code> , See {@odf.attribute number:grouping}
	 *
	 * @param numberGroupingValue   The type is <code>Boolean</code>
	 */
	public void setNumberGroupingAttribute(Boolean numberGroupingValue) {
		NumberGroupingAttribute attr = new NumberGroupingAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(numberGroupingValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberMinDecimalPlacesAttribute</code> , See {@odf.attribute number:min-decimal-places}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberMinDecimalPlacesAttribute() {
		NumberMinDecimalPlacesAttribute attr = (NumberMinDecimalPlacesAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "min-decimal-places");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberMinDecimalPlacesAttribute</code> , See {@odf.attribute number:min-decimal-places}
	 *
	 * @param numberMinDecimalPlacesValue   The type is <code>Integer</code>
	 */
	public void setNumberMinDecimalPlacesAttribute(Integer numberMinDecimalPlacesValue) {
		NumberMinDecimalPlacesAttribute attr = new NumberMinDecimalPlacesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(numberMinDecimalPlacesValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberMinExponentDigitsAttribute</code> , See {@odf.attribute number:min-exponent-digits}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberMinExponentDigitsAttribute() {
		NumberMinExponentDigitsAttribute attr = (NumberMinExponentDigitsAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "min-exponent-digits");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberMinExponentDigitsAttribute</code> , See {@odf.attribute number:min-exponent-digits}
	 *
	 * @param numberMinExponentDigitsValue   The type is <code>Integer</code>
	 */
	public void setNumberMinExponentDigitsAttribute(Integer numberMinExponentDigitsValue) {
		NumberMinExponentDigitsAttribute attr = new NumberMinExponentDigitsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(numberMinExponentDigitsValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberMinIntegerDigitsAttribute</code> , See {@odf.attribute number:min-integer-digits}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberMinIntegerDigitsAttribute() {
		NumberMinIntegerDigitsAttribute attr = (NumberMinIntegerDigitsAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "min-integer-digits");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberMinIntegerDigitsAttribute</code> , See {@odf.attribute number:min-integer-digits}
	 *
	 * @param numberMinIntegerDigitsValue   The type is <code>Integer</code>
	 */
	public void setNumberMinIntegerDigitsAttribute(Integer numberMinIntegerDigitsValue) {
		NumberMinIntegerDigitsAttribute attr = new NumberMinIntegerDigitsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(numberMinIntegerDigitsValue.intValue());
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
