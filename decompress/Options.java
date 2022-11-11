// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.cli;

import java.util.Collections;
import java.util.HashSet;
import java.util.Collection;
import a4.a0;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

public class Options implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Map longOpts;
    private Map optionGroups;
    private List requiredOpts;
    private Map shortOpts;
    
    public Options() {
        this.shortOpts = new HashMap();
        this.longOpts = new HashMap();
        this.requiredOpts = new ArrayList();
        this.optionGroups = new HashMap();
    }
    
    public Options addOption(final String s, final String s2, final boolean b, final String s3) {
        this.addOption(new Option(s, s2, b, s3));
        return this;
    }
    
    public Options addOption(final String s, final boolean b, final String s2) {
        this.addOption(s, null, b, s2);
        return this;
    }
    
    public Options addOption(final Option option) {
        final String key = option.getKey();
        if (option.hasLongOpt()) {
            this.longOpts.put(option.getLongOpt(), option);
        }
        if (option.isRequired()) {
            if (this.requiredOpts.contains(key)) {
                final List requiredOpts = this.requiredOpts;
                requiredOpts.remove(requiredOpts.indexOf(key));
            }
            this.requiredOpts.add(key);
        }
        this.shortOpts.put(key, option);
        return this;
    }
    
    public Options addOptionGroup(final OptionGroup optionGroup) {
        final Iterator iterator = optionGroup.getOptions().iterator();
        if (optionGroup.isRequired()) {
            this.requiredOpts.add(optionGroup);
        }
        while (iterator.hasNext()) {
            final Option option = (Option)iterator.next();
            option.setRequired(false);
            this.addOption(option);
            this.optionGroups.put(option.getKey(), optionGroup);
        }
        return this;
    }
    
    public Option getOption(String e0) {
        e0 = a0.E0(e0);
        if (this.shortOpts.containsKey(e0)) {
            return this.shortOpts.get(e0);
        }
        return this.longOpts.get(e0);
    }
    
    public OptionGroup getOptionGroup(final Option option) {
        return this.optionGroups.get(option.getKey());
    }
    
    public Collection getOptionGroups() {
        return new HashSet(this.optionGroups.values());
    }
    
    public Collection getOptions() {
        return Collections.unmodifiableCollection((Collection<?>)this.helpOptions());
    }
    
    public List getRequiredOptions() {
        return this.requiredOpts;
    }
    
    public boolean hasOption(String e0) {
        e0 = a0.E0(e0);
        return this.shortOpts.containsKey(e0) || this.longOpts.containsKey(e0);
    }
    
    public List helpOptions() {
        return new ArrayList(this.shortOpts.values());
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("[ Options: [ short ");
        sb.append(this.shortOpts.toString());
        sb.append(" ] [ long ");
        sb.append(this.longOpts);
        sb.append(" ]");
        return sb.toString();
    }
}
