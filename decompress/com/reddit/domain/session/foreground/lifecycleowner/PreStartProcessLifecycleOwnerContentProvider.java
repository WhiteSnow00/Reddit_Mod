// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.session.foreground.lifecycleowner;

import android.database.Cursor;
import android.content.Context;
import android.app.Application$ActivityLifecycleCallbacks;
import me0.a;
import android.app.Application;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import android.os.Handler;
import android.os.Looper;
import me0.b;
import android.content.ContentValues;
import ah2.f;
import android.net.Uri;
import kotlin.Metadata;
import android.content.ContentProvider;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/reddit/domain/session/foreground/lifecycleowner/PreStartProcessLifecycleOwnerContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class PreStartProcessLifecycleOwnerContentProvider extends ContentProvider
{
    public final int delete(final Uri uri, final String s, final String[] array) {
        f.f((Object)uri, "uri");
        return 0;
    }
    
    public final String getType(final Uri uri) {
        f.f((Object)uri, "uri");
        return null;
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        f.f((Object)uri, "uri");
        return null;
    }
    
    public final boolean onCreate() {
        final b f = b.f;
        final Context context = this.getContext();
        ah2.f.c((Object)context);
        final Context applicationContext = context.getApplicationContext();
        ah2.f.e((Object)applicationContext, "context!!.applicationContext");
        final Handler l = new Handler(Looper.getMainLooper());
        final r m = new r((q)f);
        if (!b.g) {
            b.l = l;
            m.f(Lifecycle.Event.ON_CREATE);
            b.m = m;
            final Context applicationContext2 = applicationContext.getApplicationContext();
            ah2.f.d((Object)applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application)applicationContext2).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new a());
            b.g = true;
        }
        return true;
    }
    
    public final Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        f.f((Object)uri, "uri");
        return null;
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        f.f((Object)uri, "uri");
        return 0;
    }
}
