// 
// Decompiled by Procyon v0.6.0
// 

package oa;

import java.util.ArrayList;
import java.util.Collections;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.List;

public final class c
{
    public final String a;
    public final List<LogEventDropped> b;
    
    static {
        Collections.unmodifiableList((List<?>)new a().b);
    }
    
    public c(final String a, final List<LogEventDropped> b) {
        this.a = a;
        this.b = b;
    }
    
    public static final class a
    {
        public String a;
        public List<LogEventDropped> b;
        
        public a() {
            this.a = "";
            this.b = new ArrayList<LogEventDropped>();
        }
    }
}
