// 
// Decompiled by Procyon v0.6.0
// 

package w9;

import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Date;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import ot2.c;
import java.util.concurrent.ExecutorService;
import ot2.b;

public abstract class d implements w9.a
{
    public static final b b;
    public final ExecutorService a;
    
    static {
        b = c.b("LruDiskUsage");
    }
    
    public d() {
        this.a = Executors.newSingleThreadExecutor();
    }
    
    public abstract boolean a(final long p0, final int p1);
    
    public final class a implements Callable<Void>
    {
        public final File f;
        public final d g;
        
        public a(final d g, final File f) {
            this.g = g;
            this.f = f;
        }
        
        @Override
        public final Object call() throws Exception {
            final d g = this.g;
            final File f = this.f;
            g.getClass();
            final b a = w9.c.a;
            final boolean exists = f.exists();
            long n = 0L;
            if (exists) {
                final long currentTimeMillis = System.currentTimeMillis();
                if (!f.setLastModified(currentTimeMillis)) {
                    final long length = f.length();
                    if (length == 0L) {
                        if (!f.delete() || !f.createNewFile()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Error recreate zero-size file ");
                            sb.append(f);
                            throw new IOException(sb.toString());
                        }
                    }
                    else {
                        final RandomAccessFile randomAccessFile = new RandomAccessFile(f, "rwd");
                        final long n2 = length - 1L;
                        randomAccessFile.seek(n2);
                        final byte byte1 = randomAccessFile.readByte();
                        randomAccessFile.seek(n2);
                        randomAccessFile.write(byte1);
                        randomAccessFile.close();
                    }
                    if (f.lastModified() < currentTimeMillis) {
                        w9.c.a.warn("Last modified date {} is not set for file {}", (Object)new Date(f.lastModified()), (Object)f.getAbsolutePath());
                    }
                }
            }
            final File parentFile = f.getParentFile();
            Object list = new LinkedList<File>();
            final File[] listFiles = parentFile.listFiles();
            if (listFiles != null) {
                list = Arrays.asList(listFiles);
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new w9.c.a());
            }
            final Iterator<Object> iterator = (Iterator<Object>)((List<File>)list).iterator();
            while (iterator.hasNext()) {
                n += iterator.next().length();
            }
            int size = ((List)list).size();
            for (final File file : list) {
                if (!g.a(n, size)) {
                    final long length2 = file.length();
                    if (file.delete()) {
                        --size;
                        n -= length2;
                        final b b = d.b;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Cache file ");
                        sb2.append(file);
                        sb2.append(" is deleted because it exceeds cache limit");
                        b.info(sb2.toString());
                    }
                    else {
                        final b b2 = d.b;
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Error deleting file ");
                        sb3.append(file);
                        sb3.append(" for trimming cache");
                        b2.error(sb3.toString());
                    }
                }
            }
            return null;
        }
    }
}
