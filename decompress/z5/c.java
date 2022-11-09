// 
// Decompiled by Procyon v0.6.0
// 

package z5;

import j0.i;
import ii.k;
import eg.e1;
import eg.k0;
import eg.t1;
import com.android.billingclient.api.d0;
import android.util.Log;
import android.util.Pair;
import xe.j;
import ii.h;
import com.google.firebase.iid.a$a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.reddit.data.events.models.components.Post;
import com.reddit.data.events.models.AnalyticsPlatform;
import s40.e$a;
import d22.g;
import z10.w;
import com.reddit.common.ThingType;
import com.reddit.data.events.models.components.Post$Builder;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.ILink;
import com.instabug.apm.logger.APMLogger;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import android.app.Activity;
import com.reddit.data.events.models.Event;
import s40.e;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import okhttp3.Call$Factory;
import okhttp3.HttpUrl;
import java.util.concurrent.ConcurrentHashMap;
import ah2.f;
import wk.d;
import xe.a;
import ig.m0;

public final class c implements m0, a, d
{
    public Object f = "";
    public Object g = "";
    public Object h = h;
    
    public final void a(final Activity activity) {
        final String s = (String)this.g;
        if (s != null && !s.isEmpty()) {
            final wk.c c = (wk.c)this.h;
            if (c != null) {
                c.c(activity, System.nanoTime(), (String)this.g);
            }
        }
    }
    
    public final void a(final String g) {
        Label_0193: {
            Label_0188: {
                long n;
                long n2;
                Activity activity;
                wk.c c;
                if (((String)this.f).equals("") && ((String)this.g).equals("")) {
                    n = System.currentTimeMillis();
                    n2 = System.nanoTime();
                    activity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
                    if (activity == null) {
                        break Label_0188;
                    }
                    c = (wk.c)this.h;
                    if (c == null) {
                        break Label_0188;
                    }
                }
                else {
                    final Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
                    final long nanoTime = System.nanoTime();
                    Label_0125: {
                        if (currentActivity != null) {
                            final wk.c c2 = (wk.c)this.h;
                            if (c2 != null) {
                                c2.c(currentActivity, nanoTime, (String)this.g);
                                break Label_0125;
                            }
                        }
                        APMLogger.d("Can not stop tracing the current screen because Activity is null");
                    }
                    this.f = this.g;
                    n = System.currentTimeMillis();
                    n2 = System.nanoTime();
                    activity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
                    if (activity == null) {
                        break Label_0188;
                    }
                    c = (wk.c)this.h;
                    if (c == null) {
                        break Label_0188;
                    }
                }
                c.d(activity, g, n, n2);
                break Label_0193;
            }
            APMLogger.d("Can not trace the current screen because Activity is null");
        }
        this.g = g;
    }
    
    public final c b(final ILink link) {
        ah2.f.f((Object)link, "link");
        if (!(link instanceof Link)) {
            return null;
        }
        final Post$Builder id = new Post$Builder().id(w.e(link.getId(), ThingType.LINK));
        final Link link2 = (Link)link;
        final Post$Builder domain = id.type(ah.a.o(link2)).title(link2.getTitle()).url(link2.getUrl()).domain(link2.getDomain());
        final int b = d22.g.b;
        this.h = domain.created_timestamp(Long.valueOf(d22.g.a(link.getCreatedUtc())));
        return this;
    }
    
    public final void c() {
        final e e = (e)this.f;
        final Event.Builder builder = (Event.Builder)this.g;
        final Post$Builder post$Builder = (Post$Builder)this.h;
        Post build;
        if (post$Builder != null) {
            build = post$Builder.build();
        }
        else {
            build = null;
        }
        final Event.Builder noun = builder.post(build).source("feed").action("remove").noun("ad");
        ah2.f.e((Object)noun, "builder\n        .post(po\u2026ove\")\n        .noun(\"ad\")");
        e$a.b(e, noun, (lw1.a)null, (AnalyticsPlatform)null, false, (String)null, (Boolean)null, 126);
    }
    
    public final Object then(xe.g g) {
        final FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId)this.f;
        final String s = (String)this.g;
        final String s2 = (String)this.h;
        final String f = firebaseInstanceId.f();
        Object o = FirebaseInstanceId.j;
        final String g2 = firebaseInstanceId.g();
        synchronized (o) {
            final a$a b = a$a.b(((com.google.firebase.iid.a)o).a.getString(com.google.firebase.iid.a.b(g2, s, s2), (String)null));
            monitorexit(o);
            if (!firebaseInstanceId.j(b)) {
                g = j.e(new h(b.a));
                return g;
            }
            o = firebaseInstanceId.e;
            final ii.c c = new ii.c(firebaseInstanceId, f, s, s2, b);
            synchronized (o) {
                final Pair pair = new Pair((Object)s, (Object)s2);
                g = (xe.g)((i)((k)o).b).getOrDefault((Object)pair, (Object)null);
                if (g != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        final String value = String.valueOf(pair);
                        final StringBuilder sb = new StringBuilder(value.length() + 29);
                        sb.append("Joining ongoing request for: ");
                        sb.append(value);
                        Log.d("FirebaseInstanceId", sb.toString());
                    }
                    monitorexit(o);
                }
                else {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        final String value2 = String.valueOf(pair);
                        final StringBuilder sb2 = new StringBuilder(value2.length() + 24);
                        sb2.append("Making new request for: ");
                        sb2.append(value2);
                        Log.d("FirebaseInstanceId", sb2.toString());
                    }
                    g = c.b().h(((k)o).a, (a)new d0(9, o, (Object)pair));
                    ((i)((k)o).b).put((Object)pair, (Object)g);
                }
                return g;
            }
        }
    }
}
