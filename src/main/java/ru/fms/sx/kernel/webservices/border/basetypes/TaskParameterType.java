
package ru.fms.sx.kernel.webservices.border.basetypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="taskParameterType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INTEGER"/>
 *     <enumeration value="LONG"/>
 *     <enumeration value="FLOAT"/>
 *     <enumeration value="STRING"/>
 *     <enumeration value="BOOLEAN"/>
 *     <enumeration value="DATE"/>
 *     <enumeration value="TIME"/>
 *     <enumeration value="DATE_TIME"/>
 *     <enumeration value="LIST"/>
 *     <enumeration value="DICT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "taskParameterType")
@XmlEnum
public enum TaskParameterType {

    INTEGER,
    LONG,
    FLOAT,
    STRING,
    BOOLEAN,
    DATE,
    TIME,
    DATE_TIME,
    LIST,
    DICT;

    public String value() {
        return name();
    }

    public static TaskParameterType fromValue(String v) {
        return valueOf(v);
    }

}
