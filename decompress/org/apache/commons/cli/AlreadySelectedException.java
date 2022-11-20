// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.cli;

public class AlreadySelectedException extends ParseException
{
    private OptionGroup group;
    private Option option;
    
    public AlreadySelectedException(final String s) {
        super(s);
    }
    
    public AlreadySelectedException(final OptionGroup group, final Option option) {
        final StringBuffer sb = new StringBuffer();
        sb.append("The option '");
        sb.append(option.getKey());
        sb.append("' was specified but an option from this group ");
        sb.append("has already been selected: '");
        sb.append(group.getSelected());
        sb.append("'");
        this(sb.toString());
        this.group = group;
        this.option = option;
    }
    
    public Option getOption() {
        return this.option;
    }
    
    public OptionGroup getOptionGroup() {
        return this.group;
    }
}
