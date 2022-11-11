// 
// Decompiled by Procyon v0.6.0
// 

package bb0;

import kotlin.Result;
import hg2.j;
import com.reddit.common.customemojis.Emote;
import b20.c;
import hj2.e;
import kotlinx.coroutines.flow.StateFlowImpl;
import b20.b;
import java.util.List;

public interface a
{
    StateFlowImpl a(final String p0, final String p1, final List p2, final b p3);
    
    e<List<c>> b(final String p0, final String p1, final boolean p2);
    
    void c(final bb0.c p0, final b p1);
    
    StateFlowImpl d(final String p0, final String p1, final List p2, final b p3);
    
    void e(final String p0);
    
    Object f(final String p0, final b20.e p1, final lg2.c p2);
    
    Object g(final String p0, final Emote p1, final lg2.c<? super j> p2);
    
    Object h(final String p0, final lg2.c<? super Result<Boolean>> p1);
}
