/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkShowAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element db:connection-resource}. */
public class DbConnectionResourceElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.DB, "connection-resource");

  /**
   * Create the instance of <code>DbConnectionResourceElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DbConnectionResourceElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element db:connection-resource}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> ,
   * See {@odf.attribute xlink:actuate}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkActuateAttribute() {
    XlinkActuateAttribute attr =
        (XlinkActuateAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "actuate");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return XlinkActuateAttribute.DEFAULT_VALUE_ONREQUEST;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See
   * {@odf.attribute xlink:actuate}
   *
   * @param xlinkActuateValue The type is <code>String</code>
   */
  public void setXlinkActuateAttribute(String xlinkActuateValue) {
    XlinkActuateAttribute attr = new XlinkActuateAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkActuateValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See
   * {@odf.attribute xlink:href}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkHrefAttribute() {
    XlinkHrefAttribute attr =
        (XlinkHrefAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "href");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See
   * {@odf.attribute xlink:href}
   *
   * @param xlinkHrefValue The type is <code>String</code>
   */
  public void setXlinkHrefAttribute(String xlinkHrefValue) {
    XlinkHrefAttribute attr = new XlinkHrefAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkHrefValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkShowAttribute</code> , See
   * {@odf.attribute xlink:show}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkShowAttribute() {
    XlinkShowAttribute attr =
        (XlinkShowAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "show");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return XlinkShowAttribute.DEFAULT_VALUE_NONE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkShowAttribute</code> , See
   * {@odf.attribute xlink:show}
   *
   * @param xlinkShowValue The type is <code>String</code>
   */
  public void setXlinkShowAttribute(String xlinkShowValue) {
    XlinkShowAttribute attr = new XlinkShowAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkShowValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See
   * {@odf.attribute xlink:type}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkTypeAttribute() {
    XlinkTypeAttribute attr =
        (XlinkTypeAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "type");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return XlinkTypeAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See
   * {@odf.attribute xlink:type}
   *
   * @param xlinkTypeValue The type is <code>String</code>
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
