
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
package org.odftoolkit.odfdom.dom.style;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.odftoolkit.odfdom.dom.element.style.StyleChartPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleDrawingPagePropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleGraphicPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleParagraphPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleRubyPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleSectionPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTableCellPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTableColumnPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTablePropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTableRowPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;



public class OdfStyleFamily implements Comparable<OdfStyleFamily> {

	private String m_name;
	private Set<OdfStyleProperty> m_properties = new TreeSet<OdfStyleProperty>();
	private static Map<String, OdfStyleFamily> m_familyByName = new HashMap<String, OdfStyleFamily>();

	public static OdfStyleFamily getByName(String name) {
		return m_familyByName.get(name);
	}

	private OdfStyleFamily(String name, OdfStyleProperty[] props) {
		m_name = name;
		m_properties.addAll(Arrays.asList(props));
		m_familyByName.put(name, this);
	}

	private OdfStyleFamily(String name) {
		m_name = name;
		m_familyByName.put(name, this);
	}
		
	public String getName() {
		return m_name;
	}

	public int compareTo(OdfStyleFamily o) {
		return m_name.compareTo(o.toString());
	}

	public static OdfStyleFamily valueOf(String name) {
		OdfStyleFamily family = getByName(name);
		if (family == null) {
			family = new OdfStyleFamily(name);
		} 
		return family;
	}

	public static String toString(OdfStyleFamily family) {
		if (family != null) {
			return family.toString();
		}
		else {
			return new String();
		}
	}

	@Override
	public String toString() {
		return m_name;
	}

	public Set<OdfStyleProperty> getProperties() {
		return Collections.unmodifiableSet(m_properties);
	}
	public final static OdfStyleFamily Chart = new OdfStyleFamily("chart",
			new OdfStyleProperty[]{
				StyleChartPropertiesElement.*,
				StyleGraphicPropertiesElement.*,
				StyleParagraphPropertiesElement.*,
				StyleTextPropertiesElement.*			});

	public final static OdfStyleFamily DrawingPage = new OdfStyleFamily("drawing-page",
			new OdfStyleProperty[]{
				StyleDrawingPagePropertiesElement.*			});

	public final static OdfStyleFamily Graphic = new OdfStyleFamily("graphic",
			new OdfStyleProperty[]{
				StyleGraphicPropertiesElement.*,
				StyleParagraphPropertiesElement.*,
				StyleTextPropertiesElement.*			});

	public final static OdfStyleFamily Paragraph = new OdfStyleFamily("paragraph",
			new OdfStyleProperty[]{
				StyleParagraphPropertiesElement.*,
				StyleTextPropertiesElement.*			});

	public final static OdfStyleFamily Presentation = new OdfStyleFamily("presentation",
			new OdfStyleProperty[]{
				StyleGraphicPropertiesElement.*,
				StyleParagraphPropertiesElement.*,
				StyleTextPropertiesElement.*			});

	public final static OdfStyleFamily Ruby = new OdfStyleFamily("ruby",
			new OdfStyleProperty[]{
				StyleRubyPropertiesElement.*			});

	public final static OdfStyleFamily Section = new OdfStyleFamily("section",
			new OdfStyleProperty[]{
				StyleSectionPropertiesElement.*			});

	public final static OdfStyleFamily Table = new OdfStyleFamily("table",
			new OdfStyleProperty[]{
				StyleTablePropertiesElement.*			});

	public final static OdfStyleFamily TableCell = new OdfStyleFamily("table-cell",
			new OdfStyleProperty[]{
				StyleTableCellPropertiesElement.*,
				StyleParagraphPropertiesElement.*,
				StyleTextPropertiesElement.*			});

	public final static OdfStyleFamily TableColumn = new OdfStyleFamily("table-column",
			new OdfStyleProperty[]{
				StyleTableColumnPropertiesElement.*			});

	public final static OdfStyleFamily TableRow = new OdfStyleFamily("table-row",
			new OdfStyleProperty[]{
				StyleTableRowPropertiesElement.*			});

	public final static OdfStyleFamily Text = new OdfStyleFamily("text",
			new OdfStyleProperty[]{
				StyleTextPropertiesElement.*			});

}