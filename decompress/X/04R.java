// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.RemoteException;
import android.os.Bundle;
import java.util.List;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import android.content.ComponentName;

public final class 04r
{
    public final 011 LIZ;
    public final ComponentName LIZIZ;
    public final 012 LIZJ;
    
    static {
        Covode.recordClassIndex(571);
    }
    
    public 04r(final 012 lizj, final 011 liz, final ComponentName liziz) {
        this.LIZJ = lizj;
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final boolean LIZ(final Uri uri, final List<Bundle> list) {
        try {
            return this.LIZJ.LIZ(this.LIZ, uri, null, null);
        }
        catch (final RemoteException ex) {
            return false;
        }
    }
}
