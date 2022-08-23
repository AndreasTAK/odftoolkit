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
package org.odftoolkit.odfdom.dom.element.svg;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgOffsetAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgStopColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgStopOpacityAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element svg:stop}.
 *
 */
public class SvgStopElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.SVG, "stop");

	/**
	 * Create the instance of <code>SvgStopElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public SvgStopElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element svg:stop}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgOffsetAttribute</code> , See {@odf.attribute svg:offset}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgOffsetAttribute() {
		SvgOffsetAttribute attr = (SvgOffsetAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "offset");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgOffsetAttribute</code> , See {@odf.attribute svg:offset}
	 *
	 * @param svgOffsetValue   The type is <code>String</code>
	 */
	public void setSvgOffsetAttribute(String svgOffsetValue) {
		SvgOffsetAttribute attr = new SvgOffsetAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(svgOffsetValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgStopColorAttribute</code> , See {@odf.attribute svg:stop-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgStopColorAttribute() {
		SvgStopColorAttribute attr = (SvgStopColorAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "stop-color");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgStopColorAttribute</code> , See {@odf.attribute svg:stop-color}
	 *
	 * @param svgStopColorValue   The type is <code>String</code>
	 */
	public void setSvgStopColorAttribute(String svgStopColorValue) {
		SvgStopColorAttribute attr = new SvgStopColorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(svgStopColorValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgStopOpacityAttribute</code> , See {@odf.attribute svg:stop-opacity}
	 *
	 * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Double getSvgStopOpacityAttribute() {
		SvgStopOpacityAttribute attr = (SvgStopOpacityAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "stop-opacity");
		if (attr != null) {
			return Double.valueOf(attr.doubleValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgStopOpacityAttribute</code> , See {@odf.attribute svg:stop-opacity}
	 *
	 * @param svgStopOpacityValue   The type is <code>Double</code>
	 */
	public void setSvgStopOpacityAttribute(Double svgStopOpacityValue) {
		SvgStopOpacityAttribute attr = new SvgStopOpacityAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setDoubleValue(svgStopOpacityValue.doubleValue());
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
