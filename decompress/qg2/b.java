// 
// Decompiled by Procyon v0.6.0
// 

package qg2;

import java.util.Iterator;
import sg2.e;
import kotlin.io.FileWalkDirection;
import java.io.File;
import bj2.k;

public final class b implements k<File>
{
    public final File a;
    public final FileWalkDirection b;
    public final int c;
    
    public b(final File a, final FileWalkDirection b) {
        e.f((Object)a, "start");
        e.f((Object)b, "direction");
        this.a = a;
        this.b = b;
        this.c = Integer.MAX_VALUE;
    }
    
    public final Iterator<File> iterator() {
        return (Iterator<File>)new b.b$b(this);
    }
    
    public abstract static class a extends c
    {
        public a(final File file) {
            e.f((Object)file, "rootDir");
            super(file);
        }
    }
    
    public abstract static class c
    {
        public final File a;
        
        public c(final File a) {
            e.f((Object)a, "root");
            this.a = a;
        }
        
        public abstract File a();
    }
}
