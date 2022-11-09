// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import java.util.Iterator;
import java.util.ArrayList;
import jj2.k;

public final class h1 implements k<g1>
{
    public final ArrayList a;
    
    public h1() {
        this.a = new ArrayList();
    }
    
    public final void c(final Object o, final String s) {
        this.a.add(new g1(s, o));
    }
    
    public final Iterator<g1> iterator() {
        return this.a.iterator();
    }
}
