// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import sg2.e;
import h2.j;

public final class SemanticsConfigurationKt
{
    public static final <T> T a(final j j, final a<T> a) {
        e.f((Object)j, "<this>");
        e.f((Object)a, "key");
        final SemanticsConfigurationKt$getOrNull$1 instance = SemanticsConfigurationKt$getOrNull$1.INSTANCE;
        e.f((Object)instance, "defaultValue");
        T t;
        if ((t = j.f.get(a)) == null) {
            t = ((rg2.a<T>)instance).invoke();
        }
        return t;
    }
}
