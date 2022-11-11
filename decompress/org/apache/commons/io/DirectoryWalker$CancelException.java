// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

public class DirectoryWalker$CancelException extends IOException
{
    private static final long serialVersionUID = 1347339620135041008L;
    private final int depth;
    private final File file;
    
    public DirectoryWalker$CancelException(final File file, final int n) {
        this("Operation Cancelled", file, n);
    }
    
    public DirectoryWalker$CancelException(final String s, final File file, final int depth) {
        super(s);
        this.file = file;
        this.depth = depth;
    }
    
    public int getDepth() {
        return this.depth;
    }
    
    public File getFile() {
        return this.file;
    }
}
