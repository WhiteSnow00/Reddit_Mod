// 
// Decompiled by Procyon v0.6.0
// 

package u4;

import android.os.PowerManager$WakeLock;
import android.util.SparseArray;
import android.content.BroadcastReceiver;

@Deprecated
public abstract class a extends BroadcastReceiver
{
    public static final SparseArray<PowerManager$WakeLock> f;
    public static int g;
    
    static {
        f = new SparseArray();
        a.g = 1;
    }
}
