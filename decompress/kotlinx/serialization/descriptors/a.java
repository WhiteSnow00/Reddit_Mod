// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.descriptors;

import java.util.List;
import mj2.h;
import kotlin.collections.b;
import mj2.i$a;
import xi2.j;
import mg2.l;
import mj2.e;

public final class a
{
    public static final SerialDescriptorImpl a(final String s, final e[] array, final l l) {
        if (j.B0((CharSequence)s) ^ true) {
            final mj2.a a = new mj2.a(s);
            l.invoke((Object)a);
            return new SerialDescriptorImpl(s, (h)i$a.a, a.b.size(), b.E2((Object[])array), a);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }
    
    public static final SerialDescriptorImpl b(final String s, final h h, final e[] array, final l l) {
        ng2.e.f((Object)s, "serialName");
        ng2.e.f((Object)h, "kind");
        ng2.e.f((Object)l, "builder");
        if (!(j.B0((CharSequence)s) ^ true)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (ng2.e.a((Object)h, (Object)i$a.a) ^ true) {
            final mj2.a a = new mj2.a(s);
            l.invoke((Object)a);
            return new SerialDescriptorImpl(s, h, a.b.size(), b.E2((Object[])array), a);
        }
        throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
    }
    
    public static SerialDescriptorImpl c(final String s, final h h, final e[] array) {
        return b(s, h, array, (l)SerialDescriptorsKt$buildSerialDescriptor$1.INSTANCE);
    }
}
