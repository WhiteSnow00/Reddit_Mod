// 
// Decompiled by Procyon v0.6.0
// 

package j5;

import n5.a;
import java.io.IOException;
import java.io.File;
import n5.b;

public final class v implements b, j5.c
{
    public androidx.room.b f;
    public boolean g;
    
    public final void a(final File file) throws IOException {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }
    
    public final void b(final boolean b) {
        this.getDatabaseName();
        throw null;
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            throw null;
        }
    }
    
    @Override
    public final String getDatabaseName() {
        throw null;
    }
    
    public final b getDelegate() {
        return null;
    }
    
    @Override
    public final a getWritableDatabase() {
        synchronized (this) {
            if (!this.g) {
                this.b(true);
                this.g = true;
            }
            throw null;
        }
    }
    
    @Override
    public final void setWriteAheadLoggingEnabled(final boolean b) {
        throw null;
    }
}
