// 
// Decompiled by Procyon v0.6.0
// 

package yh2;

import di2.e;
import java.util.List;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;

public final class a
{
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> a;
    public final /* synthetic */ HashMap<p, List<Object>> b;
    public final /* synthetic */ m c;
    
    public a(final AbstractBinaryClassAnnotationAndConstantLoader a, final HashMap b, final m c, final HashMap hashMap) {
        this.a = (AbstractBinaryClassAnnotationAndConstantLoader<Object, Object>)a;
        this.b = b;
        this.c = c;
    }
    
    public final a.a$b a(final e e, final String s) {
        sg2.e.f((Object)s, "desc");
        final String c = e.c();
        sg2.e.e((Object)c, "name.asString()");
        return new a.a$b(this, p.a.a(c, s));
    }
    
    public final a.a$a b(final e e, final String s) {
        sg2.e.f((Object)e, "name");
        final String c = e.c();
        sg2.e.e((Object)c, "name.asString()");
        return new a.a$a(this, p.a.d(c, s));
    }
}
