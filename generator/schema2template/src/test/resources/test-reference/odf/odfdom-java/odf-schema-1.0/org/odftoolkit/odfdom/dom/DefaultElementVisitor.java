
package org.odftoolkit.odfdom.dom;

import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateColorElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateMotionElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateTransformElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAudioElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimCommandElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimIterateElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimParElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimParamElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimSeqElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimSetElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimTransitionFilterElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartAxisElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartCategoriesElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartChartElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartDataPointElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartDomainElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartErrorIndicatorElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartFloorElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartFooterElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartGridElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartLegendElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartMeanValueElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartPlotAreaElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartRegressionCurveElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartSeriesElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartStockGainMarkerElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartStockLossMarkerElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartStockRangeLineElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartSubtitleElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartTitleElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartWallElement;
import org.odftoolkit.odfdom.dom.element.config.ConfigConfigItemElement;
import org.odftoolkit.odfdom.dom.element.config.ConfigConfigItemMapEntryElement;
import org.odftoolkit.odfdom.dom.element.config.ConfigConfigItemMapIndexedElement;
import org.odftoolkit.odfdom.dom.element.config.ConfigConfigItemMapNamedElement;
import org.odftoolkit.odfdom.dom.element.config.ConfigConfigItemSetElement;
import org.odftoolkit.odfdom.dom.element.dc.DcCreatorElement;
import org.odftoolkit.odfdom.dom.element.dc.DcDateElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dCubeElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dExtrudeElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dLightElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dRotateElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dSceneElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dSphereElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAppletElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAreaCircleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAreaPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAreaRectangleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCaptionElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCircleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawConnectorElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawContourPathElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawContourPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawControlElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCustomShapeElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawEllipseElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawEnhancedGeometryElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawEquationElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFillImageElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFloatingFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGluePointElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGradientElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawHandleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawHatchElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawImageElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawImageMapElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawLayerElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawLayerSetElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawLineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawMarkerElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawMeasureElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawObjectElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawObjectOleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawOpacityElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPageElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPageThumbnailElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawParamElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPathElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPluginElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolylineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRectElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRegularPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawStrokeDashElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawTextBoxElement;
import org.odftoolkit.odfdom.dom.element.form.FormButtonElement;
import org.odftoolkit.odfdom.dom.element.form.FormCheckboxElement;
import org.odftoolkit.odfdom.dom.element.form.FormColumnElement;
import org.odftoolkit.odfdom.dom.element.form.FormComboboxElement;
import org.odftoolkit.odfdom.dom.element.form.FormConnectionResourceElement;
import org.odftoolkit.odfdom.dom.element.form.FormDateElement;
import org.odftoolkit.odfdom.dom.element.form.FormFileElement;
import org.odftoolkit.odfdom.dom.element.form.FormFixedTextElement;
import org.odftoolkit.odfdom.dom.element.form.FormFormElement;
import org.odftoolkit.odfdom.dom.element.form.FormFormattedTextElement;
import org.odftoolkit.odfdom.dom.element.form.FormFrameElement;
import org.odftoolkit.odfdom.dom.element.form.FormGenericControlElement;
import org.odftoolkit.odfdom.dom.element.form.FormGridElement;
import org.odftoolkit.odfdom.dom.element.form.FormHiddenElement;
import org.odftoolkit.odfdom.dom.element.form.FormImageElement;
import org.odftoolkit.odfdom.dom.element.form.FormImageFrameElement;
import org.odftoolkit.odfdom.dom.element.form.FormItemElement;
import org.odftoolkit.odfdom.dom.element.form.FormListPropertyElement;
import org.odftoolkit.odfdom.dom.element.form.FormListValueElement;
import org.odftoolkit.odfdom.dom.element.form.FormListboxElement;
import org.odftoolkit.odfdom.dom.element.form.FormNumberElement;
import org.odftoolkit.odfdom.dom.element.form.FormOptionElement;
import org.odftoolkit.odfdom.dom.element.form.FormPasswordElement;
import org.odftoolkit.odfdom.dom.element.form.FormPropertiesElement;
import org.odftoolkit.odfdom.dom.element.form.FormPropertyElement;
import org.odftoolkit.odfdom.dom.element.form.FormRadioElement;
import org.odftoolkit.odfdom.dom.element.form.FormTextElement;
import org.odftoolkit.odfdom.dom.element.form.FormTextareaElement;
import org.odftoolkit.odfdom.dom.element.form.FormTimeElement;
import org.odftoolkit.odfdom.dom.element.form.FormValueRangeElement;
import org.odftoolkit.odfdom.dom.element.math.MathMathElement;
import org.odftoolkit.odfdom.dom.element.meta.MetaDateStringElement;
import org.odftoolkit.odfdom.dom.element.number.NumberAmPmElement;
import org.odftoolkit.odfdom.dom.element.number.NumberBooleanElement;
import org.odftoolkit.odfdom.dom.element.number.NumberBooleanStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberCurrencyStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberCurrencySymbolElement;
import org.odftoolkit.odfdom.dom.element.number.NumberDateStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberDayElement;
import org.odftoolkit.odfdom.dom.element.number.NumberDayOfWeekElement;
import org.odftoolkit.odfdom.dom.element.number.NumberEmbeddedTextElement;
import org.odftoolkit.odfdom.dom.element.number.NumberEraElement;
import org.odftoolkit.odfdom.dom.element.number.NumberFractionElement;
import org.odftoolkit.odfdom.dom.element.number.NumberHoursElement;
import org.odftoolkit.odfdom.dom.element.number.NumberMinutesElement;
import org.odftoolkit.odfdom.dom.element.number.NumberMonthElement;
import org.odftoolkit.odfdom.dom.element.number.NumberNumberElement;
import org.odftoolkit.odfdom.dom.element.number.NumberNumberStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberPercentageStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberQuarterElement;
import org.odftoolkit.odfdom.dom.element.number.NumberScientificNumberElement;
import org.odftoolkit.odfdom.dom.element.number.NumberSecondsElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTextElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTextContentElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTextStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTimeStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberWeekOfYearElement;
import org.odftoolkit.odfdom.dom.element.number.NumberYearElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeAnnotationElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeAutomaticStylesElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeBinaryDataElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeBodyElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeChangeInfoElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeChartElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeDdeSourceElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeDocumentElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeDocumentContentElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeDocumentMetaElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeDocumentSettingsElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeDocumentStylesElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeDrawingElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeFontFaceDeclsElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeFormsElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeImageElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeMasterStylesElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeMetaElement;
import org.odftoolkit.odfdom.dom.element.office.OfficePresentationElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeScriptElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeScriptsElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeSettingsElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeSpreadsheetElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeStylesElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeTextElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationAnimationGroupElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationAnimationsElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationDateTimeElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationDateTimeDeclElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationDimElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationEventListenerElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationFooterElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationFooterDeclElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationHeaderElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationHeaderDeclElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationHideShapeElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationHideTextElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationNotesElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationPlaceholderElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationPlayElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationSettingsElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationShowElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationShowShapeElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationShowTextElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationSoundElement;
import org.odftoolkit.odfdom.dom.element.script.ScriptEventListenerElement;
import org.odftoolkit.odfdom.dom.element.style.StyleChartPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleDefaultStyleElement;
import org.odftoolkit.odfdom.dom.element.style.StyleDrawingPagePropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleFontFaceElement;
import org.odftoolkit.odfdom.dom.element.style.StyleFooterElement;
import org.odftoolkit.odfdom.dom.element.style.StyleFooterLeftElement;
import org.odftoolkit.odfdom.dom.element.style.StyleFooterStyleElement;
import org.odftoolkit.odfdom.dom.element.style.StyleGraphicPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleHandoutMasterElement;
import org.odftoolkit.odfdom.dom.element.style.StyleHeaderElement;
import org.odftoolkit.odfdom.dom.element.style.StyleHeaderFooterPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleHeaderLeftElement;
import org.odftoolkit.odfdom.dom.element.style.StyleHeaderStyleElement;
import org.odftoolkit.odfdom.dom.element.style.StyleListLevelPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleMapElement;
import org.odftoolkit.odfdom.dom.element.style.StyleMasterPageElement;
import org.odftoolkit.odfdom.dom.element.style.StylePageLayoutElement;
import org.odftoolkit.odfdom.dom.element.style.StylePageLayoutPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleParagraphPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StylePresentationPageLayoutElement;
import org.odftoolkit.odfdom.dom.element.style.StyleRegionCenterElement;
import org.odftoolkit.odfdom.dom.element.style.StyleRegionLeftElement;
import org.odftoolkit.odfdom.dom.element.style.StyleRegionRightElement;
import org.odftoolkit.odfdom.dom.element.style.StyleRubyPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleSectionPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleStyleElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTableCellPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTableColumnPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTablePropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTableRowPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgDefinitionSrcElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgDescElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgFontFaceFormatElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgFontFaceNameElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgFontFaceSrcElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgFontFaceUriElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgLinearGradientElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgRadialGradientElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgStopElement;
import org.odftoolkit.odfdom.dom.element.table.TableCalculationSettingsElement;
import org.odftoolkit.odfdom.dom.element.table.TableCellAddressElement;
import org.odftoolkit.odfdom.dom.element.table.TableCellContentChangeElement;
import org.odftoolkit.odfdom.dom.element.table.TableCellContentDeletionElement;
import org.odftoolkit.odfdom.dom.element.table.TableCellRangeSourceElement;
import org.odftoolkit.odfdom.dom.element.table.TableChangeDeletionElement;
import org.odftoolkit.odfdom.dom.element.table.TableChangeTrackTableCellElement;
import org.odftoolkit.odfdom.dom.element.table.TableConsolidationElement;
import org.odftoolkit.odfdom.dom.element.table.TableContentValidationElement;
import org.odftoolkit.odfdom.dom.element.table.TableContentValidationsElement;
import org.odftoolkit.odfdom.dom.element.table.TableCoveredTableCellElement;
import org.odftoolkit.odfdom.dom.element.table.TableCutOffsElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotDisplayInfoElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotFieldElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotFieldReferenceElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotGroupElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotGroupMemberElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotGroupsElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotLayoutInfoElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotLevelElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotMemberElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotMembersElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotSortInfoElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotSubtotalElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotSubtotalsElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotTableElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotTablesElement;
import org.odftoolkit.odfdom.dom.element.table.TableDatabaseRangeElement;
import org.odftoolkit.odfdom.dom.element.table.TableDatabaseRangesElement;
import org.odftoolkit.odfdom.dom.element.table.TableDatabaseSourceQueryElement;
import org.odftoolkit.odfdom.dom.element.table.TableDatabaseSourceSqlElement;
import org.odftoolkit.odfdom.dom.element.table.TableDatabaseSourceTableElement;
import org.odftoolkit.odfdom.dom.element.table.TableDdeLinkElement;
import org.odftoolkit.odfdom.dom.element.table.TableDdeLinksElement;
import org.odftoolkit.odfdom.dom.element.table.TableDeletionElement;
import org.odftoolkit.odfdom.dom.element.table.TableDeletionsElement;
import org.odftoolkit.odfdom.dom.element.table.TableDependenciesElement;
import org.odftoolkit.odfdom.dom.element.table.TableDependencyElement;
import org.odftoolkit.odfdom.dom.element.table.TableDetectiveElement;
import org.odftoolkit.odfdom.dom.element.table.TableErrorMacroElement;
import org.odftoolkit.odfdom.dom.element.table.TableErrorMessageElement;
import org.odftoolkit.odfdom.dom.element.table.TableFilterElement;
import org.odftoolkit.odfdom.dom.element.table.TableFilterAndElement;
import org.odftoolkit.odfdom.dom.element.table.TableFilterConditionElement;
import org.odftoolkit.odfdom.dom.element.table.TableFilterOrElement;
import org.odftoolkit.odfdom.dom.element.table.TableHelpMessageElement;
import org.odftoolkit.odfdom.dom.element.table.TableHighlightedRangeElement;
import org.odftoolkit.odfdom.dom.element.table.TableInsertionElement;
import org.odftoolkit.odfdom.dom.element.table.TableInsertionCutOffElement;
import org.odftoolkit.odfdom.dom.element.table.TableIterationElement;
import org.odftoolkit.odfdom.dom.element.table.TableLabelRangeElement;
import org.odftoolkit.odfdom.dom.element.table.TableLabelRangesElement;
import org.odftoolkit.odfdom.dom.element.table.TableMovementElement;
import org.odftoolkit.odfdom.dom.element.table.TableMovementCutOffElement;
import org.odftoolkit.odfdom.dom.element.table.TableNamedExpressionElement;
import org.odftoolkit.odfdom.dom.element.table.TableNamedExpressionsElement;
import org.odftoolkit.odfdom.dom.element.table.TableNamedRangeElement;
import org.odftoolkit.odfdom.dom.element.table.TableNullDateElement;
import org.odftoolkit.odfdom.dom.element.table.TableOperationElement;
import org.odftoolkit.odfdom.dom.element.table.TablePreviousElement;
import org.odftoolkit.odfdom.dom.element.table.TableScenarioElement;
import org.odftoolkit.odfdom.dom.element.table.TableShapesElement;
import org.odftoolkit.odfdom.dom.element.table.TableSortElement;
import org.odftoolkit.odfdom.dom.element.table.TableSortByElement;
import org.odftoolkit.odfdom.dom.element.table.TableSortGroupsElement;
import org.odftoolkit.odfdom.dom.element.table.TableSourceCellRangeElement;
import org.odftoolkit.odfdom.dom.element.table.TableSourceRangeAddressElement;
import org.odftoolkit.odfdom.dom.element.table.TableSourceServiceElement;
import org.odftoolkit.odfdom.dom.element.table.TableSubtotalFieldElement;
import org.odftoolkit.odfdom.dom.element.table.TableSubtotalRuleElement;
import org.odftoolkit.odfdom.dom.element.table.TableSubtotalRulesElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableColumnElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableColumnGroupElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableColumnsElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableHeaderColumnsElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableHeaderRowsElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowGroupElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowsElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableSourceElement;
import org.odftoolkit.odfdom.dom.element.table.TableTargetRangeAddressElement;
import org.odftoolkit.odfdom.dom.element.table.TableTrackedChangesElement;
import org.odftoolkit.odfdom.dom.element.text.TextAElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexAutoMarkFileElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexMarkElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexMarkEndElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexMarkStartElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexSourceElement;
import org.odftoolkit.odfdom.dom.element.text.TextAuthorInitialsElement;
import org.odftoolkit.odfdom.dom.element.text.TextAuthorNameElement;
import org.odftoolkit.odfdom.dom.element.text.TextBibliographyElement;
import org.odftoolkit.odfdom.dom.element.text.TextBibliographyConfigurationElement;
import org.odftoolkit.odfdom.dom.element.text.TextBibliographyEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextBibliographyMarkElement;
import org.odftoolkit.odfdom.dom.element.text.TextBibliographySourceElement;
import org.odftoolkit.odfdom.dom.element.text.TextBookmarkElement;
import org.odftoolkit.odfdom.dom.element.text.TextBookmarkEndElement;
import org.odftoolkit.odfdom.dom.element.text.TextBookmarkRefElement;
import org.odftoolkit.odfdom.dom.element.text.TextBookmarkStartElement;
import org.odftoolkit.odfdom.dom.element.text.TextChangeElement;
import org.odftoolkit.odfdom.dom.element.text.TextChangeEndElement;
import org.odftoolkit.odfdom.dom.element.text.TextChangeStartElement;
import org.odftoolkit.odfdom.dom.element.text.TextChangedRegionElement;
import org.odftoolkit.odfdom.dom.element.text.TextChapterElement;
import org.odftoolkit.odfdom.dom.element.text.TextCharacterCountElement;
import org.odftoolkit.odfdom.dom.element.text.TextConditionalTextElement;
import org.odftoolkit.odfdom.dom.element.text.TextCreationDateElement;
import org.odftoolkit.odfdom.dom.element.text.TextCreationTimeElement;
import org.odftoolkit.odfdom.dom.element.text.TextCreatorElement;
import org.odftoolkit.odfdom.dom.element.text.TextDatabaseDisplayElement;
import org.odftoolkit.odfdom.dom.element.text.TextDatabaseNameElement;
import org.odftoolkit.odfdom.dom.element.text.TextDatabaseNextElement;
import org.odftoolkit.odfdom.dom.element.text.TextDatabaseRowNumberElement;
import org.odftoolkit.odfdom.dom.element.text.TextDatabaseRowSelectElement;
import org.odftoolkit.odfdom.dom.element.text.TextDateElement;
import org.odftoolkit.odfdom.dom.element.text.TextDdeConnectionElement;
import org.odftoolkit.odfdom.dom.element.text.TextDdeConnectionDeclElement;
import org.odftoolkit.odfdom.dom.element.text.TextDdeConnectionDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextDeletionElement;
import org.odftoolkit.odfdom.dom.element.text.TextDescriptionElement;
import org.odftoolkit.odfdom.dom.element.text.TextEditingCyclesElement;
import org.odftoolkit.odfdom.dom.element.text.TextEditingDurationElement;
import org.odftoolkit.odfdom.dom.element.text.TextExecuteMacroElement;
import org.odftoolkit.odfdom.dom.element.text.TextExpressionElement;
import org.odftoolkit.odfdom.dom.element.text.TextFileNameElement;
import org.odftoolkit.odfdom.dom.element.text.TextFormatChangeElement;
import org.odftoolkit.odfdom.dom.element.text.TextHElement;
import org.odftoolkit.odfdom.dom.element.text.TextHiddenParagraphElement;
import org.odftoolkit.odfdom.dom.element.text.TextHiddenTextElement;
import org.odftoolkit.odfdom.dom.element.text.TextIllustrationIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextIllustrationIndexEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextIllustrationIndexSourceElement;
import org.odftoolkit.odfdom.dom.element.text.TextImageCountElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexBodyElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryBibliographyElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryChapterElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryLinkEndElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryLinkStartElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryPageNumberElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntrySpanElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryTabStopElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexEntryTextElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexSourceStyleElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexSourceStylesElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexTitleElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexTitleTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextInitialCreatorElement;
import org.odftoolkit.odfdom.dom.element.text.TextInsertionElement;
import org.odftoolkit.odfdom.dom.element.text.TextKeywordsElement;
import org.odftoolkit.odfdom.dom.element.text.TextLineBreakElement;
import org.odftoolkit.odfdom.dom.element.text.TextLinenumberingConfigurationElement;
import org.odftoolkit.odfdom.dom.element.text.TextLinenumberingSeparatorElement;
import org.odftoolkit.odfdom.dom.element.text.TextListElement;
import org.odftoolkit.odfdom.dom.element.text.TextListHeaderElement;
import org.odftoolkit.odfdom.dom.element.text.TextListItemElement;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleBulletElement;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleImageElement;
import org.odftoolkit.odfdom.dom.element.text.TextListLevelStyleNumberElement;
import org.odftoolkit.odfdom.dom.element.text.TextListStyleElement;
import org.odftoolkit.odfdom.dom.element.text.TextMeasureElement;
import org.odftoolkit.odfdom.dom.element.text.TextModificationDateElement;
import org.odftoolkit.odfdom.dom.element.text.TextModificationTimeElement;
import org.odftoolkit.odfdom.dom.element.text.TextNoteElement;
import org.odftoolkit.odfdom.dom.element.text.TextNoteBodyElement;
import org.odftoolkit.odfdom.dom.element.text.TextNoteCitationElement;
import org.odftoolkit.odfdom.dom.element.text.TextNoteContinuationNoticeBackwardElement;
import org.odftoolkit.odfdom.dom.element.text.TextNoteContinuationNoticeForwardElement;
import org.odftoolkit.odfdom.dom.element.text.TextNoteRefElement;
import org.odftoolkit.odfdom.dom.element.text.TextNotesConfigurationElement;
import org.odftoolkit.odfdom.dom.element.text.TextNumberElement;
import org.odftoolkit.odfdom.dom.element.text.TextNumberedParagraphElement;
import org.odftoolkit.odfdom.dom.element.text.TextObjectCountElement;
import org.odftoolkit.odfdom.dom.element.text.TextObjectIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextObjectIndexEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextObjectIndexSourceElement;
import org.odftoolkit.odfdom.dom.element.text.TextOutlineLevelStyleElement;
import org.odftoolkit.odfdom.dom.element.text.TextOutlineStyleElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.dom.element.text.TextPageElement;
import org.odftoolkit.odfdom.dom.element.text.TextPageContinuationElement;
import org.odftoolkit.odfdom.dom.element.text.TextPageCountElement;
import org.odftoolkit.odfdom.dom.element.text.TextPageNumberElement;
import org.odftoolkit.odfdom.dom.element.text.TextPageSequenceElement;
import org.odftoolkit.odfdom.dom.element.text.TextPageVariableGetElement;
import org.odftoolkit.odfdom.dom.element.text.TextPageVariableSetElement;
import org.odftoolkit.odfdom.dom.element.text.TextParagraphCountElement;
import org.odftoolkit.odfdom.dom.element.text.TextPlaceholderElement;
import org.odftoolkit.odfdom.dom.element.text.TextPrintDateElement;
import org.odftoolkit.odfdom.dom.element.text.TextPrintTimeElement;
import org.odftoolkit.odfdom.dom.element.text.TextPrintedByElement;
import org.odftoolkit.odfdom.dom.element.text.TextReferenceMarkElement;
import org.odftoolkit.odfdom.dom.element.text.TextReferenceMarkEndElement;
import org.odftoolkit.odfdom.dom.element.text.TextReferenceMarkStartElement;
import org.odftoolkit.odfdom.dom.element.text.TextReferenceRefElement;
import org.odftoolkit.odfdom.dom.element.text.TextRubyElement;
import org.odftoolkit.odfdom.dom.element.text.TextRubyBaseElement;
import org.odftoolkit.odfdom.dom.element.text.TextRubyTextElement;
import org.odftoolkit.odfdom.dom.element.text.TextSElement;
import org.odftoolkit.odfdom.dom.element.text.TextScriptElement;
import org.odftoolkit.odfdom.dom.element.text.TextSectionElement;
import org.odftoolkit.odfdom.dom.element.text.TextSectionSourceElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderCityElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderCompanyElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderCountryElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderEmailElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderFaxElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderFirstnameElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderInitialsElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderLastnameElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderPhonePrivateElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderPhoneWorkElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderPositionElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderPostalCodeElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderStateOrProvinceElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderStreetElement;
import org.odftoolkit.odfdom.dom.element.text.TextSenderTitleElement;
import org.odftoolkit.odfdom.dom.element.text.TextSequenceElement;
import org.odftoolkit.odfdom.dom.element.text.TextSequenceDeclElement;
import org.odftoolkit.odfdom.dom.element.text.TextSequenceDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextSequenceRefElement;
import org.odftoolkit.odfdom.dom.element.text.TextSheetNameElement;
import org.odftoolkit.odfdom.dom.element.text.TextSortKeyElement;
import org.odftoolkit.odfdom.dom.element.text.TextSpanElement;
import org.odftoolkit.odfdom.dom.element.text.TextSubjectElement;
import org.odftoolkit.odfdom.dom.element.text.TextTabElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableCountElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableFormulaElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableIndexEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableIndexSourceElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentSourceElement;
import org.odftoolkit.odfdom.dom.element.text.TextTemplateNameElement;
import org.odftoolkit.odfdom.dom.element.text.TextTextInputElement;
import org.odftoolkit.odfdom.dom.element.text.TextTimeElement;
import org.odftoolkit.odfdom.dom.element.text.TextTitleElement;
import org.odftoolkit.odfdom.dom.element.text.TextTocMarkElement;
import org.odftoolkit.odfdom.dom.element.text.TextTocMarkEndElement;
import org.odftoolkit.odfdom.dom.element.text.TextTocMarkStartElement;
import org.odftoolkit.odfdom.dom.element.text.TextTrackedChangesElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserDefinedElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserFieldDeclElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserFieldDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserFieldGetElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserFieldInputElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexEntryTemplateElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexMarkElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexMarkEndElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexMarkStartElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexSourceElement;
import org.odftoolkit.odfdom.dom.element.text.TextVariableDeclElement;
import org.odftoolkit.odfdom.dom.element.text.TextVariableDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextVariableGetElement;
import org.odftoolkit.odfdom.dom.element.text.TextVariableInputElement;
import org.odftoolkit.odfdom.dom.element.text.TextVariableSetElement;
import org.odftoolkit.odfdom.dom.element.text.TextWordCountElement;
import org.odftoolkit.odfdom.dom.element.xforms.XformsModelElement;

/**
 * A default visitor for DOM layer elements.
 * <p> It implements the interface of DomVisitor in package layer.</p>
 * <p> It provides element process method for some special elements. </p>
 *
 */
public abstract class DefaultElementVisitor implements ElementVisitor {

	@Override
	abstract public void visit(OdfElement element);
	/**
	 * A method to visit "anim:animate" elements
	 * @param ele - an instance of AnimAnimateElement
	 */
	public void visit(AnimAnimateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:animateColor" elements
	 * @param ele - an instance of AnimAnimateColorElement
	 */
	public void visit(AnimAnimateColorElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:animateMotion" elements
	 * @param ele - an instance of AnimAnimateMotionElement
	 */
	public void visit(AnimAnimateMotionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:animateTransform" elements
	 * @param ele - an instance of AnimAnimateTransformElement
	 */
	public void visit(AnimAnimateTransformElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:audio" elements
	 * @param ele - an instance of AnimAudioElement
	 */
	public void visit(AnimAudioElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:command" elements
	 * @param ele - an instance of AnimCommandElement
	 */
	public void visit(AnimCommandElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:iterate" elements
	 * @param ele - an instance of AnimIterateElement
	 */
	public void visit(AnimIterateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:par" elements
	 * @param ele - an instance of AnimParElement
	 */
	public void visit(AnimParElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:param" elements
	 * @param ele - an instance of AnimParamElement
	 */
	public void visit(AnimParamElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:seq" elements
	 * @param ele - an instance of AnimSeqElement
	 */
	public void visit(AnimSeqElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:set" elements
	 * @param ele - an instance of AnimSetElement
	 */
	public void visit(AnimSetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "anim:transitionFilter" elements
	 * @param ele - an instance of AnimTransitionFilterElement
	 */
	public void visit(AnimTransitionFilterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:axis" elements
	 * @param ele - an instance of ChartAxisElement
	 */
	public void visit(ChartAxisElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:categories" elements
	 * @param ele - an instance of ChartCategoriesElement
	 */
	public void visit(ChartCategoriesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:chart" elements
	 * @param ele - an instance of ChartChartElement
	 */
	public void visit(ChartChartElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:data-point" elements
	 * @param ele - an instance of ChartDataPointElement
	 */
	public void visit(ChartDataPointElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:domain" elements
	 * @param ele - an instance of ChartDomainElement
	 */
	public void visit(ChartDomainElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:error-indicator" elements
	 * @param ele - an instance of ChartErrorIndicatorElement
	 */
	public void visit(ChartErrorIndicatorElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:floor" elements
	 * @param ele - an instance of ChartFloorElement
	 */
	public void visit(ChartFloorElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:footer" elements
	 * @param ele - an instance of ChartFooterElement
	 */
	public void visit(ChartFooterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:grid" elements
	 * @param ele - an instance of ChartGridElement
	 */
	public void visit(ChartGridElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:legend" elements
	 * @param ele - an instance of ChartLegendElement
	 */
	public void visit(ChartLegendElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:mean-value" elements
	 * @param ele - an instance of ChartMeanValueElement
	 */
	public void visit(ChartMeanValueElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:plot-area" elements
	 * @param ele - an instance of ChartPlotAreaElement
	 */
	public void visit(ChartPlotAreaElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:regression-curve" elements
	 * @param ele - an instance of ChartRegressionCurveElement
	 */
	public void visit(ChartRegressionCurveElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:series" elements
	 * @param ele - an instance of ChartSeriesElement
	 */
	public void visit(ChartSeriesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:stock-gain-marker" elements
	 * @param ele - an instance of ChartStockGainMarkerElement
	 */
	public void visit(ChartStockGainMarkerElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:stock-loss-marker" elements
	 * @param ele - an instance of ChartStockLossMarkerElement
	 */
	public void visit(ChartStockLossMarkerElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:stock-range-line" elements
	 * @param ele - an instance of ChartStockRangeLineElement
	 */
	public void visit(ChartStockRangeLineElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:subtitle" elements
	 * @param ele - an instance of ChartSubtitleElement
	 */
	public void visit(ChartSubtitleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:title" elements
	 * @param ele - an instance of ChartTitleElement
	 */
	public void visit(ChartTitleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "chart:wall" elements
	 * @param ele - an instance of ChartWallElement
	 */
	public void visit(ChartWallElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "config:config-item" elements
	 * @param ele - an instance of ConfigConfigItemElement
	 */
	public void visit(ConfigConfigItemElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "config:config-item-map-entry" elements
	 * @param ele - an instance of ConfigConfigItemMapEntryElement
	 */
	public void visit(ConfigConfigItemMapEntryElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "config:config-item-map-indexed" elements
	 * @param ele - an instance of ConfigConfigItemMapIndexedElement
	 */
	public void visit(ConfigConfigItemMapIndexedElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "config:config-item-map-named" elements
	 * @param ele - an instance of ConfigConfigItemMapNamedElement
	 */
	public void visit(ConfigConfigItemMapNamedElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "config:config-item-set" elements
	 * @param ele - an instance of ConfigConfigItemSetElement
	 */
	public void visit(ConfigConfigItemSetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "dc:creator" elements
	 * @param ele - an instance of DcCreatorElement
	 */
	public void visit(DcCreatorElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "dc:date" elements
	 * @param ele - an instance of DcDateElement
	 */
	public void visit(DcDateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "dr3d:cube" elements
	 * @param ele - an instance of Dr3dCubeElement
	 */
	public void visit(Dr3dCubeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "dr3d:extrude" elements
	 * @param ele - an instance of Dr3dExtrudeElement
	 */
	public void visit(Dr3dExtrudeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "dr3d:light" elements
	 * @param ele - an instance of Dr3dLightElement
	 */
	public void visit(Dr3dLightElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "dr3d:rotate" elements
	 * @param ele - an instance of Dr3dRotateElement
	 */
	public void visit(Dr3dRotateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "dr3d:scene" elements
	 * @param ele - an instance of Dr3dSceneElement
	 */
	public void visit(Dr3dSceneElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "dr3d:sphere" elements
	 * @param ele - an instance of Dr3dSphereElement
	 */
	public void visit(Dr3dSphereElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:a" elements
	 * @param ele - an instance of DrawAElement
	 */
	public void visit(DrawAElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:applet" elements
	 * @param ele - an instance of DrawAppletElement
	 */
	public void visit(DrawAppletElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:area-circle" elements
	 * @param ele - an instance of DrawAreaCircleElement
	 */
	public void visit(DrawAreaCircleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:area-polygon" elements
	 * @param ele - an instance of DrawAreaPolygonElement
	 */
	public void visit(DrawAreaPolygonElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:area-rectangle" elements
	 * @param ele - an instance of DrawAreaRectangleElement
	 */
	public void visit(DrawAreaRectangleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:caption" elements
	 * @param ele - an instance of DrawCaptionElement
	 */
	public void visit(DrawCaptionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:circle" elements
	 * @param ele - an instance of DrawCircleElement
	 */
	public void visit(DrawCircleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:connector" elements
	 * @param ele - an instance of DrawConnectorElement
	 */
	public void visit(DrawConnectorElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:contour-path" elements
	 * @param ele - an instance of DrawContourPathElement
	 */
	public void visit(DrawContourPathElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:contour-polygon" elements
	 * @param ele - an instance of DrawContourPolygonElement
	 */
	public void visit(DrawContourPolygonElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:control" elements
	 * @param ele - an instance of DrawControlElement
	 */
	public void visit(DrawControlElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:custom-shape" elements
	 * @param ele - an instance of DrawCustomShapeElement
	 */
	public void visit(DrawCustomShapeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:ellipse" elements
	 * @param ele - an instance of DrawEllipseElement
	 */
	public void visit(DrawEllipseElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:enhanced-geometry" elements
	 * @param ele - an instance of DrawEnhancedGeometryElement
	 */
	public void visit(DrawEnhancedGeometryElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:equation" elements
	 * @param ele - an instance of DrawEquationElement
	 */
	public void visit(DrawEquationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:fill-image" elements
	 * @param ele - an instance of DrawFillImageElement
	 */
	public void visit(DrawFillImageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:floating-frame" elements
	 * @param ele - an instance of DrawFloatingFrameElement
	 */
	public void visit(DrawFloatingFrameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:frame" elements
	 * @param ele - an instance of DrawFrameElement
	 */
	public void visit(DrawFrameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:g" elements
	 * @param ele - an instance of DrawGElement
	 */
	public void visit(DrawGElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:glue-point" elements
	 * @param ele - an instance of DrawGluePointElement
	 */
	public void visit(DrawGluePointElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:gradient" elements
	 * @param ele - an instance of DrawGradientElement
	 */
	public void visit(DrawGradientElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:handle" elements
	 * @param ele - an instance of DrawHandleElement
	 */
	public void visit(DrawHandleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:hatch" elements
	 * @param ele - an instance of DrawHatchElement
	 */
	public void visit(DrawHatchElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:image" elements
	 * @param ele - an instance of DrawImageElement
	 */
	public void visit(DrawImageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:image-map" elements
	 * @param ele - an instance of DrawImageMapElement
	 */
	public void visit(DrawImageMapElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:layer" elements
	 * @param ele - an instance of DrawLayerElement
	 */
	public void visit(DrawLayerElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:layer-set" elements
	 * @param ele - an instance of DrawLayerSetElement
	 */
	public void visit(DrawLayerSetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:line" elements
	 * @param ele - an instance of DrawLineElement
	 */
	public void visit(DrawLineElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:marker" elements
	 * @param ele - an instance of DrawMarkerElement
	 */
	public void visit(DrawMarkerElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:measure" elements
	 * @param ele - an instance of DrawMeasureElement
	 */
	public void visit(DrawMeasureElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:object" elements
	 * @param ele - an instance of DrawObjectElement
	 */
	public void visit(DrawObjectElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:object-ole" elements
	 * @param ele - an instance of DrawObjectOleElement
	 */
	public void visit(DrawObjectOleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:opacity" elements
	 * @param ele - an instance of DrawOpacityElement
	 */
	public void visit(DrawOpacityElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:page" elements
	 * @param ele - an instance of DrawPageElement
	 */
	public void visit(DrawPageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:page-thumbnail" elements
	 * @param ele - an instance of DrawPageThumbnailElement
	 */
	public void visit(DrawPageThumbnailElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:param" elements
	 * @param ele - an instance of DrawParamElement
	 */
	public void visit(DrawParamElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:path" elements
	 * @param ele - an instance of DrawPathElement
	 */
	public void visit(DrawPathElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:plugin" elements
	 * @param ele - an instance of DrawPluginElement
	 */
	public void visit(DrawPluginElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:polygon" elements
	 * @param ele - an instance of DrawPolygonElement
	 */
	public void visit(DrawPolygonElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:polyline" elements
	 * @param ele - an instance of DrawPolylineElement
	 */
	public void visit(DrawPolylineElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:rect" elements
	 * @param ele - an instance of DrawRectElement
	 */
	public void visit(DrawRectElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:regular-polygon" elements
	 * @param ele - an instance of DrawRegularPolygonElement
	 */
	public void visit(DrawRegularPolygonElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:stroke-dash" elements
	 * @param ele - an instance of DrawStrokeDashElement
	 */
	public void visit(DrawStrokeDashElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "draw:text-box" elements
	 * @param ele - an instance of DrawTextBoxElement
	 */
	public void visit(DrawTextBoxElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:button" elements
	 * @param ele - an instance of FormButtonElement
	 */
	public void visit(FormButtonElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:checkbox" elements
	 * @param ele - an instance of FormCheckboxElement
	 */
	public void visit(FormCheckboxElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:column" elements
	 * @param ele - an instance of FormColumnElement
	 */
	public void visit(FormColumnElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:combobox" elements
	 * @param ele - an instance of FormComboboxElement
	 */
	public void visit(FormComboboxElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:connection-resource" elements
	 * @param ele - an instance of FormConnectionResourceElement
	 */
	public void visit(FormConnectionResourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:date" elements
	 * @param ele - an instance of FormDateElement
	 */
	public void visit(FormDateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:file" elements
	 * @param ele - an instance of FormFileElement
	 */
	public void visit(FormFileElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:fixed-text" elements
	 * @param ele - an instance of FormFixedTextElement
	 */
	public void visit(FormFixedTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:form" elements
	 * @param ele - an instance of FormFormElement
	 */
	public void visit(FormFormElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:formatted-text" elements
	 * @param ele - an instance of FormFormattedTextElement
	 */
	public void visit(FormFormattedTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:frame" elements
	 * @param ele - an instance of FormFrameElement
	 */
	public void visit(FormFrameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:generic-control" elements
	 * @param ele - an instance of FormGenericControlElement
	 */
	public void visit(FormGenericControlElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:grid" elements
	 * @param ele - an instance of FormGridElement
	 */
	public void visit(FormGridElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:hidden" elements
	 * @param ele - an instance of FormHiddenElement
	 */
	public void visit(FormHiddenElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:image" elements
	 * @param ele - an instance of FormImageElement
	 */
	public void visit(FormImageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:image-frame" elements
	 * @param ele - an instance of FormImageFrameElement
	 */
	public void visit(FormImageFrameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:item" elements
	 * @param ele - an instance of FormItemElement
	 */
	public void visit(FormItemElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:list-property" elements
	 * @param ele - an instance of FormListPropertyElement
	 */
	public void visit(FormListPropertyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:list-value" elements
	 * @param ele - an instance of FormListValueElement
	 */
	public void visit(FormListValueElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:listbox" elements
	 * @param ele - an instance of FormListboxElement
	 */
	public void visit(FormListboxElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:number" elements
	 * @param ele - an instance of FormNumberElement
	 */
	public void visit(FormNumberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:option" elements
	 * @param ele - an instance of FormOptionElement
	 */
	public void visit(FormOptionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:password" elements
	 * @param ele - an instance of FormPasswordElement
	 */
	public void visit(FormPasswordElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:properties" elements
	 * @param ele - an instance of FormPropertiesElement
	 */
	public void visit(FormPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:property" elements
	 * @param ele - an instance of FormPropertyElement
	 */
	public void visit(FormPropertyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:radio" elements
	 * @param ele - an instance of FormRadioElement
	 */
	public void visit(FormRadioElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:text" elements
	 * @param ele - an instance of FormTextElement
	 */
	public void visit(FormTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:textarea" elements
	 * @param ele - an instance of FormTextareaElement
	 */
	public void visit(FormTextareaElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:time" elements
	 * @param ele - an instance of FormTimeElement
	 */
	public void visit(FormTimeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "form:value-range" elements
	 * @param ele - an instance of FormValueRangeElement
	 */
	public void visit(FormValueRangeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "math:math" elements
	 * @param ele - an instance of MathMathElement
	 */
	public void visit(MathMathElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "meta:date-string" elements
	 * @param ele - an instance of MetaDateStringElement
	 */
	public void visit(MetaDateStringElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:am-pm" elements
	 * @param ele - an instance of NumberAmPmElement
	 */
	public void visit(NumberAmPmElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:boolean" elements
	 * @param ele - an instance of NumberBooleanElement
	 */
	public void visit(NumberBooleanElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:boolean-style" elements
	 * @param ele - an instance of NumberBooleanStyleElement
	 */
	public void visit(NumberBooleanStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:currency-style" elements
	 * @param ele - an instance of NumberCurrencyStyleElement
	 */
	public void visit(NumberCurrencyStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:currency-symbol" elements
	 * @param ele - an instance of NumberCurrencySymbolElement
	 */
	public void visit(NumberCurrencySymbolElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:date-style" elements
	 * @param ele - an instance of NumberDateStyleElement
	 */
	public void visit(NumberDateStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:day" elements
	 * @param ele - an instance of NumberDayElement
	 */
	public void visit(NumberDayElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:day-of-week" elements
	 * @param ele - an instance of NumberDayOfWeekElement
	 */
	public void visit(NumberDayOfWeekElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:embedded-text" elements
	 * @param ele - an instance of NumberEmbeddedTextElement
	 */
	public void visit(NumberEmbeddedTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:era" elements
	 * @param ele - an instance of NumberEraElement
	 */
	public void visit(NumberEraElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:fraction" elements
	 * @param ele - an instance of NumberFractionElement
	 */
	public void visit(NumberFractionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:hours" elements
	 * @param ele - an instance of NumberHoursElement
	 */
	public void visit(NumberHoursElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:minutes" elements
	 * @param ele - an instance of NumberMinutesElement
	 */
	public void visit(NumberMinutesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:month" elements
	 * @param ele - an instance of NumberMonthElement
	 */
	public void visit(NumberMonthElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:number" elements
	 * @param ele - an instance of NumberNumberElement
	 */
	public void visit(NumberNumberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:number-style" elements
	 * @param ele - an instance of NumberNumberStyleElement
	 */
	public void visit(NumberNumberStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:percentage-style" elements
	 * @param ele - an instance of NumberPercentageStyleElement
	 */
	public void visit(NumberPercentageStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:quarter" elements
	 * @param ele - an instance of NumberQuarterElement
	 */
	public void visit(NumberQuarterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:scientific-number" elements
	 * @param ele - an instance of NumberScientificNumberElement
	 */
	public void visit(NumberScientificNumberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:seconds" elements
	 * @param ele - an instance of NumberSecondsElement
	 */
	public void visit(NumberSecondsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:text" elements
	 * @param ele - an instance of NumberTextElement
	 */
	public void visit(NumberTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:text-content" elements
	 * @param ele - an instance of NumberTextContentElement
	 */
	public void visit(NumberTextContentElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:text-style" elements
	 * @param ele - an instance of NumberTextStyleElement
	 */
	public void visit(NumberTextStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:time-style" elements
	 * @param ele - an instance of NumberTimeStyleElement
	 */
	public void visit(NumberTimeStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:week-of-year" elements
	 * @param ele - an instance of NumberWeekOfYearElement
	 */
	public void visit(NumberWeekOfYearElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "number:year" elements
	 * @param ele - an instance of NumberYearElement
	 */
	public void visit(NumberYearElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:annotation" elements
	 * @param ele - an instance of OfficeAnnotationElement
	 */
	public void visit(OfficeAnnotationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:automatic-styles" elements
	 * @param ele - an instance of OfficeAutomaticStylesElement
	 */
	public void visit(OfficeAutomaticStylesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:binary-data" elements
	 * @param ele - an instance of OfficeBinaryDataElement
	 */
	public void visit(OfficeBinaryDataElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:body" elements
	 * @param ele - an instance of OfficeBodyElement
	 */
	public void visit(OfficeBodyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:change-info" elements
	 * @param ele - an instance of OfficeChangeInfoElement
	 */
	public void visit(OfficeChangeInfoElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:chart" elements
	 * @param ele - an instance of OfficeChartElement
	 */
	public void visit(OfficeChartElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:dde-source" elements
	 * @param ele - an instance of OfficeDdeSourceElement
	 */
	public void visit(OfficeDdeSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:document" elements
	 * @param ele - an instance of OfficeDocumentElement
	 */
	public void visit(OfficeDocumentElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:document-content" elements
	 * @param ele - an instance of OfficeDocumentContentElement
	 */
	public void visit(OfficeDocumentContentElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:document-meta" elements
	 * @param ele - an instance of OfficeDocumentMetaElement
	 */
	public void visit(OfficeDocumentMetaElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:document-settings" elements
	 * @param ele - an instance of OfficeDocumentSettingsElement
	 */
	public void visit(OfficeDocumentSettingsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:document-styles" elements
	 * @param ele - an instance of OfficeDocumentStylesElement
	 */
	public void visit(OfficeDocumentStylesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:drawing" elements
	 * @param ele - an instance of OfficeDrawingElement
	 */
	public void visit(OfficeDrawingElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:event-listeners" elements
	 * @param ele - an instance of OfficeEventListenersElement
	 */
	public void visit(OfficeEventListenersElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:font-face-decls" elements
	 * @param ele - an instance of OfficeFontFaceDeclsElement
	 */
	public void visit(OfficeFontFaceDeclsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:forms" elements
	 * @param ele - an instance of OfficeFormsElement
	 */
	public void visit(OfficeFormsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:image" elements
	 * @param ele - an instance of OfficeImageElement
	 */
	public void visit(OfficeImageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:master-styles" elements
	 * @param ele - an instance of OfficeMasterStylesElement
	 */
	public void visit(OfficeMasterStylesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:meta" elements
	 * @param ele - an instance of OfficeMetaElement
	 */
	public void visit(OfficeMetaElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:presentation" elements
	 * @param ele - an instance of OfficePresentationElement
	 */
	public void visit(OfficePresentationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:script" elements
	 * @param ele - an instance of OfficeScriptElement
	 */
	public void visit(OfficeScriptElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:scripts" elements
	 * @param ele - an instance of OfficeScriptsElement
	 */
	public void visit(OfficeScriptsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:settings" elements
	 * @param ele - an instance of OfficeSettingsElement
	 */
	public void visit(OfficeSettingsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:spreadsheet" elements
	 * @param ele - an instance of OfficeSpreadsheetElement
	 */
	public void visit(OfficeSpreadsheetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:styles" elements
	 * @param ele - an instance of OfficeStylesElement
	 */
	public void visit(OfficeStylesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "office:text" elements
	 * @param ele - an instance of OfficeTextElement
	 */
	public void visit(OfficeTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:animation-group" elements
	 * @param ele - an instance of PresentationAnimationGroupElement
	 */
	public void visit(PresentationAnimationGroupElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:animations" elements
	 * @param ele - an instance of PresentationAnimationsElement
	 */
	public void visit(PresentationAnimationsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:date-time" elements
	 * @param ele - an instance of PresentationDateTimeElement
	 */
	public void visit(PresentationDateTimeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:date-time-decl" elements
	 * @param ele - an instance of PresentationDateTimeDeclElement
	 */
	public void visit(PresentationDateTimeDeclElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:dim" elements
	 * @param ele - an instance of PresentationDimElement
	 */
	public void visit(PresentationDimElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:event-listener" elements
	 * @param ele - an instance of PresentationEventListenerElement
	 */
	public void visit(PresentationEventListenerElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:footer" elements
	 * @param ele - an instance of PresentationFooterElement
	 */
	public void visit(PresentationFooterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:footer-decl" elements
	 * @param ele - an instance of PresentationFooterDeclElement
	 */
	public void visit(PresentationFooterDeclElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:header" elements
	 * @param ele - an instance of PresentationHeaderElement
	 */
	public void visit(PresentationHeaderElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:header-decl" elements
	 * @param ele - an instance of PresentationHeaderDeclElement
	 */
	public void visit(PresentationHeaderDeclElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:hide-shape" elements
	 * @param ele - an instance of PresentationHideShapeElement
	 */
	public void visit(PresentationHideShapeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:hide-text" elements
	 * @param ele - an instance of PresentationHideTextElement
	 */
	public void visit(PresentationHideTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:notes" elements
	 * @param ele - an instance of PresentationNotesElement
	 */
	public void visit(PresentationNotesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:placeholder" elements
	 * @param ele - an instance of PresentationPlaceholderElement
	 */
	public void visit(PresentationPlaceholderElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:play" elements
	 * @param ele - an instance of PresentationPlayElement
	 */
	public void visit(PresentationPlayElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:settings" elements
	 * @param ele - an instance of PresentationSettingsElement
	 */
	public void visit(PresentationSettingsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:show" elements
	 * @param ele - an instance of PresentationShowElement
	 */
	public void visit(PresentationShowElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:show-shape" elements
	 * @param ele - an instance of PresentationShowShapeElement
	 */
	public void visit(PresentationShowShapeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:show-text" elements
	 * @param ele - an instance of PresentationShowTextElement
	 */
	public void visit(PresentationShowTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "presentation:sound" elements
	 * @param ele - an instance of PresentationSoundElement
	 */
	public void visit(PresentationSoundElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "script:event-listener" elements
	 * @param ele - an instance of ScriptEventListenerElement
	 */
	public void visit(ScriptEventListenerElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:chart-properties" elements
	 * @param ele - an instance of StyleChartPropertiesElement
	 */
	public void visit(StyleChartPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:default-style" elements
	 * @param ele - an instance of StyleDefaultStyleElement
	 */
	public void visit(StyleDefaultStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:drawing-page-properties" elements
	 * @param ele - an instance of StyleDrawingPagePropertiesElement
	 */
	public void visit(StyleDrawingPagePropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:font-face" elements
	 * @param ele - an instance of StyleFontFaceElement
	 */
	public void visit(StyleFontFaceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:footer" elements
	 * @param ele - an instance of StyleFooterElement
	 */
	public void visit(StyleFooterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:footer-left" elements
	 * @param ele - an instance of StyleFooterLeftElement
	 */
	public void visit(StyleFooterLeftElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:footer-style" elements
	 * @param ele - an instance of StyleFooterStyleElement
	 */
	public void visit(StyleFooterStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:graphic-properties" elements
	 * @param ele - an instance of StyleGraphicPropertiesElement
	 */
	public void visit(StyleGraphicPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:handout-master" elements
	 * @param ele - an instance of StyleHandoutMasterElement
	 */
	public void visit(StyleHandoutMasterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:header" elements
	 * @param ele - an instance of StyleHeaderElement
	 */
	public void visit(StyleHeaderElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:header-footer-properties" elements
	 * @param ele - an instance of StyleHeaderFooterPropertiesElement
	 */
	public void visit(StyleHeaderFooterPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:header-left" elements
	 * @param ele - an instance of StyleHeaderLeftElement
	 */
	public void visit(StyleHeaderLeftElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:header-style" elements
	 * @param ele - an instance of StyleHeaderStyleElement
	 */
	public void visit(StyleHeaderStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:list-level-properties" elements
	 * @param ele - an instance of StyleListLevelPropertiesElement
	 */
	public void visit(StyleListLevelPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:map" elements
	 * @param ele - an instance of StyleMapElement
	 */
	public void visit(StyleMapElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:master-page" elements
	 * @param ele - an instance of StyleMasterPageElement
	 */
	public void visit(StyleMasterPageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:page-layout" elements
	 * @param ele - an instance of StylePageLayoutElement
	 */
	public void visit(StylePageLayoutElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:page-layout-properties" elements
	 * @param ele - an instance of StylePageLayoutPropertiesElement
	 */
	public void visit(StylePageLayoutPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:paragraph-properties" elements
	 * @param ele - an instance of StyleParagraphPropertiesElement
	 */
	public void visit(StyleParagraphPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:presentation-page-layout" elements
	 * @param ele - an instance of StylePresentationPageLayoutElement
	 */
	public void visit(StylePresentationPageLayoutElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:region-center" elements
	 * @param ele - an instance of StyleRegionCenterElement
	 */
	public void visit(StyleRegionCenterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:region-left" elements
	 * @param ele - an instance of StyleRegionLeftElement
	 */
	public void visit(StyleRegionLeftElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:region-right" elements
	 * @param ele - an instance of StyleRegionRightElement
	 */
	public void visit(StyleRegionRightElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:ruby-properties" elements
	 * @param ele - an instance of StyleRubyPropertiesElement
	 */
	public void visit(StyleRubyPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:section-properties" elements
	 * @param ele - an instance of StyleSectionPropertiesElement
	 */
	public void visit(StyleSectionPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:style" elements
	 * @param ele - an instance of StyleStyleElement
	 */
	public void visit(StyleStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:table-cell-properties" elements
	 * @param ele - an instance of StyleTableCellPropertiesElement
	 */
	public void visit(StyleTableCellPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:table-column-properties" elements
	 * @param ele - an instance of StyleTableColumnPropertiesElement
	 */
	public void visit(StyleTableColumnPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:table-properties" elements
	 * @param ele - an instance of StyleTablePropertiesElement
	 */
	public void visit(StyleTablePropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:table-row-properties" elements
	 * @param ele - an instance of StyleTableRowPropertiesElement
	 */
	public void visit(StyleTableRowPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "style:text-properties" elements
	 * @param ele - an instance of StyleTextPropertiesElement
	 */
	public void visit(StyleTextPropertiesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "svg:definition-src" elements
	 * @param ele - an instance of SvgDefinitionSrcElement
	 */
	public void visit(SvgDefinitionSrcElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "svg:desc" elements
	 * @param ele - an instance of SvgDescElement
	 */
	public void visit(SvgDescElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "svg:font-face-format" elements
	 * @param ele - an instance of SvgFontFaceFormatElement
	 */
	public void visit(SvgFontFaceFormatElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "svg:font-face-name" elements
	 * @param ele - an instance of SvgFontFaceNameElement
	 */
	public void visit(SvgFontFaceNameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "svg:font-face-src" elements
	 * @param ele - an instance of SvgFontFaceSrcElement
	 */
	public void visit(SvgFontFaceSrcElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "svg:font-face-uri" elements
	 * @param ele - an instance of SvgFontFaceUriElement
	 */
	public void visit(SvgFontFaceUriElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "svg:linearGradient" elements
	 * @param ele - an instance of SvgLinearGradientElement
	 */
	public void visit(SvgLinearGradientElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "svg:radialGradient" elements
	 * @param ele - an instance of SvgRadialGradientElement
	 */
	public void visit(SvgRadialGradientElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "svg:stop" elements
	 * @param ele - an instance of SvgStopElement
	 */
	public void visit(SvgStopElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:calculation-settings" elements
	 * @param ele - an instance of TableCalculationSettingsElement
	 */
	public void visit(TableCalculationSettingsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:cell-address" elements
	 * @param ele - an instance of TableCellAddressElement
	 */
	public void visit(TableCellAddressElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:cell-content-change" elements
	 * @param ele - an instance of TableCellContentChangeElement
	 */
	public void visit(TableCellContentChangeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:cell-content-deletion" elements
	 * @param ele - an instance of TableCellContentDeletionElement
	 */
	public void visit(TableCellContentDeletionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:cell-range-source" elements
	 * @param ele - an instance of TableCellRangeSourceElement
	 */
	public void visit(TableCellRangeSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:change-deletion" elements
	 * @param ele - an instance of TableChangeDeletionElement
	 */
	public void visit(TableChangeDeletionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:change-track-table-cell" elements
	 * @param ele - an instance of TableChangeTrackTableCellElement
	 */
	public void visit(TableChangeTrackTableCellElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:consolidation" elements
	 * @param ele - an instance of TableConsolidationElement
	 */
	public void visit(TableConsolidationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:content-validation" elements
	 * @param ele - an instance of TableContentValidationElement
	 */
	public void visit(TableContentValidationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:content-validations" elements
	 * @param ele - an instance of TableContentValidationsElement
	 */
	public void visit(TableContentValidationsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:covered-table-cell" elements
	 * @param ele - an instance of TableCoveredTableCellElement
	 */
	public void visit(TableCoveredTableCellElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:cut-offs" elements
	 * @param ele - an instance of TableCutOffsElement
	 */
	public void visit(TableCutOffsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-display-info" elements
	 * @param ele - an instance of TableDataPilotDisplayInfoElement
	 */
	public void visit(TableDataPilotDisplayInfoElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-field" elements
	 * @param ele - an instance of TableDataPilotFieldElement
	 */
	public void visit(TableDataPilotFieldElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-field-reference" elements
	 * @param ele - an instance of TableDataPilotFieldReferenceElement
	 */
	public void visit(TableDataPilotFieldReferenceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-group" elements
	 * @param ele - an instance of TableDataPilotGroupElement
	 */
	public void visit(TableDataPilotGroupElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-group-member" elements
	 * @param ele - an instance of TableDataPilotGroupMemberElement
	 */
	public void visit(TableDataPilotGroupMemberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-groups" elements
	 * @param ele - an instance of TableDataPilotGroupsElement
	 */
	public void visit(TableDataPilotGroupsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-layout-info" elements
	 * @param ele - an instance of TableDataPilotLayoutInfoElement
	 */
	public void visit(TableDataPilotLayoutInfoElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-level" elements
	 * @param ele - an instance of TableDataPilotLevelElement
	 */
	public void visit(TableDataPilotLevelElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-member" elements
	 * @param ele - an instance of TableDataPilotMemberElement
	 */
	public void visit(TableDataPilotMemberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-members" elements
	 * @param ele - an instance of TableDataPilotMembersElement
	 */
	public void visit(TableDataPilotMembersElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-sort-info" elements
	 * @param ele - an instance of TableDataPilotSortInfoElement
	 */
	public void visit(TableDataPilotSortInfoElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-subtotal" elements
	 * @param ele - an instance of TableDataPilotSubtotalElement
	 */
	public void visit(TableDataPilotSubtotalElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-subtotals" elements
	 * @param ele - an instance of TableDataPilotSubtotalsElement
	 */
	public void visit(TableDataPilotSubtotalsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-table" elements
	 * @param ele - an instance of TableDataPilotTableElement
	 */
	public void visit(TableDataPilotTableElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:data-pilot-tables" elements
	 * @param ele - an instance of TableDataPilotTablesElement
	 */
	public void visit(TableDataPilotTablesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:database-range" elements
	 * @param ele - an instance of TableDatabaseRangeElement
	 */
	public void visit(TableDatabaseRangeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:database-ranges" elements
	 * @param ele - an instance of TableDatabaseRangesElement
	 */
	public void visit(TableDatabaseRangesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:database-source-query" elements
	 * @param ele - an instance of TableDatabaseSourceQueryElement
	 */
	public void visit(TableDatabaseSourceQueryElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:database-source-sql" elements
	 * @param ele - an instance of TableDatabaseSourceSqlElement
	 */
	public void visit(TableDatabaseSourceSqlElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:database-source-table" elements
	 * @param ele - an instance of TableDatabaseSourceTableElement
	 */
	public void visit(TableDatabaseSourceTableElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:dde-link" elements
	 * @param ele - an instance of TableDdeLinkElement
	 */
	public void visit(TableDdeLinkElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:dde-links" elements
	 * @param ele - an instance of TableDdeLinksElement
	 */
	public void visit(TableDdeLinksElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:deletion" elements
	 * @param ele - an instance of TableDeletionElement
	 */
	public void visit(TableDeletionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:deletions" elements
	 * @param ele - an instance of TableDeletionsElement
	 */
	public void visit(TableDeletionsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:dependencies" elements
	 * @param ele - an instance of TableDependenciesElement
	 */
	public void visit(TableDependenciesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:dependency" elements
	 * @param ele - an instance of TableDependencyElement
	 */
	public void visit(TableDependencyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:detective" elements
	 * @param ele - an instance of TableDetectiveElement
	 */
	public void visit(TableDetectiveElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:error-macro" elements
	 * @param ele - an instance of TableErrorMacroElement
	 */
	public void visit(TableErrorMacroElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:error-message" elements
	 * @param ele - an instance of TableErrorMessageElement
	 */
	public void visit(TableErrorMessageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:filter" elements
	 * @param ele - an instance of TableFilterElement
	 */
	public void visit(TableFilterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:filter-and" elements
	 * @param ele - an instance of TableFilterAndElement
	 */
	public void visit(TableFilterAndElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:filter-condition" elements
	 * @param ele - an instance of TableFilterConditionElement
	 */
	public void visit(TableFilterConditionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:filter-or" elements
	 * @param ele - an instance of TableFilterOrElement
	 */
	public void visit(TableFilterOrElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:help-message" elements
	 * @param ele - an instance of TableHelpMessageElement
	 */
	public void visit(TableHelpMessageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:highlighted-range" elements
	 * @param ele - an instance of TableHighlightedRangeElement
	 */
	public void visit(TableHighlightedRangeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:insertion" elements
	 * @param ele - an instance of TableInsertionElement
	 */
	public void visit(TableInsertionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:insertion-cut-off" elements
	 * @param ele - an instance of TableInsertionCutOffElement
	 */
	public void visit(TableInsertionCutOffElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:iteration" elements
	 * @param ele - an instance of TableIterationElement
	 */
	public void visit(TableIterationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:label-range" elements
	 * @param ele - an instance of TableLabelRangeElement
	 */
	public void visit(TableLabelRangeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:label-ranges" elements
	 * @param ele - an instance of TableLabelRangesElement
	 */
	public void visit(TableLabelRangesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:movement" elements
	 * @param ele - an instance of TableMovementElement
	 */
	public void visit(TableMovementElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:movement-cut-off" elements
	 * @param ele - an instance of TableMovementCutOffElement
	 */
	public void visit(TableMovementCutOffElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:named-expression" elements
	 * @param ele - an instance of TableNamedExpressionElement
	 */
	public void visit(TableNamedExpressionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:named-expressions" elements
	 * @param ele - an instance of TableNamedExpressionsElement
	 */
	public void visit(TableNamedExpressionsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:named-range" elements
	 * @param ele - an instance of TableNamedRangeElement
	 */
	public void visit(TableNamedRangeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:null-date" elements
	 * @param ele - an instance of TableNullDateElement
	 */
	public void visit(TableNullDateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:operation" elements
	 * @param ele - an instance of TableOperationElement
	 */
	public void visit(TableOperationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:previous" elements
	 * @param ele - an instance of TablePreviousElement
	 */
	public void visit(TablePreviousElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:scenario" elements
	 * @param ele - an instance of TableScenarioElement
	 */
	public void visit(TableScenarioElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:shapes" elements
	 * @param ele - an instance of TableShapesElement
	 */
	public void visit(TableShapesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:sort" elements
	 * @param ele - an instance of TableSortElement
	 */
	public void visit(TableSortElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:sort-by" elements
	 * @param ele - an instance of TableSortByElement
	 */
	public void visit(TableSortByElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:sort-groups" elements
	 * @param ele - an instance of TableSortGroupsElement
	 */
	public void visit(TableSortGroupsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:source-cell-range" elements
	 * @param ele - an instance of TableSourceCellRangeElement
	 */
	public void visit(TableSourceCellRangeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:source-range-address" elements
	 * @param ele - an instance of TableSourceRangeAddressElement
	 */
	public void visit(TableSourceRangeAddressElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:source-service" elements
	 * @param ele - an instance of TableSourceServiceElement
	 */
	public void visit(TableSourceServiceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:subtotal-field" elements
	 * @param ele - an instance of TableSubtotalFieldElement
	 */
	public void visit(TableSubtotalFieldElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:subtotal-rule" elements
	 * @param ele - an instance of TableSubtotalRuleElement
	 */
	public void visit(TableSubtotalRuleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:subtotal-rules" elements
	 * @param ele - an instance of TableSubtotalRulesElement
	 */
	public void visit(TableSubtotalRulesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table" elements
	 * @param ele - an instance of TableTableElement
	 */
	public void visit(TableTableElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-cell" elements
	 * @param ele - an instance of TableTableCellElement
	 */
	public void visit(TableTableCellElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-column" elements
	 * @param ele - an instance of TableTableColumnElement
	 */
	public void visit(TableTableColumnElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-column-group" elements
	 * @param ele - an instance of TableTableColumnGroupElement
	 */
	public void visit(TableTableColumnGroupElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-columns" elements
	 * @param ele - an instance of TableTableColumnsElement
	 */
	public void visit(TableTableColumnsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-header-columns" elements
	 * @param ele - an instance of TableTableHeaderColumnsElement
	 */
	public void visit(TableTableHeaderColumnsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-header-rows" elements
	 * @param ele - an instance of TableTableHeaderRowsElement
	 */
	public void visit(TableTableHeaderRowsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-row" elements
	 * @param ele - an instance of TableTableRowElement
	 */
	public void visit(TableTableRowElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-row-group" elements
	 * @param ele - an instance of TableTableRowGroupElement
	 */
	public void visit(TableTableRowGroupElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-rows" elements
	 * @param ele - an instance of TableTableRowsElement
	 */
	public void visit(TableTableRowsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:table-source" elements
	 * @param ele - an instance of TableTableSourceElement
	 */
	public void visit(TableTableSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:target-range-address" elements
	 * @param ele - an instance of TableTargetRangeAddressElement
	 */
	public void visit(TableTargetRangeAddressElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "table:tracked-changes" elements
	 * @param ele - an instance of TableTrackedChangesElement
	 */
	public void visit(TableTrackedChangesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:a" elements
	 * @param ele - an instance of TextAElement
	 */
	public void visit(TextAElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:alphabetical-index" elements
	 * @param ele - an instance of TextAlphabeticalIndexElement
	 */
	public void visit(TextAlphabeticalIndexElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:alphabetical-index-auto-mark-file" elements
	 * @param ele - an instance of TextAlphabeticalIndexAutoMarkFileElement
	 */
	public void visit(TextAlphabeticalIndexAutoMarkFileElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:alphabetical-index-entry-template" elements
	 * @param ele - an instance of TextAlphabeticalIndexEntryTemplateElement
	 */
	public void visit(TextAlphabeticalIndexEntryTemplateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:alphabetical-index-mark" elements
	 * @param ele - an instance of TextAlphabeticalIndexMarkElement
	 */
	public void visit(TextAlphabeticalIndexMarkElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:alphabetical-index-mark-end" elements
	 * @param ele - an instance of TextAlphabeticalIndexMarkEndElement
	 */
	public void visit(TextAlphabeticalIndexMarkEndElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:alphabetical-index-mark-start" elements
	 * @param ele - an instance of TextAlphabeticalIndexMarkStartElement
	 */
	public void visit(TextAlphabeticalIndexMarkStartElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:alphabetical-index-source" elements
	 * @param ele - an instance of TextAlphabeticalIndexSourceElement
	 */
	public void visit(TextAlphabeticalIndexSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:author-initials" elements
	 * @param ele - an instance of TextAuthorInitialsElement
	 */
	public void visit(TextAuthorInitialsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:author-name" elements
	 * @param ele - an instance of TextAuthorNameElement
	 */
	public void visit(TextAuthorNameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:bibliography" elements
	 * @param ele - an instance of TextBibliographyElement
	 */
	public void visit(TextBibliographyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:bibliography-configuration" elements
	 * @param ele - an instance of TextBibliographyConfigurationElement
	 */
	public void visit(TextBibliographyConfigurationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:bibliography-entry-template" elements
	 * @param ele - an instance of TextBibliographyEntryTemplateElement
	 */
	public void visit(TextBibliographyEntryTemplateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:bibliography-mark" elements
	 * @param ele - an instance of TextBibliographyMarkElement
	 */
	public void visit(TextBibliographyMarkElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:bibliography-source" elements
	 * @param ele - an instance of TextBibliographySourceElement
	 */
	public void visit(TextBibliographySourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:bookmark" elements
	 * @param ele - an instance of TextBookmarkElement
	 */
	public void visit(TextBookmarkElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:bookmark-end" elements
	 * @param ele - an instance of TextBookmarkEndElement
	 */
	public void visit(TextBookmarkEndElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:bookmark-ref" elements
	 * @param ele - an instance of TextBookmarkRefElement
	 */
	public void visit(TextBookmarkRefElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:bookmark-start" elements
	 * @param ele - an instance of TextBookmarkStartElement
	 */
	public void visit(TextBookmarkStartElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:change" elements
	 * @param ele - an instance of TextChangeElement
	 */
	public void visit(TextChangeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:change-end" elements
	 * @param ele - an instance of TextChangeEndElement
	 */
	public void visit(TextChangeEndElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:change-start" elements
	 * @param ele - an instance of TextChangeStartElement
	 */
	public void visit(TextChangeStartElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:changed-region" elements
	 * @param ele - an instance of TextChangedRegionElement
	 */
	public void visit(TextChangedRegionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:chapter" elements
	 * @param ele - an instance of TextChapterElement
	 */
	public void visit(TextChapterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:character-count" elements
	 * @param ele - an instance of TextCharacterCountElement
	 */
	public void visit(TextCharacterCountElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:conditional-text" elements
	 * @param ele - an instance of TextConditionalTextElement
	 */
	public void visit(TextConditionalTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:creation-date" elements
	 * @param ele - an instance of TextCreationDateElement
	 */
	public void visit(TextCreationDateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:creation-time" elements
	 * @param ele - an instance of TextCreationTimeElement
	 */
	public void visit(TextCreationTimeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:creator" elements
	 * @param ele - an instance of TextCreatorElement
	 */
	public void visit(TextCreatorElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:database-display" elements
	 * @param ele - an instance of TextDatabaseDisplayElement
	 */
	public void visit(TextDatabaseDisplayElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:database-name" elements
	 * @param ele - an instance of TextDatabaseNameElement
	 */
	public void visit(TextDatabaseNameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:database-next" elements
	 * @param ele - an instance of TextDatabaseNextElement
	 */
	public void visit(TextDatabaseNextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:database-row-number" elements
	 * @param ele - an instance of TextDatabaseRowNumberElement
	 */
	public void visit(TextDatabaseRowNumberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:database-row-select" elements
	 * @param ele - an instance of TextDatabaseRowSelectElement
	 */
	public void visit(TextDatabaseRowSelectElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:date" elements
	 * @param ele - an instance of TextDateElement
	 */
	public void visit(TextDateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:dde-connection" elements
	 * @param ele - an instance of TextDdeConnectionElement
	 */
	public void visit(TextDdeConnectionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:dde-connection-decl" elements
	 * @param ele - an instance of TextDdeConnectionDeclElement
	 */
	public void visit(TextDdeConnectionDeclElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:dde-connection-decls" elements
	 * @param ele - an instance of TextDdeConnectionDeclsElement
	 */
	public void visit(TextDdeConnectionDeclsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:deletion" elements
	 * @param ele - an instance of TextDeletionElement
	 */
	public void visit(TextDeletionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:description" elements
	 * @param ele - an instance of TextDescriptionElement
	 */
	public void visit(TextDescriptionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:editing-cycles" elements
	 * @param ele - an instance of TextEditingCyclesElement
	 */
	public void visit(TextEditingCyclesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:editing-duration" elements
	 * @param ele - an instance of TextEditingDurationElement
	 */
	public void visit(TextEditingDurationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:execute-macro" elements
	 * @param ele - an instance of TextExecuteMacroElement
	 */
	public void visit(TextExecuteMacroElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:expression" elements
	 * @param ele - an instance of TextExpressionElement
	 */
	public void visit(TextExpressionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:file-name" elements
	 * @param ele - an instance of TextFileNameElement
	 */
	public void visit(TextFileNameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:format-change" elements
	 * @param ele - an instance of TextFormatChangeElement
	 */
	public void visit(TextFormatChangeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:h" elements
	 * @param ele - an instance of TextHElement
	 */
	public void visit(TextHElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:hidden-paragraph" elements
	 * @param ele - an instance of TextHiddenParagraphElement
	 */
	public void visit(TextHiddenParagraphElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:hidden-text" elements
	 * @param ele - an instance of TextHiddenTextElement
	 */
	public void visit(TextHiddenTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:illustration-index" elements
	 * @param ele - an instance of TextIllustrationIndexElement
	 */
	public void visit(TextIllustrationIndexElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:illustration-index-entry-template" elements
	 * @param ele - an instance of TextIllustrationIndexEntryTemplateElement
	 */
	public void visit(TextIllustrationIndexEntryTemplateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:illustration-index-source" elements
	 * @param ele - an instance of TextIllustrationIndexSourceElement
	 */
	public void visit(TextIllustrationIndexSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:image-count" elements
	 * @param ele - an instance of TextImageCountElement
	 */
	public void visit(TextImageCountElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-body" elements
	 * @param ele - an instance of TextIndexBodyElement
	 */
	public void visit(TextIndexBodyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-entry-bibliography" elements
	 * @param ele - an instance of TextIndexEntryBibliographyElement
	 */
	public void visit(TextIndexEntryBibliographyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-entry-chapter" elements
	 * @param ele - an instance of TextIndexEntryChapterElement
	 */
	public void visit(TextIndexEntryChapterElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-entry-link-end" elements
	 * @param ele - an instance of TextIndexEntryLinkEndElement
	 */
	public void visit(TextIndexEntryLinkEndElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-entry-link-start" elements
	 * @param ele - an instance of TextIndexEntryLinkStartElement
	 */
	public void visit(TextIndexEntryLinkStartElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-entry-page-number" elements
	 * @param ele - an instance of TextIndexEntryPageNumberElement
	 */
	public void visit(TextIndexEntryPageNumberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-entry-span" elements
	 * @param ele - an instance of TextIndexEntrySpanElement
	 */
	public void visit(TextIndexEntrySpanElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-entry-tab-stop" elements
	 * @param ele - an instance of TextIndexEntryTabStopElement
	 */
	public void visit(TextIndexEntryTabStopElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-entry-text" elements
	 * @param ele - an instance of TextIndexEntryTextElement
	 */
	public void visit(TextIndexEntryTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-source-style" elements
	 * @param ele - an instance of TextIndexSourceStyleElement
	 */
	public void visit(TextIndexSourceStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-source-styles" elements
	 * @param ele - an instance of TextIndexSourceStylesElement
	 */
	public void visit(TextIndexSourceStylesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-title" elements
	 * @param ele - an instance of TextIndexTitleElement
	 */
	public void visit(TextIndexTitleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:index-title-template" elements
	 * @param ele - an instance of TextIndexTitleTemplateElement
	 */
	public void visit(TextIndexTitleTemplateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:initial-creator" elements
	 * @param ele - an instance of TextInitialCreatorElement
	 */
	public void visit(TextInitialCreatorElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:insertion" elements
	 * @param ele - an instance of TextInsertionElement
	 */
	public void visit(TextInsertionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:keywords" elements
	 * @param ele - an instance of TextKeywordsElement
	 */
	public void visit(TextKeywordsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:line-break" elements
	 * @param ele - an instance of TextLineBreakElement
	 */
	public void visit(TextLineBreakElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:linenumbering-configuration" elements
	 * @param ele - an instance of TextLinenumberingConfigurationElement
	 */
	public void visit(TextLinenumberingConfigurationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:linenumbering-separator" elements
	 * @param ele - an instance of TextLinenumberingSeparatorElement
	 */
	public void visit(TextLinenumberingSeparatorElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:list" elements
	 * @param ele - an instance of TextListElement
	 */
	public void visit(TextListElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:list-header" elements
	 * @param ele - an instance of TextListHeaderElement
	 */
	public void visit(TextListHeaderElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:list-item" elements
	 * @param ele - an instance of TextListItemElement
	 */
	public void visit(TextListItemElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:list-level-style-bullet" elements
	 * @param ele - an instance of TextListLevelStyleBulletElement
	 */
	public void visit(TextListLevelStyleBulletElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:list-level-style-image" elements
	 * @param ele - an instance of TextListLevelStyleImageElement
	 */
	public void visit(TextListLevelStyleImageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:list-level-style-number" elements
	 * @param ele - an instance of TextListLevelStyleNumberElement
	 */
	public void visit(TextListLevelStyleNumberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:list-style" elements
	 * @param ele - an instance of TextListStyleElement
	 */
	public void visit(TextListStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:measure" elements
	 * @param ele - an instance of TextMeasureElement
	 */
	public void visit(TextMeasureElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:modification-date" elements
	 * @param ele - an instance of TextModificationDateElement
	 */
	public void visit(TextModificationDateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:modification-time" elements
	 * @param ele - an instance of TextModificationTimeElement
	 */
	public void visit(TextModificationTimeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:note" elements
	 * @param ele - an instance of TextNoteElement
	 */
	public void visit(TextNoteElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:note-body" elements
	 * @param ele - an instance of TextNoteBodyElement
	 */
	public void visit(TextNoteBodyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:note-citation" elements
	 * @param ele - an instance of TextNoteCitationElement
	 */
	public void visit(TextNoteCitationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:note-continuation-notice-backward" elements
	 * @param ele - an instance of TextNoteContinuationNoticeBackwardElement
	 */
	public void visit(TextNoteContinuationNoticeBackwardElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:note-continuation-notice-forward" elements
	 * @param ele - an instance of TextNoteContinuationNoticeForwardElement
	 */
	public void visit(TextNoteContinuationNoticeForwardElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:note-ref" elements
	 * @param ele - an instance of TextNoteRefElement
	 */
	public void visit(TextNoteRefElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:notes-configuration" elements
	 * @param ele - an instance of TextNotesConfigurationElement
	 */
	public void visit(TextNotesConfigurationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:number" elements
	 * @param ele - an instance of TextNumberElement
	 */
	public void visit(TextNumberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:numbered-paragraph" elements
	 * @param ele - an instance of TextNumberedParagraphElement
	 */
	public void visit(TextNumberedParagraphElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:object-count" elements
	 * @param ele - an instance of TextObjectCountElement
	 */
	public void visit(TextObjectCountElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:object-index" elements
	 * @param ele - an instance of TextObjectIndexElement
	 */
	public void visit(TextObjectIndexElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:object-index-entry-template" elements
	 * @param ele - an instance of TextObjectIndexEntryTemplateElement
	 */
	public void visit(TextObjectIndexEntryTemplateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:object-index-source" elements
	 * @param ele - an instance of TextObjectIndexSourceElement
	 */
	public void visit(TextObjectIndexSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:outline-level-style" elements
	 * @param ele - an instance of TextOutlineLevelStyleElement
	 */
	public void visit(TextOutlineLevelStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:outline-style" elements
	 * @param ele - an instance of TextOutlineStyleElement
	 */
	public void visit(TextOutlineStyleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:p" elements
	 * @param ele - an instance of TextPElement
	 */
	public void visit(TextPElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:page" elements
	 * @param ele - an instance of TextPageElement
	 */
	public void visit(TextPageElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:page-continuation" elements
	 * @param ele - an instance of TextPageContinuationElement
	 */
	public void visit(TextPageContinuationElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:page-count" elements
	 * @param ele - an instance of TextPageCountElement
	 */
	public void visit(TextPageCountElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:page-number" elements
	 * @param ele - an instance of TextPageNumberElement
	 */
	public void visit(TextPageNumberElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:page-sequence" elements
	 * @param ele - an instance of TextPageSequenceElement
	 */
	public void visit(TextPageSequenceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:page-variable-get" elements
	 * @param ele - an instance of TextPageVariableGetElement
	 */
	public void visit(TextPageVariableGetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:page-variable-set" elements
	 * @param ele - an instance of TextPageVariableSetElement
	 */
	public void visit(TextPageVariableSetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:paragraph-count" elements
	 * @param ele - an instance of TextParagraphCountElement
	 */
	public void visit(TextParagraphCountElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:placeholder" elements
	 * @param ele - an instance of TextPlaceholderElement
	 */
	public void visit(TextPlaceholderElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:print-date" elements
	 * @param ele - an instance of TextPrintDateElement
	 */
	public void visit(TextPrintDateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:print-time" elements
	 * @param ele - an instance of TextPrintTimeElement
	 */
	public void visit(TextPrintTimeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:printed-by" elements
	 * @param ele - an instance of TextPrintedByElement
	 */
	public void visit(TextPrintedByElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:reference-mark" elements
	 * @param ele - an instance of TextReferenceMarkElement
	 */
	public void visit(TextReferenceMarkElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:reference-mark-end" elements
	 * @param ele - an instance of TextReferenceMarkEndElement
	 */
	public void visit(TextReferenceMarkEndElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:reference-mark-start" elements
	 * @param ele - an instance of TextReferenceMarkStartElement
	 */
	public void visit(TextReferenceMarkStartElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:reference-ref" elements
	 * @param ele - an instance of TextReferenceRefElement
	 */
	public void visit(TextReferenceRefElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:ruby" elements
	 * @param ele - an instance of TextRubyElement
	 */
	public void visit(TextRubyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:ruby-base" elements
	 * @param ele - an instance of TextRubyBaseElement
	 */
	public void visit(TextRubyBaseElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:ruby-text" elements
	 * @param ele - an instance of TextRubyTextElement
	 */
	public void visit(TextRubyTextElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:s" elements
	 * @param ele - an instance of TextSElement
	 */
	public void visit(TextSElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:script" elements
	 * @param ele - an instance of TextScriptElement
	 */
	public void visit(TextScriptElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:section" elements
	 * @param ele - an instance of TextSectionElement
	 */
	public void visit(TextSectionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:section-source" elements
	 * @param ele - an instance of TextSectionSourceElement
	 */
	public void visit(TextSectionSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-city" elements
	 * @param ele - an instance of TextSenderCityElement
	 */
	public void visit(TextSenderCityElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-company" elements
	 * @param ele - an instance of TextSenderCompanyElement
	 */
	public void visit(TextSenderCompanyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-country" elements
	 * @param ele - an instance of TextSenderCountryElement
	 */
	public void visit(TextSenderCountryElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-email" elements
	 * @param ele - an instance of TextSenderEmailElement
	 */
	public void visit(TextSenderEmailElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-fax" elements
	 * @param ele - an instance of TextSenderFaxElement
	 */
	public void visit(TextSenderFaxElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-firstname" elements
	 * @param ele - an instance of TextSenderFirstnameElement
	 */
	public void visit(TextSenderFirstnameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-initials" elements
	 * @param ele - an instance of TextSenderInitialsElement
	 */
	public void visit(TextSenderInitialsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-lastname" elements
	 * @param ele - an instance of TextSenderLastnameElement
	 */
	public void visit(TextSenderLastnameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-phone-private" elements
	 * @param ele - an instance of TextSenderPhonePrivateElement
	 */
	public void visit(TextSenderPhonePrivateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-phone-work" elements
	 * @param ele - an instance of TextSenderPhoneWorkElement
	 */
	public void visit(TextSenderPhoneWorkElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-position" elements
	 * @param ele - an instance of TextSenderPositionElement
	 */
	public void visit(TextSenderPositionElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-postal-code" elements
	 * @param ele - an instance of TextSenderPostalCodeElement
	 */
	public void visit(TextSenderPostalCodeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-state-or-province" elements
	 * @param ele - an instance of TextSenderStateOrProvinceElement
	 */
	public void visit(TextSenderStateOrProvinceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-street" elements
	 * @param ele - an instance of TextSenderStreetElement
	 */
	public void visit(TextSenderStreetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sender-title" elements
	 * @param ele - an instance of TextSenderTitleElement
	 */
	public void visit(TextSenderTitleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sequence" elements
	 * @param ele - an instance of TextSequenceElement
	 */
	public void visit(TextSequenceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sequence-decl" elements
	 * @param ele - an instance of TextSequenceDeclElement
	 */
	public void visit(TextSequenceDeclElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sequence-decls" elements
	 * @param ele - an instance of TextSequenceDeclsElement
	 */
	public void visit(TextSequenceDeclsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sequence-ref" elements
	 * @param ele - an instance of TextSequenceRefElement
	 */
	public void visit(TextSequenceRefElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sheet-name" elements
	 * @param ele - an instance of TextSheetNameElement
	 */
	public void visit(TextSheetNameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:sort-key" elements
	 * @param ele - an instance of TextSortKeyElement
	 */
	public void visit(TextSortKeyElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:span" elements
	 * @param ele - an instance of TextSpanElement
	 */
	public void visit(TextSpanElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:subject" elements
	 * @param ele - an instance of TextSubjectElement
	 */
	public void visit(TextSubjectElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:tab" elements
	 * @param ele - an instance of TextTabElement
	 */
	public void visit(TextTabElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:table-count" elements
	 * @param ele - an instance of TextTableCountElement
	 */
	public void visit(TextTableCountElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:table-formula" elements
	 * @param ele - an instance of TextTableFormulaElement
	 */
	public void visit(TextTableFormulaElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:table-index" elements
	 * @param ele - an instance of TextTableIndexElement
	 */
	public void visit(TextTableIndexElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:table-index-entry-template" elements
	 * @param ele - an instance of TextTableIndexEntryTemplateElement
	 */
	public void visit(TextTableIndexEntryTemplateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:table-index-source" elements
	 * @param ele - an instance of TextTableIndexSourceElement
	 */
	public void visit(TextTableIndexSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:table-of-content" elements
	 * @param ele - an instance of TextTableOfContentElement
	 */
	public void visit(TextTableOfContentElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:table-of-content-entry-template" elements
	 * @param ele - an instance of TextTableOfContentEntryTemplateElement
	 */
	public void visit(TextTableOfContentEntryTemplateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:table-of-content-source" elements
	 * @param ele - an instance of TextTableOfContentSourceElement
	 */
	public void visit(TextTableOfContentSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:template-name" elements
	 * @param ele - an instance of TextTemplateNameElement
	 */
	public void visit(TextTemplateNameElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:text-input" elements
	 * @param ele - an instance of TextTextInputElement
	 */
	public void visit(TextTextInputElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:time" elements
	 * @param ele - an instance of TextTimeElement
	 */
	public void visit(TextTimeElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:title" elements
	 * @param ele - an instance of TextTitleElement
	 */
	public void visit(TextTitleElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:toc-mark" elements
	 * @param ele - an instance of TextTocMarkElement
	 */
	public void visit(TextTocMarkElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:toc-mark-end" elements
	 * @param ele - an instance of TextTocMarkEndElement
	 */
	public void visit(TextTocMarkEndElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:toc-mark-start" elements
	 * @param ele - an instance of TextTocMarkStartElement
	 */
	public void visit(TextTocMarkStartElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:tracked-changes" elements
	 * @param ele - an instance of TextTrackedChangesElement
	 */
	public void visit(TextTrackedChangesElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-defined" elements
	 * @param ele - an instance of TextUserDefinedElement
	 */
	public void visit(TextUserDefinedElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-field-decl" elements
	 * @param ele - an instance of TextUserFieldDeclElement
	 */
	public void visit(TextUserFieldDeclElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-field-decls" elements
	 * @param ele - an instance of TextUserFieldDeclsElement
	 */
	public void visit(TextUserFieldDeclsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-field-get" elements
	 * @param ele - an instance of TextUserFieldGetElement
	 */
	public void visit(TextUserFieldGetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-field-input" elements
	 * @param ele - an instance of TextUserFieldInputElement
	 */
	public void visit(TextUserFieldInputElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-index" elements
	 * @param ele - an instance of TextUserIndexElement
	 */
	public void visit(TextUserIndexElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-index-entry-template" elements
	 * @param ele - an instance of TextUserIndexEntryTemplateElement
	 */
	public void visit(TextUserIndexEntryTemplateElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-index-mark" elements
	 * @param ele - an instance of TextUserIndexMarkElement
	 */
	public void visit(TextUserIndexMarkElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-index-mark-end" elements
	 * @param ele - an instance of TextUserIndexMarkEndElement
	 */
	public void visit(TextUserIndexMarkEndElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-index-mark-start" elements
	 * @param ele - an instance of TextUserIndexMarkStartElement
	 */
	public void visit(TextUserIndexMarkStartElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:user-index-source" elements
	 * @param ele - an instance of TextUserIndexSourceElement
	 */
	public void visit(TextUserIndexSourceElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:variable-decl" elements
	 * @param ele - an instance of TextVariableDeclElement
	 */
	public void visit(TextVariableDeclElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:variable-decls" elements
	 * @param ele - an instance of TextVariableDeclsElement
	 */
	public void visit(TextVariableDeclsElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:variable-get" elements
	 * @param ele - an instance of TextVariableGetElement
	 */
	public void visit(TextVariableGetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:variable-input" elements
	 * @param ele - an instance of TextVariableInputElement
	 */
	public void visit(TextVariableInputElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:variable-set" elements
	 * @param ele - an instance of TextVariableSetElement
	 */
	public void visit(TextVariableSetElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "text:word-count" elements
	 * @param ele - an instance of TextWordCountElement
	 */
	public void visit(TextWordCountElement ele) {
		visit((OdfElement) ele);
	}
	/**
	 * A method to visit "xforms:model" elements
	 * @param ele - an instance of XformsModelElement
	 */
	public void visit(XformsModelElement ele) {
		visit((OdfElement) ele);
	}
}
