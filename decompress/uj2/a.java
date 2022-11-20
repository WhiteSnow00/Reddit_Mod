// 
// Decompiled by Procyon v0.6.0
// 

package uj2;

import java.util.Iterator;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import android.content.pm.ResolveInfo;
import java.util.List;
import android.content.Intent;
import android.content.Context;

public final class a
{
    public static List<ResolveInfo> a(final Context context, final Intent intent) {
        List<Object> list = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (list == null) {
            list = Collections.emptyList();
        }
        return (List<ResolveInfo>)list;
    }
    
    public static void b(final Context context, final Intent intent) throws ShortcutBadgeException {
        final List<ResolveInfo> a = a(context, intent);
        if (a.size() != 0) {
            for (final ResolveInfo resolveInfo : a) {
                final Intent intent2 = new Intent(intent);
                if (resolveInfo != null) {
                    intent2.setPackage(resolveInfo.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        final StringBuilder t = a.t("unable to resolve intent: ");
        t.append(intent.toString());
        throw new ShortcutBadgeException(t.toString());
    }
}
