// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;

public interface m0 extends CoroutineContext$a
{
    Object B();
    
    public static final class a implements CoroutineContext$b<m0>
    {
        public static final a f;
        
        static {
            f = new a();
        }
    }
}
