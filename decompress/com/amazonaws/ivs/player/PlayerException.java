// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import a2.b;

public class PlayerException extends RuntimeException
{
    private final int code;
    private final ErrorType errorType;
    private final String message;
    private final String source;
    
    public PlayerException(final ErrorType errorType, final String message) {
        final StringBuilder sb = new StringBuilder();
        sb.append(errorType);
        sb.append(" : ");
        sb.append(message);
        super(sb.toString());
        this.source = "Unspecified";
        this.errorType = errorType;
        this.code = 0;
        this.message = message;
    }
    
    public PlayerException(final String source, final ErrorType errorType, final int code, final String message) {
        final StringBuilder sb = new StringBuilder();
        sb.append(source);
        sb.append(" : ");
        sb.append(errorType);
        sb.append(" : ");
        sb.append(code);
        super(b.j(sb, " : ", message));
        this.source = source;
        this.errorType = errorType;
        this.code = code;
        this.message = message;
    }
    
    public PlayerException(final Throwable t, final String source, final ErrorType errorType, final int code, final String message) {
        final StringBuilder sb = new StringBuilder();
        sb.append(source);
        sb.append(" : ");
        sb.append(errorType);
        sb.append(" : ");
        sb.append(code);
        sb.append(" : ");
        sb.append(message);
        String string;
        if (t.getMessage() == null) {
            string = "";
        }
        else {
            final StringBuilder k = a.k(" (");
            k.append(t.getMessage());
            k.append(")");
            string = k.toString();
        }
        sb.append(string);
        super(sb.toString(), t);
        this.source = source;
        this.errorType = errorType;
        this.code = code;
        this.message = message;
    }
    
    public int getCode() {
        return this.code;
    }
    
    public String getErrorMessage() {
        return this.message;
    }
    
    public ErrorType getErrorType() {
        return this.errorType;
    }
    
    public String getSource() {
        return this.source;
    }
}
