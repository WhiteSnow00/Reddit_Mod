// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

public final class c
{
    public b a;
    public b b;
    public final ArrayList c;
    
    public c() {
        this.a = new b(0L, "", null);
        this.b = new b(0L, "", null);
        this.c = new ArrayList();
    }
    
    public c(final b a) {
        this.a = a;
        this.b = a.a();
        this.c = new ArrayList();
    }
}
