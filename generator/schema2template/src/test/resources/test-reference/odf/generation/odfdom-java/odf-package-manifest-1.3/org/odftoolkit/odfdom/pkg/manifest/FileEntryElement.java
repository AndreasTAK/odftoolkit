/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Use is subject to license terms.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.pkg.manifest;

import org.odftoolkit.odfdom.pkg.OdfPackageNamespace;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
/**
 * Manifest implementation of OpenDocument element  {@odf.element manifest:file-entry}.
 *
 */
public class FileEntryElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfPackageNamespace.MANIFEST, file-entry);

	/**
	 * Create the instance of <code>FileEntryElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public FileEntryElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element manifest:file-entry}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FullPathAttribute</code> , See {@odf.attribute manifest:full-path}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFullPathAttribute() {
		FullPathAttribute attr = (FullPathAttribute) getOdfAttribute(FullPathAttribute.ATTRIBUTE_NAME);
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FullPathAttribute</code> , See {@odf.attribute manifest:full-path}
	 *
	 * @param fullPathValue   The type is <code>String</code>
	 */
	public void setFullPathAttribute(String fullPathValue) {
		FullPathAttribute attr = new FullPathAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(fullPathValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MediaTypeAttribute</code> , See {@odf.attribute manifest:media-type}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getMediaTypeAttribute() {
		MediaTypeAttribute attr = (MediaTypeAttribute) getOdfAttribute(MediaTypeAttribute.ATTRIBUTE_NAME);
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MediaTypeAttribute</code> , See {@odf.attribute manifest:media-type}
	 *
	 * @param mediaTypeValue   The type is <code>String</code>
	 */
	public void setMediaTypeAttribute(String mediaTypeValue) {
		MediaTypeAttribute attr = new MediaTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(mediaTypeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PreferredViewModeAttribute</code> , See {@odf.attribute manifest:preferred-view-mode}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPreferredViewModeAttribute() {
		PreferredViewModeAttribute attr = (PreferredViewModeAttribute) getOdfAttribute(PreferredViewModeAttribute.ATTRIBUTE_NAME);
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PreferredViewModeAttribute</code> , See {@odf.attribute manifest:preferred-view-mode}
	 *
	 * @param preferredViewModeValue   The type is <code>String</code>
	 */
	public void setPreferredViewModeAttribute(String preferredViewModeValue) {
		PreferredViewModeAttribute attr = new PreferredViewModeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(preferredViewModeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SizeAttribute</code> , See {@odf.attribute manifest:size}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getSizeAttribute() {
		SizeAttribute attr = (SizeAttribute) getOdfAttribute(SizeAttribute.ATTRIBUTE_NAME);
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SizeAttribute</code> , See {@odf.attribute manifest:size}
	 *
	 * @param sizeValue   The type is <code>Integer</code>
	 */
	public void setSizeAttribute(Integer sizeValue) {
		SizeAttribute attr = new SizeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(sizeValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>VersionAttribute</code> , See {@odf.attribute manifest:version}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getVersionAttribute() {
		VersionAttribute attr = (VersionAttribute) getOdfAttribute(VersionAttribute.ATTRIBUTE_NAME);
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>VersionAttribute</code> , See {@odf.attribute manifest:version}
	 *
	 * @param versionValue   The type is <code>String</code>
	 */
	public void setVersionAttribute(String versionValue) {
		VersionAttribute attr = new VersionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(versionValue);
	}

	/**
	 * Create child element {@odf.element manifest:encryption-data}.
	 *
	 * @param checksumValue  the <code>String</code> value of <code>ChecksumAttribute</code>, see {@odf.attribute  manifest:checksum} at specification
	 * @param checksumTypeValue  the <code>String</code> value of <code>ChecksumTypeAttribute</code>, see {@odf.attribute  manifest:checksum-type} at specification
	 * @return the element {@odf.element manifest:encryption-data}
	 */
	 public EncryptionDataElement newEncryptionDataElement(String checksumValue, String checksumTypeValue) {
		EncryptionDataElement encryptionData = ((OdfFileDom) this.ownerDocument).newOdfElement(EncryptionDataElement.class);
		encryptionData.setChecksumAttribute(checksumValue);
		encryptionData.setChecksumTypeAttribute(checksumTypeValue);
		this.appendChild(encryptionData);
		return encryptionData;
	}

}
