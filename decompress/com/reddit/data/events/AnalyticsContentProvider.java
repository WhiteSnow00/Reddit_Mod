// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events;

import android.database.Cursor;
import android.content.Context;
import eg.n0;
import android.content.ContentValues;
import ah2.f;
import android.net.Uri;
import kotlin.Metadata;
import android.content.ContentProvider;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/reddit/data/events/AnalyticsContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class AnalyticsContentProvider extends ContentProvider
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
        final Context context = this.getContext();
        f.c((Object)context);
        n0.A = context.getApplicationContext();
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
