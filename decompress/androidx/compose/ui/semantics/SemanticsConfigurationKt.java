// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import ah2.f;
import h2.j;

public final class SemanticsConfigurationKt
{
    public static final <T> T a(final j j, final a<T> a) {
        f.f((Object)j, "<this>");
        f.f((Object)a, "key");
        final SemanticsConfigurationKt$getOrNull.SemanticsConfigurationKt$getOrNull$1 instance = SemanticsConfigurationKt$getOrNull.SemanticsConfigurationKt$getOrNull$1.INSTANCE;
        f.f((Object)instance, "defaultValue");
        Object o;
        if ((o = j.f.get(a)) == null) {
            o = ((zg2.a)instance).invoke();
        }
        return (T)o;
    }
}
