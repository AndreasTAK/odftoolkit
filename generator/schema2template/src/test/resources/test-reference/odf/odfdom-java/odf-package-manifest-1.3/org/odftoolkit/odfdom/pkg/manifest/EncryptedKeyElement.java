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

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
/**
 * Manifest implementation of OpenDocument element  {@odf.element encrypted-key}.
 *
 */
public class EncryptedKeyElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName("urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", "manifest:encrypted-key");

	/**
	 * Create the instance of <code>EncryptedKeyElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public EncryptedKeyElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element encrypted-key}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element CipherData}.
	 *
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element CipherData}
	 */
	public CipherDataElement newCipherDataElement() {
		CipherDataElement cipherData = ((OdfFileDom) this.ownerDocument).newOdfElement(CipherDataElement.class);
		this.appendChild(cipherData);
		return cipherData;
	}

	/**
	 * Create child element {@odf.element encryption-method}.
	 *
	 * @param pGPAlgorithmValue  the <code>String</code> value of <code>PGPAlgorithmAttribute</code>, see {@odf.attribute  PGPAlgorithm} at specification
	 * @return the element {@odf.element encryption-method}
	 */
	 public EncryptionMethodElement newEncryptionMethodElement(String pGPAlgorithmValue) {
		EncryptionMethodElement encryptionMethod = ((OdfFileDom) this.ownerDocument).newOdfElement(EncryptionMethodElement.class);
		encryptionMethod.setPGPAlgorithmAttribute(pGPAlgorithmValue);
		this.appendChild(encryptionMethod);
		return encryptionMethod;
	}

	/**
	 * Create child element {@odf.element keyinfo}.
	 *
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element keyinfo}
	 */
	public KeyinfoElement newKeyinfoElement() {
		KeyinfoElement keyinfo = ((OdfFileDom) this.ownerDocument).newOdfElement(KeyinfoElement.class);
		this.appendChild(keyinfo);
		return keyinfo;
	}

}
