
package ru.fms.sx.kernel.webservices.border.basetypes;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for getTaskTypesResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getTaskTypesResponseMessageType">
 *   <complexContent>
 *     <extension base="{http://baseTypes.border.webservices.kernel.sx.fms.ru}baseResponseMessageType">
 *       <sequence>
 *         <sequence>
 *           <element name="services" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}service" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getTaskTypesResponseMessageType", propOrder = {
    "services"
})
public class GetTaskTypesResponseMessageType
    extends BaseResponseMessageType
{

    @XmlElement(nillable = true)
    protected List<Service> services;

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * 
     * 
     * @return
     *     The value of the services property.
     */
    public List<Service> getServices() {
        if (services == null) {
            services = new ArrayList<>();
        }
        return this.services;
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
