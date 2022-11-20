// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import kotlin.collections.c;
import kotlin.Pair;
import java.util.Map;
import ng2.e;
import com.reddit.session.mode.common.SessionMode;
import java.util.LinkedHashMap;
import java.util.HashMap;

public final class j
{
    public final HashMap a;
    public final HashMap b;
    
    public j(final int n) {
        if (n != 1) {
            this.a = new HashMap();
            this.b = new HashMap();
            return;
        }
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
    }
    
    public final void a(final SessionMode sessionMode, final String s, final SessionMode sessionMode2) {
        e.f((Object)sessionMode, "sourceMode");
        e.f((Object)sessionMode2, "targetMode");
        final Map map = (Map)this.a.get(sessionMode);
        if (map == null) {
            this.a.put(sessionMode, c.y4(new Pair[] { new Pair((Object)s, (Object)sessionMode2) }));
        }
        else {
            map.put(s, sessionMode2);
        }
    }
}
