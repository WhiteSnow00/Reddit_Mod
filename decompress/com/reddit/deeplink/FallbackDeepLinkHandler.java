// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.deeplink;

import jc0.c;
import android.content.Context;
import com.reddit.errorreporting.domain.DeeplinkHandleResult;
import com.reddit.errorreporting.domain.DeeplinkType;
import android.net.Uri;
import android.content.Intent;
import javax.inject.Inject;
import ng2.e;
import hc0.d;
import hg0.b;
import android.app.Activity;
import mg2.a;

public final class FallbackDeepLinkHandler
{
    public final a<Activity> a;
    public final dw0.a b;
    public final b c;
    public final d d;
    
    @Inject
    public FallbackDeepLinkHandler(final a<? extends Activity> a, final dw0.a b, final b c, final d d) {
        e.f((Object)a, "getActivity");
        e.f((Object)b, "redditLogger");
        e.f((Object)c, "deeplinkErrorReportingUseCase");
        e.f((Object)d, "screenNavigator");
        this.a = (a<Activity>)a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final Intent intent) {
        Uri data;
        if ((data = (Uri)intent.getParcelableExtra("com.reddit.extra.uri")) == null && (data = intent.getData()) == null) {
            return;
        }
        if (!e.a((Object)data.getScheme(), (Object)"http") && !e.a((Object)data.getScheme(), (Object)"https")) {
            this.b.j((a)new FallbackDeepLinkHandler$handleDeepLink$1(data));
            final b c = this.c;
            final DeeplinkType deep_LINK = DeeplinkType.DEEP_LINK;
            final DeeplinkHandleResult invalid = DeeplinkHandleResult.INVALID;
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid deeplink: ");
            sb.append(data);
            c.a(deep_LINK, invalid, sb.toString());
            ((Activity)this.a.invoke()).startActivity(this.d.d((Context)this.a.invoke()));
        }
        else {
            final d d = this.d;
            final Context context = (Context)this.a.invoke();
            final String string = data.toString();
            e.e((Object)string, "uri.toString()");
            ((c)d).K2(context, string, false);
        }
    }
}
