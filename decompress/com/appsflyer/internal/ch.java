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
import android.database.Cursor;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import android.net.Uri;
import java.util.Map;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class ch extends cf
{
    static {
        Covode.recordClassIndex(2670);
    }
    
    public ch(final Runnable runnable) {
        super("huawei", runnable);
    }
    
    @Override
    public final void AFKeystoreWrapper(final Context context) {
        this.valueOf(context, new ax<Map<String, Object>>(context, "com.huawei.appmarket.commondata", new String[] { "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F" }) {
            static {
                Covode.recordClassIndex(2671);
            }
            
            private Map<String, Object> AFKeystoreWrapper() {
                final String packageName = ((PackageItemInfo)super.AFInAppEventType.getPackageManager().resolveContentProvider(super.values, 128)).packageName;
                ch.this.values.put("api_ver", ac.valueOf(super.AFInAppEventType, packageName));
                ch.this.values.put("api_ver_name", ac.values(super.AFInAppEventType, packageName));
                final Cursor cursor = null;
                Cursor cursor3;
                final Cursor cursor2 = cursor3 = null;
                Cursor cursor4 = cursor;
                try {
                    Label_0543: {
                        Label_0537: {
                            Cursor com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
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
                                sb.append("/item/5");
                                cursor3 = cursor2;
                                cursor4 = cursor;
                                com_appsflyer_internal_ch$5_android_content_ContentResolver_query = com_appsflyer_internal_ch$5_android_content_ContentResolver_query(contentResolver, Uri.parse(sb.toString()), null, null, new String[] { super.AFInAppEventType.getPackageName() }, null);
                                if (com_appsflyer_internal_ch$5_android_content_ContentResolver_query != null) {
                                    cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                    cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                    if (com_appsflyer_internal_ch$5_android_content_ContentResolver_query.moveToFirst()) {
                                        cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        ch.this.values.put("response", "OK");
                                        cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        ch.this.values.put("referrer", com_appsflyer_internal_ch$5_android_content_ContentResolver_query.getString(0));
                                        cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        ch.this.values.put("click_ts", com_appsflyer_internal_ch$5_android_content_ContentResolver_query.getLong(1));
                                        cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        ch.this.values.put("install_end_ts", com_appsflyer_internal_ch$5_android_content_ContentResolver_query.getLong(2));
                                        cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        if (com_appsflyer_internal_ch$5_android_content_ContentResolver_query.getColumnCount() > 3) {
                                            cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            ch.this.values.put("install_begin_ts", com_appsflyer_internal_ch$5_android_content_ContentResolver_query.getLong(3));
                                            cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            final HashMap hashMap = new HashMap();
                                            cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            final String string = com_appsflyer_internal_ch$5_android_content_ContentResolver_query.getString(4);
                                            if (string != null) {
                                                cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                                cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                                hashMap.put("track_id", string);
                                            }
                                            cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            hashMap.put("referrer_ex", com_appsflyer_internal_ch$5_android_content_ContentResolver_query.getString(5));
                                            cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                            ch.this.values.put("huawei_custom", hashMap);
                                        }
                                    }
                                    else {
                                        cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                        ch.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                                    }
                                }
                                else {
                                    cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                    cursor4 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                                    ch.this.values.put("response", "SERVICE_UNAVAILABLE");
                                }
                            }
                            catch (final Exception ex) {
                                cursor4 = cursor3;
                                ch.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                                cursor4 = cursor3;
                                AFLogger.valueOf(ex.getMessage(), ex);
                                if (cursor3 != null) {
                                    break Label_0537;
                                }
                                break Label_0543;
                            }
                            if (com_appsflyer_internal_ch$5_android_content_ContentResolver_query == null) {
                                break Label_0543;
                            }
                            cursor3 = com_appsflyer_internal_ch$5_android_content_ContentResolver_query;
                        }
                        cursor3.close();
                    }
                    ch.this.AFKeystoreWrapper();
                    return ch.this.values;
                }
                finally {
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                }
            }
            
            public static Cursor com_appsflyer_internal_ch$5_android_content_ContentResolver_query(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
                MethodCollector.i(952);
                final 5an liz = new 5aq().LIZ(240004, "android/content/ContentResolver", "query", (Object)contentResolver, new Object[] { uri, array, s, array2, s2 }, "android.database.Cursor", new 5dv(false));
                Cursor query;
                if (liz.LIZ) {
                    query = (Cursor)liz.LIZIZ;
                }
                else {
                    query = contentResolver.query(uri, array, s, array2, s2);
                }
                MethodCollector.o(952);
                return query;
            }
        });
    }
}
