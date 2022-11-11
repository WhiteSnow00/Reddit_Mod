// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import kotlin.collections.EmptyList;
import sg2.e;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.annotation.Annotation;
import java.util.List;

public final class a
{
    public List<? extends Annotation> a;
    public final ArrayList b;
    public final HashSet c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    
    public a(final String s) {
        sg2.e.f((Object)s, "serialName");
        this.a = (List<? extends Annotation>)EmptyList.INSTANCE;
        this.b = new ArrayList();
        this.c = new HashSet();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }
    
    public static void a(final a a, final String s, final qj2.e e) {
        final EmptyList instance = EmptyList.INSTANCE;
        a.getClass();
        e.f((Object)s, "elementName");
        e.f((Object)e, "descriptor");
        e.f((Object)instance, "annotations");
        if (a.c.add(s)) {
            a.b.add(s);
            a.d.add(e);
            a.e.add(instance);
            a.f.add(false);
            return;
        }
        throw new IllegalArgumentException(a.k("Element with name '", s, "' is already registered").toString());
    }
}
