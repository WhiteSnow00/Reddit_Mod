// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import n1.f;
import androidx.compose.ui.platform.k1;
import zg2.p;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import u2.b;

public interface c extends b
{
    k B0();
    
    default <T> Object G0(final long n, final p<? super c, ? super tg2.c<? super T>, ?> p3, final tg2.c<? super T> c) {
        return p3.invoke((Object)this, (Object)c);
    }
    
    Object P(final PointerEventPass p0, final BaseContinuationImpl p1);
    
    long a();
    
    k1 getViewConfiguration();
    
    default long r0() {
        final int d = f.d;
        return f.b;
    }
    
    default <T> Object v0(final long n, final p<? super c, ? super tg2.c<? super T>, ?> p3, final tg2.c<? super T> c) {
        return p3.invoke((Object)this, (Object)c);
    }
}
