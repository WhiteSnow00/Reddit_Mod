// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import wi2.f;
import sg2.e;
import zi2.d;
import wi2.g;
import java.util.ArrayDeque;
import bd0.a;
import android.support.v4.media.c;
import wi2.l;

public class TypeCheckerState
{
    public final boolean a;
    public final boolean b;
    public final l c;
    public final c d;
    public final bd0.a e;
    public int f;
    public ArrayDeque<g> g;
    public d h;
    
    public TypeCheckerState(final boolean a, final boolean b, final l c, final c d, final bd0.a e) {
        sg2.e.f((Object)c, "typeSystemContext");
        sg2.e.f((Object)d, "kotlinTypePreparator");
        sg2.e.f((Object)e, "kotlinTypeRefiner");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        final ArrayDeque<g> g = this.g;
        sg2.e.c((Object)g);
        g.clear();
        final d h = this.h;
        sg2.e.c((Object)h);
        h.clear();
    }
    
    public boolean b(final f f, final f f2) {
        sg2.e.f((Object)f, "subType");
        sg2.e.f((Object)f2, "superType");
        return true;
    }
    
    public final void c() {
        if (this.g == null) {
            this.g = new ArrayDeque<g>(4);
        }
        if (this.h == null) {
            this.h = new d();
        }
    }
    
    public final f d(final f f) {
        sg2.e.f((Object)f, "type");
        return (f)this.d.I0(f);
    }
    
    public enum LowerCapturedTypePolicy
    {
        CHECK_ONLY_LOWER, 
        CHECK_SUBTYPE_AND_LOWER, 
        SKIP_LOWER;
    }
    
    public interface a
    {
        void a(final rg2.a<Boolean> p0);
    }
    
    public abstract static class b
    {
        public abstract g a(final TypeCheckerState p0, final f p1);
    }
}
