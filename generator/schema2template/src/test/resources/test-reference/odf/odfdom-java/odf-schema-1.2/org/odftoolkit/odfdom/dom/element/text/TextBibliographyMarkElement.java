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
import org.odftoolkit.odfdom.dom.attribute.text.TextAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextAnnoteAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextAuthorAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextBibliographyTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextBooktitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextChapterAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCustom1Attribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCustom2Attribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCustom3Attribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCustom4Attribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCustom5Attribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextEditionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextEditorAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextHowpublishedAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIdentifierAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextInstitutionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIsbnAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIssnAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextJournalAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextMonthAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextNoteAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextNumberAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextOrganizationsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextPagesAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextPublisherAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextReportTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextSchoolAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextSeriesAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUrlAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextVolumeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextYearAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:bibliography-mark}.
 *
 */
public class TextBibliographyMarkElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "bibliography-mark");

	/**
	 * Create the instance of <code>TextBibliographyMarkElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextBibliographyMarkElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:bibliography-mark}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextAddressAttribute</code> , See {@odf.attribute text:address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextAddressAttribute() {
		TextAddressAttribute attr = (TextAddressAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "address");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextAddressAttribute</code> , See {@odf.attribute text:address}
	 *
	 * @param textAddressValue   The type is <code>String</code>
	 */
	public void setTextAddressAttribute(String textAddressValue) {
		TextAddressAttribute attr = new TextAddressAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textAddressValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextAnnoteAttribute</code> , See {@odf.attribute text:annote}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextAnnoteAttribute() {
		TextAnnoteAttribute attr = (TextAnnoteAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "annote");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextAnnoteAttribute</code> , See {@odf.attribute text:annote}
	 *
	 * @param textAnnoteValue   The type is <code>String</code>
	 */
	public void setTextAnnoteAttribute(String textAnnoteValue) {
		TextAnnoteAttribute attr = new TextAnnoteAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textAnnoteValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextAuthorAttribute</code> , See {@odf.attribute text:author}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextAuthorAttribute() {
		TextAuthorAttribute attr = (TextAuthorAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "author");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextAuthorAttribute</code> , See {@odf.attribute text:author}
	 *
	 * @param textAuthorValue   The type is <code>String</code>
	 */
	public void setTextAuthorAttribute(String textAuthorValue) {
		TextAuthorAttribute attr = new TextAuthorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textAuthorValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextBibliographyTypeAttribute</code> , See {@odf.attribute text:bibliography-type}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextBibliographyTypeAttribute() {
		TextBibliographyTypeAttribute attr = (TextBibliographyTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "bibliography-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextBibliographyTypeAttribute</code> , See {@odf.attribute text:bibliography-type}
	 *
	 * @param textBibliographyTypeValue   The type is <code>String</code>
	 */
	public void setTextBibliographyTypeAttribute(String textBibliographyTypeValue) {
		TextBibliographyTypeAttribute attr = new TextBibliographyTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textBibliographyTypeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextBooktitleAttribute</code> , See {@odf.attribute text:booktitle}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextBooktitleAttribute() {
		TextBooktitleAttribute attr = (TextBooktitleAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "booktitle");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextBooktitleAttribute</code> , See {@odf.attribute text:booktitle}
	 *
	 * @param textBooktitleValue   The type is <code>String</code>
	 */
	public void setTextBooktitleAttribute(String textBooktitleValue) {
		TextBooktitleAttribute attr = new TextBooktitleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textBooktitleValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextChapterAttribute</code> , See {@odf.attribute text:chapter}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextChapterAttribute() {
		TextChapterAttribute attr = (TextChapterAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "chapter");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextChapterAttribute</code> , See {@odf.attribute text:chapter}
	 *
	 * @param textChapterValue   The type is <code>String</code>
	 */
	public void setTextChapterAttribute(String textChapterValue) {
		TextChapterAttribute attr = new TextChapterAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textChapterValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextCustom1Attribute</code> , See {@odf.attribute text:custom1}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextCustom1Attribute() {
		TextCustom1Attribute attr = (TextCustom1Attribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "custom1");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextCustom1Attribute</code> , See {@odf.attribute text:custom1}
	 *
	 * @param textCustom1Value   The type is <code>String</code>
	 */
	public void setTextCustom1Attribute(String textCustom1Value) {
		TextCustom1Attribute attr = new TextCustom1Attribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textCustom1Value);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextCustom2Attribute</code> , See {@odf.attribute text:custom2}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextCustom2Attribute() {
		TextCustom2Attribute attr = (TextCustom2Attribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "custom2");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextCustom2Attribute</code> , See {@odf.attribute text:custom2}
	 *
	 * @param textCustom2Value   The type is <code>String</code>
	 */
	public void setTextCustom2Attribute(String textCustom2Value) {
		TextCustom2Attribute attr = new TextCustom2Attribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textCustom2Value);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextCustom3Attribute</code> , See {@odf.attribute text:custom3}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextCustom3Attribute() {
		TextCustom3Attribute attr = (TextCustom3Attribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "custom3");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextCustom3Attribute</code> , See {@odf.attribute text:custom3}
	 *
	 * @param textCustom3Value   The type is <code>String</code>
	 */
	public void setTextCustom3Attribute(String textCustom3Value) {
		TextCustom3Attribute attr = new TextCustom3Attribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textCustom3Value);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextCustom4Attribute</code> , See {@odf.attribute text:custom4}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextCustom4Attribute() {
		TextCustom4Attribute attr = (TextCustom4Attribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "custom4");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextCustom4Attribute</code> , See {@odf.attribute text:custom4}
	 *
	 * @param textCustom4Value   The type is <code>String</code>
	 */
	public void setTextCustom4Attribute(String textCustom4Value) {
		TextCustom4Attribute attr = new TextCustom4Attribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textCustom4Value);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextCustom5Attribute</code> , See {@odf.attribute text:custom5}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextCustom5Attribute() {
		TextCustom5Attribute attr = (TextCustom5Attribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "custom5");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextCustom5Attribute</code> , See {@odf.attribute text:custom5}
	 *
	 * @param textCustom5Value   The type is <code>String</code>
	 */
	public void setTextCustom5Attribute(String textCustom5Value) {
		TextCustom5Attribute attr = new TextCustom5Attribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textCustom5Value);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextEditionAttribute</code> , See {@odf.attribute text:edition}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextEditionAttribute() {
		TextEditionAttribute attr = (TextEditionAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "edition");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextEditionAttribute</code> , See {@odf.attribute text:edition}
	 *
	 * @param textEditionValue   The type is <code>String</code>
	 */
	public void setTextEditionAttribute(String textEditionValue) {
		TextEditionAttribute attr = new TextEditionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textEditionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextEditorAttribute</code> , See {@odf.attribute text:editor}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextEditorAttribute() {
		TextEditorAttribute attr = (TextEditorAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "editor");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextEditorAttribute</code> , See {@odf.attribute text:editor}
	 *
	 * @param textEditorValue   The type is <code>String</code>
	 */
	public void setTextEditorAttribute(String textEditorValue) {
		TextEditorAttribute attr = new TextEditorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textEditorValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextHowpublishedAttribute</code> , See {@odf.attribute text:howpublished}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextHowpublishedAttribute() {
		TextHowpublishedAttribute attr = (TextHowpublishedAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "howpublished");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextHowpublishedAttribute</code> , See {@odf.attribute text:howpublished}
	 *
	 * @param textHowpublishedValue   The type is <code>String</code>
	 */
	public void setTextHowpublishedAttribute(String textHowpublishedValue) {
		TextHowpublishedAttribute attr = new TextHowpublishedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textHowpublishedValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIdentifierAttribute</code> , See {@odf.attribute text:identifier}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIdentifierAttribute() {
		TextIdentifierAttribute attr = (TextIdentifierAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "identifier");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIdentifierAttribute</code> , See {@odf.attribute text:identifier}
	 *
	 * @param textIdentifierValue   The type is <code>String</code>
	 */
	public void setTextIdentifierAttribute(String textIdentifierValue) {
		TextIdentifierAttribute attr = new TextIdentifierAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textIdentifierValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextInstitutionAttribute</code> , See {@odf.attribute text:institution}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextInstitutionAttribute() {
		TextInstitutionAttribute attr = (TextInstitutionAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "institution");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextInstitutionAttribute</code> , See {@odf.attribute text:institution}
	 *
	 * @param textInstitutionValue   The type is <code>String</code>
	 */
	public void setTextInstitutionAttribute(String textInstitutionValue) {
		TextInstitutionAttribute attr = new TextInstitutionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textInstitutionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIsbnAttribute</code> , See {@odf.attribute text:isbn}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIsbnAttribute() {
		TextIsbnAttribute attr = (TextIsbnAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "isbn");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIsbnAttribute</code> , See {@odf.attribute text:isbn}
	 *
	 * @param textIsbnValue   The type is <code>String</code>
	 */
	public void setTextIsbnAttribute(String textIsbnValue) {
		TextIsbnAttribute attr = new TextIsbnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textIsbnValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIssnAttribute</code> , See {@odf.attribute text:issn}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIssnAttribute() {
		TextIssnAttribute attr = (TextIssnAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "issn");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIssnAttribute</code> , See {@odf.attribute text:issn}
	 *
	 * @param textIssnValue   The type is <code>String</code>
	 */
	public void setTextIssnAttribute(String textIssnValue) {
		TextIssnAttribute attr = new TextIssnAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textIssnValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextJournalAttribute</code> , See {@odf.attribute text:journal}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextJournalAttribute() {
		TextJournalAttribute attr = (TextJournalAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "journal");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextJournalAttribute</code> , See {@odf.attribute text:journal}
	 *
	 * @param textJournalValue   The type is <code>String</code>
	 */
	public void setTextJournalAttribute(String textJournalValue) {
		TextJournalAttribute attr = new TextJournalAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textJournalValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextMonthAttribute</code> , See {@odf.attribute text:month}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextMonthAttribute() {
		TextMonthAttribute attr = (TextMonthAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "month");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextMonthAttribute</code> , See {@odf.attribute text:month}
	 *
	 * @param textMonthValue   The type is <code>String</code>
	 */
	public void setTextMonthAttribute(String textMonthValue) {
		TextMonthAttribute attr = new TextMonthAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textMonthValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextNoteAttribute</code> , See {@odf.attribute text:note}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextNoteAttribute() {
		TextNoteAttribute attr = (TextNoteAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "note");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextNoteAttribute</code> , See {@odf.attribute text:note}
	 *
	 * @param textNoteValue   The type is <code>String</code>
	 */
	public void setTextNoteAttribute(String textNoteValue) {
		TextNoteAttribute attr = new TextNoteAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textNoteValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextNumberAttribute</code> , See {@odf.attribute text:number}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextNumberAttribute() {
		TextNumberAttribute attr = (TextNumberAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "number");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextNumberAttribute</code> , See {@odf.attribute text:number}
	 *
	 * @param textNumberValue   The type is <code>String</code>
	 */
	public void setTextNumberAttribute(String textNumberValue) {
		TextNumberAttribute attr = new TextNumberAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textNumberValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextOrganizationsAttribute</code> , See {@odf.attribute text:organizations}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextOrganizationsAttribute() {
		TextOrganizationsAttribute attr = (TextOrganizationsAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "organizations");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextOrganizationsAttribute</code> , See {@odf.attribute text:organizations}
	 *
	 * @param textOrganizationsValue   The type is <code>String</code>
	 */
	public void setTextOrganizationsAttribute(String textOrganizationsValue) {
		TextOrganizationsAttribute attr = new TextOrganizationsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textOrganizationsValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextPagesAttribute</code> , See {@odf.attribute text:pages}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextPagesAttribute() {
		TextPagesAttribute attr = (TextPagesAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "pages");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextPagesAttribute</code> , See {@odf.attribute text:pages}
	 *
	 * @param textPagesValue   The type is <code>String</code>
	 */
	public void setTextPagesAttribute(String textPagesValue) {
		TextPagesAttribute attr = new TextPagesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textPagesValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextPublisherAttribute</code> , See {@odf.attribute text:publisher}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextPublisherAttribute() {
		TextPublisherAttribute attr = (TextPublisherAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "publisher");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextPublisherAttribute</code> , See {@odf.attribute text:publisher}
	 *
	 * @param textPublisherValue   The type is <code>String</code>
	 */
	public void setTextPublisherAttribute(String textPublisherValue) {
		TextPublisherAttribute attr = new TextPublisherAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textPublisherValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextReportTypeAttribute</code> , See {@odf.attribute text:report-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextReportTypeAttribute() {
		TextReportTypeAttribute attr = (TextReportTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "report-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextReportTypeAttribute</code> , See {@odf.attribute text:report-type}
	 *
	 * @param textReportTypeValue   The type is <code>String</code>
	 */
	public void setTextReportTypeAttribute(String textReportTypeValue) {
		TextReportTypeAttribute attr = new TextReportTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textReportTypeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextSchoolAttribute</code> , See {@odf.attribute text:school}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextSchoolAttribute() {
		TextSchoolAttribute attr = (TextSchoolAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "school");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextSchoolAttribute</code> , See {@odf.attribute text:school}
	 *
	 * @param textSchoolValue   The type is <code>String</code>
	 */
	public void setTextSchoolAttribute(String textSchoolValue) {
		TextSchoolAttribute attr = new TextSchoolAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textSchoolValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextSeriesAttribute</code> , See {@odf.attribute text:series}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextSeriesAttribute() {
		TextSeriesAttribute attr = (TextSeriesAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "series");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextSeriesAttribute</code> , See {@odf.attribute text:series}
	 *
	 * @param textSeriesValue   The type is <code>String</code>
	 */
	public void setTextSeriesAttribute(String textSeriesValue) {
		TextSeriesAttribute attr = new TextSeriesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textSeriesValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextTitleAttribute</code> , See {@odf.attribute text:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextTitleAttribute() {
		TextTitleAttribute attr = (TextTitleAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "title");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextTitleAttribute</code> , See {@odf.attribute text:title}
	 *
	 * @param textTitleValue   The type is <code>String</code>
	 */
	public void setTextTitleAttribute(String textTitleValue) {
		TextTitleAttribute attr = new TextTitleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textTitleValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUrlAttribute</code> , See {@odf.attribute text:url}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextUrlAttribute() {
		TextUrlAttribute attr = (TextUrlAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "url");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUrlAttribute</code> , See {@odf.attribute text:url}
	 *
	 * @param textUrlValue   The type is <code>String</code>
	 */
	public void setTextUrlAttribute(String textUrlValue) {
		TextUrlAttribute attr = new TextUrlAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textUrlValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextVolumeAttribute</code> , See {@odf.attribute text:volume}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextVolumeAttribute() {
		TextVolumeAttribute attr = (TextVolumeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "volume");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextVolumeAttribute</code> , See {@odf.attribute text:volume}
	 *
	 * @param textVolumeValue   The type is <code>String</code>
	 */
	public void setTextVolumeAttribute(String textVolumeValue) {
		TextVolumeAttribute attr = new TextVolumeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textVolumeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextYearAttribute</code> , See {@odf.attribute text:year}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextYearAttribute() {
		TextYearAttribute attr = (TextYearAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "year");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextYearAttribute</code> , See {@odf.attribute text:year}
	 *
	 * @param textYearValue   The type is <code>String</code>
	 */
	public void setTextYearAttribute(String textYearValue) {
		TextYearAttribute attr = new TextYearAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textYearValue);
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

	/**
	 * Add text content. Only elements which are allowed to have text content offer this method.
	 */
	 public void newTextNode(String content) {
		if (content != null && !content.equals("")) {
			this.appendChild(this.getOwnerDocument().createTextNode(content));
		}
	 }
}
