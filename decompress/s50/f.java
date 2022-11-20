// 
// Decompiled by Procyon v0.6.0
// 

package s50;

import com.reddit.data.predictions.RedditPredictionsRepository;
import pd0.n;
import ff0.t1;
import com.reddit.session.o;
import x40.e0;
import com.reddit.data.predictions.RemoteGqlPredictionsDataSource;
import wu1.b;
import xd0.s;
import xd0.b0;
import com.reddit.postsubmit.data.RedditPostSubmitRepository;
import wa0.t;
import s61.e;
import y50.f0;
import x40.l0;
import o50.c;
import com.reddit.data.postsubmit.RemotePostSubmitDataSource;
import s61.g;
import com.reddit.data.postsubmit.remote.RemoteGqlPostRequirementsDataSource;
import q20.a;
import javax.inject.Provider;
import ne2.d;

public final class f implements d
{
    public final int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final Provider i;
    public final Provider j;
    public final Provider k;
    public final Provider l;
    
    public f(final Provider b, final Provider c, final Provider d, final Provider e, final Provider f, final Provider g, final Provider h, final Provider i, final Provider j, final Provider k, final Provider l, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new RedditPostSubmitRepository((a)this.b.get(), (RemoteGqlPostRequirementsDataSource)this.c.get(), (g)this.d.get(), (RemotePostSubmitDataSource)this.e.get(), (c)this.f.get(), (l0)this.g.get(), (o50.g)this.h.get(), (f0)this.i.get(), (e)this.j.get(), (t)this.k.get(), (d20.a)this.l.get());
            }
            case 1: {
                return new com.reddit.frontpage.presentation.search.subreddit.a((yo0.a)this.b.get(), (p20.c)this.c.get(), (tk0.a)this.d.get(), (b0)this.e.get(), (q20.c)this.f.get(), (bv1.f)this.g.get(), (h22.f)this.h.get(), (kg0.a)this.i.get(), (s)this.j.get(), (b)this.k.get(), (wu1.a)this.l.get());
            }
            case 0: {
                return new RedditPredictionsRepository((RemoteGqlPredictionsDataSource)this.b.get(), (e0)this.c.get(), (od0.b)this.d.get(), (hd0.a)this.e.get(), (a)this.f.get(), (te0.a)this.g.get(), (jr0.a)this.h.get(), (o)this.i.get(), (t1)this.j.get(), (n)this.k.get(), (d20.a)this.l.get());
            }
        }
    }
}
