// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.Iterator;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.net.Uri;
import java.security.cert.Certificate;
import android.content.pm.Signature;
import X.0II;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.text.TextUtils;
import X.6Tl;
import X.NQO;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.appsflyer.AFLogger;
import android.os.Process;
import android.content.Intent;
import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.android.billingclient.api.Purchase;
import java.util.List;
import java.util.Map;

public final class ac
{
    public final Map<String, String> AFInAppEventParameterName;
    public final List<Purchase> AFInAppEventType;
    public final boolean valueOf;
    public final boolean values;
    
    static {
        Covode.recordClassIndex(2578);
    }
    
    public ac() {
    }
    
    public ac(final boolean valueOf, final boolean values, final List<Purchase> afInAppEventType, final Map<String, String> afInAppEventParameterName) {
        this.valueOf = valueOf;
        this.values = values;
        this.AFInAppEventType = afInAppEventType;
        this.AFInAppEventParameterName = afInAppEventParameterName;
    }
    
    public static boolean AFInAppEventParameterName() {
        return Build.BRAND.equals("OPPO");
    }
    
    public static boolean AFKeystoreWrapper(final Context context, final Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }
    
    public static boolean AFKeystoreWrapper(final Context context, final String s) {
        if (s != null) {
            final int checkPermission = context.checkPermission(s, Process.myPid(), Process.myUid());
            final StringBuilder sb = new StringBuilder("is Permission Available: ");
            sb.append(s);
            sb.append("; res: ");
            sb.append(checkPermission);
            AFLogger.AFInAppEventParameterName(sb.toString());
            return checkPermission == 0;
        }
        throw new IllegalArgumentException("permission is null");
    }
    
    public static PackageInfo INVOKEVIRTUAL_com_appsflyer_internal_ac_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(final PackageManager packageManager, final String s, final int n) {
        final Context liz = NQO.LJJ.LIZ();
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 128) {
            if (6Tl.LIZIZ == null) {
                6Tl.LIZIZ = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LIZIZ;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 0) {
            if (6Tl.LIZLLL == null) {
                6Tl.LIZLLL = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LIZLLL;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 64) {
            if (6Tl.LJ == null) {
                6Tl.LJ = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LJ;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 8) {
            if (6Tl.LJFF == null) {
                6Tl.LJFF = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LJFF;
        }
        return packageManager.getPackageInfo(s, n);
    }
    
    public static long valueOf(final Context context, final String s) {
        try {
            final PackageInfo invokevirtual_com_appsflyer_internal_ac_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo = INVOKEVIRTUAL_com_appsflyer_internal_ac_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(context.getPackageManager(), s, 0);
            if (Build$VERSION.SDK_INT >= 28) {
                return invokevirtual_com_appsflyer_internal_ac_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo.getLongVersionCode();
            }
            return invokevirtual_com_appsflyer_internal_ac_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo.versionCode;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            AFLogger.valueOf(((Throwable)ex).getMessage(), (Throwable)ex);
            return 0L;
        }
    }
    
    public static String values(final Context context, final String s) {
        try {
            return INVOKEVIRTUAL_com_appsflyer_internal_ac_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(context.getPackageManager(), s, 0).versionName;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            AFLogger.valueOf(((Throwable)ex).getMessage(), (Throwable)ex);
            return "";
        }
    }
    
    public static String values(final PackageManager packageManager, final String s) {
        MethodCollector.i(6334);
        final Signature[] signatures = INVOKEVIRTUAL_com_appsflyer_internal_ac_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(packageManager, s, 64).signatures;
        if (signatures == null) {
            MethodCollector.o(6334);
            return null;
        }
        final Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatures[0].toByteArray()));
        final MessageDigest instance = MessageDigest.getInstance("SHA256");
        instance.update(generateCertificate.getEncoded());
        final String liz = 0II.LIZ("%032X", new Object[] { new BigInteger(1, instance.digest()) });
        MethodCollector.o(6334);
        return liz;
    }
    
    public static Map<String, String> values(final Context context, final Map<String, String> map, final Uri uri) {
        final Iterator iterator = uri.getQueryParameterNames().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final String s = "media_source";
            if (!hasNext) {
                break;
            }
            String s2 = (String)iterator.next();
            final String queryParameter = uri.getQueryParameter(s2);
            if (!map.containsKey(s2)) {
                final int hashCode = s2.hashCode();
                if (hashCode != -1420799080) {
                    if (hashCode != 99) {
                        if (hashCode == 110987 && s2.equals("pid")) {
                            s2 = s;
                        }
                    }
                    else if (s2.equals("c")) {
                        s2 = "campaign";
                    }
                }
                else if (s2.equals("af_prt")) {
                    s2 = "agency";
                }
            }
            map.put(s2, queryParameter);
        }
        try {
            if (!map.containsKey("install_time")) {
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                final long firstInstallTime = INVOKEVIRTUAL_com_appsflyer_internal_ac_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(context.getPackageManager(), context.getPackageName(), 0).firstInstallTime;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                map.put("install_time", simpleDateFormat.format(new Date(firstInstallTime)));
            }
        }
        catch (final Exception ex) {
            AFLogger.valueOf("Could not fetch install time. ", ex);
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        final String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        final String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        final String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }
    
    public final boolean AFInAppEventType() {
        return this.values;
    }
    
    public final boolean AFKeystoreWrapper() {
        return this.valueOf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ac ac = (ac)o;
            if (this.valueOf != ac.valueOf) {
                return false;
            }
            if (this.values != ac.values) {
                return false;
            }
            if (!this.AFInAppEventType.equals(ac.AFInAppEventType)) {
                return false;
            }
            final Map<String, String> afInAppEventParameterName = this.AFInAppEventParameterName;
            final Map<String, String> afInAppEventParameterName2 = ac.AFInAppEventParameterName;
            if (afInAppEventParameterName != null) {
                return afInAppEventParameterName.equals(afInAppEventParameterName2);
            }
            if (afInAppEventParameterName2 == null) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int valueOf = this.valueOf ? 1 : 0;
        final int values = this.values ? 1 : 0;
        final int hashCode = this.AFInAppEventType.hashCode();
        final Map<String, String> afInAppEventParameterName = this.AFInAppEventParameterName;
        int hashCode2;
        if (afInAppEventParameterName != null) {
            hashCode2 = afInAppEventParameterName.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return ((valueOf * 31 + values) * 31 + hashCode) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ArsValidateRequestData{isSandbox=");
        sb.append(this.valueOf);
        sb.append(", isHistory=");
        sb.append(this.values);
        sb.append(", subscriptions=");
        sb.append(this.AFInAppEventType);
        sb.append(", additionalParams=");
        sb.append(this.AFInAppEventParameterName);
        sb.append('}');
        return sb.toString();
    }
}
