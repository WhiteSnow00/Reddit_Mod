// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

public class FileExistsException extends IOException
{
    private static final long serialVersionUID = 1L;
    
    public FileExistsException() {
    }
    
    public FileExistsException(final File file) {
        final StringBuilder sb = new StringBuilder();
        sb.append("File ");
        sb.append(file);
        sb.append(" exists");
        super(sb.toString());
    }
    
    public FileExistsException(final String s) {
        super(s);
    }
}
