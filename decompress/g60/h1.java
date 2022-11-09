// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.queries.e8;
import com.reddit.comment.ui.presentation.b;
import com.reddit.queries.c8;
import m10.l;
import qw.c;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import com.reddit.queries.w7;
import h7.h$a;
import java.util.Iterator;
import com.reddit.data.repository.g;
import java.util.ArrayList;
import qg2.m;
import java.util.List;
import r20.d;
import a4.u1;
import sf2.o;
import pg2.j;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import nf2.c0;
import com.reddit.domain.model.Multireddit;
import javax.inject.Inject;
import ah2.f;
import r20.a;
import com.reddit.data.remote.RemoteR2MultiredditDataSource;
import ge0.t;

public final class h1 implements t
{
    public final d60.t a;
    public final RemoteR2MultiredditDataSource b;
    public final a c;
    
    @Inject
    public h1(final d60.t a, final RemoteR2MultiredditDataSource b, final a c) {
        f.f((Object)a, "remoteGql");
        f.f((Object)b, "remoteR2");
        f.f((Object)c, "backgroundThread");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final c0<Multireddit> a(final Multireddit multireddit, String s, final String s2, final Multireddit.Visibility visibility) {
        f.f((Object)multireddit, "multireddit");
        final RemoteR2MultiredditDataSource b = this.b;
        final String path-6nFwv9Y = multireddit.getPath-6nFwv9Y();
        f.f((Object)b, "$this$update");
        f.f((Object)path-6nFwv9Y, "multiredditPath");
        final JSONObject jsonObject = new JSONObject();
        if (s != null) {
            jsonObject.put("display_name", (Object)s);
        }
        if (s2 != null) {
            jsonObject.put("description_md", (Object)s2);
        }
        if (visibility != null) {
            final int n = d60.c0.a[visibility.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s = "hidden";
                }
                else {
                    s = "private";
                }
            }
            else {
                s = "public";
            }
            jsonObject.put("visibility", (Object)s);
        }
        final j a = j.a;
        final c0 w = b.updateInner-AEi484M(path-6nFwv9Y, jsonObject, false).w((o)new p(multireddit, 2)).w((o)new q(multireddit, 1));
        f.e((Object)w, "remoteR2\n      .update(\n\u2026multireddit.subreddits) }");
        return (c0<Multireddit>)u1.j1(w, (d)this.c);
    }
    
    public final c0<Multireddit> b(final Multireddit multireddit, final List<String> list) {
        f.f((Object)multireddit, "multireddit");
        final RemoteR2MultiredditDataSource b = this.b;
        final String path-6nFwv9Y = multireddit.getPath-6nFwv9Y();
        final ArrayList list2 = new ArrayList<String>(m.P0((Iterable)list, 10));
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(s20.a.h((String)iterator.next()));
        }
        final c0 w = b.addSubreddits-OhVY_gU(path-6nFwv9Y, (List<String>)list2).w((o)new g(multireddit, 2));
        f.e((Object)w, "remoteR2.addSubreddits(\n\u2026it.descriptionRichText) }");
        return (c0<Multireddit>)u1.j1(w, (d)this.c);
    }
    
    public final nf2.a c(final Multireddit multireddit, final boolean b) {
        f.f((Object)multireddit, "multireddit");
        final RemoteR2MultiredditDataSource b2 = this.b;
        final String path-6nFwv9Y = multireddit.getPath-6nFwv9Y();
        f.f((Object)b2, "$this$updateFollowed");
        f.f((Object)path-6nFwv9Y, "path");
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("path", (Object)path-6nFwv9Y);
        String s;
        if (b) {
            s = "sub";
        }
        else {
            s = "unsub";
        }
        jsonObject.put("action", (Object)s);
        return o72.f.t(b2.updateFollowedInner(jsonObject), (d)this.c);
    }
    
    public final c0<Multireddit> d(final String s, final boolean b) {
        f.f((Object)s, "path");
        final d60.t a = this.a;
        a.getClass();
        final c0 w = e$a.a((e)a.a, (k)new w7(h$a.c((Object)s), h$a.c((Object)b)), (OkHttpClient)null, (Map)null, 14).w((o)new c((Object)a, 11));
        f.e((Object)w, "graphQlClient.execute(\n \u2026ent.toDomainModel()\n    }");
        return (c0<Multireddit>)u1.j1(w, (d)this.c);
    }
    
    public final c0<Multireddit> e(final String s, final String s2, final String s3) {
        ak0.m.y(s, "displayName", s2, "description", s3, "sourcePath");
        final c0 w = this.b.copy-LuTlwXg(s, s2, s3, true).w((o)new com.reddit.data.repository.t(2, this, s2));
        f.e((Object)w, "remoteR2\n      .copy(\n  \u2026nRichText(description)) }");
        return (c0<Multireddit>)u1.j1(w, (d)this.c);
    }
    
    public final c0<Multireddit> f(final String s, final String s2) {
        f.f((Object)s, "name");
        f.f((Object)s2, "description");
        final RemoteR2MultiredditDataSource b = this.b;
        f.f((Object)b, "<this>");
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("display_name", (Object)s);
        jsonObject.put("description_md", (Object)s2);
        final c0 w = b.createInner(jsonObject).w((o)new l(4, (Object)this, (Object)s2)).w((o)new u0(3));
        f.e((Object)w, "remoteR2\n      .create(n\u2026se it's brand new\n      }");
        return (c0<Multireddit>)u1.j1(w, (d)this.c);
    }
    
    public final c0 g(final String s, final boolean b) {
        final d60.t a = this.a;
        c0 c0;
        if (b) {
            c0 = e$a.a((e)a.a, (k)new c8(h$a.c((Object)Boolean.TRUE), h$a.c((Object)s)), (OkHttpClient)null, (Map)null, 14).w((o)new b((Object)a, 4));
            f.e((Object)c0, "graphQlClient.execute(\n \u2026\n        },\n      )\n    }");
        }
        else {
            c0 = e$a.a((e)a.a, (k)new e8(h$a.c((Object)Boolean.TRUE), h$a.c((Object)s)), (OkHttpClient)null, (Map)null, 14).w((o)new he0.b((Object)a, 10));
            f.e((Object)c0, "graphQlClient.execute(\n \u2026\n        },\n      )\n    }");
        }
        return u1.j1(c0, (d)this.c);
    }
}
