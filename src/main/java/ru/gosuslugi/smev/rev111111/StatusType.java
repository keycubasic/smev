
package ru.gosuslugi.smev.rev111111;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REQUEST"/>
 *     <enumeration value="RESULT"/>
 *     <enumeration value="REJECT"/>
 *     <enumeration value="INVALID"/>
 *     <enumeration value="ACCEPT"/>
 *     <enumeration value="PING"/>
 *     <enumeration value="PROCESS"/>
 *     <enumeration value="NOTIFY"/>
 *     <enumeration value="FAILURE"/>
 *     <enumeration value="CANCEL"/>
 *     <enumeration value="STATE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatusType")
@XmlEnum
public enum StatusType {

    REQUEST,
    RESULT,
    REJECT,
    INVALID,
    ACCEPT,
    PING,
    PROCESS,
    NOTIFY,
    FAILURE,
    CANCEL,
    STATE;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
