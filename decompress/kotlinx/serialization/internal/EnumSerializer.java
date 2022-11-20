// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.internal;

import java.util.Arrays;
import nj2.d;
import kotlinx.serialization.SerializationException;
import nj2.c;
import mg2.l;
import mj2.h;
import kotlinx.serialization.descriptors.a;
import mj2.h$b;
import ng2.e;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import lj2.b;

public final class EnumSerializer<T extends Enum<T>> implements b<T>
{
    public final T[] a;
    public final SerialDescriptorImpl b;
    
    public EnumSerializer(final String s, final T[] a) {
        e.f((Object)a, "values");
        this.a = a;
        this.b = kotlinx.serialization.descriptors.a.b(s, (h)h$b.a, new mj2.e[0], (l)new EnumSerializer$descriptor$1(this, s));
    }
    
    public final Object deserialize(final c c) {
        e.f((Object)c, "decoder");
        final int h = c.h(this.b);
        if (h >= 0 && h < this.a.length) {
            return this.a[h];
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(h);
        sb.append(" is not among valid ");
        sb.append(this.b.a);
        sb.append(" enum values, values size is ");
        sb.append(this.a.length);
        throw new SerializationException(sb.toString());
    }
    
    public final mj2.e getDescriptor() {
        return this.b;
    }
    
    public final void serialize(final d d, final Object o) {
        final Enum enum1 = (Enum)o;
        e.f((Object)d, "encoder");
        e.f((Object)enum1, "value");
        final int o2 = kotlin.collections.b.o2((Object)enum1, (Object[])this.a);
        if (o2 != -1) {
            d.i(this.b, o2);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(enum1);
        sb.append(" is not a valid enum ");
        sb.append(this.b.a);
        sb.append(", must be one of ");
        final String string = Arrays.toString(this.a);
        e.e((Object)string, "toString(this)");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }
    
    @Override
    public final String toString() {
        return p1.h.c(a.t("kotlinx.serialization.internal.EnumSerializer<"), this.b.a, '>');
    }
}
