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
package org.odftoolkit.odfdom.dom.element.presentation;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPlayFullAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkShowAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;
import org.odftoolkit.odfdom.pkg.OdfContainerElementBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element presentation:sound}.
 *
 */
public class PresentationSoundElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.PRESENTATION, "sound");

	/**
	 * Create the instance of <code>PresentationSoundElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public PresentationSoundElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element presentation:sound}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPlayFullAttribute</code> , See {@odf.attribute presentation:play-full}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getPresentationPlayFullAttribute() {
		PresentationPlayFullAttribute attr = (PresentationPlayFullAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "play-full");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPlayFullAttribute</code> , See {@odf.attribute presentation:play-full}
	 *
	 * @param presentationPlayFullValue   The type is <code>Boolean</code>
	 */
	public void setPresentationPlayFullAttribute(Boolean presentationPlayFullValue) {
		PresentationPlayFullAttribute attr = new PresentationPlayFullAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(presentationPlayFullValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkActuateAttribute() {
		XlinkActuateAttribute attr = (XlinkActuateAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "actuate");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return XlinkActuateAttribute.DEFAULT_VALUE_ONREQUEST;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @param xlinkActuateValue   The type is <code>String</code>
	 */
	public void setXlinkActuateAttribute(String xlinkActuateValue) {
		XlinkActuateAttribute attr = new XlinkActuateAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkActuateValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkHrefAttribute() {
		XlinkHrefAttribute attr = (XlinkHrefAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "href");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @param xlinkHrefValue   The type is <code>String</code>
	 */
	public void setXlinkHrefAttribute(String xlinkHrefValue) {
		XlinkHrefAttribute attr = new XlinkHrefAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkHrefValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkShowAttribute() {
		XlinkShowAttribute attr = (XlinkShowAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "show");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @param xlinkShowValue   The type is <code>String</code>
	 */
	public void setXlinkShowAttribute(String xlinkShowValue) {
		XlinkShowAttribute attr = new XlinkShowAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkShowValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkTypeAttribute() {
		XlinkTypeAttribute attr = (XlinkTypeAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return XlinkTypeAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @param xlinkTypeValue   The type is <code>String</code>
	 */
	public void setXlinkTypeAttribute(String xlinkTypeValue) {
		XlinkTypeAttribute attr = new XlinkTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkTypeValue);
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
