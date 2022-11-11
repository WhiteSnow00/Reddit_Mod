// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.db;

import a60.i;
import a60.o;
import a60.m;
import java.util.Collections;
import a60.j;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import a60.b2;
import a60.v1;
import a60.t1;
import a60.r1;
import a60.p1;
import com.reddit.data.room.dao.c;
import a60.j1;
import a60.t0;
import a60.r0;
import a60.p0;
import a60.n0;
import a60.l0;
import a60.j0;
import a60.h0;
import a60.e0;
import a60.b0;
import a60.w;
import a60.u;
import androidx.room.RoomDatabase;
import bj0.a;
import a60.k0;
import a60.u1;
import a60.q1;
import a60.u0;
import a60.n;
import a60.c2;
import a60.e;
import a60.o0;
import a60.k;
import a60.s1;
import a60.v;
import com.reddit.data.room.dao.d;
import a60.k1;
import a60.q0;
import com.reddit.data.room.dao.f;
import a60.q;
import a60.m0;
import com.reddit.data.room.dao.h;
import a60.w1;
import a60.s0;
import bj0.b;
import a60.f0;
import a60.i0;
import a60.c0;
import a60.x;
import a60.g;

public final class RedditRoomDatabase_Impl extends RedditRoomDatabase
{
    public volatile g A;
    public volatile x B;
    public volatile c0 C;
    public volatile i0 D;
    public volatile f0 E;
    public volatile b F;
    public volatile lv.b G;
    public volatile m70.b H;
    public volatile s0 I;
    public volatile w1 J;
    public volatile h K;
    public volatile m0 L;
    public volatile q M;
    public volatile f N;
    public volatile q0 O;
    public volatile com.reddit.chat.db.b P;
    public volatile k1 Q;
    public volatile com.reddit.data.room.dao.b R;
    public volatile d S;
    public volatile v T;
    public volatile s1 U;
    public volatile k q;
    public volatile o0 r;
    public volatile a60.b s;
    public volatile e t;
    public volatile c2 u;
    public volatile n v;
    public volatile u0 w;
    public volatile q1 x;
    public volatile u1 y;
    public volatile k0 z;
    
    public final a A() {
        if (this.F != null) {
            return (a)this.F;
        }
        synchronized (this) {
            if (this.F == null) {
                this.F = new b((RoomDatabase)this);
            }
            return (a)this.F;
        }
    }
    
    public final u B() {
        if (this.T != null) {
            return (u)this.T;
        }
        synchronized (this) {
            if (this.T == null) {
                this.T = new v((RoomDatabase)this);
            }
            return (u)this.T;
        }
    }
    
    public final w C() {
        if (this.B != null) {
            return (w)this.B;
        }
        synchronized (this) {
            if (this.B == null) {
                this.B = new x((RoomDatabase)this);
            }
            return (w)this.B;
        }
    }
    
    public final b0 D() {
        if (this.C != null) {
            return (b0)this.C;
        }
        synchronized (this) {
            if (this.C == null) {
                this.C = new c0((RoomDatabase)this);
            }
            return (b0)this.C;
        }
    }
    
    public final com.reddit.chat.db.a E() {
        if (this.P != null) {
            return (com.reddit.chat.db.a)this.P;
        }
        synchronized (this) {
            if (this.P == null) {
                this.P = new com.reddit.chat.db.b((RoomDatabase)this);
            }
            return (com.reddit.chat.db.a)this.P;
        }
    }
    
    public final e0 F() {
        if (this.E != null) {
            return (e0)this.E;
        }
        synchronized (this) {
            if (this.E == null) {
                this.E = new f0((RoomDatabase)this);
            }
            return (e0)this.E;
        }
    }
    
    public final h0 G() {
        if (this.D != null) {
            return (h0)this.D;
        }
        synchronized (this) {
            if (this.D == null) {
                this.D = new i0((RoomDatabase)this);
            }
            return (h0)this.D;
        }
    }
    
    public final j0 H() {
        if (this.z != null) {
            return (j0)this.z;
        }
        synchronized (this) {
            if (this.z == null) {
                this.z = new k0((RoomDatabase)this);
            }
            return (j0)this.z;
        }
    }
    
    public final l0 I() {
        if (this.L != null) {
            return (l0)this.L;
        }
        synchronized (this) {
            if (this.L == null) {
                this.L = new m0((RoomDatabase)this);
            }
            return (l0)this.L;
        }
    }
    
    public final n0 J() {
        if (this.r != null) {
            return (n0)this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new o0((RoomDatabase)this);
            }
            return (n0)this.r;
        }
    }
    
    public final p0 K() {
        if (this.O != null) {
            return (p0)this.O;
        }
        synchronized (this) {
            if (this.O == null) {
                this.O = new q0((RoomDatabase)this);
            }
            return (p0)this.O;
        }
    }
    
    public final r0 L() {
        if (this.I != null) {
            return (r0)this.I;
        }
        synchronized (this) {
            if (this.I == null) {
                this.I = new s0((RoomDatabase)this);
            }
            return (r0)this.I;
        }
    }
    
    public final com.reddit.data.room.dao.e M() {
        if (this.N != null) {
            return (com.reddit.data.room.dao.e)this.N;
        }
        synchronized (this) {
            if (this.N == null) {
                this.N = new f((RoomDatabase)this);
            }
            return (com.reddit.data.room.dao.e)this.N;
        }
    }
    
    public final t0 N() {
        if (this.w != null) {
            return (t0)this.w;
        }
        synchronized (this) {
            if (this.w == null) {
                this.w = new u0((RoomDatabase)this);
            }
            return (t0)this.w;
        }
    }
    
    public final j1 O() {
        if (this.Q != null) {
            return (j1)this.Q;
        }
        synchronized (this) {
            if (this.Q == null) {
                this.Q = new k1((RoomDatabase)this);
            }
            return (j1)this.Q;
        }
    }
    
    public final c P() {
        if (this.S != null) {
            return (c)this.S;
        }
        synchronized (this) {
            if (this.S == null) {
                this.S = new d((RoomDatabase)this);
            }
            return (c)this.S;
        }
    }
    
    public final p1 Q() {
        if (this.x != null) {
            return (p1)this.x;
        }
        synchronized (this) {
            if (this.x == null) {
                this.x = new q1((RoomDatabase)this);
            }
            return (p1)this.x;
        }
    }
    
    public final r1 R() {
        if (this.U != null) {
            return (r1)this.U;
        }
        synchronized (this) {
            if (this.U == null) {
                this.U = new s1((RoomDatabase)this);
            }
            return (r1)this.U;
        }
    }
    
    public final t1 S() {
        if (this.y != null) {
            return (t1)this.y;
        }
        synchronized (this) {
            if (this.y == null) {
                this.y = new u1((RoomDatabase)this);
            }
            return (t1)this.y;
        }
    }
    
    public final v1 T() {
        if (this.J != null) {
            return (v1)this.J;
        }
        synchronized (this) {
            if (this.J == null) {
                this.J = new w1((RoomDatabase)this);
            }
            return (v1)this.J;
        }
    }
    
    public final com.reddit.data.room.dao.g U() {
        if (this.K != null) {
            return this.K;
        }
        synchronized (this) {
            if (this.K == null) {
                this.K = new h((RoomDatabase)this);
            }
            return this.K;
        }
    }
    
    public final lv.a V() {
        if (this.G != null) {
            return (lv.a)this.G;
        }
        synchronized (this) {
            if (this.G == null) {
                this.G = new lv.b((RoomDatabase)this);
            }
            return (lv.a)this.G;
        }
    }
    
    public final b2 W() {
        if (this.u != null) {
            return (b2)this.u;
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new c2((RoomDatabase)this);
            }
            return (b2)this.u;
        }
    }
    
    public final void d() {
        ((RoomDatabase)this).a();
        final n5.a writableDatabase = ((RoomDatabase)this).d.getWritableDatabase();
        try {
            ((RoomDatabase)this).c();
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.execSQL("DELETE FROM `account`");
            writableDatabase.execSQL("DELETE FROM `account_mutations`");
            writableDatabase.execSQL("DELETE FROM `announcement`");
            writableDatabase.execSQL("DELETE FROM `chat_goal`");
            writableDatabase.execSQL("DELETE FROM `comments`");
            writableDatabase.execSQL("DELETE FROM `comment_mutations`");
            writableDatabase.execSQL("DELETE FROM `meta_community_info`");
            writableDatabase.execSQL("DELETE FROM `crowdsource_tagging_questions`");
            writableDatabase.execSQL("DELETE FROM `discover_feed_items`");
            writableDatabase.execSQL("DELETE FROM `experiments`");
            writableDatabase.execSQL("DELETE FROM `karma_statistics`");
            writableDatabase.execSQL("DELETE FROM `link`");
            writableDatabase.execSQL("DELETE FROM `link_mutations`");
            writableDatabase.execSQL("DELETE FROM `listing`");
            writableDatabase.execSQL("DELETE FROM `listing_discovery_unit`");
            writableDatabase.execSQL("DELETE FROM `live_chats`");
            writableDatabase.execSQL("DELETE FROM `moderatorsresponse`");
            writableDatabase.execSQL("DELETE FROM `query`");
            writableDatabase.execSQL("DELETE FROM `recent_subreddits`");
            writableDatabase.execSQL("DELETE FROM `skipped_geo_tagging`");
            writableDatabase.execSQL("DELETE FROM `spans`");
            writableDatabase.execSQL("DELETE FROM `stream_subreddit_state`");
            writableDatabase.execSQL("DELETE FROM `stream_link_state`");
            writableDatabase.execSQL("DELETE FROM `subreddit`");
            writableDatabase.execSQL("DELETE FROM `subreddit_forking`");
            writableDatabase.execSQL("DELETE FROM `subreddit_leaderboard`");
            writableDatabase.execSQL("DELETE FROM `subreddit_mutations`");
            writableDatabase.execSQL("DELETE FROM `subreddit_triggered_invite`");
            writableDatabase.execSQL("DELETE FROM `subreddit_extra`");
            writableDatabase.execSQL("DELETE FROM `subreddit_pinned_posts`");
            writableDatabase.execSQL("DELETE FROM `survey_local_demo`");
            writableDatabase.execSQL("DELETE FROM `survey_status`");
            writableDatabase.execSQL("DELETE FROM `unsubmitted_pixels`");
            writableDatabase.execSQL("DELETE FROM `userSocialLink`");
            writableDatabase.execSQL("DELETE FROM `user_subreddit`");
            writableDatabase.execSQL("DELETE FROM `userMyReddits`");
            ((RoomDatabase)this).q();
        }
        finally {
            ((RoomDatabase)this).m();
            writableDatabase.d2("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.k2()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }
    
    public final j5.g g() {
        return new j5.g((RoomDatabase)this, new HashMap(0), new HashMap(0), new String[] { "account", "account_mutations", "announcement", "chat_goal", "comments", "comment_mutations", "meta_community_info", "crowdsource_tagging_questions", "discover_feed_items", "experiments", "karma_statistics", "link", "link_mutations", "listing", "listing_discovery_unit", "live_chats", "moderatorsresponse", "query", "recent_subreddits", "skipped_geo_tagging", "spans", "stream_subreddit_state", "stream_link_state", "subreddit", "subreddit_forking", "subreddit_leaderboard", "subreddit_mutations", "subreddit_triggered_invite", "subreddit_extra", "subreddit_pinned_posts", "survey_local_demo", "survey_status", "unsubmitted_pixels", "userSocialLink", "user_subreddit", "userMyReddits" });
    }
    
    public final n5.b h(final androidx.room.b b) {
        final androidx.room.h c = new androidx.room.h(b, (androidx.room.h.a)new RedditRoomDatabase_Impl$a(this), "8d7637134786b537acd3e9fa3c9303fe", "7e6c1cb650f8e639f47ad028f212d55e");
        final n5.b.b.a a = new n5.b.b.a(b.b);
        a.b = b.c;
        a.c = (n5.b.a)c;
        return b.a.a(a.a());
    }
    
    public final List i() {
        return Arrays.asList(new k5.b[0]);
    }
    
    public final Set<Class<? extends k5.a>> j() {
        return new HashSet<Class<? extends k5.a>>();
    }
    
    public final Map<Class<?>, List<Class<?>>> k() {
        final HashMap hashMap = new HashMap();
        hashMap.put(j.class, Collections.emptyList());
        hashMap.put(n0.class, Collections.emptyList());
        hashMap.put(a60.a.class, Collections.emptyList());
        hashMap.put(a60.d.class, Collections.emptyList());
        hashMap.put(b2.class, Collections.emptyList());
        hashMap.put(m.class, Collections.emptyList());
        hashMap.put(t0.class, Collections.emptyList());
        hashMap.put(p1.class, Collections.emptyList());
        hashMap.put(t1.class, Collections.emptyList());
        hashMap.put(j0.class, Collections.emptyList());
        hashMap.put(a60.f.class, Collections.emptyList());
        hashMap.put(w.class, Collections.emptyList());
        hashMap.put(b0.class, Collections.emptyList());
        hashMap.put(h0.class, Collections.emptyList());
        hashMap.put(e0.class, Collections.emptyList());
        hashMap.put(a.class, Collections.emptyList());
        hashMap.put(lv.a.class, Collections.emptyList());
        hashMap.put(m70.a.class, Collections.emptyList());
        hashMap.put(r0.class, Collections.emptyList());
        hashMap.put(v1.class, Collections.emptyList());
        hashMap.put(com.reddit.data.room.dao.g.class, Collections.emptyList());
        hashMap.put(l0.class, Collections.emptyList());
        hashMap.put(o.class, Collections.emptyList());
        hashMap.put(com.reddit.data.room.dao.e.class, Collections.emptyList());
        hashMap.put(p0.class, Collections.emptyList());
        hashMap.put(i.class, Collections.emptyList());
        hashMap.put(com.reddit.chat.db.a.class, Collections.emptyList());
        hashMap.put(j1.class, Collections.emptyList());
        hashMap.put(com.reddit.data.room.dao.a.class, Collections.emptyList());
        hashMap.put(c.class, Collections.emptyList());
        hashMap.put(u.class, Collections.emptyList());
        hashMap.put(r1.class, Collections.emptyList());
        return hashMap;
    }
    
    public final a60.a s() {
        if (this.s != null) {
            return (a60.a)this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new a60.b((RoomDatabase)this);
            }
            return (a60.a)this.s;
        }
    }
    
    public final a60.d t() {
        if (this.t != null) {
            return (a60.d)this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new e((RoomDatabase)this);
            }
            return (a60.d)this.t;
        }
    }
    
    public final a60.f u() {
        if (this.A != null) {
            return (a60.f)this.A;
        }
        synchronized (this) {
            if (this.A == null) {
                this.A = new g((RoomDatabase)this);
            }
            return (a60.f)this.A;
        }
    }
    
    public final j v() {
        if (this.q != null) {
            return (j)this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new k((RoomDatabase)this);
            }
            return (j)this.q;
        }
    }
    
    public final m w() {
        if (this.v != null) {
            return (m)this.v;
        }
        synchronized (this) {
            if (this.v == null) {
                this.v = new n((RoomDatabase)this);
            }
            return (m)this.v;
        }
    }
    
    public final m70.a x() {
        if (this.H != null) {
            return (m70.a)this.H;
        }
        synchronized (this) {
            if (this.H == null) {
                this.H = new m70.b((RoomDatabase)this);
            }
            return (m70.a)this.H;
        }
    }
    
    public final o y() {
        if (this.M != null) {
            return (o)this.M;
        }
        synchronized (this) {
            if (this.M == null) {
                this.M = new q((RoomDatabase)this);
            }
            return (o)this.M;
        }
    }
    
    public final com.reddit.data.room.dao.a z() {
        if (this.R != null) {
            return (com.reddit.data.room.dao.a)this.R;
        }
        synchronized (this) {
            if (this.R == null) {
                this.R = new com.reddit.data.room.dao.b((RoomDatabase)this);
            }
            return (com.reddit.data.room.dao.a)this.R;
        }
    }
}
