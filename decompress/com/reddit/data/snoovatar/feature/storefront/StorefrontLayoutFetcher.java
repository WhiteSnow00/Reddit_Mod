// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.feature.storefront;

import com.reddit.queries.b2$d;
import com.reddit.queries.b2$a;
import com.reddit.data.snoovatar.mapper.storefront.InconsistentStorefrontData;
import com.reddit.queries.b2$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.b2;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.data.snoovatar.entity.storefront.layout.LayoutJson;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import jw0.a;
import ur0.g;

public final class StorefrontLayoutFetcher
{
    public final g a;
    public final u60.g b;
    public final a c;
    
    @Inject
    public StorefrontLayoutFetcher(final g a, final u60.g b, final a c) {
        f.f((Object)a, "gqlClient");
        f.f((Object)b, "layoutParser");
        f.f((Object)c, "redditLogger");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final c<? super LayoutJson> c) {
        StorefrontLayoutFetcher$fetchLayout.StorefrontLayoutFetcher$fetchLayout$1 storefrontLayoutFetcher$fetchLayout$2 = null;
        Label_0047: {
            if (c instanceof StorefrontLayoutFetcher$fetchLayout.StorefrontLayoutFetcher$fetchLayout$1) {
                final StorefrontLayoutFetcher$fetchLayout.StorefrontLayoutFetcher$fetchLayout$1 storefrontLayoutFetcher$fetchLayout$1 = (StorefrontLayoutFetcher$fetchLayout.StorefrontLayoutFetcher$fetchLayout$1)c;
                final int label = storefrontLayoutFetcher$fetchLayout$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    storefrontLayoutFetcher$fetchLayout$1.label = label + Integer.MIN_VALUE;
                    storefrontLayoutFetcher$fetchLayout$2 = storefrontLayoutFetcher$fetchLayout$1;
                    break Label_0047;
                }
            }
            storefrontLayoutFetcher$fetchLayout$2 = new StorefrontLayoutFetcher$fetchLayout.StorefrontLayoutFetcher$fetchLayout$1(this, (c)c);
        }
        Object o = storefrontLayoutFetcher$fetchLayout$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = storefrontLayoutFetcher$fetchLayout$2.label;
        StorefrontLayoutFetcher storefrontLayoutFetcher;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            storefrontLayoutFetcher = (StorefrontLayoutFetcher)storefrontLayoutFetcher$fetchLayout$2.L$0;
            aj2.c.Q0(o);
        }
        else {
            aj2.c.Q0(o);
            storefrontLayoutFetcher$fetchLayout$2.L$0 = this;
            storefrontLayoutFetcher$fetchLayout$2.label = 1;
            o = this.b((c<? super String>)storefrontLayoutFetcher$fetchLayout$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            storefrontLayoutFetcher = this;
        }
        final String s = (String)o;
        final Object o2 = null;
        if (s == null) {
            return null;
        }
        final Object a = storefrontLayoutFetcher.b.a(s);
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(a);
        if (exceptionOrNull-impl != null) {
            storefrontLayoutFetcher.c.c((Throwable)new StorefrontJsonParseError(exceptionOrNull-impl));
        }
        Object o3;
        if (Result.isFailure-impl(a)) {
            o3 = o2;
        }
        else {
            o3 = a;
        }
        return o3;
    }
    
    public final Object b(final c<? super String> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof StorefrontLayoutFetcher$fetchLayoutJson.StorefrontLayoutFetcher$fetchLayoutJson$1) {
                final StorefrontLayoutFetcher$fetchLayoutJson.StorefrontLayoutFetcher$fetchLayoutJson$1 storefrontLayoutFetcher$fetchLayoutJson$1 = (StorefrontLayoutFetcher$fetchLayoutJson.StorefrontLayoutFetcher$fetchLayoutJson$1)c;
                final int label = storefrontLayoutFetcher$fetchLayoutJson$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    storefrontLayoutFetcher$fetchLayoutJson$1.label = label + Integer.MIN_VALUE;
                    o = storefrontLayoutFetcher$fetchLayoutJson$1;
                    break Label_0047;
                }
            }
            o = new StorefrontLayoutFetcher$fetchLayoutJson.StorefrontLayoutFetcher$fetchLayoutJson$1(this, (c)c);
        }
        Object o2 = ((StorefrontLayoutFetcher$fetchLayoutJson.StorefrontLayoutFetcher$fetchLayoutJson$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((StorefrontLayoutFetcher$fetchLayoutJson.StorefrontLayoutFetcher$fetchLayoutJson$1)o).label;
        StorefrontLayoutFetcher storefrontLayoutFetcher;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            storefrontLayoutFetcher = (StorefrontLayoutFetcher)((StorefrontLayoutFetcher$fetchLayoutJson.StorefrontLayoutFetcher$fetchLayoutJson$1)o).L$0;
            aj2.c.Q0(o2);
        }
        else {
            aj2.c.Q0(o2);
            final b2 b2 = new b2();
            final g a = this.a;
            ((StorefrontLayoutFetcher$fetchLayoutJson.StorefrontLayoutFetcher$fetchLayoutJson$1)o).L$0 = this;
            ((StorefrontLayoutFetcher$fetchLayoutJson.StorefrontLayoutFetcher$fetchLayoutJson$1)o).label = 1;
            o2 = e$a.b(14, (k)b2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            storefrontLayoutFetcher = this;
        }
        final b2$a a2 = ((b2$c)o2).a;
        final String s = null;
        Object b4 = null;
        Label_0182: {
            if (a2 != null) {
                final b2$d b3 = a2.b;
                if (b3 != null) {
                    b4 = b3.b;
                    break Label_0182;
                }
            }
            b4 = null;
        }
        String s2;
        if (b4 instanceof String) {
            s2 = (String)b4;
        }
        else {
            storefrontLayoutFetcher.c.c((Throwable)new InconsistentStorefrontData("No dynamic storefront layout data."));
            s2 = s;
        }
        return s2;
    }
}
