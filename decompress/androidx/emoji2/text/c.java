// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.content.pm.ProviderInfo;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import java.util.List;
import w3.f;
import java.util.Collections;
import java.util.ArrayList;
import android.content.Intent;
import mj2.c0;
import android.content.Context;

public final class c
{
    public static l a(final Context context) {
        final a a = new a();
        final PackageManager packageManager = context.getPackageManager();
        c0.s((Object)packageManager, "Package manager required to locate emoji font provider");
        final Iterator iterator = a.a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT")).iterator();
        while (true) {
            boolean b;
            do {
                final boolean hasNext = iterator.hasNext();
                final l l = null;
                final int n = 0;
                if (!hasNext) {
                    final ProviderInfo a2 = null;
                    f f = null;
                    Label_0238: {
                        if (a2 != null) {
                            try {
                                final String authority = a2.authority;
                                final String packageName = a2.packageName;
                                final Signature[] b2 = a.a.b(packageManager, packageName);
                                final ArrayList<byte[]> list = new ArrayList<byte[]>();
                                for (int length = b2.length, i = n; i < length; ++i) {
                                    list.add(b2[i].toByteArray());
                                }
                                f = new f(authority, packageName, "emojicompat-emoji-font", (List)Collections.singletonList(list));
                                break Label_0238;
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                Log.wtf("emoji2.text.DefaultEmojiConfig", (Throwable)ex);
                            }
                        }
                        f = null;
                    }
                    l j;
                    if (f == null) {
                        j = l;
                    }
                    else {
                        j = new l(context, f);
                    }
                    return j;
                }
                final ProviderInfo a2 = a.a.a((ResolveInfo)iterator.next());
                b = true;
                if (a2 != null) {
                    final ApplicationInfo applicationInfo = a2.applicationInfo;
                    if (applicationInfo != null && (applicationInfo.flags & 0x1) == 0x1) {
                        continue;
                    }
                }
                b = false;
            } while (!b);
            continue;
        }
    }
    
    public static final class a
    {
        public final b a;
        
        public a() {
            Object a;
            if (Build$VERSION.SDK_INT >= 28) {
                a = new c$d();
            }
            else {
                a = new c();
            }
            this.a = (b)a;
        }
    }
    
    public static class b
    {
        public ProviderInfo a(final ResolveInfo resolveInfo) {
            throw null;
        }
        
        public Signature[] b(final PackageManager packageManager, final String s) throws PackageManager$NameNotFoundException {
            return packageManager.getPackageInfo(s, 64).signatures;
        }
        
        public List c(final PackageManager packageManager, final Intent intent) {
            throw null;
        }
    }
    
    public static class c extends b
    {
        @Override
        public final ProviderInfo a(final ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }
        
        @Override
        public final List c(final PackageManager packageManager, final Intent intent) {
            return packageManager.queryIntentContentProviders(intent, 0);
        }
    }
}
