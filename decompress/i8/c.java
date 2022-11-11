// 
// Decompiled by Procyon v0.6.0
// 

package i8;

import java.io.IOException;
import java.io.File;
import java.nio.charset.Charset;

public final class c
{
    public static final Charset a;
    
    static {
        a = Charset.forName("US-ASCII");
        Charset.forName("UTF-8");
    }
    
    public static void a(File file) throws IOException {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                file = listFiles[i];
                if (file.isDirectory()) {
                    a(file);
                }
                if (!file.delete()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("failed to delete file: ");
                    sb.append(file);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }
}
