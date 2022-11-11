// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.saveable;

import rg2.p;
import rg2.l;
import h1.e;

public final class SaverKt
{
    public static final e a;
    
    static {
        a = a((l)SaverKt$AutoSaver$2.INSTANCE, (p)SaverKt$AutoSaver$1.INSTANCE);
    }
    
    public static final e a(final l l, final p p2) {
        sg2.e.f((Object)p2, "save");
        sg2.e.f((Object)l, "restore");
        return new e(l, p2);
    }
}
