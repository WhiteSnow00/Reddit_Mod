// 
// Decompiled by Procyon v0.6.0
// 

package ih2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import yh2.b;
import ng2.e;
import java.lang.annotation.Annotation;
import rh2.a;

public final class d extends m implements a
{
    public final Annotation a;
    
    public d(final Annotation a) {
        e.f((Object)a, "annotation");
        this.a = a;
    }
    
    public final b b() {
        return ReflectClassUtilKt.a(p7.a.p(p7.a.m(this.a)));
    }
    
    public final void c() {
    }
    
    public final boolean equals(final Object o) {
        return o instanceof d && this.a == ((d)o).a;
    }
    
    public final int hashCode() {
        return System.identityHashCode(this.a);
    }
    
    public final ArrayList k() {
        final Method[] declaredMethods = p7.a.p(p7.a.m(this.a)).getDeclaredMethods();
        e.e((Object)declaredMethods, "annotation.annotationClass.java.declaredMethods");
        final ArrayList list = new ArrayList<ih2.e>(declaredMethods.length);
        for (final Method method : declaredMethods) {
            final Object invoke = method.invoke(this.a, new Object[0]);
            e.e(invoke, "method.invoke(annotation)");
            list.add(e$a.a(invoke, yh2.e.g(method.getName())));
        }
        return list;
    }
    
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a q() {
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a(p7.a.p(p7.a.m(this.a)));
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        android.support.v4.media.a.B((Class)d.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
    
    public final void v() {
    }
}
