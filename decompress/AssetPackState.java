// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import android.os.BaseBundle;
import xl0.d;
import eg.u;
import eg.e1;
import eg.k0;
import android.os.Bundle;
import eg.x;

public abstract class AssetPackState
{
    public static x h(final String s, final int n, final int n2, final long n3, final long n4, final double n5, final int n6, final String s2, final String s3) {
        return new x(s, n, n2, n3, n4, (int)Math.rint(100.0 * n5), n6, s2, s3);
    }
    
    public static x i(final Bundle bundle, final String s, final k0 k0, final e1 e1, final u u) {
        final int a = u.a(((BaseBundle)bundle).getInt(d.n("status", s)));
        final int int1 = ((BaseBundle)bundle).getInt(d.n("error_code", s));
        final long long1 = ((BaseBundle)bundle).getLong(d.n("bytes_downloaded", s));
        final long long2 = ((BaseBundle)bundle).getLong(d.n("total_bytes_to_download", s));
        synchronized (k0) {
            final Double n = k0.a.get(s);
            double doubleValue;
            if (n == null) {
                doubleValue = 0.0;
                monitorexit(k0);
            }
            else {
                doubleValue = n;
                monitorexit(k0);
            }
            final long long3 = ((BaseBundle)bundle).getLong(d.n("pack_version", s));
            final long long4 = ((BaseBundle)bundle).getLong(d.n("pack_base_version", s));
            final int n2 = 1;
            int n3 = 4;
            int n4;
            if (a == 4) {
                n4 = n2;
                if (long4 != 0L) {
                    n4 = n2;
                    if (long4 != long3) {
                        n4 = 2;
                    }
                }
            }
            else {
                n4 = 1;
                n3 = a;
            }
            return h(s, n3, int1, long1, long2, doubleValue, n4, ((BaseBundle)bundle).getString(d.n("pack_version_tag", s), String.valueOf(((BaseBundle)bundle).getInt("app_version_code"))), e1.a(s));
        }
    }
    
    public abstract long a();
    
    public abstract int b();
    
    public abstract String c();
    
    public abstract int d();
    
    public abstract long e();
    
    public abstract int f();
    
    public abstract int g();
    
    public abstract String j();
    
    public abstract String k();
}
