// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.external.richtext;

import com.reddit.vault.data.local.LocalCommunitiesDataSource$allCommunities$$inlined$map$2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x82.h;
import hj2.e;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import u82.a;
import java.util.ArrayList;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import x82.o;
import kotlin.Metadata;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.external.richtext.BurnLinkPostProcessingDelegate$postProcessRichText$2$pointsIconUrl$1", f = "BurnLinkPostProcessingDelegate.kt", l = { 53 }, m = "invokeSuspend")
final class BurnLinkPostProcessingDelegate$postProcessRichText$2$pointsIconUrl$1 extends SuspendLambda implements p<b0, c<? super String>, Object>
{
    public final /* synthetic */ o.c $deepLink;
    public int label;
    
    public BurnLinkPostProcessingDelegate$postProcessRichText$2$pointsIconUrl$1(final o.c $deepLink, final c<? super BurnLinkPostProcessingDelegate$postProcessRichText$2$pointsIconUrl$1> c) {
        this.$deepLink = $deepLink;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new BurnLinkPostProcessingDelegate$postProcessRichText$2$pointsIconUrl$1(this.$deepLink, (c<? super BurnLinkPostProcessingDelegate$postProcessRichText$2$pointsIconUrl$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super String> c) {
        return ((BurnLinkPostProcessingDelegate$postProcessRichText$2$pointsIconUrl$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(o);
        }
        else {
            b.k0(o);
            Label_0243: {
                if (o90.b.a) {
                    synchronized (o90.b.b) {
                        final LinkedHashSet c = o90.b.c;
                        o = new ArrayList();
                        for (final Object next : c) {
                            if (next instanceof a) {
                                ((ArrayList<Object>)o).add(next);
                            }
                        }
                        o = CollectionsKt___CollectionsKt.d4((List)o);
                        if (o != null) {
                            break Label_0243;
                        }
                        o = new StringBuilder();
                        ((StringBuilder)o).append("Unable to find a component of type ");
                        ((StringBuilder)o).append(a.class.getSimpleName());
                        coroutine_SUSPENDED = new IllegalStateException(((StringBuilder)o).toString().toString());
                        throw coroutine_SUSPENDED;
                    }
                }
                final LinkedHashSet c2 = o90.b.c;
                final ArrayList list = new ArrayList();
                for (final Object next2 : c2) {
                    if (next2 instanceof a) {
                        list.add(next2);
                    }
                }
                o = CollectionsKt___CollectionsKt.d4((List)list);
                if (o == null) {
                    throw new IllegalStateException(aw.b.e((Class)a.class, a.r("Unable to find a component of type ")));
                }
            }
            final LocalCommunitiesDataSource$allCommunities$$inlined$map$2 c3 = ((a)o).q8().c();
            this.label = 1;
            if ((o = kotlinx.coroutines.flow.a.z((e)c3, (c)this)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final List list2 = (List)o;
        Object n = null;
        if (list2 != null) {
            final o.c $deepLink = this.$deepLink;
            final Iterator iterator3 = list2.iterator();
            while (true) {
                while (iterator3.hasNext()) {
                    o = iterator3.next();
                    if (cj2.j.F0(((h)o).w, $deepLink.i, true)) {
                        final h h = (h)o;
                        n = n;
                        if (h != null) {
                            n = h.n;
                            return n;
                        }
                        return n;
                    }
                }
                o = null;
                continue;
            }
        }
        return n;
    }
}
