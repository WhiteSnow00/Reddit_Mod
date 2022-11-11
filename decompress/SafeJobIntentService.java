// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import com.bytedance.covode.number.Covode;

public abstract class SafeJobIntentService extends JobIntentService
{
    static {
        Covode.recordClassIndex(676);
    }
    
    private e LIZ() {
        try {
            return super.dequeueWork();
        }
        catch (final SecurityException ex) {
            return null;
        }
    }
}
