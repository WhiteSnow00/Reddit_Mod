// 
// Decompiled by Procyon v0.6.0
// 

package p5;

import java.util.List;
import android.content.Context;

public interface b<T>
{
    T create(final Context p0);
    
    List<Class<? extends b<?>>> dependencies();
}
