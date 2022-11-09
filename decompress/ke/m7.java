// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import j0.b;
import java.util.Map;
import re.b4;
import java.util.List;
import x6.h;
import z0.d1;
import re.a4;

public final class m7 extends i
{
    public final /* synthetic */ int h;
    public final Object i;
    
    public m7(final a4 i) {
        this.h = 0;
        this.i = i;
        super("getValue");
    }
    
    public m7(final d1 i) {
        this.h = 1;
        super("internal.logger");
        this.i = i;
        super.g.put("log", new da(this, false, true));
        super.g.put("silent", new l9());
        super.g.get("silent").a("log", (o)new da(this, true, true));
        super.g.put("unmonitored", new ca());
        super.g.get("unmonitored").a("log", (o)new da(this, false, false));
    }
    
    public final o h(final h h, final List list) {
        switch (this.h) {
            default: {
                return (o)o.f3;
            }
            case 0: {
                f4.h("getValue", 2, list);
                final o b = h.b(list.get(0));
                Object b2 = h.b(list.get(1));
                final String c = b.c();
                final a4 a4 = (a4)this.i;
                final b i = ((b4)a4.b).i;
                final String s = (String)a4.a;
                final String s2 = null;
                final Map map = (Map)((j0.i)i).getOrDefault((Object)s, (Object)null);
                String s3 = s2;
                if (map != null) {
                    if (!map.containsKey(c)) {
                        s3 = s2;
                    }
                    else {
                        s3 = map.get(c);
                    }
                }
                if (s3 != null) {
                    b2 = new s(s3);
                }
                return (o)b2;
            }
        }
    }
}
