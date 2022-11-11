// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import hg2.j;
import rg2.l;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import java.util.LinkedHashSet;
import java.util.Set;
import fi2.g;

public final class r extends g
{
    public final /* synthetic */ Set f;
    
    public r(final LinkedHashSet f) {
        this.f = f;
    }
    
    public static /* synthetic */ void d1(final int n) {
        final Object[] array = new Object[3];
        if (n != 1) {
            if (n != 2) {
                array[0] = "fakeOverride";
            }
            else {
                array[0] = "fromCurrent";
            }
        }
        else {
            array[0] = "fromSuper";
        }
        array[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (n != 1 && n != 2) {
            array[2] = "addFakeOverride";
        }
        else {
            array[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
    }
    
    public final void c1(final CallableMemberDescriptor callableMemberDescriptor, final CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            d1(1);
            throw null;
        }
        if (callableMemberDescriptor2 != null) {
            return;
        }
        d1(2);
        throw null;
    }
    
    public final void m(final CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor != null) {
            OverridingUtil.r(callableMemberDescriptor, null);
            this.f.add(callableMemberDescriptor);
            return;
        }
        d1(0);
        throw null;
    }
}
