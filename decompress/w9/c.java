// 
// Decompiled by Procyon v0.6.0
// 

package w9;

import java.util.Comparator;
import java.io.IOException;
import java.io.File;
import ot2.b;

public final class c
{
    public static final b a;
    
    static {
        a = ot2.c.b("Files");
    }
    
    public static void a(final File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("File ");
                sb.append(file);
                sb.append(" is not directory!");
                throw new IOException(sb.toString());
            }
        }
        else if (!file.mkdirs()) {
            throw new IOException(String.format("Directory %s can't be created", file.getAbsolutePath()));
        }
    }
    
    public static final class a implements Comparator<File>
    {
        @Override
        public final int compare(final Object o, final Object o2) {
            final long n = lcmp(((File)o).lastModified(), ((File)o2).lastModified());
            int n2;
            if (n < 0) {
                n2 = -1;
            }
            else if (n == 0) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            return n2;
        }
    }
}
