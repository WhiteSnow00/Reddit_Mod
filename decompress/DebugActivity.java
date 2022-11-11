// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.debug;

import kotlinx.coroutines.JobSupport;
import java.util.Collection;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ListView;
import java.util.concurrent.CancellationException;
import mj2.r1;
import w90.cu;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ak0.m;
import w90.du;
import w90.yt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import w90.zt;
import java.util.ArrayList;
import android.widget.ListAdapter;
import android.content.Context;
import android.os.Bundle;
import zg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import java.util.Map;
import java.util.UUID;
import java.util.HashMap;
import mj2.b0;
import db0.t;
import ge0.a0;
import od0.d;
import ra0.b;
import wa0.k;
import ge0.u;
import com.reddit.session.q;
import bt0.o;
import bt0.r;
import java.util.LinkedHashMap;
import rj2.f;
import gz1.j;
import e80.h;
import com.reddit.screen.notification.controller.PushNotificationController;
import e80.e;
import b00.c;
import b00.a;
import javax.inject.Inject;
import wa0.l;
import kotlin.Metadata;
import android.app.ListActivity;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/reddit/debug/DebugActivity;", "Landroid/app/ListActivity;", "<init>", "()V", "a", "b", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class DebugActivity extends ListActivity
{
    public static final /* synthetic */ int S = 0;
    @Inject
    public l A;
    @Inject
    public b00.a B;
    @Inject
    public c C;
    @Inject
    public jw0.a D;
    @Inject
    public n22.a E;
    @Inject
    public db0.l F;
    @Inject
    public hf0.a G;
    @Inject
    public e H;
    @Inject
    public h80.a I;
    @Inject
    public PushNotificationController J;
    @Inject
    public h K;
    @Inject
    public j L;
    @Inject
    public ty1.a M;
    public int N;
    public int O;
    public f P;
    public final LinkedHashMap Q;
    public final pg2.f R;
    @Inject
    public bt0.f f;
    @Inject
    public r g;
    @Inject
    public o h;
    @Inject
    public bt0.e i;
    @Inject
    public q j;
    @Inject
    public ev.a k;
    @Inject
    public cf0.a l;
    @Inject
    public e20.a m;
    @Inject
    public u n;
    @Inject
    public k o;
    @Inject
    public bt0.a p;
    @Inject
    public ra0.b q;
    @Inject
    public d r;
    @Inject
    public a0 s;
    @Inject
    public bt0.j t;
    @Inject
    public t u;
    @Inject
    public bt0.b v;
    @Inject
    public bt0.h w;
    @Inject
    public le0.a x;
    @Inject
    public b0 y;
    @Inject
    public cm0.a z;
    
    public DebugActivity() {
        this.Q = new LinkedHashMap();
        this.R = kotlin.a.b((zg2.a)new DebugActivity$debugItems$2(this));
    }
    
    public final bt0.a a() {
        final bt0.a p = this.p;
        if (p != null) {
            return p;
        }
        ah2.f.n("appSettings");
        throw null;
    }
    
    public final h80.a b() {
        final h80.a i = this.I;
        if (i != null) {
            return i;
        }
        ah2.f.n("detailHolderNavigator");
        throw null;
    }
    
    public final bt0.j c() {
        final bt0.j t = this.t;
        if (t != null) {
            return t;
        }
        ah2.f.n("onboardingSettings");
        throw null;
    }
    
    public final q d() {
        final q j = this.j;
        if (j != null) {
            return j;
        }
        ah2.f.n("sessionManager");
        throw null;
    }
    
    public final void e(final String s, final String s2, final String s3, final boolean b) {
        ah2.f.f((Object)s2, "body");
        ah2.f.f((Object)s3, "deeplink");
        final HashMap hashMap = new HashMap();
        final String string = UUID.randomUUID().toString();
        ah2.f.e((Object)string, "randomUUID().toString()");
        hashMap.put("id", string);
        hashMap.put("type", "lifecycle_post_suggestions");
        hashMap.put("title", s);
        hashMap.put("body", s2);
        hashMap.put("deeplink", s3);
        hashMap.put("extra_event_params", "{\"arbitrary\":\"yes\",\"predefined\":\"no\"}");
        if (b) {
            hashMap.put("silent", "1");
        }
        this.f(hashMap);
    }
    
    public final void f(final HashMap hashMap) {
        final f p = this.P;
        if (p != null) {
            mj2.g.i((b0)p, (CoroutineContext)null, (CoroutineStart)null, (p)new DebugActivity$showLocalNotification$1(this, (Map)hashMap, (tg2.c)null), 3);
            return;
        }
        ah2.f.n("createdScope");
        throw null;
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((Context)this).setTheme(2132017597);
        this.setListAdapter((ListAdapter)new b((Context)this));
        Object o = new DebugActivity$onCreate$1(this);
        final Object u1;
        Label_0230: {
            if (w90.b.a) {
                synchronized (w90.b.b) {
                    final LinkedHashSet c = w90.b.c;
                    final ArrayList<Object> list = new ArrayList<Object>();
                    for (final Object next : c) {
                        if (next instanceof zt) {
                            list.add(next);
                        }
                    }
                    if (CollectionsKt___CollectionsKt.U1((List)list) != null) {
                        break Label_0230;
                    }
                    o = new StringBuilder();
                    ((StringBuilder)o).append("Unable to find a component of type ");
                    ((StringBuilder)o).append(zt.class.getSimpleName());
                    throw new IllegalStateException(((StringBuilder)o).toString().toString());
                }
            }
            final LinkedHashSet c2 = w90.b.c;
            final ArrayList list2 = new ArrayList();
            for (final Object next2 : c2) {
                if (next2 instanceof zt) {
                    list2.add(next2);
                }
            }
            u1 = CollectionsKt___CollectionsKt.U1((List)list2);
            if (u1 == null) {
                throw new IllegalStateException(a40.f.l((Class)zt.class, a.k("Unable to find a component of type ")));
            }
        }
        final Object value = ((zt)u1).k().get(DebugActivity.class);
        yt yt;
        if (value instanceof yt) {
            yt = (yt)value;
        }
        else {
            yt = null;
        }
        yt yt2 = yt;
        if (yt == null) {
            yt2 = yt;
            if (this instanceof w90.d) {
                final w90.c gl = ((w90.d)this).gl();
                Label_0392: {
                    if (gl != null) {
                        final cu ue = gl.ue();
                        if (ue != null) {
                            Object a;
                            if (!((a = ue.a) instanceof du)) {
                                a = null;
                            }
                            final du du = (du)a;
                            if (du == null) {
                                throw new IllegalStateException(zu.a.a(ue.a, a.k("Component("), ") is not an instance of (", (Class)du.class, ')'));
                            }
                            final Map subFeatureInjectors = du.getSubFeatureInjectors();
                            if (subFeatureInjectors != null) {
                                yt2 = (yt)subFeatureInjectors.get(DebugActivity.class);
                                break Label_0392;
                            }
                        }
                    }
                    yt2 = null;
                }
                if (!(yt2 instanceof yt)) {
                    yt2 = null;
                }
            }
        }
        if (yt2 == null || yt2.inject((Object)this, (zg2.a)o) == null) {
            throw new IllegalStateException(ak0.m.j((Class)x70.c.class, b.l("\n    Unable to find any FeatureInjector for target class ", "DebugActivity", " with a\n    dependency factory of type "), ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ", "DebugActivity", " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
        }
        final r1 e = ah2.c.e();
        final e20.a m = this.m;
        if (m != null) {
            this.P = mj2.g.a(((JobSupport)e).plus((CoroutineContext)m.d()).plus((CoroutineContext)h30.a.a));
            return;
        }
        ah2.f.n("dispatcherProvider");
        throw null;
    }
    
    public final void onDestroy() {
        final f p = this.P;
        if (p != null) {
            mj2.g.d((b0)p, (CancellationException)null);
        }
        super.onDestroy();
    }
    
    public final void onListItemClick(final ListView listView, final View view, final int n, final long n2) {
        ah2.f.f((Object)listView, "l");
        ah2.f.f((Object)view, "v");
        super.onListItemClick(listView, view, n, n2);
        ((List)this.R.getValue()).get(n).b.invoke();
    }
    
    public final class a
    {
        public String a;
        public zg2.a<pg2.j> b;
        
        public a(final String a, final zg2.a b) {
            ah2.f.f((Object)b, "runnable");
            this.a = a;
            this.b = (zg2.a<pg2.j>)b;
        }
        
        @Override
        public final String toString() {
            return this.a;
        }
    }
    
    public final class b extends ArrayAdapter<a>
    {
        public b(final DebugActivity debugActivity, final Context context) {
            ah2.f.f((Object)context, "context");
            super(context, 17367043);
            final int s = DebugActivity.S;
            this.addAll((Collection)debugActivity.R.getValue());
        }
    }
}
