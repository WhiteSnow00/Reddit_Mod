// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.deeplink;

import tc0.c;
import android.content.Context;
import com.reddit.errorreporting.domain.DeeplinkHandleResult;
import com.reddit.errorreporting.domain.DeeplinkType;
import android.net.Uri;
import android.content.Intent;
import javax.inject.Inject;
import ah2.f;
import rc0.d;
import pg0.b;
import android.app.Activity;
import zg2.a;

public final class FallbackDeepLinkHandler
{
    public final a<Activity> a;
    public final jw0.a b;
    public final b c;
    public final d d;
    public final db0.a e;
    
    @Inject
    public FallbackDeepLinkHandler(final a<? extends Activity> a, final jw0.a b, final b c, final d d, final db0.a e) {
        f.f((Object)a, "getActivity");
        f.f((Object)b, "redditLogger");
        f.f((Object)c, "deeplinkErrorReportingUseCase");
        f.f((Object)d, "screenNavigator");
        f.f((Object)e, "appFeatures");
        this.a = (a<Activity>)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final Intent intent) {
        Uri data;
        if ((data = (Uri)intent.getParcelableExtra("com.reddit.extra.uri")) == null && (data = intent.getData()) == null) {
            return;
        }
        if (this.e.T8() && !f.a((Object)data.getScheme(), (Object)"http") && !f.a((Object)data.getScheme(), (Object)"https")) {
            this.b.h((a)new FallbackDeepLinkHandler$handleDeepLink$1(data));
            final b c = this.c;
            final DeeplinkType deep_LINK = DeeplinkType.DEEP_LINK;
            final DeeplinkHandleResult invalid = DeeplinkHandleResult.INVALID;
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid deeplink: ");
            sb.append(data);
            c.a(deep_LINK, invalid, sb.toString());
            ((Activity)this.a.invoke()).startActivity(this.d.b((Context)this.a.invoke()));
        }
        else {
            final d d = this.d;
            final Context context = (Context)this.a.invoke();
            final String string = data.toString();
            f.e((Object)string, "uri.toString()");
            ((c)d).Q2(context, string, false);
        }
    }
}
