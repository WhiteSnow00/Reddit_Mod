// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.AbstractMap;
import X.5an;
import X.5dv;
import X.5aq;
import java.lang.reflect.Field;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import android.view.View;
import android.os.Build$VERSION;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.content.Intent;
import android.graphics.Color;
import android.os.SystemClock;
import android.media.AudioTrack;
import android.view.KeyEvent;
import android.util.TypedValue;
import android.hardware.SensorManager;
import android.graphics.ImageFormat;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.text.AndroidCharacter;
import com.appsflyer.AFLogger;
import android.os.Process;
import android.view.View$MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.Map;
import java.util.HashMap;
import android.view.Gravity;
import X.6Tl;
import X.NQO;
import android.content.pm.PackageManager;
import X.5ek;
import java.io.File;
import android.graphics.PixelFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.telephony.PhoneNumberUtils;
import java.util.regex.Matcher;
import android.text.TextUtils;
import java.util.regex.Pattern;
import android.webkit.URLUtil;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class c
{
    public static char[] AFInAppEventParameterName;
    public static long AFInAppEventType;
    public static int valueOf;
    public static int values;
    
    static {
        Covode.recordClassIndex(2660);
        c.values = 1;
        c.AFInAppEventType = 9088409587802389276L;
        c.AFInAppEventParameterName = new char[] { '\u0018', '\u001c', 'M', 'a', 'J', '4', 'L', 'N', '7', '2', 'J', 'c', 'c', 'c', 'a', 'a', 'I', '1', '0', '1', 'L', 'K', '5', 'N', 'J', '2', 'L', 'L', 'L', 'L', 'M', 'M', '3', 'Z', '»', '½', '¿', '\u00c4', '\u00c0', 'º', '\u009d', '¢', '\u00c5', '¤', '\u008c', '¥', '¾', '\u00c8', '\u00c0', '¿', '\u00c9', '·', '«', '»', '»', '¸', 'º', '¿', '@', '\u0085', '\u0080', 'p', 'q', '~', '\u0089', '\u008c', 'p', 'M', 'f', '\u0087', 'd', '_', '|', '\u0082', '\u0086', '\u0081', '\u007f', '}', '\u001a', 'L', '9', 'm', 'f', 'j', 'n', 'p', 'Q', 'N', 'l', 'K', 'G', 'k', 'k', 'e', '\u00ce', '\u00d0', '\u0089', '\u00d8', '\u00dd', '\u0089', '\u00cd', '\u00ce', '\u00d5', '\u00d2', '\u00ca', '¯', '\u0089', '£', '\u00d7', '\u00d8', '\u00d2', '\u00dd', '\u00d9', '\u00ce', '\u00cc', '\u00e1', '\u00ce', '\u0089', '\u00d1', '\u00dd', '\u00d2', '\u00e0', '\u0089', '\u00d1', '\u00dd', '\u00ca', '\u00d9', '\u0089', '\u00ce', '\u00d1', '\u00cc', '\u00ca', '\u00cc', '\u0089', '\u00dd' };
    }
    
    public static String AFInAppEventParameterName(final Context context) {
        final int n = c.values + 33;
        c.valueOf = n % 128;
        int n2;
        if (n % 2 == 0) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        Label_0051: {
            if (n2 != 0) {
                break Label_0051;
            }
            try {
                PackageInfo packageInfo = INVOKEVIRTUAL_com_appsflyer_internal_c_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(context.getPackageManager(), context.getPackageName(), 0);
                while (true) {
                    final String packageName = packageInfo.packageName;
                    c.valueOf = (c.values + 55) % 128;
                    return packageName;
                    packageInfo = INVOKEVIRTUAL_com_appsflyer_internal_c_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(context.getPackageManager(), context.getPackageName(), 1);
                    continue;
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                return null;
            }
        }
    }
    
    public static boolean AFInAppEventParameterName(final String s) {
        c.values = (c.valueOf + 17) % 128;
        try {
            Class.forName(s);
            c.values = (c.valueOf + 53) % 128;
            return true;
        }
        catch (final ClassNotFoundException ex) {
            return false;
        }
    }
    
    public static String AFInAppEventType(final Context context) {
        Label_0194: {
            if (System.getProperties().containsKey(valueOf("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[] { 80, 14, 0, 0 }, URLUtil.isJavaScriptUrl("javascript:")).intern())) {
                break Label_0194;
            }
            int n = 0;
        Label_0058_Outer:
            while (true) {
                final String s = null;
                Label_0075: {
                    if (n == 1) {
                        break Label_0075;
                    }
                    String s2 = s;
                    while (true) {
                        c.valueOf = (c.values + 121) % 128;
                        return s2;
                        try {
                            final Matcher matcher = Pattern.compile(values("\u736c\u7a4f\u7342\u4179\u9579\ue36e\uef30\u9f41\u5e38\u66df\uf7f9\uc3d2\uab88\u52ac").intern()).matcher(INVOKEVIRTUAL_com_appsflyer_internal_c_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(context).getPath().replace(values("\u6f68\uc524\u6f47\ufe5b\u714b\u0712\ud5e8\u835f\u64df\ud9b2").intern(), ""));
                            int n2;
                            if (!matcher.find()) {
                                n2 = 57;
                            }
                            else {
                                n2 = 73;
                            }
                            s2 = s;
                            if (n2 != 57) {
                                final int n3 = c.valueOf + 95;
                                c.values = n3 % 128;
                                if (n3 % 2 == 0) {
                                    s2 = matcher.group(0);
                                }
                                else {
                                    s2 = matcher.group(1);
                                }
                                c.valueOf = (c.values + 93) % 128;
                            }
                            continue;
                            n = 1;
                            continue Label_0058_Outer;
                        }
                        catch (final Exception ex) {
                            final aj afInAppEventParameterName = aj.AFInAppEventParameterName();
                            final String intern = values("\ucb71\u300d\ucb32\u0b79\u80e9\uf6b4\u8712\u2729\u3625\u2c86\ue234\uab8c\u1397\u18fd\ucf92\ubc74\u0e12\u0b61\ubb08\u40ee\u7a9c").intern();
                            final StringBuilder sb = new StringBuilder();
                            sb.append(valueOf(null, new int[] { 94, 41, 105, 12 }, TextUtils.regionMatches((CharSequence)"", 0, (CharSequence)"", 0, 0)).intern());
                            sb.append(ex);
                            afInAppEventParameterName.AFInAppEventType(null, intern, sb.toString());
                            return null;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    public static String AFKeystoreWrapper(final Context context, final long n) {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        final StringBuilder sb3 = new StringBuilder();
        int n2;
        if (!AFInAppEventParameterName(values("\u3386\u433f\u33e7\u784d\u1105\u6759\ufb84\udff8\u4aa2\u5fa8\u73c9\ud748\ueb73\u6bd4\u5e71\uc0f3\uf6c7\u7849\u2ae2\u3c68\u825e\u94bf\u36a9\u29d3\uadbb\ua164\u051d\u054e\ub928\ubd9f\u11a4\u711b\u4496\uca0f\ufc2c\u62a1\u5002\ue6a3").intern())) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        String s;
        if (n2 != 1) {
            c.valueOf = (c.values + 91) % 128;
            s = valueOf("\u0001", new int[] { 0, 1, 0, 0 }, PhoneNumberUtils.isNonSeparator('0') ^ true);
        }
        else {
            s = values("\u8ffb\u8fcb\u47c5\u0abf\ua316");
        }
        sb2.append(s.intern());
        final StringBuilder sb4 = new StringBuilder();
        final String packageName = context.getPackageName();
        final String value = valueOf(packageName);
        sb2.append(valueOf("\u0001", new int[] { 0, 1, 0, 0 }, PhoneNumberUtils.isGlobalPhoneNumber("")).intern());
        sb4.append(value);
        int n3;
        if (AFInAppEventType(context) != null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (n3 != 1) {
            sb2.append(values("\u8ffb\u8fcb\u47c5\u0abf\ua316").intern());
            sb4.append(packageName);
        }
        else {
            sb2.append(valueOf("\u0001", new int[] { 0, 1, 0, 0 }, TextUtils.isEmpty((CharSequence)"") ^ true).intern());
            sb4.append(packageName);
        }
        final String afInAppEventParameterName = AFInAppEventParameterName(context);
        if (afInAppEventParameterName != null) {
            sb2.append(valueOf("\u0001", new int[] { 0, 1, 0, 0 }, URLUtil.isHttpsUrl("https://") ^ true).intern());
            sb4.append(afInAppEventParameterName);
        }
        else {
            c.valueOf = (c.values + 31) % 128;
            sb2.append(values("\u8ffb\u8fcb\u47c5\u0abf\ua316").intern());
            sb4.append(packageName);
        }
        sb4.append(Boolean.TRUE.toString());
        sb.append(sb4.toString());
        try {
            sb.append(new SimpleDateFormat(values("\ua3c4\ufec2\ua3bd\uc5a7\u42f1\u34b0\u54cd\u4fe0\ue5e0\ue266\u2014\u7809\u7b39\ud63f\u0db6\u6f9c\u66a5\uc5a6\u7914\u9337\u120e\u2921").intern(), Locale.US).format(new Date(INVOKEVIRTUAL_com_appsflyer_internal_c_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(context.getPackageManager(), context.getPackageName(), 0).firstInstallTime)));
            c.values = (c.valueOf + 57) % 128;
            sb.append(n);
            String s2;
            if (!AFInAppEventParameterName(valueOf("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[] { 33, 25, 84, 0 }, TextUtils.isDigitsOnly((CharSequence)"") ^ true).intern())) {
                s2 = values("\u8ffb\u8fcb\u47c5\u0abf\ua316").intern();
            }
            else {
                c.valueOf = (c.values + 5) % 128;
                s2 = valueOf("\u0001", new int[] { 0, 1, 0, 0 }, PhoneNumberUtils.isDialable('0') ^ true).intern();
                c.valueOf = (c.values + 1) % 128;
            }
            sb3.append(s2);
            int n4;
            if (!AFInAppEventParameterName(values("\ua4fd\ubb0b\ua49c\u8079\uc6ad\ub0f1\u823a\u4883\u331c\ua79c\ua461\uaef6\u7c14\u93e4\u89c7\ub94c\u61bb\u8074\ufd57\u45dd\u1572\u6cf6\ue130\u5066\u3adf\u595a\ud2b7").intern())) {
                n4 = 47;
            }
            else {
                n4 = 48;
            }
            String s3;
            if (n4 != 48) {
                s3 = values("\u8ffb\u8fcb\u47c5\u0abf\ua316");
            }
            else {
                s3 = valueOf("\u0001", new int[] { 0, 1, 0, 0 }, PhoneNumberUtils.isDialable('0') ^ true);
            }
            sb3.append(s3.intern());
            String s4;
            if (AFInAppEventParameterName(valueOf("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[] { 58, 20, 22, 0 }, URLUtil.isNetworkUrl("http://")).intern())) {
                s4 = valueOf("\u0001", new int[] { 0, 1, 0, 0 }, PixelFormat.formatHasAlpha(0));
            }
            else {
                s4 = values("\u8ffb\u8fcb\u47c5\u0abf\ua316");
            }
            sb3.append(s4.intern());
            String s6 = null;
            Label_0753: {
                String s5;
                if (!AFInAppEventParameterName(values("\uf6ee\u8f20\uf68f\ub452\u1a3c\u6c60\ua600\u1a90\u1726\u93b7\u78f0\u8acc\u2e01\ua7cb\u5550\u9d3c\u338a\ub44c\u21dd").intern())) {
                    s5 = values("\u8ffb\u8fcb\u47c5\u0abf\ua316");
                }
                else {
                    final int n5 = c.valueOf + 45;
                    c.values = n5 % 128;
                    int n6;
                    if (n5 % 2 != 0) {
                        n6 = 50;
                    }
                    else {
                        n6 = 61;
                    }
                    if (n6 == 61) {
                        s6 = valueOf("\u0001", new int[] { 0, 1, 0, 0 }, URLUtil.isContentUrl("content:") ^ false).intern();
                        break Label_0753;
                    }
                    s5 = valueOf("\u0001", new int[] { 0, 1, 0, 0 }, true ^ URLUtil.isContentUrl("content:"));
                }
                s6 = s5.intern();
            }
            sb3.append(s6);
            final String afInAppEventType = ah.AFInAppEventType(ah.AFInAppEventParameterName(sb.toString()));
            final String string = sb2.toString();
            final StringBuilder sb5 = new StringBuilder(afInAppEventType);
            sb5.setCharAt(17, Integer.toString(Integer.parseInt(string, 2), 16).charAt(0));
            final String string2 = sb5.toString();
            final String string3 = sb3.toString();
            final StringBuilder sb6 = new StringBuilder(string2);
            sb6.setCharAt(27, Integer.toString(Integer.parseInt(string3, 2), 16).charAt(0));
            return valueOf(sb6.toString(), n);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return valueOf("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[] { 1, 32, 0, 15 }, TextUtils.isDigitsOnly((CharSequence)"")).intern();
        }
    }
    
    public static File INVOKEVIRTUAL_com_appsflyer_internal_c_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(final Context context) {
        if (5ek.LIZIZ == null || !5ek.LJ) {
            return 5ek.LIZIZ = context.getCacheDir();
        }
        return 5ek.LIZIZ;
    }
    
    public static PackageInfo INVOKEVIRTUAL_com_appsflyer_internal_c_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(final PackageManager packageManager, final String s, final int n) {
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
    
    public static String valueOf(final String s) {
        c.values = (c.valueOf + 63) % 128;
        final boolean contains = s.contains(values("\u1ee2\u1ecc\u5259\ubb4c\ud949").intern());
        int i = 1;
        if (contains) {
            final String[] split = s.split(valueOf("\u0001\u0000", new int[] { 78, 2, 7, 1 }, URLUtil.isAboutUrl("about:") ^ true).intern());
            int length = split.length;
            final StringBuilder sb = new StringBuilder();
            --length;
            sb.append(split[length]);
            sb.append(values("\u1ee2\u1ecc\u5259\ubb4c\ud949").intern());
            while (i < length) {
                c.valueOf = (c.values + 45) % 128;
                sb.append(split[i]);
                sb.append(values("\u1ee2\u1ecc\u5259\ubb4c\ud949").intern());
                ++i;
            }
            sb.append(split[0]);
            return sb.toString();
        }
        c.valueOf = (c.values + 57) % 128;
        return s;
    }
    
    public static String valueOf(String string, final Long n) {
        if (string != null && n != null && string.length() == 32) {
            final StringBuilder sb = new StringBuilder(string);
            final String string2 = n.toString();
            long n2 = 0L;
            int i = 0;
            int n3 = 0;
            while (i < string2.length()) {
                n3 += Character.getNumericValue(string2.charAt(i));
                ++i;
                c.values = (c.valueOf + 5) % 128;
            }
            final String hexString = Integer.toHexString(n3);
            sb.replace(7, hexString.length() + 7, hexString);
            int n4 = 0;
            long n5;
            while (true) {
                n5 = n2;
                if (n4 >= sb.length()) {
                    break;
                }
                n2 += Character.getNumericValue(sb.charAt(n4));
                ++n4;
            }
            while (n5 > 100L) {
                final int n6 = c.valueOf + 21;
                c.values = n6 % 128;
                if (n6 % 2 == 0) {
                    n5 -= 100L;
                }
                else {
                    n5 %= 100L;
                }
            }
            sb.insert(23, (int)n5);
            if (n5 < 10L) {
                sb.insert(23, values("\u8ffb\u8fcb\u47c5\u0abf\ua316").intern());
            }
            string = sb.toString();
            c.values = (c.valueOf + 121) % 128;
            return string;
        }
        return valueOf("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[] { 1, 32, 0, 15 }, Gravity.isVertical(0) ^ true).intern();
    }
    
    public static String valueOf(String bytes, final int[] array, final boolean b) {
        final int n = 0;
        if (bytes != null) {
            bytes = (String)(Object)bytes.getBytes("ISO-8859-1");
        }
        final byte[] array2 = (Object)bytes;
        final int n2 = array[0];
        final int n3 = array[1];
        final int n4 = array[2];
        final int n5 = array[3];
        final char[] afInAppEventParameterName = c.AFInAppEventParameterName;
        char[] array3 = new char[n3];
        System.arraycopy(afInAppEventParameterName, n2, array3, 0, n3);
        if (array2 != null) {
            c.values = (c.valueOf + 37) % 128;
            final char[] array4 = new char[n3];
            int i = 0;
            int n6 = 0;
            while (i < n3) {
                if (array2[i] != 1) {
                    array4[i] = (char)((array3[i] << 1) - n6);
                }
                else {
                    array4[i] = (char)((array3[i] << 1) + 1 - n6);
                }
                n6 = array4[i];
                ++i;
            }
            array3 = array4;
        }
        if (n5 > 0) {
            final char[] array5 = new char[n3];
            System.arraycopy(array3, 0, array5, 0, n3);
            final int n7 = n3 - n5;
            System.arraycopy(array5, 0, array3, n7, n5);
            System.arraycopy(array5, n5, array3, 0, n7);
        }
        char[] array6 = array3;
        if (b) {
            array6 = new char[n3];
            int j = 0;
            while (j < n3) {
                final int n8 = c.values + 79;
                c.valueOf = n8 % 128;
                if (n8 % 2 == 0) {
                    array6[j] = array3[n3 - j - 1];
                    ++j;
                }
                else {
                    array6[j] = array3[n3 % j >>> 1];
                    j += 5;
                }
            }
        }
        int k = n;
        if (n4 > 0) {
            while (k < n3) {
                array6[k] -= (char)array[2];
                ++k;
            }
        }
        return new String(array6);
    }
    
    public static String values(final String s) {
        final int n = c.values + 89;
        c.valueOf = n % 128;
        while (true) {
            Label_0092: {
                Object charArray;
                if (n % 2 != 0) {
                    if (s != null) {
                        break Label_0092;
                    }
                    charArray = s;
                }
                else {
                    int n2;
                    if (s == null) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    charArray = s;
                    if (n2 != 1) {
                        break Label_0092;
                    }
                }
                final char[] afKeystoreWrapper = cr.AFKeystoreWrapper(c.AFInAppEventType, (char[])charArray);
                for (int i = 4; i < afKeystoreWrapper.length; ++i) {
                    afKeystoreWrapper[i] = (char)((long)(afKeystoreWrapper[i] ^ afKeystoreWrapper[i % 4]) ^ (i - 4) * c.AFInAppEventType);
                }
                final String s2 = new String(afKeystoreWrapper, 4, afKeystoreWrapper.length - 4);
                final int n3 = c.values + 7;
                c.valueOf = n3 % 128;
                int n4;
                if (n3 % 2 == 0) {
                    n4 = 5;
                }
                else {
                    n4 = 77;
                }
                if (n4 != 77) {
                    return s2;
                }
                try {
                    throw new NullPointerException("hashCode");
                }
                finally {}
            }
            Object charArray = s.toCharArray();
            c.values = (c.valueOf + 85) % 128;
            continue;
        }
    }
    
    public static final class d extends HashMap<String, Object>
    {
        public static int[] AFInAppEventParameterName;
        public static char[] AFInAppEventType;
        public static int AFVersionDeclaration;
        public static int getLevel;
        public static long valueOf;
        public final Context AFKeystoreWrapper;
        public final Map<String, Object> values;
        
        static {
            Covode.recordClassIndex(2661);
            d.AFVersionDeclaration = 1;
            d.AFInAppEventType = new char[] { (char)(-19665), (char)(-7931), '\u174b', '\u45bd', (char)(-1133), '\u29c2', '\u5e25', (char)(-29690), '\u2252', '\u50ba', (char)(-31007), '\u34d1', (char)(-11218), (char)(-31230), '\u7065', '\u22a5', (char)(-25466), '\u4ec0', '\u3920', (char)(-5345), '\u3e12', '\u6c31', (char)(-26043), (char)(-7369), (char)(-20203), '\u4779', '\u15a5', (char)(-21615), '\u79fc', '\u0e3e', (char)(-9185), '\u7257', '§', (char)(-10501), '\u64fa', '\u392c', (char)(-12436), (char)(-25278), (char)(-26965), (char)(-15202), '\u32f3', '\u6034', (char)(-8679), '\u16c7', '\u44e9', (char)(-19811), (char)(-8121), '\u5e70', (char)(-29663), (char)(-1125), '\u29ab', (char)(-30727), (char)(-2816), '\u2303', (char)(-28301), (char)(-13176), '\u3a8a', '\u68e1', (char)(-14794), '\u3444', '\u6260', 'b', '&', '\u525e', '&', '\u525d' };
            d.valueOf = -6884389957348077011L;
            d.AFInAppEventParameterName = new int[] { 264022428, -820998946, -1835969172, 545826097, 1791829078, 35725697, -876159950, -884180872, 791409275, -2126541223, 1035454124, -679804399, -620917022, 1978309802, 824869615, -147598075, -461163612, -436180871 };
        }
        
        public d(final Map<String, Object> values, final Context afKeystoreWrapper) {
            this.values = values;
            this.AFKeystoreWrapper = afKeystoreWrapper;
            ((AbstractMap<String, String>)this).put(this.AFKeystoreWrapper(), this.AFInAppEventParameterName());
        }
        
        private String AFInAppEventParameterName() {
            String s;
            try {
                final String string = this.values.get(AFInAppEventParameterName(TextUtils.getTrimmedLength((CharSequence)""), (char)(TextUtils.indexOf((CharSequence)"", '0', 0, 0) + 45903), 12 - ExpandableListView.getPackedPositionType(0L)).intern()).toString();
                final String string2 = this.values.get(AFInAppEventParameterName(24 - lcmp(ViewConfiguration.getZoomControlsTimeout(), 0L), (char)(58193 - View$MeasureSpec.makeMeasureSpec(0, 0)), 15 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()).toString();
                final String replaceAll = AFInAppEventParameterName(38 - View$MeasureSpec.getSize(0), (char)(38557 - ExpandableListView.getPackedPositionType(0L)), 5 - (Process.getThreadPriority(0) + 20 >> 6)).intern().replaceAll(values(new int[] { 554720026, 810846395, -1353340409, 1995249900 }, TextUtils.indexOf((CharSequence)"", '0', 0) + 6).intern(), "");
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(string2);
                sb.append(replaceAll);
                final String afInAppEventParameterName = ah.AFInAppEventParameterName(sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(afInAppEventParameterName.substring(0, 16));
                s = sb2.toString();
            }
            catch (final Exception ex) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(values(new int[] { 640847658, -233831226, 620669702, -1347693514, 1083507952, -1102549683, -450369102, -1732957970, 393969182, 886873569, -1952655995, 1892296752, 1890815725, -1673734706, 1444084348, -987179240, 1094281385, 992383361, 17585538, 973864474, -432527319, -1739858274 }, TextUtils.lastIndexOf((CharSequence)"", '0') + 45).intern());
                sb3.append(ex);
                AFLogger.AFInAppEventParameterName(sb3.toString());
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append(AFInAppEventParameterName(42 - lcmp(ExpandableListView.getPackedPositionForChild(0, 0), 0L), (char)(5797 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), AndroidCharacter.getMirror('0') - '\u001e').intern());
                s = sb4.toString();
            }
            try {
                final Intent invokevirtual_com_appsflyer_internal_c$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_appsflyer_internal_c$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(this.AFKeystoreWrapper, null, new IntentFilter(values(new int[] { -248593871, 418937694, 1034627370, 175927361, -56373222, 1046364932, 687343027, -368521510, 1427030466, 1568180991, -741401460, -1800867994, 1331349556, 1216887738, -1608381182, -1947019990, 948188064, 1315957742, -1365079188, 1790179928 }, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37).intern()));
                int intExtra = -2700;
                if (invokevirtual_com_appsflyer_internal_c$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver != null) {
                    intExtra = invokevirtual_com_appsflyer_internal_c$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra(values(new int[] { 998518318, -1660110958, -513052711, 611993354, 508697840, 1938850892 }, PhoneNumberUtils.toaFromString("") - 118).intern(), -2700);
                }
                else {
                    d.AFVersionDeclaration = (d.getLevel + 121) % 128;
                }
                final String nativeLibraryDir = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
                int n4 = 0;
                Label_0896: {
                    if (nativeLibraryDir != null) {
                        int n;
                        if (!nativeLibraryDir.contains(values(new int[] { -1675036583, 1271474483 }, 2 - ImageFormat.getBitsPerPixel(0)).intern())) {
                            n = 0;
                        }
                        else {
                            n = 1;
                        }
                        if (n != 0) {
                            final int n2 = d.getLevel + 61;
                            d.AFVersionDeclaration = n2 % 128;
                            int n3;
                            if (n2 % 2 != 0) {
                                n3 = 16;
                            }
                            else {
                                n3 = 76;
                            }
                            if (n3 == 16) {
                                n4 = 1;
                                break Label_0896;
                            }
                        }
                    }
                    n4 = 0;
                }
                final int size = com_appsflyer_internal_c$d_android_hardware_SensorManager_getSensorList((SensorManager)INVOKEVIRTUAL_com_appsflyer_internal_c$d_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.AFKeystoreWrapper, values(new int[] { -2108098182, 924452591, -880754948, 1430040891 }, 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()), -1).size();
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(AFInAppEventParameterName(TextUtils.getCapsMode((CharSequence)"", 0, 0) + 61, (char)(ViewConfiguration.getTapTimeout() >> 16), fcmpl(TypedValue.complexToFloat(0), 0.0f) + 1).intern());
                sb5.append(intExtra);
                sb5.append(values(new int[] { 1802121942, -851730084 }, KeyEvent.getDeadChar(0, 0) + 2).intern());
                sb5.append(n4);
                sb5.append(AFInAppEventParameterName(fcmpl(AudioTrack.getMaxVolume(), 0.0f) + 61, (char)TextUtils.getCapsMode((CharSequence)"", 0, 0), lcmp(SystemClock.elapsedRealtime(), 0L) + 1).intern());
                sb5.append(size);
                sb5.append(AFInAppEventParameterName(Color.blue(0) + 64, (char)TextUtils.getCapsMode((CharSequence)"", 0, 0), 6 - AndroidCharacter.getEastAsianWidth('0')).intern());
                sb5.append(this.values.size());
                final String string3 = sb5.toString();
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(s);
                final byte[] afInAppEventType = b.AFInAppEventType(string3);
                b.AFInAppEventParameterName(afInAppEventType);
                sb6.append(b.AFInAppEventType(afInAppEventType));
                s = sb6.toString();
            }
            catch (final Exception ex2) {
                final StringBuilder sb7 = new StringBuilder();
                sb7.append(values(new int[] { 640847658, -233831226, 620669702, -1347693514, 1083507952, -1102549683, -450369102, -1732957970, 393969182, 886873569, -1952655995, 1892296752, 1890815725, -1673734706, 1444084348, -987179240, 1094281385, 992383361, 17585538, 973864474, -432527319, -1739858274 }, 44 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
                sb7.append(ex2);
                AFLogger.AFInAppEventParameterName(sb7.toString());
                final StringBuilder sb8 = new StringBuilder();
                sb8.append(s);
                sb8.append(values(new int[] { -828854563, 475996213, 640677171, -1604617094, -1550728992, -1021112346, 2006942107, 297401137 }, TextUtils.getCapsMode((CharSequence)"", 0, 0) + 16).intern());
                s = sb8.toString();
            }
            return s;
        }
        
        public static String AFInAppEventParameterName(final int n, final char c, final int n2) {
            d.getLevel = (d.AFVersionDeclaration + 27) % 128;
            final char[] array = new char[n2];
            int i = 0;
            while (i < n2) {
                final int n3 = d.AFVersionDeclaration + 63;
                d.getLevel = n3 % 128;
                if (n3 % 2 != 0) {
                    array[i] = (char)(((long)d.AFInAppEventType[n << i] ^ ((long)i | d.valueOf)) * c);
                    i += 126;
                }
                else {
                    array[i] = (char)((long)d.AFInAppEventType[n + i] ^ i * d.valueOf ^ (long)c);
                    ++i;
                }
            }
            return new String(array);
        }
        
        public static StringBuilder AFInAppEventType(final String... array) {
            final ArrayList list = new ArrayList();
            int n = 0;
            do {
                list.add(array[n].length());
            } while (++n < 3);
            Collections.sort((List<Comparable>)list);
            final int intValue = ((Number)list.get(0)).intValue();
            final StringBuilder sb = new StringBuilder();
            d.AFVersionDeclaration = (d.getLevel + 9) % 128;
            for (int i = 0; i < intValue; ++i) {
                d.getLevel = (d.AFVersionDeclaration + 75) % 128;
                Number value = null;
                int n2 = 0;
                do {
                    int char1 = array[n2].charAt(i);
                    if (value != null) {
                        char1 ^= value.intValue();
                    }
                    else {
                        d.getLevel = (d.AFVersionDeclaration + 25) % 128;
                    }
                    value = char1;
                } while (++n2 < 3);
                sb.append(Integer.toHexString(value.intValue()));
            }
            return sb;
        }
        
        private String AFKeystoreWrapper() {
            try {
                final String string = Integer.toString(Build$VERSION.SDK_INT);
                final String string2 = this.values.get(AFInAppEventParameterName(fcmpl(TypedValue.complexToFraction(0, 0.0f, 0.0f), 0.0f), (char)(TextUtils.lastIndexOf((CharSequence)"", '0', 0) + 45903), 11 - ExpandableListView.getPackedPositionChild(0L)).intern()).toString();
                String s = this.values.get(values(new int[] { -1400612638, 722893263, 1201510708, 1839577259 }, Color.red(0) + 5).intern()).toString();
                if (s == null) {
                    d.AFVersionDeclaration = (d.getLevel + 111) % 128;
                    s = AFInAppEventParameterName(12 - fcmpl(TypedValue.complexToFraction(0, 0.0f, 0.0f), 0.0f), (char)(54368 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
                }
                final StringBuilder sb = new StringBuilder(string2);
                sb.reverse();
                final StringBuilder afInAppEventType = AFInAppEventType(string, s, sb.toString());
                final int length = afInAppEventType.length();
                int n;
                if (length <= 4) {
                    n = 83;
                }
                else {
                    n = 31;
                }
                if (n != 31) {
                    int n2 = length;
                    while (true) {
                        int n3;
                        if (n2 >= 4) {
                            n3 = 25;
                        }
                        else {
                            n3 = 14;
                        }
                        if (n3 != 14) {
                            break;
                        }
                        ++n2;
                        afInAppEventType.append('1');
                    }
                }
                else {
                    final int n4 = d.getLevel + 63;
                    d.AFVersionDeclaration = n4 % 128;
                    if (n4 % 2 == 0) {
                        afInAppEventType.delete(5, length);
                    }
                    else {
                        afInAppEventType.delete(4, length);
                    }
                }
                afInAppEventType.insert(0, AFInAppEventParameterName(lcmp(Process.getElapsedCpuTime(), 0L) + 19, (char)(TextUtils.indexOf((CharSequence)"", (CharSequence)"", 0) + 15993), fcmpl(AudioTrack.getMaxVolume(), 0.0f) + 2).intern());
                return afInAppEventType.toString();
            }
            catch (final Exception ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(values(new int[] { 640847658, -233831226, 620669702, -1347693514, 1083507952, -1102549683, -450369102, -1732957970, 393969182, 886873569, -1907198063, -659358675, -1220524838, -426323891, 726030888, -1625741836, 826016106, -853521743, -1716907684, 603768842, 752977807, -1933892853 }, View.getDefaultSize(0, 0) + 42).intern());
                sb2.append(ex);
                AFLogger.AFInAppEventParameterName(sb2.toString());
                return values(new int[] { 180447687, -652056002, 277827748, -169691734 }, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 7).intern();
            }
        }
        
        public static Intent INVOKEVIRTUAL_com_appsflyer_internal_c$d_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.doHWReceiverFix();
            }
            try {
                if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                    return context.registerReceiver(broadcastReceiver, intentFilter, (String)null, ReceiverRegisterLancet.sReceiverHandler);
                }
                return context.registerReceiver(broadcastReceiver, intentFilter);
            }
            catch (final Exception ex) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw ex;
            }
        }
        
        public static Object INVOKEVIRTUAL_com_appsflyer_internal_c$d_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String ex) {
            MethodCollector.i(3746);
        Label_0169_Outer:
            while (true) {
                if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                    if (!2JT.LIZ) {
                        break Label_0169_Outer;
                    }
                    monitorenter(ClipboardManager.class);
                    try {
                        final Object systemService = context.getSystemService((String)ex);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                                declaredField.set(systemService, ex);
                            }
                            catch (final Exception ex) {
                                6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        2JT.LIZ = false;
                        monitorexit(ClipboardManager.class);
                        break Label_0184;
                    }
                    finally {
                        monitorexit(ClipboardManager.class);
                        MethodCollector.o(3746);
                    }
                }
                while (true) {
                    if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                        break Label_0169;
                    }
                    try {
                        new 6G9().LIZ();
                        2JT.LIZIZ = true;
                        context = (Context)context.getSystemService((String)ex);
                        MethodCollector.o(3746);
                        return context;
                        context = (Context)context.getSystemService((String)ex);
                        continue Label_0169_Outer;
                        context = (Context)context.getSystemService((String)ex);
                        continue Label_0169_Outer;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
        
        public static List com_appsflyer_internal_c$d_android_hardware_SensorManager_getSensorList(final SensorManager sensorManager, final int n) {
            final 5an liz = new 5aq().LIZ(100702, "android/hardware/SensorManager", "getSensorList", (Object)sensorManager, new Object[] { n }, "java.util.List", new 5dv(false));
            if (liz.LIZ) {
                return (List)liz.LIZIZ;
            }
            return sensorManager.getSensorList(n);
        }
        
        public static String values(final int[] array, final int n) {
            d.AFVersionDeclaration = (d.getLevel + 29) % 128;
            final char[] array2 = new char[4];
            final char[] array3 = new char[array.length << 1];
            final int[] array4 = d.AFInAppEventParameterName.clone();
            d.getLevel = (d.AFVersionDeclaration + 1) % 128;
            for (int i = 0; i < array.length; i += 2) {
                d.AFVersionDeclaration = (d.getLevel + 5) % 128;
                array2[0] = (char)(array[i] >> 16);
                array2[1] = (char)array[i];
                final int n2 = i + 1;
                array2[2] = (char)(array[n2] >> 16);
                array2[3] = (char)array[n2];
                cu.values(array2, array4, false);
                final int n3 = i << 1;
                array3[n3] = array2[0];
                array3[n3 + 1] = array2[1];
                array3[n3 + 2] = array2[2];
                array3[n3 + 3] = array2[3];
            }
            return new String(array3, 0, n);
        }
        
        public static final class b
        {
            public final Boolean AFKeystoreWrapper;
            public Boolean valueOf;
            public final String values;
            
            static {
                Covode.recordClassIndex(2662);
            }
            
            public b() {
            }
            
            public b(final String values, final Boolean afKeystoreWrapper) {
                this.values = values;
                this.AFKeystoreWrapper = afKeystoreWrapper;
            }
            
            public static byte[] AFInAppEventParameterName(final byte[] array) {
                for (int i = 0; i < array.length; ++i) {
                    array[i] ^= (byte)(i % 2 + 42);
                }
                return array;
            }
            
            public static String AFInAppEventType(final byte[] array) {
                final StringBuilder sb = new StringBuilder();
                for (int length = array.length, i = 0; i < length; ++i) {
                    String s2;
                    final String s = s2 = Integer.toHexString(array[i]);
                    if (s.length() == 1) {
                        s2 = "0".concat(String.valueOf(s));
                    }
                    sb.append(s2);
                }
                return sb.toString();
            }
            
            public static byte[] AFInAppEventType(final String s) {
                return s.getBytes();
            }
        }
    }
}
