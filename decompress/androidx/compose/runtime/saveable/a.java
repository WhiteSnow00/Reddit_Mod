// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.saveable;

import sg2.k;
import h1.e;
import rg2.p;
import rg2.l;

public final class a
{
    public static final e a(final l l, final p p2) {
        sg2.e.f((Object)p2, "save");
        sg2.e.f((Object)l, "restore");
        final ListSaverKt$listSaver$1 listSaverKt$listSaver$1 = new ListSaverKt$listSaver$1(p2);
        k.e(1, (Object)l);
        return SaverKt.a(l, (p)listSaverKt$listSaver$1);
    }
}
