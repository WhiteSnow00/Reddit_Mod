// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import android.util.SizeF;
import ah2.f;
import android.util.Size;
import android.os.Bundle;

public final class c
{
    public static final void a(final Bundle bundle, final String s, final Size size) {
        f.f((Object)bundle, "bundle");
        f.f((Object)s, "key");
        bundle.putSize(s, size);
    }
    
    public static final void b(final Bundle bundle, final String s, final SizeF sizeF) {
        f.f((Object)bundle, "bundle");
        f.f((Object)s, "key");
        bundle.putSizeF(s, sizeF);
    }
}
