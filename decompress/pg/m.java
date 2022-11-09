// 
// Decompiled by Procyon v0.6.0
// 

package pg;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import dg.k;

public final class m
{
    public static final k c;
    public final XmlPullParser a;
    public final b b;
    
    static {
        c = new k("LocalTestingConfigParser");
    }
    
    public m(final XmlPullParser a) {
        this.a = a;
        final c a2 = pg.k.a;
        final b b = new b();
        b.b = new HashMap<String, Integer>();
        this.b = b;
    }
    
    public final void a(final String s, final l l) throws IOException, XmlPullParserException {
        while (true) {
            final int next = this.a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.a.getEventType() != 2) {
                continue;
            }
            if (!this.a.getName().equals(s)) {
                throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", s, this.a.getName()), this.a, (Throwable)null);
            }
            l.zza();
        }
    }
}
