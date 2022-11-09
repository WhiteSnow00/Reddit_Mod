// 
// Decompiled by Procyon v0.6.0
// 

package jc;

import java.util.Collections;
import java.util.List;
import zb.j;

public abstract class c implements j<c>
{
    public final String a;
    public final List<String> b;
    public final boolean c;
    
    public c(final String a, final boolean c, final List list) {
        this.a = a;
        this.b = Collections.unmodifiableList((List<? extends String>)list);
        this.c = c;
    }
}
