// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import java.util.Iterator;
import java.io.File;
import java.util.HashMap;
import android.content.Context;

public final class j
{
    public static final String a;
    public static final String[] b;
    
    static {
        a = b6.j.e("WrkDbPathHelper");
        b = new String[] { "-journal", "-shm", "-wal" };
    }
    
    public static void a(final Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            b6.j.c().a(j.a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            final HashMap hashMap = new HashMap();
            final File databasePath = context.getDatabasePath("androidx.work.workdb");
            final File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath, file);
            for (final String s : j.b) {
                final StringBuilder sb = new StringBuilder();
                sb.append(databasePath.getPath());
                sb.append(s);
                final File file2 = new File(sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(file.getPath());
                sb2.append(s);
                hashMap.put(file2, new File(sb2.toString()));
            }
            for (final File file3 : hashMap.keySet()) {
                final File file4 = hashMap.get(file3);
                if (file3.exists() && file4 != null) {
                    if (file4.exists()) {
                        b6.j.c().f(j.a, String.format("Over-writing contents of %s", file4), new Throwable[0]);
                    }
                    String s2;
                    if (file3.renameTo(file4)) {
                        s2 = String.format("Migrated %s to %s", file3, file4);
                    }
                    else {
                        s2 = String.format("Renaming %s to %s failed", file3, file4);
                    }
                    b6.j.c().a(j.a, s2, new Throwable[0]);
                }
            }
        }
    }
}
