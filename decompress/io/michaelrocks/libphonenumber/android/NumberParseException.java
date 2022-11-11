// 
// Decompiled by Procyon v0.6.0
// 

package io.michaelrocks.libphonenumber.android;

public class NumberParseException extends Exception
{
    private ErrorType errorType;
    private String message;
    
    public NumberParseException(final ErrorType errorType, final String message) {
        super(message);
        this.message = message;
        this.errorType = errorType;
    }
    
    public ErrorType getErrorType() {
        return this.errorType;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Error type: ");
        r.append(this.errorType);
        r.append(". ");
        r.append(this.message);
        return r.toString();
    }
    
    public enum ErrorType
    {
        INVALID_COUNTRY_CODE, 
        NOT_A_NUMBER, 
        TOO_LONG, 
        TOO_SHORT_AFTER_IDD, 
        TOO_SHORT_NSN;
    }
}
