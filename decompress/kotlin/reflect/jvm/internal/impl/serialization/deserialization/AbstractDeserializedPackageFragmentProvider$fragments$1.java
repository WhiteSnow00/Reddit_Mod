// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ki2.h;
import java.io.InputStream;
import li2.b;
import bh2.f;
import ng2.e;
import ch2.v;
import yh2.c;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class AbstractDeserializedPackageFragmentProvider$fragments$1 extends Lambda implements l<c, v>
{
    public final a this$0;
    
    public AbstractDeserializedPackageFragmentProvider$fragments$1(final a this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final v invoke(final c c) {
        e.f((Object)c, "fqName");
        final f f = (f)this.this$0;
        f.getClass();
        final InputStream c2 = f.b.c(c);
        Object o = null;
        Object a;
        if (c2 != null) {
            a = b.a.a(c, f.a, f.c, c2, false);
        }
        else {
            a = null;
        }
        if (a != null) {
            final h d = this.this$0.d;
            if (d == null) {
                e.n("components");
                throw null;
            }
            ((DeserializedPackageFragmentImpl)a).G0(d);
            o = a;
        }
        return (v)o;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((c)o);
    }
}
