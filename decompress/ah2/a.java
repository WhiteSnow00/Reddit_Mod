// 
// Decompiled by Procyon v0.6.0
// 

package ah2;

import xi2.j;
import kotlin.collections.EmptySet;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a$a;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c;
import ch2.t;
import ni2.h;
import eh2.b;

public final class a implements b
{
    public final h a;
    public final t b;
    
    public a(final h a, final c b) {
        e.f((Object)a, "storageManager");
        e.f((Object)b, "module");
        this.a = a;
        this.b = (t)b;
    }
    
    public final ch2.c a(final yh2.b b) {
        e.f((Object)b, "classId");
        if (b.c || b.k()) {
            return null;
        }
        final String b2 = b.i().b();
        e.e((Object)b2, "classId.relativeClassName.asString()");
        if (!kotlin.text.b.J0((CharSequence)b2, (CharSequence)"Function", false)) {
            return null;
        }
        final yh2.c h = b.h();
        e.e((Object)h, "classId.packageFqName");
        FunctionClassKind.Companion.getClass();
        final FunctionClassKind$a$a a = FunctionClassKind$a.a(b2, h);
        if (a == null) {
            return null;
        }
        final FunctionClassKind a2 = a.a;
        final int b3 = a.b;
        final List m = this.b.D0(h).M();
        final ArrayList list = new ArrayList();
        for (final Object next : m) {
            if (next instanceof zg2.a) {
                list.add(next);
            }
        }
        final ArrayList<Object> list2 = new ArrayList<Object>();
        for (final Object next2 : list) {
            if (next2 instanceof zg2.c) {
                list2.add(next2);
            }
        }
        Object o = CollectionsKt___CollectionsKt.U4((List)list2);
        if (o == null) {
            o = CollectionsKt___CollectionsKt.S4((List)list);
        }
        return (ch2.c)new ah2.b(this.a, (zg2.a)o, a2, b3);
    }
    
    public final Collection<ch2.c> b(final yh2.c c) {
        e.f((Object)c, "packageFqName");
        return (Collection<ch2.c>)EmptySet.INSTANCE;
    }
    
    public final boolean c(final yh2.c c, final yh2.e e) {
        e.f((Object)c, "packageFqName");
        e.f((Object)e, "name");
        final String c2 = e.c();
        e.e((Object)c2, "name.asString()");
        final boolean b = false;
        if (!j.I0(c2, "Function", false) && !j.I0(c2, "KFunction", false) && !j.I0(c2, "SuspendFunction", false)) {
            final boolean b2 = b;
            if (!j.I0(c2, "KSuspendFunction", false)) {
                return b2;
            }
        }
        FunctionClassKind.Companion.getClass();
        boolean b2 = b;
        if (FunctionClassKind$a.a(c2, c) != null) {
            b2 = true;
        }
        return b2;
    }
}
