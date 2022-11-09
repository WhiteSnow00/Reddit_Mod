// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.domain.model.search.Query;
import com.reddit.events.search.SearchStructureType;
import yi0.u0;
import androidx.viewpager.widget.c;
import javax.inject.Inject;
import ah2.f;
import ex1.b;
import com.reddit.session.Session;
import android.content.SharedPreferences;
import db0.z;
import ge0.a0;
import ge0.i0;

public final class y1 implements i0
{
    public final a0 a;
    public final z b;
    public final SharedPreferences c;
    public final Session d;
    public final b e;
    
    @Inject
    public y1(final a0 a, final z b, final SharedPreferences c, final Session d, final b e) {
        f.f((Object)a, "preferenceRepository");
        f.f((Object)b, "searchFeatures");
        f.f((Object)c, "sharedPreferenceFile");
        f.f((Object)d, "activeSession");
        f.f((Object)e, "nsfwIncognitoSettings");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final boolean b) {
        if (this.d.isIncognito()) {
            this.e.c(b);
        }
        else {
            androidx.viewpager.widget.c.p(this.c, "com.reddit.data.repository.search.SAFE_SEARCH_ENABLED", b);
        }
    }
    
    public final boolean b() {
        final boolean incognito = this.d.isIncognito();
        final boolean b = true;
        boolean b2;
        if (incognito) {
            final b e = this.e;
            b2 = e.e(e.b() ^ true);
        }
        else {
            b2 = this.c.getBoolean("com.reddit.data.repository.search.SAFE_SEARCH_ENABLED", true);
        }
        return b2 && this.e() && b;
    }
    
    public final boolean c(final u0 u0, final jv1.b b) {
        f.f((Object)u0, "searchContext");
        f.f((Object)b, "filterValues");
        if (this.e() && this.a.G3() && u0.k == SearchStructureType.SEARCH) {
            final Query f = b.f;
            ah2.f.f((Object)f, "query");
            if (!ah2.f.a((Object)f.getSubredditNsfw(), (Object)Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }
    
    public final Query d(final jv1.b b, final SearchStructureType searchStructureType) {
        f.f((Object)searchStructureType, "structureType");
        final Query f = b.f;
        Label_0044: {
            if (b.i) {
                ah2.f.f((Object)f, "query");
                if (!ah2.f.a((Object)f.getSubredditNsfw(), (Object)Boolean.TRUE)) {
                    break Label_0044;
                }
            }
            if (searchStructureType == SearchStructureType.SEARCH) {
                final boolean b2 = false;
                return Query.copy$default(f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b2, null, 49151, null);
            }
        }
        final boolean b2 = true;
        return Query.copy$default(f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b2, null, 49151, null);
    }
    
    public final boolean e() {
        return (!this.d.isIncognito() && this.b.f7()) || (this.d.isIncognito() && this.b.P4());
    }
}
