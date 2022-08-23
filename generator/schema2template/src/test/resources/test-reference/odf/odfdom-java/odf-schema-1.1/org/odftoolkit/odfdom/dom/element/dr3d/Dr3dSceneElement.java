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
package org.odftoolkit.odfdom.dom.element.dr3d;

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.svg.SvgDescElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgTitleElement;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dAmbientColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dDistanceAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dFocalLengthAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dLightingModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dProjectionAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dShadeModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dShadowSlantAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dTransformAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dVpnAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dVrpAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dVupAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawClassNamesAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawLayerAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawZIndexAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationClassNamesAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgHeightAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgXAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgYAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndCellAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndXAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndYAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTableBackgroundAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextAnchorPageNumberAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextAnchorTypeAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element dr3d:scene}.
 *
 */
public class Dr3dSceneElement extends OdfStyleableShapeElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DR3D, "scene");

	/**
	 * Create the instance of <code>Dr3dSceneElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public Dr3dSceneElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element dr3d:scene}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dAmbientColorAttribute</code> , See {@odf.attribute dr3d:ambient-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dAmbientColorAttribute() {
		Dr3dAmbientColorAttribute attr = (Dr3dAmbientColorAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "ambient-color");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dAmbientColorAttribute</code> , See {@odf.attribute dr3d:ambient-color}
	 *
	 * @param dr3dAmbientColorValue   The type is <code>String</code>
	 */
	public void setDr3dAmbientColorAttribute(String dr3dAmbientColorValue) {
		Dr3dAmbientColorAttribute attr = new Dr3dAmbientColorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dAmbientColorValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dDistanceAttribute</code> , See {@odf.attribute dr3d:distance}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dDistanceAttribute() {
		Dr3dDistanceAttribute attr = (Dr3dDistanceAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "distance");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dDistanceAttribute</code> , See {@odf.attribute dr3d:distance}
	 *
	 * @param dr3dDistanceValue   The type is <code>String</code>
	 */
	public void setDr3dDistanceAttribute(String dr3dDistanceValue) {
		Dr3dDistanceAttribute attr = new Dr3dDistanceAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dDistanceValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dFocalLengthAttribute</code> , See {@odf.attribute dr3d:focal-length}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dFocalLengthAttribute() {
		Dr3dFocalLengthAttribute attr = (Dr3dFocalLengthAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "focal-length");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dFocalLengthAttribute</code> , See {@odf.attribute dr3d:focal-length}
	 *
	 * @param dr3dFocalLengthValue   The type is <code>String</code>
	 */
	public void setDr3dFocalLengthAttribute(String dr3dFocalLengthValue) {
		Dr3dFocalLengthAttribute attr = new Dr3dFocalLengthAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dFocalLengthValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dLightingModeAttribute</code> , See {@odf.attribute dr3d:lighting-mode}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDr3dLightingModeAttribute() {
		Dr3dLightingModeAttribute attr = (Dr3dLightingModeAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "lighting-mode");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dLightingModeAttribute</code> , See {@odf.attribute dr3d:lighting-mode}
	 *
	 * @param dr3dLightingModeValue   The type is <code>Boolean</code>
	 */
	public void setDr3dLightingModeAttribute(Boolean dr3dLightingModeValue) {
		Dr3dLightingModeAttribute attr = new Dr3dLightingModeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(dr3dLightingModeValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dProjectionAttribute</code> , See {@odf.attribute dr3d:projection}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dProjectionAttribute() {
		Dr3dProjectionAttribute attr = (Dr3dProjectionAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "projection");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dProjectionAttribute</code> , See {@odf.attribute dr3d:projection}
	 *
	 * @param dr3dProjectionValue   The type is <code>String</code>
	 */
	public void setDr3dProjectionAttribute(String dr3dProjectionValue) {
		Dr3dProjectionAttribute attr = new Dr3dProjectionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dProjectionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dShadeModeAttribute</code> , See {@odf.attribute dr3d:shade-mode}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dShadeModeAttribute() {
		Dr3dShadeModeAttribute attr = (Dr3dShadeModeAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "shade-mode");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dShadeModeAttribute</code> , See {@odf.attribute dr3d:shade-mode}
	 *
	 * @param dr3dShadeModeValue   The type is <code>String</code>
	 */
	public void setDr3dShadeModeAttribute(String dr3dShadeModeValue) {
		Dr3dShadeModeAttribute attr = new Dr3dShadeModeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dShadeModeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dShadowSlantAttribute</code> , See {@odf.attribute dr3d:shadow-slant}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDr3dShadowSlantAttribute() {
		Dr3dShadowSlantAttribute attr = (Dr3dShadowSlantAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "shadow-slant");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dShadowSlantAttribute</code> , See {@odf.attribute dr3d:shadow-slant}
	 *
	 * @param dr3dShadowSlantValue   The type is <code>Integer</code>
	 */
	public void setDr3dShadowSlantAttribute(Integer dr3dShadowSlantValue) {
		Dr3dShadowSlantAttribute attr = new Dr3dShadowSlantAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(dr3dShadowSlantValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dTransformAttribute</code> , See {@odf.attribute dr3d:transform}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dTransformAttribute() {
		Dr3dTransformAttribute attr = (Dr3dTransformAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "transform");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dTransformAttribute</code> , See {@odf.attribute dr3d:transform}
	 *
	 * @param dr3dTransformValue   The type is <code>String</code>
	 */
	public void setDr3dTransformAttribute(String dr3dTransformValue) {
		Dr3dTransformAttribute attr = new Dr3dTransformAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dTransformValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dVpnAttribute</code> , See {@odf.attribute dr3d:vpn}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dVpnAttribute() {
		Dr3dVpnAttribute attr = (Dr3dVpnAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "vpn");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dVpnAttribute</code> , See {@odf.attribute dr3d:vpn}
	 *
	 * @param dr3dVpnValue   The type is <code>String</code>
	 */
	public void setDr3dVpnAttribute(String dr3dVpnValue) {
		Dr3dVpnAttribute attr = new Dr3dVpnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dVpnValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dVrpAttribute</code> , See {@odf.attribute dr3d:vrp}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dVrpAttribute() {
		Dr3dVrpAttribute attr = (Dr3dVrpAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "vrp");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dVrpAttribute</code> , See {@odf.attribute dr3d:vrp}
	 *
	 * @param dr3dVrpValue   The type is <code>String</code>
	 */
	public void setDr3dVrpAttribute(String dr3dVrpValue) {
		Dr3dVrpAttribute attr = new Dr3dVrpAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dVrpValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dVupAttribute</code> , See {@odf.attribute dr3d:vup}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dVupAttribute() {
		Dr3dVupAttribute attr = (Dr3dVupAttribute) getOdfAttribute(OdfDocumentNamespace.DR3D, "vup");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dVupAttribute</code> , See {@odf.attribute dr3d:vup}
	 *
	 * @param dr3dVupValue   The type is <code>String</code>
	 */
	public void setDr3dVupAttribute(String dr3dVupValue) {
		Dr3dVupAttribute attr = new Dr3dVupAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dr3dVupValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See {@odf.attribute draw:caption-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCaptionIdAttribute() {
		DrawCaptionIdAttribute attr = (DrawCaptionIdAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "caption-id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See {@odf.attribute draw:caption-id}
	 *
	 * @param drawCaptionIdValue   The type is <code>String</code>
	 */
	public void setDrawCaptionIdAttribute(String drawCaptionIdValue) {
		DrawCaptionIdAttribute attr = new DrawCaptionIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawCaptionIdValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawClassNamesAttribute</code> , See {@odf.attribute draw:class-names}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawClassNamesAttribute() {
		DrawClassNamesAttribute attr = (DrawClassNamesAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "class-names");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawClassNamesAttribute</code> , See {@odf.attribute draw:class-names}
	 *
	 * @param drawClassNamesValue   The type is <code>String</code>
	 */
	public void setDrawClassNamesAttribute(String drawClassNamesValue) {
		DrawClassNamesAttribute attr = new DrawClassNamesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawClassNamesValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawIdAttribute</code> , See {@odf.attribute draw:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawIdAttribute() {
		DrawIdAttribute attr = (DrawIdAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawIdAttribute</code> , See {@odf.attribute draw:id}
	 *
	 * @param drawIdValue   The type is <code>String</code>
	 */
	public void setDrawIdAttribute(String drawIdValue) {
		DrawIdAttribute attr = new DrawIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawIdValue);
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
	 * Receives the value of the ODFDOM attribute representation <code>DrawStyleNameAttribute</code> , See {@odf.attribute draw:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStyleNameAttribute() {
		DrawStyleNameAttribute attr = (DrawStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStyleNameAttribute</code> , See {@odf.attribute draw:style-name}
	 *
	 * @param drawStyleNameValue   The type is <code>String</code>
	 */
	public void setDrawStyleNameAttribute(String drawStyleNameValue) {
		DrawStyleNameAttribute attr = new DrawStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawZIndexAttribute</code> , See {@odf.attribute draw:z-index}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDrawZIndexAttribute() {
		DrawZIndexAttribute attr = (DrawZIndexAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "z-index");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawZIndexAttribute</code> , See {@odf.attribute draw:z-index}
	 *
	 * @param drawZIndexValue   The type is <code>Integer</code>
	 */
	public void setDrawZIndexAttribute(Integer drawZIndexValue) {
		DrawZIndexAttribute attr = new DrawZIndexAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(drawZIndexValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationClassNamesAttribute</code> , See {@odf.attribute presentation:class-names}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationClassNamesAttribute() {
		PresentationClassNamesAttribute attr = (PresentationClassNamesAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "class-names");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationClassNamesAttribute</code> , See {@odf.attribute presentation:class-names}
	 *
	 * @param presentationClassNamesValue   The type is <code>String</code>
	 */
	public void setPresentationClassNamesAttribute(String presentationClassNamesValue) {
		PresentationClassNamesAttribute attr = new PresentationClassNamesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationClassNamesValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationStyleNameAttribute</code> , See {@odf.attribute presentation:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationStyleNameAttribute() {
		PresentationStyleNameAttribute attr = (PresentationStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationStyleNameAttribute</code> , See {@odf.attribute presentation:style-name}
	 *
	 * @param presentationStyleNameValue   The type is <code>String</code>
	 */
	public void setPresentationStyleNameAttribute(String presentationStyleNameValue) {
		PresentationStyleNameAttribute attr = new PresentationStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationStyleNameValue);
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
	 * Receives the value of the ODFDOM attribute representation <code>TableEndCellAddressAttribute</code> , See {@odf.attribute table:end-cell-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableEndCellAddressAttribute() {
		TableEndCellAddressAttribute attr = (TableEndCellAddressAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "end-cell-address");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndCellAddressAttribute</code> , See {@odf.attribute table:end-cell-address}
	 *
	 * @param tableEndCellAddressValue   The type is <code>String</code>
	 */
	public void setTableEndCellAddressAttribute(String tableEndCellAddressValue) {
		TableEndCellAddressAttribute attr = new TableEndCellAddressAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableEndCellAddressValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableEndXAttribute</code> , See {@odf.attribute table:end-x}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableEndXAttribute() {
		TableEndXAttribute attr = (TableEndXAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "end-x");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndXAttribute</code> , See {@odf.attribute table:end-x}
	 *
	 * @param tableEndXValue   The type is <code>String</code>
	 */
	public void setTableEndXAttribute(String tableEndXValue) {
		TableEndXAttribute attr = new TableEndXAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableEndXValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableEndYAttribute</code> , See {@odf.attribute table:end-y}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableEndYAttribute() {
		TableEndYAttribute attr = (TableEndYAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "end-y");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndYAttribute</code> , See {@odf.attribute table:end-y}
	 *
	 * @param tableEndYValue   The type is <code>String</code>
	 */
	public void setTableEndYAttribute(String tableEndYValue) {
		TableEndYAttribute attr = new TableEndYAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableEndYValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTableBackgroundAttribute</code> , See {@odf.attribute table:table-background}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableTableBackgroundAttribute() {
		TableTableBackgroundAttribute attr = (TableTableBackgroundAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "table-background");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTableBackgroundAttribute</code> , See {@odf.attribute table:table-background}
	 *
	 * @param tableTableBackgroundValue   The type is <code>Boolean</code>
	 */
	public void setTableTableBackgroundAttribute(Boolean tableTableBackgroundValue) {
		TableTableBackgroundAttribute attr = new TableTableBackgroundAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableTableBackgroundValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextAnchorPageNumberAttribute</code> , See {@odf.attribute text:anchor-page-number}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextAnchorPageNumberAttribute() {
		TextAnchorPageNumberAttribute attr = (TextAnchorPageNumberAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "anchor-page-number");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextAnchorPageNumberAttribute</code> , See {@odf.attribute text:anchor-page-number}
	 *
	 * @param textAnchorPageNumberValue   The type is <code>Integer</code>
	 */
	public void setTextAnchorPageNumberAttribute(Integer textAnchorPageNumberValue) {
		TextAnchorPageNumberAttribute attr = new TextAnchorPageNumberAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textAnchorPageNumberValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextAnchorTypeAttribute</code> , See {@odf.attribute text:anchor-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextAnchorTypeAttribute() {
		TextAnchorTypeAttribute attr = (TextAnchorTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "anchor-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextAnchorTypeAttribute</code> , See {@odf.attribute text:anchor-type}
	 *
	 * @param textAnchorTypeValue   The type is <code>String</code>
	 */
	public void setTextAnchorTypeAttribute(String textAnchorTypeValue) {
		TextAnchorTypeAttribute attr = new TextAnchorTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textAnchorTypeValue);
	}

	/**
	 * Create child element {@odf.element dr3d:cube}.
	 *
	 * @return the element {@odf.element dr3d:cube}
	 */
	public Dr3dCubeElement newDr3dCubeElement() {
		Dr3dCubeElement dr3dCube = ((OdfFileDom) this.ownerDocument).newOdfElement(Dr3dCubeElement.class);
		this.appendChild(dr3dCube);
		return dr3dCube;
	}

	/**
	 * Create child element {@odf.element dr3d:extrude}.
	 *
	 * @param svgDValue  the <code>String</code> value of <code>SvgDAttribute</code>, see {@odf.attribute  svg:d} at specification
	 * @param svgViewBoxValue  the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return the element {@odf.element dr3d:extrude}
	 */
	 public Dr3dExtrudeElement newDr3dExtrudeElement(String svgDValue, int svgViewBoxValue) {
		Dr3dExtrudeElement dr3dExtrude = ((OdfFileDom) this.ownerDocument).newOdfElement(Dr3dExtrudeElement.class);
		dr3dExtrude.setSvgDAttribute(svgDValue);
		dr3dExtrude.setSvgViewBoxAttribute(svgViewBoxValue);
		this.appendChild(dr3dExtrude);
		return dr3dExtrude;
	}

	/**
	 * Create child element {@odf.element dr3d:light}.
	 *
	 * @param dr3dDirectionValue  the <code>String</code> value of <code>Dr3dDirectionAttribute</code>, see {@odf.attribute  dr3d:direction} at specification
	 * @return the element {@odf.element dr3d:light}
	 */
	 public Dr3dLightElement newDr3dLightElement(String dr3dDirectionValue) {
		Dr3dLightElement dr3dLight = ((OdfFileDom) this.ownerDocument).newOdfElement(Dr3dLightElement.class);
		dr3dLight.setDr3dDirectionAttribute(dr3dDirectionValue);
		this.appendChild(dr3dLight);
		return dr3dLight;
	}

	/**
	 * Create child element {@odf.element dr3d:rotate}.
	 *
	 * @param svgDValue  the <code>String</code> value of <code>SvgDAttribute</code>, see {@odf.attribute  svg:d} at specification
	 * @param svgViewBoxValue  the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return the element {@odf.element dr3d:rotate}
	 */
	 public Dr3dRotateElement newDr3dRotateElement(String svgDValue, int svgViewBoxValue) {
		Dr3dRotateElement dr3dRotate = ((OdfFileDom) this.ownerDocument).newOdfElement(Dr3dRotateElement.class);
		dr3dRotate.setSvgDAttribute(svgDValue);
		dr3dRotate.setSvgViewBoxAttribute(svgViewBoxValue);
		this.appendChild(dr3dRotate);
		return dr3dRotate;
	}

	/**
	 * Create child element {@odf.element dr3d:scene}.
	 *
	 * @return the element {@odf.element dr3d:scene}
	 */
	public Dr3dSceneElement newDr3dSceneElement() {
		Dr3dSceneElement dr3dScene = ((OdfFileDom) this.ownerDocument).newOdfElement(Dr3dSceneElement.class);
		this.appendChild(dr3dScene);
		return dr3dScene;
	}

	/**
	 * Create child element {@odf.element dr3d:sphere}.
	 *
	 * @return the element {@odf.element dr3d:sphere}
	 */
	public Dr3dSphereElement newDr3dSphereElement() {
		Dr3dSphereElement dr3dSphere = ((OdfFileDom) this.ownerDocument).newOdfElement(Dr3dSphereElement.class);
		this.appendChild(dr3dSphere);
		return dr3dSphere;
	}

	/**
	 * Create child element {@odf.element svg:desc}.
	 *
	 * Child element was added in ODF 1.1
	 *
	 * @return the element {@odf.element svg:desc}
	 */
	public SvgDescElement newSvgDescElement() {
		SvgDescElement svgDesc = ((OdfFileDom) this.ownerDocument).newOdfElement(SvgDescElement.class);
		this.appendChild(svgDesc);
		return svgDesc;
	}

	/**
	 * Create child element {@odf.element svg:title}.
	 *
	 * Child element was added in ODF 1.1
	 *
	 * @return the element {@odf.element svg:title}
	 */
	public SvgTitleElement newSvgTitleElement() {
		SvgTitleElement svgTitle = ((OdfFileDom) this.ownerDocument).newOdfElement(SvgTitleElement.class);
		this.appendChild(svgTitle);
		return svgTitle;
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
