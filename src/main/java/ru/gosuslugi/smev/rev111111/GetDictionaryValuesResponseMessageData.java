
package ru.gosuslugi.smev.rev111111;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import ru.fms.sx.kernel.webservices.border.basetypes.GetDictionaryValuesResponseMessageType;


/**
 * <p>Java class for getDictionaryValuesResponseMessageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getDictionaryValuesResponseMessageData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AppData" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}getDictionaryValuesResponseMessageType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDictionaryValuesResponseMessageData", propOrder = {
    "appData"
})
public class GetDictionaryValuesResponseMessageData {

    @XmlElement(name = "AppData", required = true)
    protected GetDictionaryValuesResponseMessageType appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link GetDictionaryValuesResponseMessageType }
     *     
     */
    public GetDictionaryValuesResponseMessageType getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDictionaryValuesResponseMessageType }
     *     
     */
    public void setAppData(GetDictionaryValuesResponseMessageType value) {
        this.appData = value;
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
