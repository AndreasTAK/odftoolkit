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

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.dc.DcCreatorElement;
import org.odftoolkit.odfdom.dom.element.dc.DcDateElement;
import org.odftoolkit.odfdom.dom.element.dc.DcDescriptionElement;
import org.odftoolkit.odfdom.dom.element.dc.DcLanguageElement;
import org.odftoolkit.odfdom.dom.element.dc.DcSubjectElement;
import org.odftoolkit.odfdom.dom.element.dc.DcTitleElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaAutoReloadElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaCreationDateElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaDocumentStatisticElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaEditingCyclesElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaEditingDurationElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaGeneratorElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaHyperlinkBehaviourElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaInitialCreatorElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaKeywordElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaPrintDateElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaPrintedByElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaTemplateElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaUserDefinedElement;
import org.odftoolkit.odfdom.pkg.OdfContainerElementBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element office:meta}.
 *
 */
public class OfficeMetaElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.OFFICE, "meta");

	/**
	 * Create the instance of <code>OfficeMetaElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public OfficeMetaElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element office:meta}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element dc:creator}.
	 *
	 * Child element was added in ODF 1.2
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
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element dc:date}
	 */
	public DcDateElement newDcDateElement() {
		DcDateElement dcDate = ((OdfFileDom) this.ownerDocument).newOdfElement(DcDateElement.class);
		this.appendChild(dcDate);
		return dcDate;
	}

	/**
	 * Create child element {@odf.element dc:description}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element dc:description}
	 */
	public DcDescriptionElement newDcDescriptionElement() {
		DcDescriptionElement dcDescription = ((OdfFileDom) this.ownerDocument).newOdfElement(DcDescriptionElement.class);
		this.appendChild(dcDescription);
		return dcDescription;
	}

	/**
	 * Create child element {@odf.element dc:language}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element dc:language}
	 */
	public DcLanguageElement newDcLanguageElement() {
		DcLanguageElement dcLanguage = ((OdfFileDom) this.ownerDocument).newOdfElement(DcLanguageElement.class);
		this.appendChild(dcLanguage);
		return dcLanguage;
	}

	/**
	 * Create child element {@odf.element dc:subject}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element dc:subject}
	 */
	public DcSubjectElement newDcSubjectElement() {
		DcSubjectElement dcSubject = ((OdfFileDom) this.ownerDocument).newOdfElement(DcSubjectElement.class);
		this.appendChild(dcSubject);
		return dcSubject;
	}

	/**
	 * Create child element {@odf.element dc:title}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element dc:title}
	 */
	public DcTitleElement newDcTitleElement() {
		DcTitleElement dcTitle = ((OdfFileDom) this.ownerDocument).newOdfElement(DcTitleElement.class);
		this.appendChild(dcTitle);
		return dcTitle;
	}

	/**
	 * Create child element {@odf.element meta:auto-reload}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:auto-reload}
	 */
	public MetaAutoReloadElement newMetaAutoReloadElement() {
		MetaAutoReloadElement metaAutoReload = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaAutoReloadElement.class);
		this.appendChild(metaAutoReload);
		return metaAutoReload;
	}

	/**
	 * Create child element {@odf.element meta:creation-date}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:creation-date}
	 */
	public MetaCreationDateElement newMetaCreationDateElement() {
		MetaCreationDateElement metaCreationDate = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaCreationDateElement.class);
		this.appendChild(metaCreationDate);
		return metaCreationDate;
	}

	/**
	 * Create child element {@odf.element meta:document-statistic}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:document-statistic}
	 */
	public MetaDocumentStatisticElement newMetaDocumentStatisticElement() {
		MetaDocumentStatisticElement metaDocumentStatistic = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaDocumentStatisticElement.class);
		this.appendChild(metaDocumentStatistic);
		return metaDocumentStatistic;
	}

	/**
	 * Create child element {@odf.element meta:editing-cycles}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:editing-cycles}
	 */
	public MetaEditingCyclesElement newMetaEditingCyclesElement() {
		MetaEditingCyclesElement metaEditingCycles = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaEditingCyclesElement.class);
		this.appendChild(metaEditingCycles);
		return metaEditingCycles;
	}

	/**
	 * Create child element {@odf.element meta:editing-duration}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:editing-duration}
	 */
	public MetaEditingDurationElement newMetaEditingDurationElement() {
		MetaEditingDurationElement metaEditingDuration = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaEditingDurationElement.class);
		this.appendChild(metaEditingDuration);
		return metaEditingDuration;
	}

	/**
	 * Create child element {@odf.element meta:generator}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:generator}
	 */
	public MetaGeneratorElement newMetaGeneratorElement() {
		MetaGeneratorElement metaGenerator = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaGeneratorElement.class);
		this.appendChild(metaGenerator);
		return metaGenerator;
	}

	/**
	 * Create child element {@odf.element meta:hyperlink-behaviour}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:hyperlink-behaviour}
	 */
	public MetaHyperlinkBehaviourElement newMetaHyperlinkBehaviourElement() {
		MetaHyperlinkBehaviourElement metaHyperlinkBehaviour = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaHyperlinkBehaviourElement.class);
		this.appendChild(metaHyperlinkBehaviour);
		return metaHyperlinkBehaviour;
	}

	/**
	 * Create child element {@odf.element meta:initial-creator}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:initial-creator}
	 */
	public MetaInitialCreatorElement newMetaInitialCreatorElement() {
		MetaInitialCreatorElement metaInitialCreator = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaInitialCreatorElement.class);
		this.appendChild(metaInitialCreator);
		return metaInitialCreator;
	}

	/**
	 * Create child element {@odf.element meta:keyword}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:keyword}
	 */
	public MetaKeywordElement newMetaKeywordElement() {
		MetaKeywordElement metaKeyword = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaKeywordElement.class);
		this.appendChild(metaKeyword);
		return metaKeyword;
	}

	/**
	 * Create child element {@odf.element meta:print-date}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:print-date}
	 */
	public MetaPrintDateElement newMetaPrintDateElement() {
		MetaPrintDateElement metaPrintDate = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaPrintDateElement.class);
		this.appendChild(metaPrintDate);
		return metaPrintDate;
	}

	/**
	 * Create child element {@odf.element meta:printed-by}.
	 *
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:printed-by}
	 */
	public MetaPrintedByElement newMetaPrintedByElement() {
		MetaPrintedByElement metaPrintedBy = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaPrintedByElement.class);
		this.appendChild(metaPrintedBy);
		return metaPrintedBy;
	}

	/**
	 * Create child element {@odf.element meta:template}.
	 *
	 * @param xlinkHrefValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @param xlinkTypeValue  the <code>String</code> value of <code>XlinkTypeAttribute</code>, see {@odf.attribute  xlink:type} at specification
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:template}
	 */
	 public MetaTemplateElement newMetaTemplateElement(String xlinkHrefValue, String xlinkTypeValue) {
		MetaTemplateElement metaTemplate = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaTemplateElement.class);
		metaTemplate.setXlinkHrefAttribute(xlinkHrefValue);
		metaTemplate.setXlinkTypeAttribute(xlinkTypeValue);
		this.appendChild(metaTemplate);
		return metaTemplate;
	}

	/**
	 * Create child element {@odf.element meta:user-defined}.
	 *
	 * @param metaNameValue  the <code>String</code> value of <code>MetaNameAttribute</code>, see {@odf.attribute  meta:name} at specification
	 * @param metaValueTypeValue  the <code>String</code> value of <code>MetaValueTypeAttribute</code>, see {@odf.attribute  meta:value-type} at specification
	 * Child element was added in ODF 1.2
	 *
	 * @return the element {@odf.element meta:user-defined}
	 */
	 public MetaUserDefinedElement newMetaUserDefinedElement(String metaNameValue, String metaValueTypeValue) {
		MetaUserDefinedElement metaUserDefined = ((OdfFileDom) this.ownerDocument).newOdfElement(MetaUserDefinedElement.class);
		metaUserDefined.setMetaNameAttribute(metaNameValue);
		metaUserDefined.setMetaValueTypeAttribute(metaValueTypeValue);
		this.appendChild(metaUserDefined);
		return metaUserDefined;
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
