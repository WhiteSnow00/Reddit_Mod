// 
// Decompiled by Procyon v0.6.0
// 

package z4;

import android.os.Build$VERSION;
import android.text.TextUtils;
import android.media.session.MediaSessionManager$RemoteUserInfo;

public final class a
{
    public c a;
    
    public a(final MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        final String a = b.a(mediaSessionManager$RemoteUserInfo);
        if (a == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.a = new b(mediaSessionManager$RemoteUserInfo);
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
    
    public a(final String s, final int n, final int n2) {
        if (s == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            if (Build$VERSION.SDK_INT >= 28) {
                this.a = new b(s, n, n2);
            }
            else {
                this.a = new c(s, n, n2);
            }
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a && this.a.equals(((a)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
