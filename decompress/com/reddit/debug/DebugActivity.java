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
import zi2.s1;
import o90.ht;
import java.util.Iterator;
import java.util.LinkedHashSet;
import mg.d0;
import t5.w;
import o90.jt;
import o90.dt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.et;
import java.util.ArrayList;
import android.widget.ListAdapter;
import android.content.Context;
import android.os.Bundle;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import java.util.Map;
import java.util.UUID;
import java.util.HashMap;
import ws0.r;
import ws0.i;
import xd0.s;
import fd0.d;
import wc0.b;
import pa0.k;
import xd0.m;
import com.reddit.session.n;
import ws0.q;
import ws0.u;
import java.util.LinkedHashMap;
import ej2.f;
import w70.h;
import com.reddit.screen.notification.controller.PushNotificationController;
import w70.e;
import wa0.j;
import zz.c;
import pa0.l;
import zi2.c0;
import javax.inject.Inject;
import ce0.a;
import kotlin.Metadata;
import android.app.ListActivity;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/reddit/debug/DebugActivity;", "Landroid/app/ListActivity;", "<init>", "()V", "a", "b", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class DebugActivity extends ListActivity
{
    public static final int W = 0;
    @Inject
    public ce0.a A;
    @Inject
    public c0 B;
    @Inject
    public vl0.a C;
    @Inject
    public l D;
    @Inject
    public zz.a E;
    @Inject
    public c F;
    @Inject
    public dw0.a G;
    @Inject
    public x12.a H;
    @Inject
    public j I;
    @Inject
    public ye0.a J;
    @Inject
    public e K;
    @Inject
    public z70.a L;
    @Inject
    public PushNotificationController M;
    @Inject
    public h N;
    @Inject
    public qy1.j O;
    @Inject
    public dy1.a P;
    @Inject
    public z20.a Q;
    public int R;
    public int S;
    public f T;
    public final LinkedHashMap U;
    public final cg2.f V;
    @Inject
    public ws0.f f;
    @Inject
    public u g;
    @Inject
    public q h;
    @Inject
    public ws0.e i;
    @Inject
    public n j;
    @Inject
    public av.a k;
    @Inject
    public te0.a l;
    @Inject
    public d20.a m;
    @Inject
    public m n;
    @Inject
    public k o;
    @Inject
    public wc0.b p;
    @Inject
    public ws0.a q;
    @Inject
    public ka0.b r;
    @Inject
    public d s;
    @Inject
    public s t;
    @Inject
    public i u;
    @Inject
    public ws0.k v;
    @Inject
    public r w;
    @Inject
    public wa0.r x;
    @Inject
    public ws0.b y;
    @Inject
    public ws0.h z;
    
    public DebugActivity() {
        this.U = new LinkedHashMap();
        this.V = kotlin.a.b((mg2.a)new DebugActivity$debugItems$2(this));
    }
    
    public final ws0.a a() {
        final ws0.a q = this.q;
        if (q != null) {
            return q;
        }
        ng2.e.n("appSettings");
        throw null;
    }
    
    public final z70.a b() {
        final z70.a l = this.L;
        if (l != null) {
            return l;
        }
        ng2.e.n("detailHolderNavigator");
        throw null;
    }
    
    public final ws0.k c() {
        final ws0.k v = this.v;
        if (v != null) {
            return v;
        }
        ng2.e.n("onboardingSettings");
        throw null;
    }
    
    public final n d() {
        final n j = this.j;
        if (j != null) {
            return j;
        }
        ng2.e.n("sessionManager");
        throw null;
    }
    
    public final void e(final String s, final String s2, final String s3, final boolean b) {
        ng2.e.f((Object)s2, "body");
        ng2.e.f((Object)s3, "deeplink");
        final HashMap hashMap = new HashMap();
        final String string = UUID.randomUUID().toString();
        ng2.e.e((Object)string, "randomUUID().toString()");
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
        final f t = this.T;
        if (t != null) {
            zi2.g.g((c0)t, null, null, (p)new DebugActivity$showLocalNotification$1(this, (Map)hashMap, (gg2.c)null), 3);
            return;
        }
        ng2.e.n("createdScope");
        throw null;
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((Context)this).setTheme(2132017599);
        this.setListAdapter((ListAdapter)new b((Context)this));
        Object o = new DebugActivity$onCreate$1(this);
        final Object v5;
        Label_0230: {
            if (o90.b.a) {
                synchronized (o90.b.b) {
                    final LinkedHashSet c = o90.b.c;
                    final ArrayList<Object> list = new ArrayList<Object>();
                    for (final Object next : c) {
                        if (next instanceof et) {
                            list.add(next);
                        }
                    }
                    if (CollectionsKt___CollectionsKt.v5((List)list) != null) {
                        break Label_0230;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find a component of type ");
                    sb.append(et.class.getSimpleName());
                    o = new IllegalStateException(sb.toString().toString());
                    throw o;
                }
            }
            final LinkedHashSet c2 = o90.b.c;
            final ArrayList list2 = new ArrayList();
            for (final Object next2 : c2) {
                if (next2 instanceof et) {
                    list2.add(next2);
                }
            }
            v5 = CollectionsKt___CollectionsKt.v5((List)list2);
            if (v5 == null) {
                throw new IllegalStateException(aq2.a.j((Class)et.class, a.t("Unable to find a component of type ")));
            }
        }
        final Object value = ((et)v5).l().get(DebugActivity.class);
        dt dt;
        if (value instanceof dt) {
            dt = (dt)value;
        }
        else {
            dt = null;
        }
        dt dt2 = dt;
        if (dt == null) {
            dt2 = dt;
            if (this instanceof o90.d) {
                final o90.c vk = ((o90.d)this).Vk();
                Label_0392: {
                    if (vk != null) {
                        final ht be = vk.be();
                        if (be != null) {
                            Object a;
                            if (!((a = be.a) instanceof jt)) {
                                a = null;
                            }
                            final jt jt = (jt)a;
                            if (jt == null) {
                                throw new IllegalStateException(t5.w.g(be.a, a.t("Component("), ") is not an instance of (", (Class)jt.class, ')'));
                            }
                            final Map subFeatureInjectors = jt.getSubFeatureInjectors();
                            if (subFeatureInjectors != null) {
                                dt2 = (dt)subFeatureInjectors.get(DebugActivity.class);
                                break Label_0392;
                            }
                        }
                    }
                    dt2 = null;
                }
                if (!(dt2 instanceof dt)) {
                    dt2 = null;
                }
            }
        }
        if (dt2 == null || dt2.inject((Object)this, (mg2.a)o) == null) {
            throw new IllegalStateException(b5.k.i((Class)q70.c.class, d.r("\n    Unable to find any FeatureInjector for target class ", "DebugActivity", " with a\n    dependency factory of type "), ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ", "DebugActivity", " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
        }
        final s1 b = zi2.h.b();
        final d20.a m = this.m;
        if (m != null) {
            this.T = d0.c(((JobSupport)b).plus((CoroutineContext)m.d()).plus((CoroutineContext)h30.a.a));
            return;
        }
        ng2.e.n("dispatcherProvider");
        throw null;
    }
    
    public final void onDestroy() {
        final f t = this.T;
        if (t != null) {
            d0.o((c0)t, (CancellationException)null);
        }
        super.onDestroy();
    }
    
    public final void onListItemClick(final ListView listView, final View view, final int n, final long n2) {
        ng2.e.f((Object)listView, "l");
        ng2.e.f((Object)view, "v");
        super.onListItemClick(listView, view, n, n2);
        ((List)this.V.getValue()).get(n).b.invoke();
    }
    
    public final class a
    {
        public String a;
        public mg2.a<cg2.j> b;
        
        public a(final String a, final mg2.a b) {
            ng2.e.f((Object)b, "runnable");
            this.a = a;
            this.b = (mg2.a<cg2.j>)b;
        }
        
        @Override
        public final String toString() {
            return this.a;
        }
    }
    
    public final class b extends ArrayAdapter<a>
    {
        public b(final DebugActivity debugActivity, final Context context) {
            ng2.e.f((Object)context, "context");
            super(context, 17367043);
            final int w = DebugActivity.W;
            this.addAll((Collection)debugActivity.V.getValue());
        }
    }
}
