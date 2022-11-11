// 
// Decompiled by Procyon v0.6.0
// 

package a70;

import kotlin.random.Random;
import nw1.d;
import kotlin.random.XorWowRandom;
import xe0.c;
import java.util.Map;
import com.reddit.domain.survey.model.Survey;
import javax.inject.Inject;
import sg2.e;
import com.reddit.session.o;

public final class a implements b
{
    public final o a;
    
    @Inject
    public a(final o a) {
        e.f((Object)a, "sessionManager");
        this.a = a;
    }
    
    public final float a(final Survey survey, final Map<c, xe0.b> map) {
        e.f((Object)survey, "survey");
        e.f((Object)map, "activeDdgVariants");
        final int hashCode = ml0.a.c0(lw0.b.s1(new Object[] { ((d)this.a.l()).getDeviceId(), new c(survey.getId-3R70BXE()), map.get(new c(survey.getId-3R70BXE())) }), "_", false).hashCode();
        return ((Random)new XorWowRandom(hashCode, hashCode >> 31)).nextFloat();
    }
}
