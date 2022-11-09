// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.regex.Pattern;
import com.bytedance.covode.number.Covode;

public final class l
{
    public final String[] valueOf;
    
    static {
        Covode.recordClassIndex(2704);
    }
    
    public l() {
    }
    
    public l(final String... array) {
        if (array == null || array.length == 0) {
            this.valueOf = null;
            return;
        }
        final Pattern compile = Pattern.compile("[\\w]{1,45}");
        final ArrayList list = new ArrayList();
        for (final String s : array) {
            if (s != null && compile.matcher(s).matches()) {
                list.add(s.toLowerCase());
            }
            else {
                AFLogger.AFLogger$LogLevel("Invalid partner name: ".concat(String.valueOf(s)));
            }
        }
        if (list.contains("all")) {
            this.valueOf = new String[] { "all" };
            return;
        }
        if (!list.isEmpty()) {
            this.valueOf = (String[])list.toArray(new String[0]);
            return;
        }
        this.valueOf = null;
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(2706);
        }
        
        void AFKeystoreWrapper(final String p0);
        
        void values(final String p0, final String p1, final String p2);
    }
}
