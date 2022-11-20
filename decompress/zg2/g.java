// 
// Decompiled by Procyon v0.6.0
// 

package zg2;

import ch2.m;
import java.util.Iterator;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.c$h;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a;
import ch2.b;
import fh2.j;
import java.util.Collections;
import java.util.List;
import oi2.f;
import java.util.Collection;
import java.util.ArrayList;
import cg.d;
import fh2.k0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import ch2.t;
import fh2.p;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import qi2.h;
import fh2.z;

public final class g
{
    public static final z a;
    
    static {
        final h a2 = h.a;
        final p p = new p((t)h.b, e.d);
        final ClassKind interface1 = ClassKind.INTERFACE;
        final yh2.e f = e.e.f();
        final LockBasedStorageManager$a e = LockBasedStorageManager.e;
        final z a3 = new z(p, interface1, f, e);
        final Modality abstract1 = Modality.ABSTRACT;
        if (abstract1 == null) {
            z.o0(6);
            throw null;
        }
        a3.o = abstract1;
        final c$h e2 = c.e;
        if (e2 == null) {
            z.o0(9);
            throw null;
        }
        a3.p = (m)e2;
        final List l3 = d.l3((Object)k0.K0((ch2.g)a3, Variance.IN_VARIANCE, yh2.e.g("T"), 0, (ni2.h)e));
        if (a3.r != null) {
            final StringBuilder t = a.t("Type parameters are already set for ");
            t.append(((fh2.b)a3).getName());
            throw new IllegalStateException(t.toString());
        }
        final ArrayList r = new ArrayList(l3);
        a3.r = r;
        a3.q = new f((ch2.c)a3, (List)r, (Collection)a3.s, a3.t);
        final Set<Object> emptySet = (Set<Object>)Collections.emptySet();
        if (emptySet != null) {
            final Iterator<Object> iterator = (Iterator<Object>)emptySet.iterator();
            while (iterator.hasNext()) {
                ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b)iterator.next()).O0(((fh2.b)a3).r());
            }
            a = a3;
            return;
        }
        z.o0(13);
        throw null;
    }
}
