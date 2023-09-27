
package ru.fms.sx.kernel.webservices.border.basetypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for sendErrorReportMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="sendErrorReportMessageType">
 *   <complexContent>
 *     <extension base="{http://baseTypes.border.webservices.kernel.sx.fms.ru}baseRequestMessageType">
 *       <sequence>
 *         <sequence>
 *           <element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           <element name="errorReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "sendErrorReportMessageType", propOrder = {
    "taskId",
    "errorReport"
})
public class SendErrorReportMessageType
    extends BaseRequestMessageType
{

    @XmlElement(required = true)
    protected String taskId;
    @XmlElement(required = true)
    protected String errorReport;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the errorReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorReport() {
        return errorReport;
    }

    /**
     * Sets the value of the errorReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorReport(String value) {
        this.errorReport = value;
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
