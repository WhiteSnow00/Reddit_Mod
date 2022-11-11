// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import java.util.Iterator;
import android.text.TextUtils;
import android.net.Uri$Builder;
import android.os.Bundle;

public final class s7
{
    public final h4 a;
    
    public s7(final h4 a) {
        this.a = a;
    }
    
    public final void a(final Bundle bundle, final String s) {
        this.a.b().M();
        if (!this.a.d()) {
            String string;
            if (((BaseBundle)bundle).isEmpty()) {
                string = null;
            }
            else {
                String s2 = s;
                if (s.isEmpty()) {
                    s2 = "auto";
                }
                final Uri$Builder uri$Builder = new Uri$Builder();
                uri$Builder.path(s2);
                for (final String s3 : ((BaseBundle)bundle).keySet()) {
                    uri$Builder.appendQueryParameter(s3, ((BaseBundle)bundle).getString(s3));
                }
                string = uri$Builder.build().toString();
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.a.r().y.b(string);
                final o3 z = this.a.r().z;
                this.a.s.getClass();
                z.b(System.currentTimeMillis());
            }
        }
    }
    
    public final boolean b() {
        return this.a.r().z.a() > 0L;
    }
    
    public final boolean c() {
        if (!this.b()) {
            return false;
        }
        this.a.s.getClass();
        return System.currentTimeMillis() - this.a.r().z.a() > this.a.l.S(null, r2.R);
    }
}
