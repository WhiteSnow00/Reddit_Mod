// 
// Decompiled by Procyon v0.6.0
// 

package th2;

import yh2.e;
import java.util.List;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;

public final class a
{
    public final AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> a;
    public final HashMap<o, List<Object>> b;
    public final l c;
    
    public a(final AbstractBinaryClassAnnotationAndConstantLoader a, final HashMap b, final l c, final HashMap hashMap) {
        this.a = (AbstractBinaryClassAnnotationAndConstantLoader<Object, Object>)a;
        this.b = b;
        this.c = c;
    }
    
    public final a.a$b a(final e e, final String s) {
        ng2.e.f((Object)s, "desc");
        final String c = e.c();
        ng2.e.e((Object)c, "name.asString()");
        return new a.a$b(this, o.a.a(c, s));
    }
    
    public final a.a$a b(final e e, final String s) {
        ng2.e.f((Object)e, "name");
        final String c = e.c();
        ng2.e.e((Object)c, "name.asString()");
        return new a.a$a(this, o.a.d(c, s));
    }
}
