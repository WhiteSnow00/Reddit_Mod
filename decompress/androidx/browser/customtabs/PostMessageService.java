// 
// Decompiled by Procyon v0.6.0
// 

package androidx.browser.customtabs;

import android.os.IBinder;
import android.content.Intent;
import android.os.Bundle;
import X.011;
import com.bytedance.covode.number.Covode;
import X.013;
import android.app.Service;

public class PostMessageService extends Service
{
    public 013.a LIZ;
    
    static {
        Covode.recordClassIndex(556);
    }
    
    public PostMessageService() {
        this.LIZ = new 013.a() {
            static {
                Covode.recordClassIndex(557);
            }
            
            public final void LIZ(final 011 011, final Bundle bundle) {
                011.LIZ(bundle);
            }
            
            public final void LIZ(final 011 011, final String s, final Bundle bundle) {
                011.LIZIZ(s, bundle);
            }
        };
    }
    
    public IBinder onBind(final Intent intent) {
        return (IBinder)this.LIZ;
    }
}
