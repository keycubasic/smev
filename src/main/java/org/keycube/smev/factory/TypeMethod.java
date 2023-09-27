package org.keycube.smev.factory;

public enum TypeMethod {

    BR, // bookRequest
    GDV, // getDictionaryValues
    GR, // getResult
    GTT, // getTaskTypes
    PT, // processTask
    SER; // sendErrorReport

    public static TypeMethod fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
