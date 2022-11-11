// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.concurrent.ExecutionException;
import X.5an;
import X.5dv;
import X.5aq;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Iterator;
import com.appsflyer.AFLogger;
import android.net.Uri;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.FutureTask;

public final class cm
{
    public final FutureTask<List<String>> valueOf;
    
    static {
        Covode.recordClassIndex(2680);
    }
    
    public cm(final Context context) {
        this.valueOf = new FutureTask<List<String>>(new Callable<List<String>>() {
            static {
                Covode.recordClassIndex(2681);
            }
            
            private List<String> AFInAppEventType() {
                final ArrayList list = new ArrayList();
                try {
                    final List queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.oem.PRELOAD_PROVIDER"), 0);
                    if (queryIntentContentProviders == null || queryIntentContentProviders.isEmpty()) {
                        return null;
                    }
                    final Iterator iterator = queryIntentContentProviders.iterator();
                    while (iterator.hasNext()) {
                        final String authority = ((ResolveInfo)iterator.next()).providerInfo.authority;
                        final StringBuilder sb = new StringBuilder("content://");
                        sb.append(authority);
                        sb.append("/preload_id");
                        final Cursor com_appsflyer_internal_cm$2_android_content_ContentResolver_query = com_appsflyer_internal_cm$2_android_content_ContentResolver_query(context.getContentResolver(), Uri.parse(sb.toString()), null, null, null, null);
                        if (com_appsflyer_internal_cm$2_android_content_ContentResolver_query != null) {
                            com_appsflyer_internal_cm$2_android_content_ContentResolver_query.moveToFirst();
                            list.add(com_appsflyer_internal_cm$2_android_content_ContentResolver_query.getString(com_appsflyer_internal_cm$2_android_content_ContentResolver_query.getColumnIndex("preload_id")));
                            com_appsflyer_internal_cm$2_android_content_ContentResolver_query.close();
                        }
                    }
                }
                catch (final Exception ex) {
                    AFLogger.valueOf(ex.getMessage(), ex);
                }
                return list;
            }
            
            public static Cursor com_appsflyer_internal_cm$2_android_content_ContentResolver_query(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
                MethodCollector.i(525);
                final 5an liz = new 5aq().LIZ(240004, "android/content/ContentResolver", "query", (Object)contentResolver, new Object[] { uri, array, s, array2, s2 }, "android.database.Cursor", new 5dv(false));
                Cursor query;
                if (liz.LIZ) {
                    query = (Cursor)liz.LIZIZ;
                }
                else {
                    query = contentResolver.query(uri, array, s, array2, s2);
                }
                MethodCollector.o(525);
                return query;
            }
        });
    }
    
    public final List<String> AFInAppEventParameterName() {
        try {
            if (this.AFKeystoreWrapper()) {
                return this.valueOf.get();
            }
            return null;
        }
        catch (final ExecutionException | InterruptedException ex) {
            return null;
        }
    }
    
    public final boolean AFKeystoreWrapper() {
        return this.valueOf.isDone();
    }
}
