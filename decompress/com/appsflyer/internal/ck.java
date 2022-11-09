// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import X.5an;
import X.5dv;
import X.5aq;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.ContentResolver;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import android.net.Uri;
import android.database.Cursor;
import java.util.Map;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class ck extends cf
{
    static {
        Covode.recordClassIndex(2675);
    }
    
    public ck(final Runnable runnable) {
        super("samsung", runnable);
    }
    
    @Override
    public final void AFKeystoreWrapper(final Context context) {
        this.valueOf(context, new ax<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", new String[] { "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901" }) {
            static {
                Covode.recordClassIndex(2676);
            }
            
            public static void AFInAppEventParameterName(final String s, final Map<String, Object> map, final Cursor cursor) {
                final int columnIndex = cursor.getColumnIndex(s);
                if (columnIndex == -1) {
                    return;
                }
                final long long1 = cursor.getLong(columnIndex);
                if (long1 == 0L) {
                    return;
                }
                map.put(s, long1);
            }
            
            private Map<String, Object> AFInAppEventType() {
                final Cursor cursor = null;
                Cursor cursor3;
                final Cursor cursor2 = cursor3 = null;
                Cursor cursor4 = cursor;
                try {
                    Label_0482: {
                        Label_0476: {
                            Cursor com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                            try {
                                final ContentResolver contentResolver = super.AFInAppEventType.getContentResolver();
                                cursor3 = cursor2;
                                cursor4 = cursor;
                                cursor3 = cursor2;
                                cursor4 = cursor;
                                final StringBuilder sb = new StringBuilder("content://");
                                cursor3 = cursor2;
                                cursor4 = cursor;
                                sb.append(super.values);
                                cursor3 = cursor2;
                                cursor4 = cursor;
                                com_appsflyer_internal_ck$3_android_content_ContentResolver_query = com_appsflyer_internal_ck$3_android_content_ContentResolver_query(contentResolver, Uri.parse(sb.toString()), null, null, null, null);
                                if (com_appsflyer_internal_ck$3_android_content_ContentResolver_query != null) {
                                    cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                    cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                    if (com_appsflyer_internal_ck$3_android_content_ContentResolver_query.moveToFirst()) {
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        ck.this.values.put("response", "OK");
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        valueOf("referrer", ck.this.values, com_appsflyer_internal_ck$3_android_content_ContentResolver_query);
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        AFInAppEventParameterName("click_ts", ck.this.values, com_appsflyer_internal_ck$3_android_content_ContentResolver_query);
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        AFInAppEventParameterName("install_begin_ts", ck.this.values, com_appsflyer_internal_ck$3_android_content_ContentResolver_query);
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        AFInAppEventParameterName("install_end_ts", ck.this.values, com_appsflyer_internal_ck$3_android_content_ContentResolver_query);
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        valueOf("organic_keywords", ck.this.values, com_appsflyer_internal_ck$3_android_content_ContentResolver_query);
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        valueOf("attr_type", ck.this.values, com_appsflyer_internal_ck$3_android_content_ContentResolver_query);
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        final HashMap hashMap = new HashMap();
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        final int columnIndex = com_appsflyer_internal_ck$3_android_content_ContentResolver_query.getColumnIndex("instant");
                                        if (columnIndex != -1) {
                                            cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                            cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                            final String string = com_appsflyer_internal_ck$3_android_content_ContentResolver_query.getString(columnIndex);
                                            if (string != null) {
                                                cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                                cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                                hashMap.put("instant", Boolean.parseBoolean(string));
                                            }
                                        }
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        AFInAppEventParameterName("click_server_ts", hashMap, com_appsflyer_internal_ck$3_android_content_ContentResolver_query);
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        AFInAppEventParameterName("install_begin_server_ts", hashMap, com_appsflyer_internal_ck$3_android_content_ContentResolver_query);
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        valueOf("install_version", hashMap, com_appsflyer_internal_ck$3_android_content_ContentResolver_query);
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        if (!hashMap.isEmpty()) {
                                            cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                            cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                            ck.this.values.put("custom", hashMap);
                                        }
                                    }
                                    else {
                                        cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                        ck.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                                    }
                                }
                                else {
                                    cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                    cursor4 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                                    ck.this.values.put("response", "SERVICE_UNAVAILABLE");
                                }
                            }
                            catch (final Exception ex) {
                                cursor4 = cursor3;
                                ck.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                                cursor4 = cursor3;
                                AFLogger.valueOf(ex.getMessage(), ex);
                                if (cursor3 != null) {
                                    break Label_0476;
                                }
                                break Label_0482;
                            }
                            if (com_appsflyer_internal_ck$3_android_content_ContentResolver_query == null) {
                                break Label_0482;
                            }
                            cursor3 = com_appsflyer_internal_ck$3_android_content_ContentResolver_query;
                        }
                        cursor3.close();
                    }
                    final String packageName = ((PackageItemInfo)super.AFInAppEventType.getPackageManager().resolveContentProvider(super.values, 128)).packageName;
                    ck.this.values.put("api_ver", ac.valueOf(super.AFInAppEventType, packageName));
                    ck.this.values.put("api_ver_name", ac.values(super.AFInAppEventType, packageName));
                    ck.this.AFKeystoreWrapper();
                    return ck.this.values;
                }
                finally {
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                }
            }
            
            public static Cursor com_appsflyer_internal_ck$3_android_content_ContentResolver_query(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
                MethodCollector.i(5940);
                final 5an liz = new 5aq().LIZ(240004, "android/content/ContentResolver", "query", (Object)contentResolver, new Object[] { uri, array, s, array2, s2 }, "android.database.Cursor", new 5dv(false));
                Cursor query;
                if (liz.LIZ) {
                    query = (Cursor)liz.LIZIZ;
                }
                else {
                    query = contentResolver.query(uri, array, s, array2, s2);
                }
                MethodCollector.o(5940);
                return query;
            }
            
            public static void valueOf(final String s, final Map<String, Object> map, final Cursor cursor) {
                final int columnIndex = cursor.getColumnIndex(s);
                if (columnIndex == -1) {
                    return;
                }
                final String string = cursor.getString(columnIndex);
                if (string == null) {
                    return;
                }
                map.put(s, string);
            }
        });
    }
}
