
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
package org.odftoolkit.odfdom.dom.attribute.chart;

import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfAttribute;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute chart:label-arrangement}.
 *
 */
public class ChartLabelArrangementAttribute extends OdfAttribute {

public static final OdfName ATTRIBUTE_NAME = OdfName.newName(OdfDocumentNamespace.CHART, "label-arrangement");


	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute chart:label-arrangement}.
	 *
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public ChartLabelArrangementAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}

	/**
	 * Returns the attribute name.
	 *
	 * @return the <code>OdfName</code> for {@odf.attribute chart:label-arrangement}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}

	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * The value set of {@odf.attribute chart:label-arrangement}.
	 */
	public enum Value {
		SIDE_BY_SIDE("side-by-side"), STAGGER_EVEN("stagger-even"), STAGGER_ODD("stagger-odd");

		private String mValue;

		Value(String value) {
			mValue = value;
		}

		@Override
		public String toString() {
			return mValue;
		}

		public static Value enumValueOf(String value) {
			for(Value aIter : values()) {
				if (value.equals(aIter.toString())) {
				return aIter;
				}
			}
			return null;
		}
	}

	/**
	 * @param attrValue The <code>Enum</code> value of the attribute.
	 */
	public void setEnumValue(Value attrValue) {
		setValue(attrValue.toString());
	}

	/**
	 * @return Returns the <code>Enum</code> value of the attribute
	 */
	public Value getEnumValue() {
		return Value.enumValueOf(this.getValue());
	}

	/**
	 * Returns the default value of {@odf.attribute chart:label-arrangement}.
	 *
	 * @return the default value as <code>String</code> dependent of its element name
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		return null;
	}

	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 *
	 * @return <code>true</code> if {@odf.attribute chart:label-arrangement} has an element parent
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return false;
	}

	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
	}
}
