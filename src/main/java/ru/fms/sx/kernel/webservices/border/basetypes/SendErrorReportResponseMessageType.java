
package ru.fms.sx.kernel.webservices.border.basetypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for sendErrorReportResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="sendErrorReportResponseMessageType">
 *   <complexContent>
 *     <extension base="{http://baseTypes.border.webservices.kernel.sx.fms.ru}baseResponseMessageType">
 *       <sequence>
 *         <sequence>
 *           <element name="errorReportId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         </sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendErrorReportResponseMessageType", propOrder = {
    "errorReportId"
})
public class SendErrorReportResponseMessageType
    extends BaseResponseMessageType
{

    @XmlElement(required = true)
    protected String errorReportId;

    /**
     * Gets the value of the errorReportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorReportId() {
        return errorReportId;
    }

    /**
     * Sets the value of the errorReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorReportId(String value) {
        this.errorReportId = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
