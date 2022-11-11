// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import android.text.TextUtils;
import java.util.Objects;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import com.bytedance.covode.number.Covode;

public final class 0DD
{
    static {
        Covode.recordClassIndex(1386);
    }
    
    public static final class a
    {
        public b LIZ;
        
        static {
            Covode.recordClassIndex(1387);
        }
        
        public a(final MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            final String packageName = mediaSessionManager$RemoteUserInfo.getPackageName();
            Objects.requireNonNull(packageName, "package shouldn't be null");
            if (!TextUtils.isEmpty((CharSequence)packageName)) {
                this.LIZ = new 1gI.a(mediaSessionManager$RemoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        
        public a(final String s, final int n, final int n2) {
            Objects.requireNonNull(s, "package shouldn't be null");
            if (TextUtils.isEmpty((CharSequence)s)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build$VERSION.SDK_INT >= 28) {
                this.LIZ = new 1gI.a(s, n, n2);
                return;
            }
            this.LIZ = new 0DE.a(s, n, n2);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && this.LIZ.equals(((a)o).LIZ));
        }
        
        @Override
        public final int hashCode() {
            return this.LIZ.hashCode();
        }
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(1388);
        }
    }
}
