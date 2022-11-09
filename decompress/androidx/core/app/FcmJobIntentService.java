// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import com.bytedance.covode.number.Covode;

public abstract class FcmJobIntentService extends JobIntentService
{
    static {
        Covode.recordClassIndex(662);
    }
    
    public e dequeueWork() {
        try {
            return super.dequeueWork();
        }
        catch (final SecurityException ex) {
            return null;
        }
    }
}
