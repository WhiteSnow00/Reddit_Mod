// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import mh2.f;
import dh2.c;
import sh2.i;
import ng2.e;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1 extends Lambda implements l<Object, Boolean>
{
    public final a<Object> this$0;
    
    public AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1(final a<Object> this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final Boolean invoke(final Object o) {
        e.f(o, "$this$extractNullability");
        final i i = (i)this.this$0;
        i.getClass();
        final c c = (c)o;
        Label_0085: {
            if (!(c instanceof f) || !((f)c).c()) {
                if (c instanceof LazyJavaAnnotationDescriptor) {
                    i.c.a.t.c();
                    if (((LazyJavaAnnotationDescriptor)c).h || i.d == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                        break Label_0085;
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke(o);
    }
}
