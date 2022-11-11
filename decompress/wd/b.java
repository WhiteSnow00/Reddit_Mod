// 
// Decompiled by Procyon v0.6.0
// 

package wd;

import a4.q;
import ud.f;
import android.os.Process;
import android.os.Binder;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ApplicationInfo;
import android.content.Context;

public final class b
{
    public final Context a;
    
    public b(final Context a) {
        this.a = a;
    }
    
    public final ApplicationInfo a(final int n, final String s) throws PackageManager$NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(s, n);
    }
    
    public final PackageInfo b(final int n, final String s) throws PackageManager$NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(s, n);
    }
    
    public final boolean c() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return wd.a.T(this.a);
        }
        if (f.a()) {
            final String nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return q.k(this.a.getPackageManager(), nameForUid);
            }
        }
        return false;
    }
}
