
package ru.fms.sx.kernel.webservices.border.basetypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="taskState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHECKING"/>
 *     <enumeration value="PROCESSING"/>
 *     <enumeration value="OPERATOR_ANSWER_WAITING"/>
 *     <enumeration value="DS_WAITING"/>
 *     <enumeration value="READY"/>
 *     <enumeration value="CANCELLED"/>
 *     <enumeration value="RETURNED"/>
 *     <enumeration value="CLOSED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "taskState")
@XmlEnum
public enum TaskState {

    CHECKING,
    PROCESSING,
    OPERATOR_ANSWER_WAITING,
    DS_WAITING,
    READY,
    CANCELLED,
    RETURNED,
    CLOSED;

    public String value() {
        return name();
    }

    public static TaskState fromValue(String v) {
        return valueOf(v);
    }

}
