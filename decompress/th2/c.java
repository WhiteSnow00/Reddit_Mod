// 
// Decompiled by Procyon v0.6.0
// 

package th2;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$a;
import java.util.List;
import ti2.t;
import wh2.q;
import hh2.d0;
import di2.e;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;

public abstract class c extends LazyJavaScope
{
    public c(final sh2.c c) {
        super(c, (LazyJavaScope)null);
    }
    
    public void n(final ArrayList list, final e e) {
        sg2.e.f((Object)e, "name");
    }
    
    public final d0 p() {
        return null;
    }
    
    public final LazyJavaScope$a s(final q q, final ArrayList list, final t t, final List list2) {
        sg2.e.f((Object)q, "method");
        sg2.e.f((Object)list2, "valueParameters");
        return new LazyJavaScope$a(list2, list, (List)EmptyList.INSTANCE, t);
    }
}
