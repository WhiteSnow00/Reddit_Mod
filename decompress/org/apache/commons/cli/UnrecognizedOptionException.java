// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.cli;

public class UnrecognizedOptionException extends ParseException
{
    private String option;
    
    public UnrecognizedOptionException(final String s) {
        super(s);
    }
    
    public UnrecognizedOptionException(final String s, final String option) {
        this(s);
        this.option = option;
    }
    
    public String getOption() {
        return this.option;
    }
}
