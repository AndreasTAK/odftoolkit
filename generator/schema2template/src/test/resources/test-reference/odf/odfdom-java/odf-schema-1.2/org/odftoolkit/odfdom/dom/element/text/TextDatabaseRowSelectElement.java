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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.form.FormConnectionResourceElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextConditionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDatabaseNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextRowNumberAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextTableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextTableTypeAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:database-row-select}.
 *
 */
public class TextDatabaseRowSelectElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "database-row-select");

	/**
	 * Create the instance of <code>TextDatabaseRowSelectElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextDatabaseRowSelectElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:database-row-select}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextConditionAttribute</code> , See {@odf.attribute text:condition}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextConditionAttribute() {
		TextConditionAttribute attr = (TextConditionAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "condition");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextConditionAttribute</code> , See {@odf.attribute text:condition}
	 *
	 * @param textConditionValue   The type is <code>String</code>
	 */
	public void setTextConditionAttribute(String textConditionValue) {
		TextConditionAttribute attr = new TextConditionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textConditionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextDatabaseNameAttribute</code> , See {@odf.attribute text:database-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextDatabaseNameAttribute() {
		TextDatabaseNameAttribute attr = (TextDatabaseNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "database-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextDatabaseNameAttribute</code> , See {@odf.attribute text:database-name}
	 *
	 * @param textDatabaseNameValue   The type is <code>String</code>
	 */
	public void setTextDatabaseNameAttribute(String textDatabaseNameValue) {
		TextDatabaseNameAttribute attr = new TextDatabaseNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textDatabaseNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextRowNumberAttribute</code> , See {@odf.attribute text:row-number}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextRowNumberAttribute() {
		TextRowNumberAttribute attr = (TextRowNumberAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "row-number");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextRowNumberAttribute</code> , See {@odf.attribute text:row-number}
	 *
	 * @param textRowNumberValue   The type is <code>Integer</code>
	 */
	public void setTextRowNumberAttribute(Integer textRowNumberValue) {
		TextRowNumberAttribute attr = new TextRowNumberAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textRowNumberValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextTableNameAttribute</code> , See {@odf.attribute text:table-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextTableNameAttribute() {
		TextTableNameAttribute attr = (TextTableNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "table-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextTableNameAttribute</code> , See {@odf.attribute text:table-name}
	 *
	 * @param textTableNameValue   The type is <code>String</code>
	 */
	public void setTextTableNameAttribute(String textTableNameValue) {
		TextTableNameAttribute attr = new TextTableNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textTableNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextTableTypeAttribute</code> , See {@odf.attribute text:table-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextTableTypeAttribute() {
		TextTableTypeAttribute attr = (TextTableTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "table-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextTableTypeAttribute</code> , See {@odf.attribute text:table-type}
	 *
	 * @param textTableTypeValue   The type is <code>String</code>
	 */
	public void setTextTableTypeAttribute(String textTableTypeValue) {
		TextTableTypeAttribute attr = new TextTableTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textTableTypeValue);
	}

	/**
	 * Create child element {@odf.element form:connection-resource}.
	 *
	 * @param xlinkHrefValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @return the element {@odf.element form:connection-resource}
	 */
	 public FormConnectionResourceElement newFormConnectionResourceElement(String xlinkHrefValue) {
		FormConnectionResourceElement formConnectionResource = ((OdfFileDom) this.ownerDocument).newOdfElement(FormConnectionResourceElement.class);
		formConnectionResource.setXlinkHrefAttribute(xlinkHrefValue);
		this.appendChild(formConnectionResource);
		return formConnectionResource;
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
