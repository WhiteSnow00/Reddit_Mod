// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.cli;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

public class OptionGroup implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Map optionMap;
    private boolean required;
    private String selected;
    
    public OptionGroup() {
        this.optionMap = new HashMap();
    }
    
    public OptionGroup addOption(final Option option) {
        this.optionMap.put(option.getKey(), option);
        return this;
    }
    
    public Collection getNames() {
        return this.optionMap.keySet();
    }
    
    public Collection getOptions() {
        return this.optionMap.values();
    }
    
    public String getSelected() {
        return this.selected;
    }
    
    public boolean isRequired() {
        return this.required;
    }
    
    public void setRequired(final boolean required) {
        this.required = required;
    }
    
    public void setSelected(final Option option) throws AlreadySelectedException {
        final String selected = this.selected;
        if (selected != null && !selected.equals(option.getOpt())) {
            throw new AlreadySelectedException(this, option);
        }
        this.selected = option.getOpt();
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        final Iterator iterator = this.getOptions().iterator();
        sb.append("[");
        while (iterator.hasNext()) {
            final Option option = (Option)iterator.next();
            if (option.getOpt() != null) {
                sb.append("-");
                sb.append(option.getOpt());
            }
            else {
                sb.append("--");
                sb.append(option.getLongOpt());
            }
            sb.append(" ");
            sb.append(option.getDescription());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
