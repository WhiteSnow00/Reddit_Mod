// 
// Decompiled by Procyon v0.6.0
// 

package android.app.job;

import android.content.Intent;
import android.os.Parcelable;

public final class JobWorkItem implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public JobWorkItem(final Intent intent) {
    }
    
    public native Intent getIntent();
}
