// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import sf2.o;
import ov.d;
import java.util.List;
import nf2.c0;
import java.util.concurrent.Callable;
import q6.j;
import nf2.a;
import com.reddit.domain.model.search.Query;
import javax.inject.Inject;
import ah2.f;
import h60.i0;
import javax.inject.Provider;

public final class y0 implements l0
{
    public final Provider<i0> a;
    
    @Inject
    public y0(final Provider<i0> a) {
        f.f((Object)a, "queryDaoProvider");
        this.a = a;
    }
    
    @Override
    public final a a(final Query query) {
        f.f((Object)query, "query");
        final a q = nf2.a.q((Callable)new j(3, this, query));
        f.e((Object)q, "fromCallable {\n        q\u2026     ),\n        )\n      }");
        return q;
    }
    
    @Override
    public final c0<List<Query>> b() {
        final Object value = this.a.get();
        f.e(value, "queryDaoProvider.get()");
        final c0 w = ((i0)value).A1().w((o)new d(5));
        f.e((Object)w, "queryDao.findQueriesTime\u2026      )\n        }\n      }");
        return (c0<List<Query>>)w;
    }
    
    @Override
    public final a c(final Query query) {
        final Object value = this.a.get();
        f.e(value, "queryDaoProvider.get()");
        final i0 i0 = (i0)value;
        final String query2 = query.getQuery();
        String subreddit = query.getSubreddit();
        if (subreddit == null) {
            subreddit = "";
        }
        String subredditId = query.getSubredditId();
        if (subredditId == null) {
            subredditId = "";
        }
        String userSubreddit = query.getUserSubreddit();
        if (userSubreddit == null) {
            userSubreddit = "";
        }
        String userSubredditKindWithId = query.getUserSubredditKindWithId();
        if (userSubredditKindWithId == null) {
            userSubredditKindWithId = "";
        }
        String flairText = query.getFlairText();
        if (flairText == null) {
            flairText = "";
        }
        String flairApiText = query.getFlairApiText();
        if (flairApiText == null) {
            flairApiText = "";
        }
        String flairRichText = query.getFlairRichText();
        if (flairRichText == null) {
            flairRichText = "";
        }
        String flairTextColor = query.getFlairTextColor();
        if (flairTextColor == null) {
            flairTextColor = "";
        }
        String flairBackgroundColorHex = query.getFlairBackgroundColorHex();
        if (flairBackgroundColorHex == null) {
            flairBackgroundColorHex = "";
        }
        return i0.t0(query2, subreddit, subredditId, userSubreddit, userSubredditKindWithId, flairText, flairRichText, flairTextColor, flairBackgroundColorHex, flairApiText);
    }
}
