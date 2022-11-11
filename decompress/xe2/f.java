// 
// Decompiled by Procyon v0.6.0
// 

package xe2;

import android.content.Context;
import java.io.Serializable;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import al0.b;
import io.branch.referral.Defines$Jsonkey;
import org.json.JSONObject;
import android.app.Activity;
import java.lang.ref.WeakReference;

public final class f
{
    public static WeakReference<Activity> a;
    
    public static String a(String s, JSONObject jsonObject) {
        while (true) {
            String s2;
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append("~");
                sb.append(Defines$Jsonkey.ReferringLink.getKey());
                final String string;
                s2 = (string = jsonObject.getString(sb.toString()));
                final String s3 = "\\?";
                final String[] array = string.split(s3);
                final int n = 0;
                final String s4 = array[n];
                s2 = s4;
                break Label_0053;
            }
            catch (Exception s2) {
                s2 = "";
            }
            try {
                final String string = s2;
                final String s3 = "\\?";
                final String[] array = string.split(s3);
                final int n = 0;
                final String s4 = s2 = array[n];
                final String s5 = s2 = b.h(s2, "?validate=true");
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    s2 = s5;
                    try {
                        s2 = s5;
                        final StringBuilder sb2 = new StringBuilder();
                        s2 = s5;
                        sb2.append(s5);
                        s2 = s5;
                        String s6;
                        if (jsonObject.getString("ct").equals("t1")) {
                            s2 = s5;
                            s2 = s5;
                            final StringBuilder sb3 = new StringBuilder();
                            s2 = s5;
                            sb3.append("&t1=");
                            s2 = s5;
                            sb3.append((String)s);
                            s2 = s5;
                            s6 = sb3.toString();
                        }
                        else {
                            s2 = s5;
                            s2 = s5;
                            final StringBuilder sb4 = new StringBuilder();
                            s2 = s5;
                            sb4.append("&t1=");
                            s2 = s5;
                            sb4.append(jsonObject.getString("t1"));
                            s2 = s5;
                            s6 = sb4.toString();
                        }
                        s2 = s5;
                        sb2.append(s6);
                        s2 = s5;
                        final String s7 = s2 = (s2 = sb2.toString());
                        final StringBuilder sb5 = new StringBuilder();
                        s2 = s7;
                        sb5.append(s7);
                        s2 = s7;
                        String s8;
                        if (jsonObject.getString("ct").equals("t2")) {
                            s2 = s7;
                            s2 = s7;
                            final StringBuilder sb6 = new StringBuilder();
                            s2 = s7;
                            sb6.append("&t2=");
                            s2 = s7;
                            sb6.append((String)s);
                            s2 = s7;
                            s8 = sb6.toString();
                        }
                        else {
                            s2 = s7;
                            s2 = s7;
                            final StringBuilder sb7 = new StringBuilder();
                            s2 = s7;
                            sb7.append("&t2=");
                            s2 = s7;
                            sb7.append(jsonObject.getString("t2"));
                            s2 = s7;
                            s8 = sb7.toString();
                        }
                        s2 = s7;
                        sb5.append(s8);
                        s2 = s7;
                        final String s9 = s2 = (s2 = sb5.toString());
                        final StringBuilder sb8 = new StringBuilder();
                        s2 = s9;
                        sb8.append(s9);
                        s2 = s9;
                        String s10;
                        if (jsonObject.getString("ct").equals("t3")) {
                            s2 = s9;
                            s2 = s9;
                            final StringBuilder sb9 = new StringBuilder();
                            s2 = s9;
                            sb9.append("&t3=");
                            s2 = s9;
                            sb9.append((String)s);
                            s2 = s9;
                            s10 = sb9.toString();
                        }
                        else {
                            s2 = s9;
                            s2 = s9;
                            final StringBuilder sb10 = new StringBuilder();
                            s2 = s9;
                            sb10.append("&t3=");
                            s2 = s9;
                            sb10.append(jsonObject.getString("t3"));
                            s2 = s9;
                            s10 = sb10.toString();
                        }
                        s2 = s9;
                        sb8.append(s10);
                        s2 = s9;
                        final String s11 = s2 = (s2 = sb8.toString());
                        final StringBuilder sb11 = new StringBuilder();
                        s2 = s11;
                        sb11.append(s11);
                        s2 = s11;
                        String s12;
                        if (jsonObject.getString("ct").equals("t4")) {
                            s2 = s11;
                            s2 = s11;
                            final StringBuilder sb12 = new StringBuilder();
                            s2 = s11;
                            sb12.append("&t4=");
                            s2 = s11;
                            sb12.append((String)s);
                            s2 = s11;
                            s12 = sb12.toString();
                        }
                        else {
                            s2 = s11;
                            s2 = s11;
                            final StringBuilder sb13 = new StringBuilder();
                            s2 = s11;
                            sb13.append("&t4=");
                            s2 = s11;
                            sb13.append(jsonObject.getString("t4"));
                            s2 = s11;
                            s12 = sb13.toString();
                        }
                        s2 = s11;
                        sb11.append(s12);
                        s2 = s11;
                        final String s13 = s2 = (s2 = sb11.toString());
                        final StringBuilder sb14 = new StringBuilder();
                        s2 = s13;
                        sb14.append(s13);
                        s2 = s13;
                        if (jsonObject.getString("ct").equals("t5")) {
                            s2 = s13;
                            s2 = s13;
                            jsonObject = (JSONObject)new StringBuilder();
                            s2 = s13;
                            ((StringBuilder)jsonObject).append("&t5=");
                            s2 = s13;
                            ((StringBuilder)jsonObject).append((String)s);
                            s2 = s13;
                            s = ((StringBuilder)jsonObject).toString();
                        }
                        else {
                            s2 = s13;
                            s2 = s13;
                            final StringBuilder sb15 = new StringBuilder();
                            s2 = s13;
                            sb15.append("&t5=");
                            s2 = s13;
                            sb15.append(jsonObject.getString("t5"));
                            s2 = s13;
                            s = sb15.toString();
                        }
                        s2 = s13;
                        sb14.append((String)s);
                        s2 = s13;
                        s = (s2 = sb14.toString());
                    }
                    catch (final Exception s) {
                        ((Throwable)s).printStackTrace();
                    }
                }
                return b.h(s2, "&os=android");
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public static void b(final String s) {
        if (f.a.get() != null) {
            final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s).buildUpon().appendQueryParameter("$uri_redirect_mode", "2").build());
            intent.addFlags(268435456);
            intent.setPackage("com.android.chrome");
            ((Context)f.a.get()).getPackageManager().queryIntentActivities(intent, 0);
            try {
                f.a.get().startActivity(intent);
            }
            catch (final ActivityNotFoundException ex) {
                intent.setPackage((String)null);
                f.a.get().startActivity(intent);
            }
        }
    }
}
