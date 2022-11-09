// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import ah2.f;
import javax.inject.Inject;
import java.util.LinkedHashSet;

public final class t0 implements g0
{
    public final LinkedHashSet a;
    
    @Inject
    public t0() {
        this.a = new LinkedHashSet();
    }
    
    @Override
    public final void a(String string, final String s) {
        f.f((Object)string, "linkKindWithId");
        f.f((Object)s, "commentKindWithId");
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append('_');
        sb.append(s);
        string = sb.toString();
        this.a.add(string);
    }
    
    @Override
    public final boolean b(String string, final String s) {
        f.f((Object)string, "linkKindWithId");
        f.f((Object)s, "commentKindWithId");
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append('_');
        sb.append(s);
        string = sb.toString();
        return this.a.contains(string);
    }
}
