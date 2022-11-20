// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.cli;

import java.util.Iterator;
import java.util.List;

public class MissingOptionException extends ParseException
{
    private List missingOptions;
    
    public MissingOptionException(final String s) {
        super(s);
    }
    
    public MissingOptionException(final List missingOptions) {
        final StringBuffer sb = new StringBuffer("Missing required option");
        String s;
        if (missingOptions.size() == 1) {
            s = "";
        }
        else {
            s = "s";
        }
        sb.append(s);
        sb.append(": ");
        final Iterator iterator = missingOptions.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        this(sb.toString());
        this.missingOptions = missingOptions;
    }
    
    public List getMissingOptions() {
        return this.missingOptions;
    }
}
