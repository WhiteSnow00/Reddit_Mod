// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;

public class TaggedIOException extends IOExceptionWithCause
{
    private static final long serialVersionUID = -6994123481142850163L;
    private final Serializable tag;
    
    public TaggedIOException(final IOException ex, final Serializable tag) {
        super(ex.getMessage(), (Throwable)ex);
        this.tag = tag;
    }
    
    public static boolean isTaggedWith(final Throwable t, final Object o) {
        return o != null && t instanceof TaggedIOException && o.equals(((TaggedIOException)t).tag);
    }
    
    public static void throwCauseIfTaggedWith(final Throwable t, final Object o) throws IOException {
        if (!isTaggedWith(t, o)) {
            return;
        }
        throw ((TaggedIOException)t).getCause();
    }
    
    public IOException getCause() {
        return (IOException)super.getCause();
    }
    
    public /* bridge */ Throwable getCause() {
        return this.getCause();
    }
    
    public Serializable getTag() {
        return this.tag;
    }
}
