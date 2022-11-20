// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import zd.b;
import ci2.g;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import nh2.c;
import rh2.a;
import kotlin.jvm.internal.PropertyReference1;
import ug2.f;
import kotlin.jvm.internal.PropertyReference1Impl;
import ng2.h;
import ni2.e;
import ug2.k;

public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor
{
    public static final k<Object>[] h;
    public final e g;
    
    static {
        h = new k[] { (k)ng2.h.c((PropertyReference1)new PropertyReference1Impl((f)ng2.h.a((Class)JavaRetentionAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;")) };
    }
    
    public JavaRetentionAnnotationDescriptor(final a a, final c c) {
        ng2.e.f((Object)a, "annotation");
        ng2.e.f((Object)c, "c");
        super(c, a, e$a.w);
        this.g = (e)c.a.a.h((mg2.a)new JavaRetentionAnnotationDescriptor$allValueArguments.JavaRetentionAnnotationDescriptor$allValueArguments$2(this));
    }
    
    public final Map<yh2.e, g<?>> a() {
        return (Map)b.f0(this.g, JavaRetentionAnnotationDescriptor.h[0]);
    }
}
