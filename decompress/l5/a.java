// 
// Decompiled by Procyon v0.6.0
// 

package l5;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import ak0.m;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.Lock;
import java.io.File;
import java.util.HashMap;

public final class a
{
    public static final HashMap e;
    public final File a;
    public final Lock b;
    public final boolean c;
    public FileChannel d;
    
    static {
        e = new HashMap();
    }
    
    public a(File a, final String s, final boolean c) {
        a = new File(a, m.l(s, ".lck"));
        this.a = a;
        final String absolutePath = a.getAbsolutePath();
        final HashMap e = l5.a.e;
        synchronized (e) {
            Lock b;
            if ((b = e.get(absolutePath)) == null) {
                b = new ReentrantLock();
                e.put(absolutePath, b);
            }
            monitorexit(e);
            this.b = b;
            this.c = c;
        }
    }
    
    public final void a() {
        final FileChannel d = this.d;
        while (true) {
            if (d == null) {
                break Label_0013;
            }
            try {
                d.close();
                this.b.unlock();
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
}
