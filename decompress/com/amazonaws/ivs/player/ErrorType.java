// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

public enum ErrorType
{
    ERROR, 
    ERROR_AUTHORIZATION, 
    ERROR_INVALID_DATA, 
    ERROR_INVALID_PARAMETER, 
    ERROR_INVALID_STATE, 
    ERROR_NETWORK, 
    ERROR_NETWORK_IO, 
    ERROR_NOT_AVAILABLE, 
    ERROR_NOT_SUPPORTED, 
    ERROR_NO_SOURCE, 
    ERROR_TIMEOUT, 
    OK;
    
    public static ErrorType fromInt(final int n) {
        if (n >= values().length) {
            return ErrorType.ERROR;
        }
        return values()[n];
    }
}
