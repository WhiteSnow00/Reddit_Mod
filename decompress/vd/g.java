// 
// Decompiled by Procyon v0.6.0
// 

package vd;

import android.os.StrictMode$ThreadPolicy;
import java.io.Closeable;
import java.io.IOException;
import mg.d0;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import android.os.StrictMode;
import android.os.Process;

public final class g
{
    public static String a;
    public static int b;
    
    public static String a() {
        if (g.a == null) {
            int b;
            if ((b = g.b) == 0) {
                b = (g.b = Process.myPid());
            }
            Closeable closeable = null;
            final String s = null;
            String s2 = null;
            String a;
            if (b <= 0) {
                a = s;
            }
            else {
                Object o = null;
                try {
                    final StringBuilder sb = new StringBuilder(25);
                    sb.append("/proc/");
                    sb.append(b);
                    sb.append("/cmdline");
                    final String string = sb.toString();
                    final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        final BufferedReader bufferedReader = new BufferedReader(new FileReader(string));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        try {
                            final String line = bufferedReader.readLine();
                            d0.y((Object)line);
                            line.trim();
                        }
                        catch (IOException closeable) {
                            closeable = null;
                        }
                        finally {
                            goto Label_0147;
                        }
                    }
                    finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                catch (final IOException ex) {
                    s2 = null;
                    o = closeable;
                    a = s2;
                }
                finally {
                    o = s2;
                }
                e.a((Closeable)o);
            }
            g.a = a;
        }
        return g.a;
    }
}
