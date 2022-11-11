// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import hh2.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import ti2.n0;
import ti2.t;
import di2.e;
import di2.d;
import kotlin.reflect.jvm.internal.impl.builtins.c;
import rg2.l;

public abstract class DescriptorRenderer
{
    public static final DescriptorRendererImpl a;
    public static final DescriptorRendererImpl b;
    
    static {
        DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1.INSTANCE);
        DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$COMPACT$1.INSTANCE);
        DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1.INSTANCE);
        DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1.INSTANCE);
        DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1.INSTANCE);
        a = DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1.INSTANCE);
        DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1.INSTANCE);
        DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1.INSTANCE);
        b = DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$DEBUG_TEXT$1.INSTANCE);
        DescriptorRenderer.a.a((l)DescriptorRenderer$Companion$HTML$1.INSTANCE);
    }
    
    public abstract String p(final String p0, final String p1, final c p2);
    
    public abstract String q(final d p0);
    
    public abstract String r(final e p0, final boolean p1);
    
    public abstract String s(final t p0);
    
    public abstract String t(final n0 p0);
    
    public static final class a
    {
        public static DescriptorRendererImpl a(final l l) {
            sg2.e.f((Object)l, "changeOptions");
            final DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            l.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }
    
    public interface b
    {
        void a(final StringBuilder p0);
        
        void b(final m0 p0, final int p1, final int p2, final StringBuilder p3);
        
        void c(final StringBuilder p0);
        
        void d(final m0 p0, final StringBuilder p1);
    }
}
