// 
// Decompiled by Procyon v0.6.0
// 

package fh2;

import mg2.l;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import java.util.LinkedHashSet;
import java.util.Set;
import ai2.g;

public final class r extends g
{
    public final Set b;
    
    public r(final LinkedHashSet b) {
        this.b = b;
    }
    
    public static void s0(final int n) {
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
    
    public final void n(final CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor != null) {
            OverridingUtil.r(callableMemberDescriptor, (l)null);
            this.b.add(callableMemberDescriptor);
            return;
        }
        s0(0);
        throw null;
    }
    
    public final void r0(final CallableMemberDescriptor callableMemberDescriptor, final CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            s0(1);
            throw null;
        }
        if (callableMemberDescriptor2 != null) {
            return;
        }
        s0(2);
        throw null;
    }
}
