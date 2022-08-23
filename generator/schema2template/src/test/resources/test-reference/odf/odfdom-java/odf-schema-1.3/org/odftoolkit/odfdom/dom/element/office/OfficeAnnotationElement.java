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
package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.dc.DcCreatorElement;
import org.odftoolkit.odfdom.dom.element.dc.DcDateElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaCreatorInitialsElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaDateStringElement;
import org.odftoolkit.odfdom.dom.element.text.TextListElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionPointXAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionPointYAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCornerRadiusAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawLayerAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTextStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTransformAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeDisplayAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgHeightAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgXAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgYAttribute;
import org.odftoolkit.odfdom.dom.element.draw.DrawShapeElementBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element office:annotation}.
 *
 */
public class OfficeAnnotationElement extends DrawShapeElementBase {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.OFFICE, "annotation");

	/**
	 * Create the instance of <code>OfficeAnnotationElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public OfficeAnnotationElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element office:annotation}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCaptionPointXAttribute</code> , See {@odf.attribute draw:caption-point-x}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCaptionPointXAttribute() {
		DrawCaptionPointXAttribute attr = (DrawCaptionPointXAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "caption-point-x");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCaptionPointXAttribute</code> , See {@odf.attribute draw:caption-point-x}
	 *
	 * @param drawCaptionPointXValue   The type is <code>String</code>
	 */
	public void setDrawCaptionPointXAttribute(String drawCaptionPointXValue) {
		DrawCaptionPointXAttribute attr = new DrawCaptionPointXAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawCaptionPointXValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCaptionPointYAttribute</code> , See {@odf.attribute draw:caption-point-y}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCaptionPointYAttribute() {
		DrawCaptionPointYAttribute attr = (DrawCaptionPointYAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "caption-point-y");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCaptionPointYAttribute</code> , See {@odf.attribute draw:caption-point-y}
	 *
	 * @param drawCaptionPointYValue   The type is <code>String</code>
	 */
	public void setDrawCaptionPointYAttribute(String drawCaptionPointYValue) {
		DrawCaptionPointYAttribute attr = new DrawCaptionPointYAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawCaptionPointYValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCornerRadiusAttribute</code> , See {@odf.attribute draw:corner-radius}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCornerRadiusAttribute() {
		DrawCornerRadiusAttribute attr = (DrawCornerRadiusAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "corner-radius");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCornerRadiusAttribute</code> , See {@odf.attribute draw:corner-radius}
	 *
	 * @param drawCornerRadiusValue   The type is <code>String</code>
	 */
	public void setDrawCornerRadiusAttribute(String drawCornerRadiusValue) {
		DrawCornerRadiusAttribute attr = new DrawCornerRadiusAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawCornerRadiusValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawLayerAttribute</code> , See {@odf.attribute draw:layer}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawLayerAttribute() {
		DrawLayerAttribute attr = (DrawLayerAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "layer");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawLayerAttribute</code> , See {@odf.attribute draw:layer}
	 *
	 * @param drawLayerValue   The type is <code>String</code>
	 */
	public void setDrawLayerAttribute(String drawLayerValue) {
		DrawLayerAttribute attr = new DrawLayerAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawLayerValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawTextStyleNameAttribute</code> , See {@odf.attribute draw:text-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawTextStyleNameAttribute() {
		DrawTextStyleNameAttribute attr = (DrawTextStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "text-style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawTextStyleNameAttribute</code> , See {@odf.attribute draw:text-style-name}
	 *
	 * @param drawTextStyleNameValue   The type is <code>String</code>
	 */
	public void setDrawTextStyleNameAttribute(String drawTextStyleNameValue) {
		DrawTextStyleNameAttribute attr = new DrawTextStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawTextStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawTransformAttribute</code> , See {@odf.attribute draw:transform}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawTransformAttribute() {
		DrawTransformAttribute attr = (DrawTransformAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "transform");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawTransformAttribute</code> , See {@odf.attribute draw:transform}
	 *
	 * @param drawTransformValue   The type is <code>String</code>
	 */
	public void setDrawTransformAttribute(String drawTransformValue) {
		DrawTransformAttribute attr = new DrawTransformAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawTransformValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeDisplayAttribute</code> , See {@odf.attribute office:display}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getOfficeDisplayAttribute() {
		OfficeDisplayAttribute attr = (OfficeDisplayAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "display");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeDisplayAttribute</code> , See {@odf.attribute office:display}
	 *
	 * @param officeDisplayValue   The type is <code>Boolean</code>
	 */
	public void setOfficeDisplayAttribute(Boolean officeDisplayValue) {
		OfficeDisplayAttribute attr = new OfficeDisplayAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(officeDisplayValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeNameAttribute</code> , See {@odf.attribute office:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeNameAttribute() {
		OfficeNameAttribute attr = (OfficeNameAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeNameAttribute</code> , See {@odf.attribute office:name}
	 *
	 * @param officeNameValue   The type is <code>String</code>
	 */
	public void setOfficeNameAttribute(String officeNameValue) {
		OfficeNameAttribute attr = new OfficeNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgHeightAttribute</code> , See {@odf.attribute svg:height}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgHeightAttribute() {
		SvgHeightAttribute attr = (SvgHeightAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "height");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgHeightAttribute</code> , See {@odf.attribute svg:height}
	 *
	 * @param svgHeightValue   The type is <code>String</code>
	 */
	public void setSvgHeightAttribute(String svgHeightValue) {
		SvgHeightAttribute attr = new SvgHeightAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(svgHeightValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgWidthAttribute</code> , See {@odf.attribute svg:width}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgWidthAttribute() {
		SvgWidthAttribute attr = (SvgWidthAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "width");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgWidthAttribute</code> , See {@odf.attribute svg:width}
	 *
	 * @param svgWidthValue   The type is <code>String</code>
	 */
	public void setSvgWidthAttribute(String svgWidthValue) {
		SvgWidthAttribute attr = new SvgWidthAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(svgWidthValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgXAttribute</code> , See {@odf.attribute svg:x}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgXAttribute() {
		SvgXAttribute attr = (SvgXAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "x");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgXAttribute</code> , See {@odf.attribute svg:x}
	 *
	 * @param svgXValue   The type is <code>String</code>
	 */
	public void setSvgXAttribute(String svgXValue) {
		SvgXAttribute attr = new SvgXAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(svgXValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgYAttribute</code> , See {@odf.attribute svg:y}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgYAttribute() {
		SvgYAttribute attr = (SvgYAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "y");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgYAttribute</code> , See {@odf.attribute svg:y}
	 *
	 * @param svgYValue   The type is <code>String</code>
	 */
	public void setSvgYAttribute(String svgYValue) {
		SvgYAttribute attr = new SvgYAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(svgYValue);
	}

	/**
	 * Create child element {@odf.element dc:creator}.
	 *
	 * @return the element {@odf.element dc:creator}
	 */
	public DcCreatorElement newDcCreatorElement() {
		DcCreatorElement dcCreator = ((OdfFileDom) this.ownerDocument).newOdfElement(DcCreatorElement.class);
		this.appendChild(dcCreator);
		return dcCreator;
	}

	/**
	 * Create child element {@odf.element dc:date}.
	 *
	 * @return the element {@odf.element dc:date}
	 */
	public DcDateElement newDcDateElement() {
		DcDateElement dcDate = ((OdfFileDom) this.ownerDocument).newOdfElement(DcDateElement.class);
		this.appendChild(dcDate);
		return dcDate;
	}

	/**
	 * Create child element {@odf.element meta:creator-initials}.
	 *
	 * Child element was added in ODF 1.3
	 *
	 * @return the element {@odf.element meta:creator-initials}
	 */
	public MetaCreatorInitialsElement newMetaCreatorInitialsElement() {
		MetaCreatorInitialsElement metaCreatorInitials = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaCreatorInitialsElement.class);
		this.appendChild(metaCreatorInitials);
		return metaCreatorInitials;
	}

	/**
	 * Create child element {@odf.element meta:date-string}.
	 *
	 * @return the element {@odf.element meta:date-string}
	 */
	public MetaDateStringElement newMetaDateStringElement() {
		MetaDateStringElement metaDateString = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaDateStringElement.class);
		this.appendChild(metaDateString);
		return metaDateString;
	}

	/**
	 * Create child element {@odf.element text:list}.
	 *
	 * @return the element {@odf.element text:list}
	 */
	public TextListElement newTextListElement() {
		TextListElement textList = ((OdfFileDom) this.ownerDocument).newOdfElement(TextListElement.class);
		this.appendChild(textList);
		return textList;
	}

	/**
	 * Create child element {@odf.element text:p}.
	 *
	 * @return the element {@odf.element text:p}
	 */
	public TextPElement newTextPElement() {
		TextPElement textP = ((OdfFileDom) this.ownerDocument).newOdfElement(TextPElement.class);
		this.appendChild(textP);
		return textP;
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
