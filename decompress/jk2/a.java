// 
// Decompiled by Procyon v0.6.0
// 

package jk2;

import java.io.Writer;
import java.io.PrintWriter;
import org.apache.commons.io.output.StringBuilderWriter;
import java.io.File;

public final class a
{
    public static final int a = 0;
    
    static {
        final char separatorChar = File.separatorChar;
        final StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        final PrintWriter printWriter = new PrintWriter((Writer)stringBuilderWriter);
        printWriter.println();
        stringBuilderWriter.toString();
        printWriter.close();
    }
}
