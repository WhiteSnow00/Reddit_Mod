// 
// Decompiled by Procyon v0.6.0
// 

package m72;

import com.reddit.domain.model.streaming.StreamListingConfiguration;
import ff2.o;
import q61.a;
import java.util.Locale;
import com.reddit.domain.model.streaming.StreamListingType;
import kotlin.NoWhenBranchMatchedException;
import af2.c0;
import ff0.v0;
import javax.inject.Inject;
import ng2.e;
import xd0.e0;
import android.support.v4.media.b;

public final class c extends b
{
    public final e0 g;
    
    @Inject
    public c(final e0 g) {
        e.f((Object)g, "repository");
        this.g = g;
    }
    
    public final c0 f1(final v0 v0) {
        final c.c$a c$a = (c.c$a)v0;
        e.f((Object)c$a, "params");
        final e0 g = this.g;
        final int n = c.c$b.a[((Enum)c$a.b).ordinal()];
        boolean b = true;
        c0<StreamListingConfiguration> c0;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                final String a = c$a.a;
                if (a == null) {
                    b = false;
                }
                if (!b) {
                    throw new IllegalStateException("A sourceName must be present for StreamingEntryPointType.SUBREDDIT entry point type.".toString());
                }
                c0 = g.p(a, false);
            }
            else {
                final String value = StreamListingType.POPULAR.getValue();
                final Locale us = Locale.US;
                e.e((Object)us, "US");
                final String lowerCase = value.toLowerCase(us);
                e.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
                c0 = g.p(lowerCase, false);
            }
        }
        else {
            c0 = g.j(false);
        }
        final c0<StreamListingConfiguration> b2 = c0.B((ff2.o<Throwable, ? extends StreamListingConfiguration>)new a(10));
        e.e((Object)b2, "repository\n      .run {\n\u2026ngConfiguration.DEFAULT }");
        return b2;
    }
}
