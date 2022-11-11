// 
// Decompiled by Procyon v0.6.0
// 

package o3;

import android.os.Bundle;
import android.os.Handler;
import android.content.BroadcastReceiver;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Intent$ShortcutIconResource;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.Bitmap;
import android.os.Parcelable;
import a4.q;
import android.content.IntentSender;
import java.util.Iterator;
import android.text.TextUtils;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.Context;
import n3.a;
import a4.o;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import a4.z1;
import android.content.pm.ShortcutManager;
import android.os.Build$VERSION;
import java.util.List;
import android.app.Activity;

public final class d
{
    public static List a(final Activity activity) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            return b.a(activity, z1.b((ShortcutManager)((Context)activity).getSystemService((Class)ShortcutManager.class)));
        }
        if (sdk_INT >= 25) {
            final ShortcutManager shortcutManager = (ShortcutManager)((Context)activity).getSystemService((Class)ShortcutManager.class);
            final ArrayList list = new ArrayList();
            list.addAll(shortcutManager.getPinnedShortcuts());
            return b.a(activity, list);
        }
        return Collections.emptyList();
    }
    
    public static boolean b(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 26) {
            return o.i((ShortcutManager)((Context)activity).getSystemService((Class)ShortcutManager.class));
        }
        if (a.checkSelfPermission((Context)activity, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        final Iterator iterator = ((Context)activity).getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (iterator.hasNext()) {
            final String permission = ((ResolveInfo)iterator.next()).activityInfo.permission;
            if (TextUtils.isEmpty((CharSequence)permission) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(permission)) {
                return true;
            }
        }
        return false;
    }
    
    public static void c(final Activity activity, final b b, final IntentSender intentSender) {
        if (Build$VERSION.SDK_INT >= 26) {
            q.l((ShortcutManager)((Context)activity).getSystemService((Class)ShortcutManager.class), b.b(), intentSender);
            return;
        }
        if (!b(activity)) {
            return;
        }
        final Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        final Intent[] c = b.c;
        intent.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)c[c.length - 1]).putExtra("android.intent.extra.shortcut.NAME", b.e.toString());
        final IconCompat h = b.h;
        Label_0228: {
            if (h != null) {
                final Context a = b.a;
                h.a(a);
                final int a2 = h.a;
                Bitmap b2 = null;
                Label_0220: {
                    if (a2 != 1) {
                        if (a2 != 2) {
                            if (a2 == 5) {
                                b2 = IconCompat.b((Bitmap)h.b, true);
                                break Label_0220;
                            }
                            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                        }
                        else {
                            try {
                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", (Parcelable)Intent$ShortcutIconResource.fromContext(a.createPackageContext(h.f(), 0), h.e));
                                break Label_0228;
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                final StringBuilder r = a.r("Can't find package ");
                                r.append(h.b);
                                throw new IllegalArgumentException(r.toString(), (Throwable)ex);
                            }
                        }
                    }
                    b2 = (Bitmap)h.b;
                }
                intent.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)b2);
            }
        }
        ((Context)activity).sendOrderedBroadcast(intent, (String)null, (BroadcastReceiver)new c(intentSender), (Handler)null, -1, (String)null, (Bundle)null);
    }
}
