// 
// Decompiled by Procyon v0.6.0
// 

package aj2;

import android.os.Looper;
import zi2.g1;
import java.util.List;
import ej2.l;

public final class a implements l
{
    public int a() {
        return 1073741823;
    }
    
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
    
    public g1 c(final List<? extends l> list) {
        final Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return (g1)new kotlinx.coroutines.android.a(g.b(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
