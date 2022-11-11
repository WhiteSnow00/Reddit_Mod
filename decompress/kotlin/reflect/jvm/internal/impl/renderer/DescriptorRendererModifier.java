// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.collections.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.util.Set;

public enum DescriptorRendererModifier
{
    ACTUAL(true);
    
    public static final Set<DescriptorRendererModifier> ALL;
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS;
    
    ANNOTATIONS(false), 
    CONST(true);
    
    public static final a Companion;
    
    DATA(true), 
    EXPECT(true), 
    FUN(true), 
    INLINE(true), 
    INNER(true), 
    LATEINIT(true), 
    MEMBER_KIND(true), 
    MODALITY(true), 
    OVERRIDE(true), 
    VALUE(true), 
    VISIBILITY(true);
    
    private final boolean includeByDefault;
    
    static {
        int i = 0;
        Companion = new a();
        final DescriptorRendererModifier[] values = values();
        final ArrayList list = new ArrayList();
        while (i < values.length) {
            final DescriptorRendererModifier descriptorRendererModifier = values[i];
            if (descriptorRendererModifier.includeByDefault) {
                list.add(descriptorRendererModifier);
            }
            ++i;
        }
        ALL_EXCEPT_ANNOTATIONS = CollectionsKt___CollectionsKt.u4((Iterable)list);
        ALL = b.y1(values());
    }
    
    private DescriptorRendererModifier(final boolean includeByDefault) {
        this.includeByDefault = includeByDefault;
    }
    
    public static final class a
    {
    }
}
