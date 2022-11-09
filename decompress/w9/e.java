// 
// Decompiled by Procyon v0.6.0
// 

package w9;

import com.reddit.session.p;
import wu.h;
import com.instabug.library.util.InstabugSDKLogger;
import com.reddit.webembed.browser.WebBrowserActivity;
import android.content.Intent;
import android.os.Handler;
import android.app.Activity;
import android.accounts.AccountManagerCallback;
import com.reddit.common.account.SuspendedReason;
import com.reddit.session.q;
import java.util.ArrayList;
import ak0.m;
import kj2.j;
import com.reddit.domain.model.MyAccount;
import java.util.Iterator;
import au2.b;
import java.security.NoSuchAlgorithmException;
import android.text.TextUtils;
import java.security.MessageDigest;
import v9.l;
import com.reddit.logging.RedditLogger;
import android.os.Bundle;
import android.accounts.AccountManager;
import android.accounts.Account;
import kx.a;
import android.content.Context;
import ah2.f;
import com.instabug.library.internal.utils.stability.handler.penalty.PenaltyHandler;

public class e implements PenaltyHandler
{
    public static final char[] f;
    public static final char[] g;
    
    public static String a(final byte[] array) {
        final int length = array.length;
        final StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; ++i) {
            final char[] f = e.f;
            sb.append(f[(array[i] & 0xF0) >>> 4]);
            sb.append(f[array[i] & 0xF]);
        }
        return sb.toString();
    }
    
    public static final boolean b(final Context context) {
        ah2.f.f((Object)context, "context");
        final Account g = g(context);
        final boolean b = false;
        if (g != null) {
            return false;
        }
        final Account a = kx.a.a;
        final Account account = new Account("Reddit for Android", "com.reddit.account");
        boolean addAccountExplicitly;
        try {
            addAccountExplicitly = AccountManager.get(context).addAccountExplicitly(account, (String)null, (Bundle)null);
        }
        catch (final SecurityException ex) {
            RedditLogger.a.c((Throwable)new RuntimeException("account_type_clash"));
            addAccountExplicitly = b;
        }
        return addAccountExplicitly;
    }
    
    public static String c(String s) {
        final int lastIndex = s.lastIndexOf(46);
        final int lastIndex2 = s.lastIndexOf(47);
        String substring;
        if (lastIndex != -1 && lastIndex > lastIndex2 && lastIndex + 2 + 4 > s.length()) {
            substring = s.substring(lastIndex + 1, s.length());
        }
        else {
            substring = "";
        }
        final b a = l.a;
        try {
            final byte[] digest = MessageDigest.getInstance("MD5").digest(s.getBytes());
            final StringBuffer sb = new StringBuffer();
            for (int length = digest.length, i = 0; i < length; ++i) {
                sb.append(String.format("%02x", digest[i]));
            }
            s = sb.toString();
            if (!TextUtils.isEmpty((CharSequence)substring)) {
                s = a40.f.n(s, ".", substring);
            }
            return s;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public static Account d(final Context context, final fe0.b b, final String s) {
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)b, "provider");
        for (final Account account : h(context)) {
            final String name = account.name;
            ah2.f.e((Object)name, "loggedInAccount.name");
            final String f = f(context, b, name, false);
            if (f == null) {
                continue;
            }
            if (ah2.f.a((Object)f, (Object)s)) {
                return account;
            }
        }
        return null;
    }
    
    public static final Account e(final Context context, final String s) {
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)s, "name");
        final AccountManager value = AccountManager.get(context);
        final Account a = kx.a.a;
        final Account[] accountsByType = value.getAccountsByType("com.reddit.account");
        ah2.f.e((Object)accountsByType, "manager.getAccountsByType(ACCOUNT_TYPE)");
        for (final Account account : accountsByType) {
            if (ah2.f.a((Object)account.name, (Object)s)) {
                return account;
            }
        }
        return null;
    }
    
    public static String f(final Context context, final fe0.b b, String s, final boolean b2) {
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)b, "provider");
        ah2.f.f((Object)s, "username");
        final wu.b e = wu.b.e(context, b);
        if (b2) {
            s = "Reddit Incognito";
        }
        final MyAccount myAccount = (MyAccount)((h)e).c(s);
        final String s2 = null;
        String id;
        if (myAccount != null) {
            id = myAccount.getId();
        }
        else {
            id = null;
        }
        String s3 = s2;
        if (id != null) {
            s3 = myAccount.getId();
            ah2.f.f((Object)s3, "userId");
            if (TextUtils.isEmpty((CharSequence)s3)) {
                s3 = s2;
            }
            else if (!j.e2(s3, "t2_", false)) {
                s3 = m.l("t2_", s3);
            }
        }
        return s3;
    }
    
    public static final Account g(final Context context) {
        ah2.f.f((Object)context, "context");
        return e(context, "Reddit for Android");
    }
    
    public static final ArrayList h(final Context context) {
        ah2.f.f((Object)context, "context");
        final AccountManager value = AccountManager.get(context);
        final Account a = kx.a.a;
        final Account[] accountsByType = value.getAccountsByType("com.reddit.account");
        ah2.f.e((Object)accountsByType, "get(context).getAccountsByType(ACCOUNT_TYPE)");
        final ArrayList list = new ArrayList();
        for (final Account account : accountsByType) {
            if (!ah2.f.a((Object)account.name, (Object)"Reddit for Android") && !ah2.f.a((Object)account.name, (Object)"Reddit Incognito")) {
                list.add(account);
            }
        }
        return list;
    }
    
    public static SuspendedReason i(final q q) {
        ah2.f.f((Object)q, "sessionManager");
        final MyAccount b = q.B();
        final SuspendedReason suspendedReason = null;
        if (b == null) {
            return null;
        }
        final MyAccount b2 = q.B();
        ah2.f.c((Object)b2);
        if (((p)b2).getForcePasswordReset()) {
            return SuspendedReason.PASSWORD;
        }
        final MyAccount b3 = q.B();
        ah2.f.c((Object)b3);
        SuspendedReason suspended = suspendedReason;
        if (((p)b3).isSuspended()) {
            suspended = SuspendedReason.SUSPENDED;
        }
        return suspended;
    }
    
    public static final boolean j(final q q) {
        ah2.f.f((Object)q, "sessionManager");
        if (q.B() != null) {
            final MyAccount b = q.B();
            ah2.f.c((Object)b);
            if (!((p)b).isSuspended()) {
                final MyAccount b2 = q.B();
                ah2.f.c((Object)b2);
                if (!((p)b2).getForcePasswordReset()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static final boolean k(final Context context, final String s) {
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)s, "username");
        return TextUtils.equals((CharSequence)s, (CharSequence)context.getString(2131953066));
    }
    
    public static final boolean l(final Context context, final Account account, final AccountManagerCallback accountManagerCallback) {
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)account, "account");
        if (!ah2.f.a((Object)a.a, (Object)account) && !ah2.f.a((Object)a.b, (Object)account)) {
            AccountManager.get(context).removeAccount(account, (Activity)null, accountManagerCallback, (Handler)null);
            return true;
        }
        return false;
    }
    
    public static final Intent m(final Context context, final boolean b, final String s, final String s2, final Integer n) {
        ah2.f.f((Object)context, "context");
        final Intent intent = new Intent(context, (Class)WebBrowserActivity.class);
        intent.putExtra("com.reddit.extra.initial_url", s);
        intent.putExtra("com.reddit.extra.use_cookie_auth", b);
        intent.putExtra("com.reddit.extra.title_override", s2);
        if (n != null) {
            intent.putExtra("com.reddit.extra.color", (int)n);
        }
        return intent;
    }
    
    public int getPenaltyType() {
        return 1;
    }
    
    public void handle(final Exception ex) {
        InstabugSDKLogger.e("IBG-Core", ex.getClass().getSimpleName(), (Throwable)ex);
    }
}
