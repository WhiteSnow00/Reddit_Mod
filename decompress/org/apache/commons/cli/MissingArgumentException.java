// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.cli;

public class MissingArgumentException extends ParseException
{
    private Option option;
    
    public MissingArgumentException(final String s) {
        super(s);
    }
    
    public MissingArgumentException(final Option option) {
        final StringBuffer sb = new StringBuffer();
        sb.append("Missing argument for option: ");
        sb.append(option.getKey());
        this(sb.toString());
        this.option = option;
    }
    
    public Option getOption() {
        return this.option;
    }
}
