// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import com.squareup.moshi.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Set;
import com.reddit.domain.model.CarouselCollectionState;
import xd0.s;
import cg2.j;
import ng2.e;
import com.reddit.data.repository.RedditPreferenceRepository;
import java.util.concurrent.Callable;

public final class e1 implements Callable
{
    public final int f;
    public final RedditPreferenceRepository g;
    public final Object h;
    
    public e1(final RedditPreferenceRepository g, final Object h, final int f) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        switch (this.f) {
            default: {
                final RedditPreferenceRepository g = this.g;
                final String s = (String)this.h;
                e.f((Object)g, "this$0");
                e.f((Object)s, "$country");
                a.B(g.c, "user_ip_address_location", s);
                return j.a;
            }
            case 0: {
                final RedditPreferenceRepository g2 = this.g;
                final s.a a = (s.a)this.h;
                e.f((Object)g2, "this$0");
                e.f((Object)a, "$key");
                final String string = g2.c.getString(a.toString(), (String)null);
                CarouselCollectionState carouselCollectionState;
                if (string == null) {
                    carouselCollectionState = new CarouselCollectionState((Set)null, 1, (DefaultConstructorMarker)null);
                }
                else {
                    final y a2 = y10.e.a;
                    Object fromJson;
                    if (string.length() == 0) {
                        fromJson = null;
                    }
                    else {
                        fromJson = y10.e.a.a((Class)CarouselCollectionState.class).fromJson(string);
                    }
                    if ((carouselCollectionState = (CarouselCollectionState)fromJson) == null) {
                        carouselCollectionState = new CarouselCollectionState((Set)null, 1, (DefaultConstructorMarker)null);
                    }
                }
                return carouselCollectionState;
            }
        }
    }
}
