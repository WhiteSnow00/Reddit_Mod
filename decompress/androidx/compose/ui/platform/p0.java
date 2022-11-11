// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import al0.b;
import com.reddit.data.events.models.AnalyticsPlatform;
import l40.e$a;
import com.reddit.events.sociallinks.SocialLinksAnalytics$PageType;
import wd.a;
import android.graphics.Matrix;
import bg.d;
import lq0.k;
import com.reddit.events.sociallinks.SocialLinksAnalytics$Action;
import com.reddit.events.sociallinks.SocialLinksAnalytics$Source;
import com.reddit.events.sociallinks.SocialLinksAnalytics$Noun;
import rg2.p;
import com.reddit.data.events.models.Event$Builder;
import com.reddit.data.events.models.components.SocialLink$Builder;
import com.reddit.data.events.models.components.ActionInfo$Builder;
import com.reddit.data.events.models.components.Profile;
import l40.e;

public final class p0
{
    public boolean a = true;
    public boolean b = true;
    public boolean c = true;
    public final Object d = d;
    public Object e = new Profile.Builder();
    public Object f = new ActionInfo$Builder();
    public Object g = new SocialLink$Builder();
    public Object h = new Event$Builder();
    
    public final void a(final SocialLinksAnalytics$Noun socialLinksAnalytics$Noun, final SocialLinksAnalytics$Source socialLinksAnalytics$Source, final SocialLinksAnalytics$Action socialLinksAnalytics$Action) {
        sg2.e.f((Object)socialLinksAnalytics$Noun, "noun");
        sg2.e.f((Object)socialLinksAnalytics$Source, "source");
        sg2.e.f((Object)socialLinksAnalytics$Action, "action");
        final Event$Builder event$Builder = (Event$Builder)this.h;
        event$Builder.noun(socialLinksAnalytics$Noun.getValue());
        event$Builder.action(socialLinksAnalytics$Action.getValue());
        event$Builder.source(socialLinksAnalytics$Source.getValue());
    }
    
    public final float[] b(final Object o) {
        Object y;
        if ((y = this.h) == null) {
            y = k.y();
            this.h = y;
        }
        if (this.b) {
            this.c = bg.d.l0(this.c(o), (float[])y);
            this.b = false;
        }
        if (!this.c) {
            y = null;
        }
        return (float[])y;
    }
    
    public final float[] c(final Object o) {
        float[] y;
        if ((y = (float[])this.g) == null) {
            y = k.y();
            this.g = y;
        }
        if (!this.a) {
            return y;
        }
        Matrix matrix;
        if ((matrix = (Matrix)this.e) == null) {
            matrix = new Matrix();
            this.e = matrix;
        }
        ((p)this.d).invoke(o, matrix);
        final Matrix e = (Matrix)this.f;
        if (e == null || !sg2.e.a((Object)matrix, (Object)e)) {
            wd.a.u0(matrix, y);
            this.e = e;
            this.f = matrix;
        }
        this.a = false;
        return y;
    }
    
    public final void d() {
        this.a = true;
        this.b = true;
    }
    
    public final void e(final SocialLinksAnalytics$PageType socialLinksAnalytics$PageType) {
        sg2.e.f((Object)socialLinksAnalytics$PageType, "pageType");
        ((ActionInfo$Builder)this.f).page_type(((Enum)socialLinksAnalytics$PageType).name());
        this.b = true;
    }
    
    public final void f(final String s, final String s2) {
        sg2.e.f((Object)s, "id");
        sg2.e.f((Object)s2, "name");
        final Profile.Builder builder = (Profile.Builder)this.e;
        builder.id(s);
        builder.name(s2);
        this.a = true;
    }
    
    public final void g() {
        if (this.b) {
            ((Event$Builder)this.h).action_info(((ActionInfo$Builder)this.f).build());
        }
        if (this.a) {
            ((Event$Builder)this.h).profile(((Profile.Builder)this.e).build());
        }
        if (this.c) {
            ((Event$Builder)this.h).social_link(((SocialLink$Builder)this.g).build());
        }
        e$a.b((e)this.d, (Event$Builder)this.h, (bw1.a)null, (AnalyticsPlatform)null, false, (String)null, (Boolean)null, 126);
    }
    
    public final void h(final String s, final String s2, final String s3, final int n, final Boolean b) {
        b.q(s, "url", s2, "type", s3, "title");
        final SocialLink$Builder socialLink$Builder = (SocialLink$Builder)this.g;
        socialLink$Builder.url(s);
        socialLink$Builder.type(s2);
        socialLink$Builder.name(s3);
        if (b != null) {
            socialLink$Builder.is_new(Boolean.valueOf((boolean)b));
        }
        if (n > 0) {
            socialLink$Builder.position(Long.valueOf((long)n));
        }
        this.c = true;
    }
}
