// 
// Decompiled by Procyon v0.6.0
// 

package i5;

import java.io.IOException;
import java.io.File;
import androidx.room.b;
import m5.c;

public final class r implements c, d
{
    public b f;
    public boolean g;
    
    public final void a(final File file) throws IOException {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }
    
    public final void b(final boolean b) {
        this.getDatabaseName();
        throw null;
    }
    
    public final void close() {
        synchronized (this) {
            throw null;
        }
    }
    
    public final String getDatabaseName() {
        throw null;
    }
    
    public final c getDelegate() {
        return null;
    }
    
    public final m5.b getWritableDatabase() {
        synchronized (this) {
            if (!this.g) {
                this.b(true);
                this.g = true;
            }
            throw null;
        }
    }
    
    public final void setWriteAheadLoggingEnabled(final boolean b) {
        throw null;
    }
}
